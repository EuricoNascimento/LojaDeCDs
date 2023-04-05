import interfaces.IServiceCDServidor;
import model.CD;

import java.rmi.Naming;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            IServiceCDServidor serivceCD = (IServiceCDServidor) Naming.lookup("localhost");

            int opcao = 1;
            while (opcao == 1 || opcao == 2 || opcao == 0) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Selecione um numero:\n0-Pesquisar CD \n1-Listar CDs \n2-Registrar CD");
                System.out.println("Digite qualquer outro numero para sair");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 0:
                        System.out.println("Digite o nome do Album: ");
                        CD cdEncontrado = serivceCD.obterCD(scanner.next());
                        if (cdEncontrado == null) {
                            System.out.println("CD não existe ou nome do album errado");
                        } else {
                            System.out.println(cdEncontrado);
                        }
                        break;
                    case 1:
                        System.out.println("---------------Lista De Cds--------------");
                        List<CD> listaDeCDs = serivceCD.obterCDs();

                        listaDeCDs.forEach(it -> {
                            System.out.println(it);;
                        });
                        System.out.println("------------------------------------------");
                        break;
                    case 2:
                        CD meuCD = new CD("", "", "", 0.0);
                        System.out.println("Nome do Album: ");
                        meuCD.setNomeAlbum(scanner.next());
                        System.out.println("Nome da Banda/Cantor: ");
                        meuCD.setBanda(scanner.next());
                        System.out.println("Genero: ");
                        meuCD.setGenero(scanner.next());
                        System.out.println("Preco: ");
                        meuCD.setPreco(scanner.nextDouble());
                        serivceCD.registrarCD(meuCD);
                        break;
                    default:
                        break;
                }
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
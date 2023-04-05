package interfaces;

import model.CD;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServiceCDServidor extends Remote {
    void registrarCD(CD cd) throws RemoteException;

    List<CD> obterCDs() throws RemoteException;
}

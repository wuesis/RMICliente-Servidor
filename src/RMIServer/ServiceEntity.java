package RMIServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceEntity extends UnicastRemoteObject implements Service {

    public ServiceEntity() throws RemoteException {
        super();
    }

    public void ServicioUno() throws RemoteException {
        System.out.println("RMI es genial por favor paseme! :D ");
    }

    public int ServicioDos() throws RemoteException {
        return 5;
    }
}

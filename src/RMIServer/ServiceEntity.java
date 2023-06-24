package RMIServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceEntity extends UnicastRemoteObject implements Service {

    public ServiceEntity() throws RemoteException {
        super();
    }

    public void ServicioUno(String clientIP) throws RemoteException {
        System.out.println("Hola Servidor RMI! desde el cliente: " + clientIP);
    }

    public int ServicioDos() throws RemoteException {
        return 42;
    }
}

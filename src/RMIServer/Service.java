package RMIServer;

import java.rmi.Remote;

public interface Service extends Remote {
      void ServicioUno() throws java.rmi.RemoteException;
      int ServicioDos() throws java.rmi.RemoteException;
}

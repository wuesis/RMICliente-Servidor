package RMIServer;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class ServiceHub {
    public static void main(String[] args) {
        try {
            ServiceEntity serviceEntity = new ServiceEntity();
            String ip = InetAddress.getLocalHost().getHostAddress();
            LocateRegistry.createRegistry(Integer.parseInt(args[0]));
            System.setProperty("java.rmi.server.hostname",ip);
            Naming.rebind("//"+ip + ":" + args[0] + "//RMIServer", serviceEntity);
            System.out.println("Servidor en linea");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package RMIClient;

import RMIServer.Service;

public class Main {

    public static void main(String[] args) {
        try {
            Service mir = (Service) java.rmi.Naming.lookup("//" + args[0] + ":" + args[1] + "//RMIServer");
            mir.ServicioUno(args[0]);
            System.out.println("Mensaje al servidor enviado");
            System.out.println("Mensaje del servidor recibido");
            System.out.println(mir.ServicioDos());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

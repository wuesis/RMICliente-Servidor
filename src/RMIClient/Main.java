package RMIClient;

import RMIServer.Service;

public class Main {

    public static void main(String[] args) {
        try {
            Service mir = (Service) java.rmi.Naming.lookup("//" + args[0] + ":" + args[1]  +"//RMIServer");
            mir.ServicioUno();
            System.out.println("Uno ejecutado");
           System.out.println(mir.ServicioDos());
            System.out.println("Dos Ejecutado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

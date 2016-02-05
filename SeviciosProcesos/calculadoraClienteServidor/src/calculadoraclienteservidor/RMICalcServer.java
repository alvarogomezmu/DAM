/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraclienteservidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//import java.rmi.server.UnicartRemoteObject;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author AlumnoT
 */
public class RMICalcServer implements RMICalcInterface {

    public int suma(int a, int b) throws RemoteException {
        return (a + b);
    }

    public int resta(int a, int b) throws RemoteException {
        return (a - b);
    }

    public int multip(int a, int b) throws RemoteException {
        return (a * b);
    }

    public int div(int a, int b) throws RemoteException {
        return (a / b);
    }

    public static void main(String[] args) {

        System.out.println("Creando el registro de objetos remotos...");
        Registry reg = null;

        try {
            reg = LocateRegistry.createRegistry(5555);
        } catch (Exception e) {

            System.out.println("ERROR: No se ha podido crear el registro");
            e.printStackTrace();
        }

        System.out.println("Creando el objeto servidor e inscribiendolo en el registro...");
        RMICalcServer serverObject = new RMICalcServer();

        try {

            reg.rebind("Calculadora",(RMICalcInterface) UnicastRemoteObject.exportObject(serverObject, 0));

} catch (Exception e) {

            System.out.println("ERROR: No se ha podido inscribir el objeto servidor.");

            e.printStackTrace();

        }

    }

}

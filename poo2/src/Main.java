import Modelo.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******MENU******");
        System.out.println("1.- Ingresar Cliente");
        System.out.println("2.- Modificar Cliente");
        System.out.println("3.- Eliminar Cliente");
        System.out.println("4.- Listar Clientes");
        System.out.println("5.- Salir del sistema (Exit)");
        System.out.println("Ingresar opción");
        int opcion = scan.nextInt();
        ArrayList <Cliente> mochilaDeClientes = new ArrayList();
        switch (opcion) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                for (Cliente elCliente: mochilaDeClientes) {

                }
                break;
            case 5:
                System.exit(1);
                break;
        }
    }

}

package Vista;

import Controlador.ControladorArriendoEquipos;

import java.util.Scanner;

public class UIArriendoEquipos {

    private static UIArriendoEquipos instancia=null;
    private final Scanner scan;
    private UIArriendoEquipos(){
        scan=new Scanner(System.in);
    }

    public static UIArriendoEquipos getInstancia(){

        if(instancia==null){
            instancia=new UIArriendoEquipos();
        }
        return instancia;
    }

    public void menu() {
        int opcion;
        do{
            System.out.println("******* SISTEMA DE ARRIENDO DE EQUIPOS DE NIEVE *******");
            System.out.println("\n*** MENU DE OPCIONES ***");
            System.out.println("1. Crea un nuevo cliente");
            System.out.println("2. Crea un nuevo equipo");
            System.out.println("3. Arrienda equipos");
            System.out.println("4. Devuelve equipos");
            System.out.println("5. Cambia estado de un cliente");
            System.out.println("5. Lista todos los clientes");
            System.out.println("7. Lista todos los equipos");
            System.out.println("8. Lista todos los arriendos");
            System.out.println("9. Lista detalles de un arriendo");
            System.out.println("10. Salir");
            System.out.print("\tIngrese opcion: ");
            opcion=scan.nextInt();

            switch(opcion){
                case 1:
                    crearCliente();
                    break;
                case 2:
                    crearEquipo();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    listaCliente();
                    break;
                case 7:
                    listaEquipo();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.print("La opcion ingresada no es valida");
                    break;
            }
        }while(opcion!=5);
    }
    private void crearCliente(){
        String rut,nom,dir,tel;

        System.out.println("Ingrese el rut del cliente: ");
        scan.nextLine();
        rut=scan.nextLine();
        System.out.println("Ingrese el nombre del cliente: ");
        nom=scan.nextLine();

        System.out.println("Ingrese la direccion del cliente: ");
        dir=scan.nextLine();

        System.out.println("Ingrese el numero de telefono del cliente: ");
        tel=scan.next();

        ControladorArriendoEquipos.getInstancia().creaCliente(rut,nom,dir,tel);
    }

    private void crearEquipo(){
        long cod;
        String desc;
        long precio;
        System.out.println("Ingrese el codigo del equipo: ");
        cod=scan.nextLong();
        scan.nextLine();
        System.out.println("Ingrese la descripcion del equipo: ");
        desc=scan.nextLine();

        System.out.println("Ingrese el precio del equipo: ");
        precio=scan.nextLong();


        ControladorArriendoEquipos.getInstancia().creaEquipo(cod,desc,precio);
    }
    private void listaCliente(){
        String[][] matrizCliente = ControladorArriendoEquipos.getInstancia().listaClientes();
        if (matrizCliente.length > 0) {
            System.out.println("\nListado de clientes");
            System.out.println("------------");
            System.out.printf("%-15s%-15s%-15s%-15s%n","Rut","Nombre","Direccion","Telefono","Estado");
            for (String[] linea : matrizCliente) {
                System.out.printf("%-15s%-15s%-15s%-15s%n", linea[0], linea[1], linea[2],linea[3]);
            }
        } else {
            System.out.println("\nNo hay clientes");
        }
    }
    private void listaEquipo(){
        String[][] matrizEquipo = ControladorArriendoEquipos.getInstancia().listaEquipos();
        if (matrizEquipo.length > 0) {
            System.out.println("\nListado de equipo");
            System.out.println("------------");
            System.out.printf("%-15s%-15s%-15s%-15s%n","Codigo","Descripcion","Precio","Estado");
            for (String[] linea : matrizEquipo) {
                System.out.printf("%-15s%-15s%-15s%-15s%n", linea[0], linea[1], linea[2],linea[3]);
            }
        } else {
            System.out.println("\nNo hay equipo");
        }
    }

    private void arriendaEquipos(){

    }

    private void devuelveEquipos(){

    }

    private void cambiaEstadoCliente(){

    }

    private void listaArriendos(){

    }

    private void listaDetallesArriendo(){

    }
}

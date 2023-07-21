import java.time.LocalDate;
import java.util.Scanner;
public class DemoRecetaMedica {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese el numero de la receta");
        int nroReceta=scan.nextInt();
        System.out.print("Ingrese el nombre del paciente");
        String nombrePaciente=scan.nextLine();
        LocalDate fecha=LocalDate.now();
        RecetaMedica receta1=new RecetaMedica(nroReceta,nombrePaciente,fecha);
        System.out.println("--- MENU ---");
        System.out.println("1) Numero de la receta");
        System.out.println("2) Nombre del paciente");
        System.out.println("3) Fecha de ingreso");
        System.out.println("4) Añadir medicamento");
        System.out.println("5) Listar medicamentos");
        System.out.print("Opcion: ");
        int opcion=scan.nextInt();
        switch(opcion){
            1:
        }
    }
}

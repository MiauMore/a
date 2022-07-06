import java.util.Scanner;

public class arreglo{
	public static void main(String[] args){
	int [] arreglo = new int[5];
	Scanner leer= new Scanner(System.in);
	for (int i=0;i<5;i++){
	arreglo [i] = leer.nextInt();
	}//fin para
	System.out.println("los numeros ingresados son: ");
	for (int i=0;i<5;i++){
	System.out.println(arreglo[i]);
	}//fin para
	}
}
import java.util.Scanner;
public class AUejemplo2{
	public static void main (String[] args){
		Scanner uwu = new Scanner (System.in);
		
		float promedio;
		int suma = 0;
		int [] edades = new int [5];
		int sobreProm = 0;
		int bajoProm = 0;
		
		for (int i = 0; i < 5; i++){
			System.out.println("ingrese la edad del cliente: " + (i+1) + ":");
			edades[i] = uwu.nextInt();
			suma = suma + edades[i];
		}
		promedio = suma/5;
		
		for (int j = 0; j < 5; j++){
			if(edades[j] > promedio){
				sobreProm++;
			}
			if (edades[j] < promedio){
				bajoProm++;
			}
		}
		System.out.println("el promedio de edades es: " + promedio);
		System.out.println("la cantidad de edades que estan sobre el promedio son: " + sobreProm);
		System.out.println("la cantidad de edades que estan bajo el promedio son: " + bajoProm);
	}
}
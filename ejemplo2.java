import java.util.Scanner;
public class ejemplo2{
	public static void main(String args []){
		Scanner scan = new Scanner(System.in);
		int hora=0;
		int minuto=0;
		System.out.println("Ingrese hora de llegada(hh mm)");
		hora= scan.nextInt();
		System.out.println("Ingrese hora de llegada(hh mm)");
		minuto= scan.nextInt();
		int minutosllegada,minutosentrada,minutosatraso;
		if ((hora == 8 && minuto >10)||(hora > 8 )){
			System.out.println("llegó atrasado");
			minutosllegada=hora*60+minuto;
			minutosentrada=8*60+10;
			minutosatraso=minutosllegada - minutosentrada;
			System.out.println("Por "+ minutosatraso + "minutos");
			}
		else{
				System.out.println("llegó a la hora");
			}
	}
	}
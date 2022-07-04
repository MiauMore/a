import java.util.Scanner;

public class juego{
	public static void main(String[] args){
		int hp=100 , hpe=50 , atk=10 , atke=20 ,op;
		float def=1;
		Scanner leer= new Scanner(System.in);
	System.out.println("Te encuentras con un enemigo");
	System.out.println("=====================================");
	do{
		System.out.println("¿que haces?");
		System.out.println("(1) atacar");
		System.out.println("(2) defender");
		System.out.println("(3) seducir");
		System.out.println("(4) esteroides");
		System.out.println("(5) magia");
		op= leer.nextInt();
		def=1;
		switch(op){
			case 1:
			hpe = hpe-atk;
			System.out.println("atacas al enemigo");
			System.out.println("haces " + atk + " de danno");
			break;
			case 2:
			System.out.println("te defiendes, el danno recibido este turno sera reducido");
			def= (float)0.2;
			break;
			case 3:
			System.out.println("intentas seducir al enemigo");
			System.out.println("has tenido exito, ataque se reduce");
			atke= (int)(atke*0.9);
			break;
			case 4:
			System.out.println("te haces una sopa de esteroides");
			System.out.println("tu daño sube");
			atk= atk+10;
			break;
			case 5:
			System.out.println("intentas hacer magia");
			System.out.println("no ha pasado nada");
			break;
			default:
			System.out.println("no haces nada");
		}//fin swicth
		System.out.println("=====================================");
		hp= (hp- (int)(atke*def));
		System.out.println("el enemigo te golpea");
		System.out.println("recibes " + (int)(atke*def) + " de danno");
	}while(hp>0 && hpe>0);
	System.out.println("juego terminado");
	
	}
}
import java.util.Scanner;

public class juego{
	public static void main(String[] args){
		int hp=100 , hpe=50 , atk=10 , atke=20 ,op, oph;
		float def=1;
		Scanner leer= new Scanner(System.in);
	System.out.println("Te encuentras con un enemigo");
	System.out.println("=====================================");
	do{
	    System.out.println("");
		System.out.println("Tu hp es:"+hp);
		System.out.println("Tu ataque es:"+atk);
		System.out.println("El hp del enemigo es de:"+hpe);
		System.out.println("El ataque del enemigo es de:"+atke);
		System.out.println("");
		System.out.println("¿Que quieres hacer?");
		System.out.println("(1) atacar");
		System.out.println("(2) defender");
		System.out.println("(3) Magia");
		System.out.println("(4) Esteroides");
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
            System.out.println("Lista de hechizos:");
            System.out.println("(1) Seduccion");
            oph= leer.nextInt();
            switch(oph){
              case 1:
                if (hp>=15){
                System.out.println("Intentas seducir al enemigo");
			    System.out.println("Has tenido exito, ataque se reduce");
                System.out.println("El hechizo ha extraido parte de tu vida");
                hp=hp-15;
			    atke= (int)(atke-(atke*0.5));
                }else{
                  System.out.println("No tienes suficiente vida para realizar este hechizo");
                }
                break;
              default: System.out.println("el hechizo ha fallado");
                break;
            }
            break;
			case 4:
			System.out.println("te haces una sopa de esteroides");
			System.out.println("tu daño sube");
			atk= atk+5;
			break;
			default:
			System.out.println("no haces nada");
		}//fin swicth
		System.out.println("=====================================");
		hp= (hp- (int)(atke*def));
		if (hpe>0){
		System.out.println("el enemigo te golpea");
		System.out.println("recibes " + (int)(atke*def) + " de danno");
		}else{
		System.out.println("Has derrotado al enemigo");
		}
	}while(hp>0 && hpe>0);
	System.out.println("juego terminado");
	
	}
}

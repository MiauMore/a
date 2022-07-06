import java.util.Scanner;
public class Prueba{
	public static void main(String [] args) {
		Scanner tcld = new Scanner(System.in);
		String color;
		int numCandidato, alcalde1=0, alcalde2=0, gobernador1=0, gobernador2=0, alcaldeNulo=0, gobernadorNulo=0, alcaldeBlanco=0, gobernadorBlanco=0, totalGobernador=0, totalAlcalde=0;
		
		
		System.out.println("Ingrese color");
		color = tcld.next();
		
		while (!color.equalsIgnoreCase("fin")){ 
			System.out.println("Ingrese numero del candidato");
			numCandidato = tcld.nextInt();
			if (color.equalsIgnoreCase("celeste")) {
				switch (numCandidato) {
			case 1: alcalde1++;
			break;
			case 2: alcalde2++;
			break;
			case 0: alcaldeBlanco++;
			break;
			case -1: alcaldeNulo++;
			break;
			default: System.out.println("Opcion invalida");
			}
			} else {
				switch (numCandidato) {
			case 1: gobernador1++;
			break;
			case 2: gobernador2++;
			break;
			case 0: gobernadorBlanco++;
			break;
			case -1: gobernadorNulo++;
			break;
			default: System.out.println("Opcion invalida");
			}
				
				}
				System.out.println("Ingrese color");
				color = tcld.next();
		}
		
		totalAlcalde = alcalde1+alcalde2+alcaldeBlanco+alcaldeNulo;
		totalGobernador = gobernador1+gobernador2+gobernadorBlanco+gobernadorNulo;
		
		System.out.println("Alcalde Candidato 1: "+ totalAlcalde1 + ", "+ (alcalde1*100)/totalAlcalde+ "%");
		System.out.println("Alcalde Candidato 2: "+ totalAlcalde2 + ", " +(alcalde2*100)/totalAlcalde+ "%");
		System.out.println("Votos nulos: "+ alcaldeNulo);
		System.out.println("Votos blancos: "+ alcaldeBlanco);
		
		System.out.println("Gobernador Candidato 1: "+ totalGobernador1 + ", "+ (gobernador1*100)/totalGobernador+ "%");
		System.out.println("Gobernador Candidato 2: "+ totalGobernador2 + ", " + (gobernador2*100)/totalGobernador+ "%");
		System.out.println("Votos nulos: "+ gobernadorNulo);
		System.out.println("Votos blancos: "+ gobernadorBlanco);
		
	}
}	
import java.util.Scanner;
public class awa { 
 public static void main (String[] args) {
	Scanner teclado= new Scanner (System.in);
	String [][] palabras = new String[10][2];
	//10=filas ; 20=columnas
	//para contar la posición se empieza desde 0
	
	//leer
	System.out.println("ingrese 200 palabras");
	for (int i=0; i<10; i++){
		for (int j=0; j<2; j++){
			palabras[i][j] = teclado.next();
		}
	}
	
	System.out.println("ingresa una palabra para buscarrr");
	String palabra = teclado.next();
	int cont = 0;
	
	for (int i=0; i<10; i++){
		for (int j=0; j<2; j++){
			if (palabras[i][j].equals(palabra)){
				cont++;
			}
		}
	}
	System.out.println("la palabra " + palabra + " esta " + cont + " veces en la matriz");
 }
}
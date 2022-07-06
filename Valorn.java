public class Valorn{
	public static void main (String args []){
		int signo=1;
		long nroterminos=200, denominador=1;
		double suma=0;
		
		for (int =1; <=nroterminos; i++){
			//GENERA Y SUMA I-ENESIMO TERMINO
			suma += signo * (1.0/denominador);
			
			//prepara siguiente termino
			signo *= -1;
			denominador +=2;
		}
		System.out.println("suma es; " + suma);
		System.out.println("el valor de pi es; " + suma*4);
		
		signo=1;
		nroterminos=0;
		denominador=1;
		suma=0;
		
		while (suma*4!= 3.14159 + 10e5){
			//genera y suma i-esimo termino
			suma += signo * (1.0/denominador);
			nroterminos++;
			
			//prepara el siguiente termino
			signo *= -1;
			denominador +=2;
		}
		System.out.println("el valor de pi es; " + suma*4);
		
	}
}
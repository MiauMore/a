
import java.util.Scanner;
public class calculadora{

public static void main(String args []){
	Scanner scan= new Scanner(System.in);
	double a,b,resultado;
	System.out.println("Calculadora basica con dos numeros");
	System.out.println("ingrese los dos numeros");
	a = scan.nextDouble();
	b = scan.nextDouble();
	System.out.print("Ingrese la operación + - * /");
	char operator = scan.next().charAt(0);
	switch(operator){
		case '+':
		resultado = a+b;
		break;
		case'-':
		resultado=a-b;
		break;
		case'*':
		resultado=a*b;
		break;
		case'/':
		resultado=a/b;
		break;
		default:
		System.out.println("ingrese un operador valido");
		return;
	}
	System.out.printf("%.2f %c %.2f = %.2f", a, operator, b, resultado);

}


}
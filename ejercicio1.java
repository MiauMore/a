import java.util.Scanner;
public class ejercicio1{
public static void main(String[]Args){
	Scanner scan = new Scanner (System.in);
	int ley,remuneracion;
	int aguinaldototal;
	String carga,casado;
System.out.println("Ingrese la ley, dependiendo de la ley tendrá un aguinaldo");
ley=scan.nextInt();
System.out.println("Ingrese su remuneración");
remuneracion=scan.nextInt();

switch(ley){
   case 1503:
	if(remuneracion< 2000000){
		aguinaldototal=remuneracion*10/100;
	}		
	break;
	case 1621: 
	if(remuneracion<1500000){
		aguinaldototal=remuneracion*12/100;
	
	}else{
		aguinaldototal=20000;
	}
	break;
	case 4578:
	System.out.println("tiene cargas familiares (si/no)");
	carga=scan.next();
	if((remuneracion<1500000) && (carga="si")){
	aguinaldototal=remuneracion*14/100;
	
	}else{
		aguinaldototal=10000;
	}	
	break;
	case 2305:
	if(remuneracion<1000000){
	aguinaldototal=remuneracion*13/100;	
	}else{
	aguinaldototal=remuneracion*10/100;
	}
	break;
	case 3208:
	System.out.println("Está casado (si/no)");
	casado=scan.next();
	if(remuneracion<1000000 && casado="si"){
	aguinaldototal=remuneracion*11/100;
	}else{
	aguinaldototal=20000;	
	}	
	
	
}		
}
}
import java.util.Scanner;
public class ejemplosi{	
public static void main(String args[]){ 
Scanner scan = new Scanner(System.in);
int a,b,c,d,m;
System.out.println("ingrese el proncentaje a ");	
a= scan.nextInt();
System.out.println("ingrese el proncentaje b ");
b= scan.nextInt();
System.out.println("ingrese el proncentaje c ");
c= scan.nextInt();
System.out.println("ingrese el proncentaje d");
d= scan.nextInt();
System.out.println("ingrese el monto de la menor aportación");
m = scan.nextInt();	
int menor, total;
int mayor, aporteMayor;
if(a<b){
	  if (a<c){
		  if (a<d){
			 menor=a;
			 }
           else{
			  menor=d;
			}			   
			  }
		  else{
			 if(c<d){
              menor=c;
			  }	
		  else{
              menor=d;
			  }			  
			  }
	}
	else{
		if(b<c){
			if(b<d){
				menor=b;
                 }		
            else{
				menor=d;
				}				
			}
			else{
				if(c<d)
				{
					menor=c;
					}
					else{
						menor=d;
					}
			}
	}
if(a>b){
	  if (a>c){
		  if (a>d){
			 mayor=a;
			 }
           else{
			  mayor=d;
			}			   
			  }
		  else{
			 if(c>d){
              mayor=c;
			  }	
		  else{
              mayor=d;
			  }			  
			  }
	}
	else{
		if(b>c){
			if(b>d){
				mayor=b;
                 }		
            else{
				mayor=d;
				}				
			}
			else{
				if(c>d)
				{
					mayor=c;
					}
					else{
					mayor=d;
					}
			}
	}
total=(m*100)/menor;
aporteMayor=total*mayor/100;
System.out.println("El porcentaje del menor es : " + menor);	
System.out.println("El porcentaje del mayor es : " + mayor);	
System.out.println("El aporte del mayor es de : $" + aporteMayor);	




}
}
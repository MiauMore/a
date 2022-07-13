import java.util.Scanner;
public class ferreteria{
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		
		int start=0;
		int productos[][] = new int [20][2];
		String nombre[] = new String [20];
		
		
		
		
		while(start!=-1){
			
			
			for(int i=0; i<productos.length; i++){
			
				for(int j=0; j<productos[0].legnth; i++){
					
					System.out.println("Indique el nombre del "+ i +"producto");
					nombre[i] = tec.next();
					
					System.out.println("Indique el estock del"+ producto[i][j] +"producto");
					productos[i][j] = tec.nextInt();
					
					System.out.println("Indique el precio del"+ producto[i][j] +"producto");
					productos[i][j] = tec.nextInt();
				
				}
				
				
			}
		
		
		
		
		
		}
		
		
		
		
		
		
		
	}
}
	
	
	
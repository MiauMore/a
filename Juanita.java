import java.util.Scanner;
public class Juanita{
    public static void main (String[]args){
        //definir las variables a utilizar
        int PrecioGar;
        int PrecioPor;
        int PrecioLen;
        int KPor=0;
        int KGar=0;
        int KLen=0;
        int StockPor1;
        int StockPor;
        int StockGar;
        int StockGar1;
        int StockLen;
        int StockLen1;
        int TPor=0;
        int TGar=0;
        int TLen=0;
        int TDinero;
        int TDGar;
        int TDPor;
        int TDLen;
        String resp;
        Scanner teclado= new Scanner (System.in);
        System.out.println("¿Cual es el precio de los porotos hoy?");
        PrecioPor=teclado.nextInt();
        System.out.println("¿Cuantos kilos hay disponibles?");
        StockPor= teclado.nextInt();
        StockPor1=StockPor;
        System.out.println("¿Cual es el precio de las lentejas hoy?");
        PrecioLen=teclado.nextInt();
        System.out.println("¿Cuantos kilos hay disponibles?");
        StockLen=teclado.nextInt();
        StockLen1=StockLen;
        System.out.println("¿Cual es el precio de los garbanzos hoy?");
        PrecioGar=teclado.nextInt();
        System.out.println("¿Cuantos kilos hay disponibles?");
        StockGar=teclado.nextInt();
        StockGar1=StockGar;
        System.out.println("¿Algun cliente llevara algun producto?");
        resp=teclado.next();
        while ("si".equals(resp)) {
            if (StockPor>=1){
                 System.out.println ("¿Cuantos kilos de porotos llevara?");
                 KPor=teclado.nextInt();
                 if (StockPor>=KPor){
                     TPor=TPor+KPor;
                     StockPor=StockPor-KPor;
                 }else{
                     System.out.println ("No queda esa cantidad de kilos");
                 }
            }else{
                System.out.println ("No quedan porotos");
            }
            if (StockLen>=1){
                System.out.println ("¿Cuantos kilos de lentejas llevara?");
                KLen=teclado.nextInt();
                if (StockLen>=KLen){
                    TLen=TLen+KLen;
                    StockLen=StockLen-KLen;
                }else{
                     System.out.println ("No queda esa cantidad de kilos");
                }
            }else{
                System.out.println ("No quedan lentejas");
            }
            if (StockGar>=1){
                System.out.println ("¿Cuantos kilos de garbanzos llevara?");
                KGar=teclado.nextInt();
                if (StockGar>=KGar){
                    TGar=TGar+KGar;
                    StockGar=StockGar-KGar;
                }else{
                     System.out.println ("No queda esa cantidad de kilos");
                }
            }else{
                System.out.println ("No quedan garbanzos");
            }
            System.out.println ("¿Hay mas clientes?");
            resp=teclado.next();

            }
        TDGar= (KGar*PrecioGar);
        TDPor= (KPor*PrecioPor);
        TDLen= (KLen*PrecioLen);
        TDinero= (TDGar)+( TDLen)+(TDPor);

        System.out.println ("Producto    Stock inicial    Stock final    $Venta del dia");
        System.out.println ("Lentejas    " + StockLen1 + "                 " +     StockLen +          "             $" + TDLen);
        System.out.println ("Porotos     " + StockPor1 + "                 " +     StockPor +          "             $" + TDPor);
        System.out.println ("Garbanzos   " + StockGar1 + "                 " +     StockGar +          "             $" + TDGar);
        System.out.println ("                                                 $"+TDinero );
        }

}      
        

    
import java.util.*;
public class Preguntas
    public static void main (string{} args){
        Scanner sc new= Scanner(System.in);
        int= a=0, b=0, c=0,g1=0,g2=0,g3=0,edad;
        String voto;
        voto=sc.next(); if voto
        edad=sc.nextInt()
        while(!voto.equals("F")){
            switch(voto){
                case "a":
                case "A": a++;
                break
                case "b":
                case "B": b++;
                break
                case "c":
                case "C": c++;
                default: System.out.println("Lista no existe");
            }
            if(edad<=19){
                g1++;
            }else if(edad<=22){
                g2++;
            } else{
                g3++;
            }
            voto=sc.next();
        }
        System.out.println("lista/total votos/ t% votos");
        System.out.println("A/t")+ a+"/t"+a/(a+b+c)*100
        System.out.println("B/t")+ b+"/t"+a/(a+b+c)*100
        System.out.println("C/t")+ c+"/t"+a/(a+b+c)*100
        System.out.println
        System.out.println












            }






        }
    }
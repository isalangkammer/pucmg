/* Calcular se um ano 
 * � bissexto ou n�o
 */
import IO.*;
public class anobissexto{
    public static void main(String[]args){
       int ano,r;
       System.out.println("Programa para mostrar se um ano � bissexto ou n�o:");
       ano=IO.readint("Digite um ano:");
       r=ano%4;
       if(r==0){
          r=ano%100;
          if(r==0){
             r=ano%400;
             if(r==0){
                System.out.println("O ano � bissexto");
             }//fimif
             else{
                System.out.println("N�o � bissexto");
             }//fimelse
          }//fimif
          else{
              System.out.println("O ano � bissexto");
          }//fimelse
       }//fimif   
       else{
           System.out.println("N�o � bissexto");
       }//fimelse
    }//fim main()
}//fim classe
       
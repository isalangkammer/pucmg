/* Calcular se um ano 
 * é bissexto ou não
 */
import IO.*;
public class anobissexto{
    public static void main(String[]args){
       int ano,r;
       System.out.println("Programa para mostrar se um ano é bissexto ou não:");
       ano=IO.readint("Digite um ano:");
       r=ano%4;
       if(r==0){
          r=ano%100;
          if(r==0){
             r=ano%400;
             if(r==0){
                System.out.println("O ano é bissexto");
             }//fimif
             else{
                System.out.println("Não é bissexto");
             }//fimelse
          }//fimif
          else{
              System.out.println("O ano é bissexto");
          }//fimelse
       }//fimif   
       else{
           System.out.println("Não é bissexto");
       }//fimelse
    }//fim main()
}//fim classe
       
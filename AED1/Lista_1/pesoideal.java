/* Programa para calcular
 * o peso ideal, a partir do genero
 */
import IO.*;
 public class pesoideal{
   public static void main(String[]args){
      char genero;
      double altura, peso=0;
      do{
         genero=IO.readchar("Digite seu genero[f/m]:");
         while(genero!='f' && genero!='m'){
            System.out.println("Invalido");
            genero=IO.readchar("Digite seu genero[f/m]:");
         }
      }while(genero!='f' && genero!='m');
      altura=IO.readdouble("Digite sua altura:");
      if(genero=='m'){
         peso=(72.7 * altura)-58;
      }
      else{
         peso=(62.1*altura)-44.7;
      }
      System.out.println("PESO IDEAL= "+peso+" kg");
   }//fim main()
 }//fim class
       
/*Calcular o peso ideal
 * de uma pessoa do sexo masculino
 */
 
import IO.*;
public class pesoidealmasculino{
   public static void main(String[]args){
      double h,peso=0;
      h=IO.readdouble("Digite sua altura:");
      peso=(72.7 * h)-58;
      System.out.println("PESO IDEAL: "+peso+" kg");
   }//fim main()
 }//fim class
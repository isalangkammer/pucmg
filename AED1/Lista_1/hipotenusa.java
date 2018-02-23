/* Calcular o valor 
 * da hipotenusa de um triângulo
 */
 import IO.*;
 public class hipotenusa{
   public static void main(String[]args){
      double cat1,cat2,hip=0;
      cat1=IO.readdouble("Digite o cateto 1:");
      cat2=IO.readdouble("Digite o cateto 2:");
      hip=Math.pow(cat1,2)+Math.pow(cat2,2);
      hip=Math.sqrt(hip);
      System.out.println("Hipotenusa= "+hip);
   }//fim main()
 }//fim class
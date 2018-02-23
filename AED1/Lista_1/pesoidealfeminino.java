/* Calcular o peso ideal
 * de uma pessoa do sexo feminino
 */

import IO.*;
 public class pesoidealfeminino{
   public static void main(String[]args){
      double h,peso=0;
      h=IO.readdouble("Digite sua altura:");
      peso=(62.1*h)-44.7;
      System.out.println("PESO IDEAL: "+peso+" kg");
   }//fim main()
 }//fim class
       
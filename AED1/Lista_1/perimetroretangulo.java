/* Calcular o perímetro de um retangulo*/

import IO.*;
public class perimetroretangulo{
     public static void main(String[]args){
            double b,h,p;
            b= IO.readdouble("Digite o valor da base:");
            h= IO.readdouble("Digite o valor da altura:");
            p=2*(b+h);
            System.out.println(" O perímetro do retangulo ="+p);
     }//fim main
}// fim classe
/* Programa para mostrar
 * se um triangulo é equilatero, isosceles ou escaleno 
 */
import IO.*;
public class tiposdetriangulo{
     public static void main(String[]args){
       double l1,l2,l3,r;
       l1=IO.readdouble("Digite o valor do lado 1:");
       l2=IO.readdouble("Digite o valor do lado 2:");
       l3=IO.readdouble("Digite o valor do lado 3:");
       if (l1==l2 && l2==l3){
          System.out.println("O triangulo é equilatero");
       }
       else if(l1!=l2 && l2!=l3 && l1==l3){
          System.out.println("O triangulo é isosceles");
       }
       if(l1!=l2 && l1!=l3 && l2!=l3){
          System.out.println("O triangulo é escaleno ");  
       }       
     }//fim main()
}//fim classe
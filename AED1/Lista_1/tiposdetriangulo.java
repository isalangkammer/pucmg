/* Programa para mostrar
 * se um triangulo � equilatero, isosceles ou escaleno 
 */
import IO.*;
public class tiposdetriangulo{
     public static void main(String[]args){
       double l1,l2,l3,r;
       l1=IO.readdouble("Digite o valor do lado 1:");
       l2=IO.readdouble("Digite o valor do lado 2:");
       l3=IO.readdouble("Digite o valor do lado 3:");
       if (l1==l2 && l2==l3){
          System.out.println("O triangulo � equilatero");
       }
       else if(l1!=l2 && l2!=l3 && l1==l3){
          System.out.println("O triangulo � isosceles");
       }
       if(l1!=l2 && l1!=l3 && l2!=l3){
          System.out.println("O triangulo � escaleno ");  
       }       
     }//fim main()
}//fim classe
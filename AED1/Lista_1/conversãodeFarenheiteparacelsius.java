/* Programa para calcular
 * a conversão de Farenheit para Celsius
 */
import IO.*;
public class conversãodeFarenheiteparacelsius{
    public static void main(String[]args){
       double F,C;
       F=IO.readint("Digite o grau em Farenheit:");
       C=5.0/9.0*(F-32);
       System.out.println("O grau em Celsius é:" +C);
    }//fim main()
}//fim classe
       
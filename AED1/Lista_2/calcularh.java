import IO.*;
public class calcularh{
       public static void main(String[]args){
              double h=0, t, i=0, x=5, a;
              t=IO.readdouble("Quantidade de termos:");
              while(i<t){
                   a=1.0/x;
                   h=h+a;
                   x=x+2;
                   i++;
                   System.out.println("="+a);
              }
              System.out.println("O valor de H é:"+h);
       }//fim main()
}//fim classe       
                   
                   
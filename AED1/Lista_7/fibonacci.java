import IO.*;
public class fibonacci{
       public static void main(String[]args){
              int n;
              n=lerTermo();
              calcularFibonacci(n);
       }
       public static int lerTermo(){
              int n;
              n=IO.readint("Digite a quantidade de termos:");
              return n;
       }
       public static void calcularFibonacci(int n){
              int f=0,g=1,r;
              for(int i=1; i<n; i++){
                 System.out.println(""+g);
                 r=g;
                 g=f+g;
                 f=r;
              }
       }
}
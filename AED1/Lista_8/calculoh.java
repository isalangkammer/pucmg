import IO.*;
public class calculoh{
       public static void main(String[]args){
              int n;
              n=lerTermos();
              double h;
              h=calcularH(n);
              resultado(h);
       }//fim main()
       public static int lerTermos(){
              int n;
              n=IO.readint("Digite a quantidade de termos:");
              return n;
       }//fim lerTermos()
       public static double calcularH(int n){
              int a=2; 
              double div,h=0;
              for(int i=1; i<=n; i++){
                  div=(double)a/100;
                  h=h+div;
                  a=a+3;
              }  
              return h;
       }//fim calcularH()
       public static void resultado(double h){
              System.out.println("H="+h);
       }//fim resultado()       
}//fim classe
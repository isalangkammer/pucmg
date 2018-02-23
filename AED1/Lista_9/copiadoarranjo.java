import IO.*;
public class copiadoarranjo{
       public static void main(String[]args){
              int x=IO.readint("Digite o tamanho do arranjo:");
              double[]a=new double[x];
              double[]b=new double[x];
              learranjo(a);
              copiaArranjo(a,b);
              
       }//fim main
        public static void learranjo(double[]a){
              for(int i=0; i<a.length;i++){
                  a[i]=IO.readdouble("Digite um valor:");
              }
       }//fim learranjo
       public static void copiaArranjo(double[]a, double[]b){
              for(int i=0; i<a.length;i++){
                  b[i]=a[i];
                  System.out.println("="+b[i]);
              }//fim for
       }//fim copiaarranjo
}//fim classe

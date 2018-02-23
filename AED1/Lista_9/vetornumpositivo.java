import IO.*;
public class vetornumpositivo{
       public static void main(String[]args){
              int x=IO.readint("Digite o tamanho do arranjo:");
              double[] a= new double[x];
              int p;
              learranjo(a);
              p=verificaPositivos(a);
              System.out.println("Números positivos:"+p);
       }
       public static void learranjo(double[]a){
              for(int i=0; i<a.length;i++){
                  a[i]=IO.readdouble("Digite um valor:");
              }
       }
       public static int verificaPositivos(double[]a){
              int positivos=0;
              for(int i=0; i<a.length;i++){
                  if(a[i]>0){
                     positivos++;
                  } 
              }//fim for
              return positivos; 
       }//fim verificarpositivo
}//fim classe
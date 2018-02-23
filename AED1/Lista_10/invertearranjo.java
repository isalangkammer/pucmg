import IO.*;
public class invertearranjo{
   public static void main(String[]args){
      int i=0,j;
      j=IO.readint("Digite o tamanho:");
      double[]a=new double[j];
      inverte(a,i,j);
      arranjo(a);
   }//fim main
   public static void inverte(double[]a,int i, int j){
      double aux;
      if(i>=j){
         return;
      }   
      aux=a[i];
      a[i]=a[j];
      a[j]=aux;
      inverte(a,(i+1),(j-1));
   }//fim 
   public static void arranjo(double[]a){
      for(int i=0;i<a.length;i++){
         System.out.println(+a[i]+"\t");
      }
   }//fim 
}//fim classe
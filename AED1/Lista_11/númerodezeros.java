import IO.*;
public class númerodezeros{
      public static void main(String[]args){
            int a=IO.readint("Digite o tamanho do arranjo:");
            double[]x=new double[a];
            leArranjo(x);
            int qt,i=0;
            qt=qtZeros(x,i);
            System.out.println("Quantidade de zeros:"+qt);
      }
      public static void leArranjo(double[]x){
            for(int i=0;i<x.length;i++){
                  x[i]=IO.readdouble("Valor:");
            }
      }
      public static int qtZeros(double[]x, int i){
            if(i>=x.length)return 0;
            if(x[i]==0){
               return(1+qtZeros(x,(i+1)));
            }
            else{
               return(0+qtZeros(x,(i+1)));
            }          
      }//fim qtZeros
}//fim classe
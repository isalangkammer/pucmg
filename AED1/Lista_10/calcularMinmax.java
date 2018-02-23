import IO.*;
public class calcularMinmax{
      public static void main(String[]args){
            int x,y;
            x=IO.readint("Digite a quantidade de linhas da matriz:");
            y=IO.readint("Digite a quantidade de colunas da matriz:");
            double[][]m=new double[x][y];
            leMatriz(m);
      }//fim main()
      public static void leMatriz(double[][]m){
            int i,j;
            for(i=0;i<m.length;i++){
               for(j=0;j<m[i].length;j++){
                  m[i][j]=IO.readdouble("Digite um valor para a linha "+i+" e coluna "+j+":");
               }//fim for
            }//fim for
      }//fim leMatriz
      public static double CalcularMin(double[][]m){
            double min,max;
            min=m[0][0];
            max=m[0][0];
            for(int i=0;i<m.length;i++){
               for(int j=0;j<m[i].length;j++){
                  if(m[i][j]<min){
                     min=m[i][j];
                     for(
                  }
               }
            }
      }//fim calcularMinMax
}//fim classe
import IO.*;
public class somaacimadiagonal{
      public static void main(String[]args){
            System.out.println("Programa para calcular a media da diagonal principal de uma matriz quadrada.");
            int lc=IO.readint("Digite o número de linhas e colunas:");
            double[][]m=new double[lc][lc];
            leMatriz(m);
            double soma=somaAcimaDiagonal(m);
            System.out.println("A Soma dos elementos acima da diagonal principal é: "+soma);
      }//fim main
      public static void leMatriz(double[][]m){
            int i,j;
            for(i=0;i<m.length;i++){
               for(j=0;j<m[i].length;j++){
                  m[i][j]=IO.readdouble("Digite um valor para a linha "+i+" e coluna "+j+":");
               }//fim for
            }//fim for
      }//fim leMatriz
      public static double somaAcimaDiagonal(double[][]m){
            int i,j;
            double soma=0;
            for(i=0;i<m.length;i++){
               for(j=0;j<m[i].length;j++){
                  if(i!=j){
                     soma=soma+m[i][j];
                  }//fim for
               }//fim for
            }//fim for   
            return soma;
      }//fim mediadiagonal
}//fim classe
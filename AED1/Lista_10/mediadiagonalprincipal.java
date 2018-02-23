import IO.*;
public class mediadiagonalprincipal{
      public static void main(String[]args){
            System.out.println("Programa para calcular a media da diagonal principal de uma matriz quadrada.");
            int lc=IO.readint("Digite o número de linhas e colunas:");
            double[][]m=new double[lc][lc];
            leMatriz(m);
            double media=mediaDiagonal(m);
            System.out.println("A média da diagonal principal é: "+media);
      }//fim main
      public static void leMatriz(double[][]m){
            int i,j;
            for(i=0;i<m.length;i++){
               for(j=0;j<m[i].length;j++){
                  m[i][j]=IO.readdouble("Digite um valor para a linha "+i+" e coluna "+j+":");
               }//fim for
            }//fim for
      }//fim leMatriz
      public static double mediaDiagonal(double[][]m){
            int i,j,qt=0;
            double soma=0, media=0;
            for(i=0;i<m.length;i++){
               for(j=0;j<m[i].length;j++){
                  if(i==j){
                     soma=soma+m[i][j];
                     qt++;
                  }//fim for
               }//fim for
            }//fim for   
            media=soma/(double)qt;
            return media;
      }//fim mediadiagonal
}//fim classe
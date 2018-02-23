import IO.*;
public class multiplicacaomatriz{
      public static void main(String[]args){
            int i,j;
            i=IO.readint("Digite a quantidade de linhas da 1ªmatriz:");
            j=IO.readint("Digite a quantidade de colunas da 1ªmatriz:");
            double[][]a=new double[i][j];
            int x,y;
            do{
               x=IO.readint("Digite a quantidade de linhas da 2ªmatriz:");
               while(x!=j){
                  System.out.println("INVÁLIDO!Para multiplicação de matrizes é necessário que o número de colunas da 1ª seja igual ao numero de linhas da Segunda!");
                  x=IO.readint("Digite a quantidade de linhas da 2ªmatriz:");
               }  
            }while(x!=j);   
            y=IO.readint("Digite a quantidade de colunas da 2ªmatriz:");
            double[][]b=new double[x][y];
            double[][]r=new double[i][y];
            leMatriz(a);
            leMatriz(b);
            multiplicaMatriz(a,b,r);
            imprimirMatriz(r);
      }//fim main()
      public static void leMatriz(double[][]m){
            int i,j;
            for(i=0;i<m.length;i++){
               for(j=0;j<m[i].length;j++){
                  m[i][j]=IO.readdouble("Digite um valor para a linha "+i+" e coluna "+j+":");
               }//fim for
            }//fim for
      }//fim leMatriz
      public static void multiplicaMatriz(double[][]a, double[][]b, double[][]r){
            int i,j;
            double aux,s=0;
            for(i=0;i<a.length;i++){
               for(j=0;j<a[i].length;j++){
                  aux=a[i][j]*b[i][j];
                  s=aux+s;
                  aux=a[i][j+1]*b[i][j+1];
                  s=aux+s;
                  r[i][j]=s;
               }
            }   
      }//fim multiplicaMatriz
      public static void imprimirMatriz(double[][]r){
            int i,j;
            for(i=0;i<r.length;i++){
               for(j=0;j<r[i].length;j++){
                  System.out.print(+r[i][j]+"\t");
               }
               System.out.print("\n");
            }
      }//fim imprimirMatriz
}//fim classe

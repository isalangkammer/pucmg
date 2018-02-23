 /**
  * Criar uma matriz de reais 5x5 e calcular a matriz transposta
  * Questão 1 - Parte I - Lista 13
  *
  * Autora: Isabelle Alves Langkammer
  */
 import IO.*;
 public class matriz{
   public static void main(String[]args){
      double[][]m=new double[5][5];
      double[][]aux=new double[5][5];
      double valor;
      leMatriz(m);
      for(int i=0;i<m.length;i++){
         valor= valorLinha(m,i);
         System.out.println("O maior valor da linha "+i+" é :"+valor);
      }
      mediaDiagonal(m);
      maiorValor(m);
      maiorColuna(m);
      matrizTransposta(m,aux);
      imprimeMatriz(aux);
   }
   /**
    * Método para ler uma matriz
    *
    * @param m matriz 
    */
   public static void leMatriz(double[][]m){
      for(int i=0;i<m.length;i++){
         for(int j=0;j<m[i].length;j++){
            m[i][j]=IO.readdouble("Digite o valor da linha "+i+" e coluna "+j+" :");
         }//fim for
      }//fim for
   }//fim leMatriz()
   /**
    * Método para calcular o maior valor de cada linha
    *
    * @param m matriz
    * @param i valor da linha
    *
    * @return maior maior valor da linha
    */
   public static double valorLinha(double[][]m, int i){
      double maior=m[i][0];
      for(int j=1;j<m[i].length;j++){
         if(m[i][j]>maior){
            maior=m[i][j];
         }//fim if
      }//fim for
      return maior;
   }//fim valorLinha()
   /**
    * Método para calcular a média da diagonal principal
    *
    * @param m matriz
    */
   public static void mediaDiagonal(double[][]m){
      double media=0, soma=0;
      for(int i=0; i<m.length;i++){
         for(int j=0;j<m[i].length;j++){
            if(i==j){
               soma=soma+m[i][j];
            }//fim if   
         }//fim for
      }//fim for
      media=soma/5.0;
      System.out.println("A média da diagonal principal é: "+media); 
   }//fim mediaDiagonal()
   /**
    * Método que calcula em qual coluna está o maior número.
    *
    * @param m matriz
    */
   public static void maiorColuna(double[][]m){
      int coluna=0;
      double maior=m[0][0];
      for(int i=0;i<m.length;i++){
         for(int j=1;j<m[i].length;j++){
            if(m[i][j]>maior){
               coluna=j;
               maior=m[i][j];
            }//fim if
         }//fim for
      }//fim for
      System.out.println("A coluna "+coluna+" possui o maior valor da matriz.");
   }//fim maiorColuna()
   /**
    * Método para calcular o maior valor abaixo da diagonal principal
    *
    * @param m matriz
    */
   public static void maiorValor(double[][]m){
      double maior=m[1][0];
      for(int i=0;i<m.length;i++){
         for(int j=0;j<m[i].length;j++){
            if(i<j){
               if(m[i][j]>maior){
                  maior=m[i][j];
               }//fim if
            }//fim if
         }//fim for
      }//fim for
      System.out.println("O "+maior+" é o maior valor abaixo da diagonal principal");
   }//fim maiorValor()
   /**
    * Método que calcula a matriz transposta
    *
    * @param m matriz
    * @param aux matriz auxiliar 
    */
   public static void matrizTransposta(double[][]m, double[][]aux){
      for(int i=0;i<m.length;i++){
         for(int j=0;j<m[i].length;j++){
            aux[j][i]=m[i][j];
         }//fim for
      }//fim for
   }//fim matriz transposta()
   /**
    * Método para imprimir a matriz transposta
    *
    * @param aux matriz auxiliar
    */
   public static void imprimeMatriz(double[][]aux){
      System.out.println("Matriz Transposta:");
      for(int i=0;i<aux.length;i++){
         for(int j=0;j<aux[i].length;j++){
            System.out.print(+aux[i][j]+"\t");
         }//fim for
         System.out.print("\n");
      }//fim for
   }//fim imprimeMatriz()
 }//fim class matriz
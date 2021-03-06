/**
 * Calcular o en�simo n�mero Fibonacci.
 * Quest�o 01 - Parte II - Lista 13
 *
 * Autora: Isabelle Alves Langkammer
 */
 import IO.*;
 public class fibonacciRecursivo{
   public static void main(String[]args){
      int n, i=0, j=1;
      n=IO.readint("Digite um n�mero:");
      fibonacci(n-1,i,j);   
   }//fim main()
   /**
    * M�todo recursivo para calcular o en�simo termo de Fibonacci
    *
    * @param n en�simo termo
    * @param i v�riavel auxiliar
    * @param j v�riavel auxiliar
    */
   public static void fibonacci(int n, int i,int j){
      System.out.print(+i+" ");
      int aux=0;
      if(n<=0)return;
      else{
         fibonacci(n-1,j,j+i);
      }//fim else
   }//fim fibonacci()
 }//fim class fibonacciRecursivo
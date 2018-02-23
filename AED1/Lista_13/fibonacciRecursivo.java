/**
 * Calcular o enésimo número Fibonacci.
 * Questão 01 - Parte II - Lista 13
 *
 * Autora: Isabelle Alves Langkammer
 */
 import IO.*;
 public class fibonacciRecursivo{
   public static void main(String[]args){
      int n, i=0, j=1;
      n=IO.readint("Digite um número:");
      fibonacci(n-1,i,j);   
   }//fim main()
   /**
    * Método recursivo para calcular o enésimo termo de Fibonacci
    *
    * @param n enésimo termo
    * @param i váriavel auxiliar
    * @param j váriavel auxiliar
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
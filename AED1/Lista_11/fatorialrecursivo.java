/**
 * Método recursivo para calcular o enésimo número Fibonacci.
 * Questão 01 - Parte II - Lista 13
 *
 * Autora: Isabelle Alves Langkammer
 */
 import IO.*;
 public class fatorialrecursivo{
   public static void main(String[]args){
            long n, fat;
            n=IO.readint("Digite o enésimo número:");
            fat=fatorial(n);
            System.out.println("="+fat);
      }
      public static long fatorial(long n){
            if(n<=1)return 1;
            return n*fatorial(n-1);
      }
 }//fim classe
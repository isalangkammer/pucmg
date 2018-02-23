import IO.*;
public class seqrecursiva{
      public static void main(String[]args){
            escreva(1);
      }
      public static void escreva(int c){
            if(c>5)return;
            System.out.print(+c+", ");
            escreva((c+1));
            System.out.print(+c+", ");
      }//fim escreva
}//fim classe
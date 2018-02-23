import IO.*;
public class sequenciarecursiva{
      public static void main(String[]args){
            escreva(1);
      }
      public static void escreva(int c){
            if(c>10)return;
            System.out.println(+c+", ");
            escreva((c+1));
      }//fim escreva
}//fim classe
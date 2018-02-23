import IO.*;
public class recursividadec{
      public static void main(String[]args){
            escreva(1);
      }
      public static void escreva(int c){
            if(c>10)return;
            System.out.println("Olá Mundo!");
            escreva((c+1));
      }//fim escreva
}//fim classe
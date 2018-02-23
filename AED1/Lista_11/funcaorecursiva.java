import IO.*;
public class funcaorecursiva{
      public static void main(String[]args){
            int funcao,x;
            x=IO.readint("Digite um valor:");
            funcao=f(x);
      }//fim main()
      public static int f(int x);
         if(x==0){
            return 0;
         }
         if(x<0){
            return -1;
         }   
         return(2*f(x-5));
      }//fim f
}//fim classe
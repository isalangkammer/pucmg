import IO.*;
public class exponenciacaorecursiva{
      public static void main(String[]args){
            int b,e, result;
            b=IO.readint("Digite a base:");
            e=IO.readint("Digite o expoente:");
            result=exponenciacao(b,e);
            System.out.println("="+result);
      }//fim main
      public static int exponenciacao(int b, int e){
            if(e<=0)return 1;
            return b*exponenciacao(b,e-1);
      }//fim 
}//fim classe
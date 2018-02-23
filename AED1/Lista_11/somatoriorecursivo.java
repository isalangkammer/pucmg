import IO.*;
public class somatoriorecursivo{
      public static void main(String[]args){
            int i,n,result;
            i=IO.readint("Digite o número inicial:");
            n=IO.readint("Digite o número final:");
            result=somatorio(i,n);
            System.out.println("="+result);
      }//fim main
      public static int somatorio(int i, int n){
            if(i>=n)return 0;
            return i+somatorio(i+1,n);
      }//fim 
}//fim classe
import IO.*;
public class torredehanoi{
      public static void main(String[]args){
            System.out.println("Programa que resolve o problema da Torre de Hanói");
            int n=IO.readint("O número de discos a serem movidos:");
            torreHanoi(n,1,3,2);
      }//fim main()
      public static void torreHanoi(int n, int p1, int p2, int p3){
            if(n<=0)return;
            torreHanoi(n-1,p1,p3,p2);
            System.out.println("Move "+p1+"->"+p2);
            torreHanoi(n-1,p3,p2,p1);
      }
}//fim classe
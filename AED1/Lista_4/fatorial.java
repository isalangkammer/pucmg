import IO.*;
public class fatorial{
       public static void main(String[]args){
              int n,i,fat=1;
              n=IO.readint("Digite um número:");
              i=n;
              while(i>1){
                 fat=fat*i;
                 i=i-1;
              }
              System.out.println("Fatorial="+fat);
       }//fim main()
}//fim classe               
              
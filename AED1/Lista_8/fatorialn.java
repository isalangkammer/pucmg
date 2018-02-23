import IO.*;
public class fatorialn{
       public static void main(String[]args){
              int num, fat;
              num=lerNum();
              fat=calculoFatorial(num);
              resultado(fat);
       }
       public static int lerNum(){
              int n;
              do{
                 n=IO.readint("Digite um número:");
                 while(n<1){
                    System.out.println("Inválido");
                    n=IO.readint("Digite um número:");
                 }   
              }while(n<1);   
              return n;
       }
       public static int calculoFatorial(int n){
              int i, fat=1;
              i=n;
              while(i>=1){
                   fat=i*fat;
                   i=i-1;
              }
              return fat;
       }
       public static void resultado(int fat){
              System.out.println("Fatorial="+fat);
       }
}
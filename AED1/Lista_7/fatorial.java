import IO.*;
public class fatorial{
       public static void main(String[]args){
              int num,fat;
              num=lerValor();
              fat=calcularFatorial(num);
              resultado(fat);
       }
       public static int lerValor(){
              int n;
              do{
                 n=IO.readint("Digite um número:");
                 if(n<=0){
                      System.out.println("Inválido");
                      n=IO.readint("Digite um número:");
                 }
              }while(n<=0);
              return n;
       }
       public static int calcularFatorial(int a){
              int fat, i;
              i=a;
              fat=1;
              while(i>0){
                    fat=fat*i;
                    i=i-1;
              }
              return fat;
       }
       public static void resultado(int fat){
              System.out.println("Fatorial="+fat);
       }
}
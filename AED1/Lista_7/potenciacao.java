import IO.*;
public class potenciacao{
       public static void main(String[]args){
              int base, expoente;
              double pot;
              base=lerBase();
              expoente=lerExp();
              pot=calcularPotencia(base,expoente);
              System.out.println("="+pot);
              
       }
       public static double calcularPotencia(int b, int e){
              double p;
              p=Math.pow(b,e);
              return p;
       }
       public static int lerBase(){
              int b;
              do{
                 b=IO.readint("Digite a base:");
                 if(b<=0){
                    System.out.println("Inválido");
                    b=IO.readint("Digite a base:");
                 }
              }while(b<=0);
              return b;
       }
       public static int lerExp(){
               int exp;
               do{
                  exp=IO.readint("Digite o expoente:");
                  if(exp<=0){
                     System.out.println("Inválido");
                     exp=IO.readint("Digite o expoente:");
                  }
               }while(exp<=0);
               return exp;
       }
}
import IO.*;
public class potenciacao{
       public static void main(String[]args){
              int base, expoente; 
              double exponenciacao;
              base=lerbase();
              expoente=lerexpoente();
              exponenciacao=calcularpotenciacao(base,expoente);
              resultado(exponenciacao);
       }
       public static int lerbase(){
              int b;
              do{
                b=IO.readint("Digite o valor da base:");
                if(b<=0){
                   System.out.println("Inválido");
                }
              }while(b<=0);
              return b;
       }
       public static int lerexpoente(){
              int e;
              do{
                e=IO.readint("Digite o valor do expoente:");
                if(e<=0){
                   System.out.println("Inválido");
                }
              }while(e<=0);
              return e;
       }
       public static double calcularpotenciacao(int b, int e){
              double c;
              c=Math.pow(b,e);
              return c;
       }
       public static void resultado(double exp){
              System.out.println("Potenciação="+exp);
       }
}
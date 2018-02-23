import IO.*;
public class somatorio{
       public static void main(String[]args){
              int li,ls, s;
              li=lerlimiteI();
              ls=lerlimiteS();
              s=calcularSomatorio(li,ls);
              resultado(s);
              
       }
       public static int lerlimiteI(){
              int l;
              l=IO.readint("Digite o limite inferior:");
              return l;
       }
       public static int lerlimiteS(){
              int l;
              l=IO.readint("Digite o limite Superior:");
              return l;
       }
       public static int calcularSomatorio(int li, int ls){
              int soma=0;
              if(li<ls){
                 for(int i=li; i<=ls; i++){
                     soma=soma+i;
                 }
              }
              else if(ls<li){
                   for(int i=ls; i<=li; i++){
                       soma=soma+i;
                   }
              } 
              return soma;      
       }
       public static void resultado(int soma){
              System.out.println("Soma dos números="+soma);
       }
}
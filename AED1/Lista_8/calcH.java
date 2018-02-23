import IO.*;
public class calcH{
       public static void main(String[]args){
              int termos;
              double h;
              termos=lerquantidade();
              h=calcularH(termos);
              resultado(h);
       }//fim main
       public static int lerquantidade(){
              int t;
              do{
                 t=IO.readint("Digite a quantidade de termos:");
                 while(t<0){
                      System.out.println("Comando Inválido");
                      t=IO.readint("Digite a quantidade de termos:");
                 }//fim while
              }while(t<0);
              return t;
       }//fim lerquantidade
       public static double calcularH(int t){
              int n=1,d=1;
              double soma=0, div=0;
              for(int i=1; i<=t; i++){
                  div=(double)n/(double)d;
                  soma=soma+div;
                  n=n+2;
                  d=d+1;
              }//fim for
              return soma;
       }//fim calcularH
       public static void resultado(double h){
              System.out.println("H="+h);
       }//fim resultado
}
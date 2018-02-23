import IO.*;
public class valorH{
       public static void main(String[]args){
              double h; 
              int t;
              t=lertermos();
              h=calcularH(t);
              resultado(h);  
       }//fim main
       public static int lertermos(){
              int t;
              do{
                 t=IO.readint("Digite a quantidade de termos:");
                 while(t<0){
                      System.out.println("Comando Inválido");
                      t=IO.readint("Digite a quantidade de termos:");
                 }//fim while
              }while(t<0);
              return t;
       }//fim lertermos       
       public static double calcularH(int t){
              double a, h=0, var=100;
              for(int i=1;i<=t;i++){
                  a=(double)1/(double)var;
                  h=h+a;
                  var=var-1;
              }//fim for
              return h;
       }//fim calcularH
       public static void resultado(double h){
               System.out.println("H="+h);
       }//fim resultado
}//fim classe       
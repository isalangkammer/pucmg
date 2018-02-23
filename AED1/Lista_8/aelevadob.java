import IO.*;
public class aelevadob{
       public static void main(String[]args){
              int a, b, elevado;
              a=lerA();
              b=lerB();
              elevado=AelevadoB(a,b);
              resultado(elevado);
       }//fim main
       public static int lerA(){
              int a;
              do{
                 a=IO.readint("Digite o valor de A:");
                 while(a<0){
                       System.out.println("Inválido");
                       a=IO.readint("Digite o valor de A:");
                 }//fim while  
              }while(a<0);
              return a;        
       }//fim lerA
       public static int lerB(){
              int b;
              do{
                 b=IO.readint("Digite o valor de B:");
                 while(b<0){
                       System.out.println("Inválido");
                       b=IO.readint("Digite o valor de B:");
                 }//fim while    
              }while(b<0);
              return b;   
       }//fim lerB
       public static int AelevadoB( int a, int b){
              int elev=1;
              for(int i=1; i<=b; i++){
                  elev=a*elev;
              }//fim for
              return elev;
       }//fim AelevadoB
       public static void resultado(int e){
              System.out.println("="+e);
       }//fim resultado
}//fim classe
import IO.*;
public class perimetroretangulo{
       public static void main(String[]args){
              double base, altura, perimetro;
              base=lerBase();
              altura=lerAltura();
              perimetro=calcularPerimetro(base,altura);
              resultado(perimetro);
              
       }
       public static double lerBase(){
              double b;
              do{
                 b=IO.readdouble("Digite o valor da base:");
                 if(b<=0){
                    System.out.println("Inválido");
                 }
              }while(b<=0);   
              return b;
       }
       public static double lerAltura(){
              double h;
              do{
                 h=IO.readdouble("Digite o valor da altura:");
                 if(h<=0){
                    System.out.println("Inválido");
                 }
              }while(h<=0);
              return h;
       }
       public static double calcularPerimetro(double a, double b){
              double p;
              p=2*(a+b);
              return p;
       }
       public static void resultado(double perimetro){
              System.out.println("Perímetro do retângulo="+perimetro);
       }       
}       
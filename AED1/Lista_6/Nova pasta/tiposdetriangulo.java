import IO.*;
public class tiposdetriangulo{
       static final int TIPO1=1, TIPO2=2, TIPO3=3;
       public static void main(String[]args){
              double l1,l2,l3;
              int tipot;
              l1=lado1();
              l2=lado2();
              l3=lado3();
              tipot=tipotriangulo(l1,l2,l3);
              triangulo(tipot);
       }//fim main()
       public static double lado1(){
              double l1;
              do{
                 l1=IO.readdouble("Digite o lado 1:");
                 if(l1<=0){
                    System.out.println("Inválido");
                 }
              }while(l1<=0);
              return l1;
       }//fim lado1()
       public static double lado2(){
              double l2;
              do{
                 l2=IO.readdouble("Digite o lado 2:");
                 if(l2<=0){
                    System.out.println("Inválido");
                 }
              }while(l2<=0);
              return l2;
       }//fim lado2()
       public static double lado3(){
              double l3;
              do{
                 l3=IO.readdouble("Digite o lado 3:");
                 if(l3<=0){
                    System.out.println("Inválido");
                 }
              }while(l3<=0);
              return l3;
       }//fim lado3()
       public static int tipotriangulo(double l1, double l2, double l3){
              int tipo=0;
              if(l1==l2 && l2==l3){
                 tipo=TIPO1;
              }
              if(l1!=l2 && l1!=l3 && l2!=l3){
                 tipo=TIPO3;
              }
              else if(l1!=l2 || l2!=l3){
                 tipo=TIPO2;
              }
              return tipo;
       }// fim tipotriangulo()
       public static void triangulo(int tipot){
              if(tipot==0){
                 System.out.println("Não é um triangulo");
              }
              if(tipot==TIPO1){
                 System.out.println("Triangulo equilatero");
              }
              else if(tipot==TIPO2){
                 System.out.println("Triangulo isosceles");
              }
              else{
                 System.out.println("Triangulo escaleno");
              }   
       }//fim traingulo()
}       
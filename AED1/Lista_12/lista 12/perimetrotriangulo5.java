/**
 * Questão 05- Acrescentar a classe um método para verificar se dois triangulos são iguais
 *
 * Lista 12 - Aed 1
 *
 * Autora: Isabelle Alves Langkammer
 */
 import IO.*;
 public class perimetrotriangulo5{
    public static double lelado(){
      double lado;
      do{
         lado=IO.readdouble("Digite o lado:");
         while(lado<=0){
            System.out.println("VALOR INVÁLIDO");
            lado=IO.readdouble("Digite o lado:");
         }
      }while(lado<=0);
      return lado;   
   }//fim lelado()
   public static void main(String[]args){
      Triangulo a=new Triangulo();
      Triangulo[] triangulo=new Triangulo[5];
      Triangulo x= new Triangulo();
      for(int i=0;i<5;i++){
         triangulo[i]= new Triangulo();
      }//fim for
      double lado;
      for(int i=0;i<5;i++){
         System.out.println("Triangulo "+i);
         for(int j=1;j<4;j++){
            triangulo[i].setlado(lelado(),j);
         }
      }
      int t=IO.readint("Digite qual triangulo :");
      System.out.println("O perímetro é "+triangulo[t].perimetroTriangulo());
      if(triangulo[t].tipoTriangulo(t)==1){
         System.out.println("Triangulo equilatéro");
      }//fim if
      else if(triangulo[t].tipoTriangulo(t)==2){
         System.out.println("Triangulo isósceles");
      }//fim else if
      else{
         System.out.println("Triangulo escaleno");
      }//fim else
      boolean iguais=triangulo[0].ehIgual(triangulo[1]);
      if(iguais){
         System.out.println("Os triangulos são iguais");
      }
   }//fim main()
 }//fim class
 /**
  * Classe que descreve um Triangulo
  */    
 class Triangulo{
   private double lado1;
   private double lado2;
   private double lado3;
   /**
    * Atribui valor ao lado
    */
   public void setlado(double lado, int num){
      switch(num){
         case 1: lado1=lado;
         case 2: lado2=lado;
         case 3: lado3=lado;
         default: break;      
      }
   }    
   public double getlado(int num){
      switch(num){
         case 1: return lado1;
         case 2: return lado2;
         case 3: return lado3;
         default: return 0;  
      }
   }//fim getlado
   /**
    * Método para calcular o perímetro do triangulo.
    *
    * @return perimetro valor do perimetro do triangulo
    *
    */
   public double perimetroTriangulo(){
      double perimetro;
      perimetro=getlado(1)+getlado(2)+getlado(3);
      return perimetro;
   }//fim perimetroTriangulo()
   /**
    * Método que identifica e retorna o tipo de triangulo.
    *
    * @return 1,2 ou 3 tipo de triangulo
    */
   public int tipoTriangulo(int t){
      if(getlado(1)==getlado(2) && getlado(2)==getlado(3)){
         return 1;
      }//fim if
      else if(getlado(1)!=getlado(2) && getlado(1)!=getlado(3) && getlado(2)!=getlado(3)){
         return 3;
      }//fim else if
      else{
         return 2;
      }//fim else
   }//fim tipotriangulo
   public boolean ehIgual(int a){
      if(getlado(a)==a.Triangulo()){
         return true;
      }
      else{
         return false;
      }
   }   
 }//fim classe triangulo
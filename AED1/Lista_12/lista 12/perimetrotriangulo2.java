/**
 * Questão 03- Acrescentar a classe um método para ler os lados.
 *
 * Lista 12 - Aed 1
 *
 * Autora: Isabelle Alves Langkammer
 */
 import IO.*;
 public class perimetrotriangulo4{
   /**
    * Método para ler o lado do traingulo.
    *
    * @return lado valor do lado do triangulo.
    */
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
      Triangulo x= new Triangulo();
      double lado;
      lado=lelado();
      x.setlado1(lado);
      lado=lelado();
      x.setlado2(lado);
      lado=lelado();
      x.setlado3(lado);
      System.out.println("O perímetro é "+x.perimetroTriangulo());
      if(x.tipoTriangulo()==1){
         System.out.println("Triangulo equilatéro");
      }//fim if
      else if(x.tipoTriangulo()==2){
         System.out.println("Triangulo isósceles");
      }//fim else if
      else{
         System.out.println("Triangulo escaleno");
      }//fim else
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
    * Atribui valor ao lado 1
    */
   public void setlado1(double lado1){
      this.lado1=lado1;
   }//fim setlado1
   /**
    * Atribui valor ao lado 2
    */   
   public void setlado2(double lado2){
      this.lado2=lado2;
   }//fim setlado2
   /**
    * Atribui valor ao lado 3
    */   
   public void setlado3(double lado3){
      this.lado3=lado3;
   }//fim setlado3
   /**
    * Recupera valor ao lado 1
    */   
   public double getlado1(){
      return lado1;
   }//fim getlado1
   /**
    * Recupera valor ao lado 2
    */   
   public double getlado2(){
      return lado2;
   }//fim getlado2
   /**
    * Recupera valor ao lado 3
    */
   public double getlado3(){
      return lado3;
   }//fim getlado3
   /**
    * Método para calcular o perímetro do triangulo.
    *
    * @return perimetro valor do perimetro do triangulo
    *
    */
   public double perimetroTriangulo(){
      double perimetro;
      perimetro=getlado1()+getlado2()+getlado3();
      return perimetro;
   }//fim perimetroTriangulo()
   /**
    * Método que identifica e retorna o tipo de triangulo.
    *
    * @return 1,2 ou 3 tipo de triangulo
    */
   public int tipoTriangulo(){
      if(getlado1()==getlado2() && getlado2()==getlado3()){
         return 1;
      }//fim if
      else if(getlado1()!=getlado2() && getlado1()!=getlado3() && getlado2()!=getlado3()){
         return 3;
      }//fim else if
      else{
         return 2;
      }//fim else
   }//fim tipotriangulo   
 }//fim classe triangulo
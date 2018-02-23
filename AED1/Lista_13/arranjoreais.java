 /**
  * Inverter um arranjo.
  * Questão 02 - Parte II - Lista 13
  *
  * Autora: Isabelle Alves Langkammer
  */
 import IO.*;
 public class arranjoreais{
   public static void main(String[]args){
      int tamanho;
      tamanho=IO.readint("Digite o tamanho do arranjo:");
      double[]a=new double[tamanho];
      leArranjo(a);
      inverte(a,0,a.length-1);
      impressao(a);
   }//fim main()
   /*
    * Método para ler um arranjo.
    *
    * @param a arranjo
    */
   public static void leArranjo(double[]a){
      for(int i=0;i<a.length;i++){
         a[i]=IO.readdouble("Valor: ");
      }//fim for
   }//fim leArranjo()
   /**
    * Método para inverte um arranjo
    *
    * @param a arranjo
    * @param i variavel auxiliar
    * @param j variavel auxiliar
    */
   public static void inverte(double[]a, int i, int j){
      double aux;
      if(i>=j)return;
      aux=a[i];
      a[i]=a[j];
      a[j]=aux;
      inverte(a,i+1,j-1); 
   }//fim inverte()
   /**
    * Método que imprime o arranjo
    *
    * @param a arranjo
    */
   public static void impressao(double[]a){
      for(int i=0;i<a.length;i++){
         System.out.println(+a[i]);
      }//fim for
   }//fim impressao()
 }//fim class arranjoreais
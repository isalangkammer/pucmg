import IO.*;
public class aprovacao2{
       public static void main(String[]args){
              apresentacao();
              double n1, n2, nf;
              n1=lerNota();
              n2=lerNota();
              nf=notaFinal(n1,n2);
              if(nf>=60){
                 System.out.println("Aprovado");
              }
              else{
                 System.out.println("Reprovado");
              }   
       }//fim main()
       public static void apresentacao(){
              System.out.println("Programa para ler as duas notas do aluno e dizer se foi aprovado");
              System.out.println("Programa desenvolvido por Isabelle Langkammer");
       }//fim apresentacao()
       public static double lerNota(){
              double nota;
              do{
                 nota=IO.readdouble("Digite a nota[0..50]:");
                 if(nota<0 || nota>50){
                    System.out.println("Inválido");
                 }
              }while(nota<0 || nota>50);
              return nota;
       }//fim lerNota()
       public static double notaFinal(double a, double b){
              double soma;
              soma=a+b;
              return soma;       
       }              
}//fim classe 
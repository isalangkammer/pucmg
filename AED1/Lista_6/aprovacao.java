import IO.*;
public class aprovacao{
       public static void main(String[]args){
              apresentacao();
              double n1, n2, nf=0;
              n1=lerNota();
              n2=lerNota();
              nf=n1+n2;
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
}//fim classe       
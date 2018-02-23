import IO.*;
public class notasalunos{
       public static void main(String[]args){
              double nota, media, soma=0, maior=0, menor=100;
              int i=0;
              do{
                nota=lernota();
                if(nota!=-1){
                  soma=soma+nota;
                  i++;
                  maior=vermaior(nota, maior);
                  menor=vermenor(nota,menor);
                }
              }while(nota!=-1);  
              media=calcularmedia(soma,i);
              resultado(media, maior, menor);
       }
       public static double lernota(){
              double n;
              do{
                n=IO.readdouble("Digite a nota:");
                if(n>100 || n<0&& n!=-1){
                   System.out.println("Inválido");
                }
              }while(n>100 || n<0 && n!=-1);
              return n;
       }
       public static double calcularmedia(double soma, int i){
              double med;
              med=soma/(double)i;
              return med;  
       }
       public static double vermaior(double nota, double maior){
              if(nota>maior){
                 maior=nota;
              }
              return maior;
       }
       public static double vermenor(double nota, double menor){
              if(nota<menor){
                 menor=nota;
              }
              return menor;   
       }
       public static void resultado(double media, double maior, double menor){
              System.out.println("A media das notas:"+media);
              System.out.println("A menor nota: "+menor);
              System.out.println("A maior nota: "+maior);
       }

}
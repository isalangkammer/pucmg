import IO.*;
public class notafinal{
       public static void main(String[]args){
              int nota, ampliaprov=0, maior=60, menor=100, soma=0, quant=0;
              double medrep;
              nota=lerNota(); 
              while(nota>=0 && nota<=100){
                    if(nota>=60){
                       if(nota>maior){
                          maior=nota;
                       }
                       if(nota<menor){
                          menor=nota;
                       }
                    }
                    else if(nota<60){
                         soma=nota+soma;
                         quant++;
                    } 
                    nota=lerNota();        
              }// fim while
              ampliaprov=calcularAmplitude(maior, menor);
              medrep=calcularMedia(soma, quant);
              resultado(ampliaprov,medrep);
       }//fim main
       public static int lerNota(){
              int n;
              do{
                 n=IO.readint("Digite a nota final:");
                 while(n>100){
                       System.out.println("Inválido");
                       n=IO.readint("Digite a nota final:");
                 }
                 if(n<0){
                      break;
                 }
              }while(n<0);
              return n;
       }//fim lerNota
       public static int calcularAmplitude(int maior, int menor){
              int a;
              a= maior-menor;
              return a;
       }
       public static double calcularMedia(int soma, int quant){
              double media;
              media=(double)soma/(double)quant;
              return media;
       }
       public static void resultado(int a, double m){
              System.out.println("Amplitude dos alunos aprovados: "+a);
              System.out.println("Media dos reprovados: "+m); 
       }
}//fim classe
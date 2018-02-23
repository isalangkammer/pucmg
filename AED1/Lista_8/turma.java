import IO.*;
public class turma{
       public static void main(String[]args){
              int id, soma=0, quant=0, maior=18, menor=90,amplitude=0;
              double media;
              id=lerId();
              while(id>=0){
                  if(id>=18 && id<90){
                     if(id>maior){
                        maior=id;
                     }
                     else if(id<menor){
                        menor=id;
                     }
                  }
                  else if(id>0 && id<18){
                       soma=id+soma;
                       quant++;         
                  } 
                   id=lerId();
              }
              media=(double)soma/(double)quant;
              amplitude=maior-menor;
              resultado(media, amplitude);
       }
       public static int lerId(){
              int id;
              do{
                 id=IO.readint("Digite a idade[num. negativo para]:");
                 while(id>90){
                     System.out.println("inválido");
                     id=IO.readint("Digite a idade[num. negativo para]:");
                 }
                 if(id<0){
                    break;
                 }
              }while(id<0);
              return id;
       }
       public static void resultado(double media, int amplitude){
              System.out.println("Media="+media);
              System.out.println("Amplitude="+amplitude);
       }       
}
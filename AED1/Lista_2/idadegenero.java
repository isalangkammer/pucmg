import IO.*;
public class idadegenero{
       public static void main(String[]args){
              int idade=1,imasc=0, ifem=0, masc=0, fem=0;
              double medmasc=0, medfem=0;
              char genero;
              while(idade!=0){
                    idade=IO.readint("Digite a idade, para parar digite zero:");
                    while(idade<0){
                         System.out.println("INVÁLIDO");
                         idade=IO.readint("Digite a idade, para parar digite zero:");
                    }
                    if(idade==0){
                            break;
                    }        
                    genero=IO.readchar("Digite m para masculino e f para feminino:");
                    while(genero!='m' && genero!='f'){
                         System.out.println("INVÁLIDO");
                         genero=IO.readchar("Digite m para masculino e f para feminino:");
                    }
                    if(genero=='m'){
                       imasc=imasc+idade;
                       masc=masc+1;
                    }
                    else{
                       ifem=ifem+idade;
                       fem=fem+1;
                    }
              }//fim while
              medfem=(double)ifem/(double)fem;
              medmasc=(double)imasc/(double)masc;  
              System.out.println("A media de idade masculina é:"+medmasc);
              System.out.println("A media de idade feminina é:"+medfem);       
       }//fim main
}//fim classe
import IO.*;
public class genero{
       public static void main(String[]args){
              int idade, m=0, f=0,somam=0, somaf=0;
              char genero;
              double medm=0, medf=0;
              do{
                   idade=IO.readint("Digite a idade[para parar digite zero]:");
                   while(idade<0){
                        System.out.println("inválido");
                        idade=IO.readint("Digite a idade[para parar digite zero]:");
                   }
                   if(idade==0){
                         break;
                   }
                   genero=IO.readchar("Digite o genero [m para masculino e f para feminino]:");
                   while(genero!='m' && genero!='f'){
                         System.out.println("inválido");
                          genero=IO.readchar("Digite o genero [m para masculino e f para feminino]:");
                   }             
                   if(genero=='m'){
                       somam=idade+somam;
                       m++;
                   }
                   else{
                       somaf=idade+somaf;
                       f++;
                   }        
              }while(idade!=0);
              medm=(double)somam/(double)m;
              medf=(double)somaf/(double)f;
              System.out.println("A media de idade masculina é:"+medm);
              System.out.println("A media de idade feminina é:"+medf);
       }
}
                   
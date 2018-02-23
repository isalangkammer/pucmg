import IO.*;
public class pesquisa{
       public static void main(String[]args){
              int idade,genero,i=0,nf=0,nm=0, soma=0;
              double mediaid=0;
              do{
                idade=IO.readint("Digite a idade[0 ou menor para]:");
                
              }while(idade<=0); 
              if(idade>=0){
                do{
                  genero=IO.readint("Digite 0 para masculino e 1 para feminino:");
                }while(genero!=0 && genero!=1);
                soma=soma+idade;
                i++;
                if(genero==0){
                   if(idade>=18 && idade<=21){
                      nm++;
                   }
                }
                if(genero==1){
                   if(idade>=21){
                      nf++;
                   }
                }
                do{
                  idade=IO.readint("Digite a idade[0 ou menor para]:");
                }while(idade!=0 && idade>0);
                mediaid=(double)soma/(double)i;
                System.out.println("A media de idade é:"+mediaid);
                System.out.println("Quantidade de homens de 18 a 21:"+nm);
                System.out.println("Quantidade de mulheres a partor de 21:"+nf);
              }//fim if
       }//fim main()
}//fim classe
                   
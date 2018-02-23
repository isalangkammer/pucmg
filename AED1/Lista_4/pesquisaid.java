import IO.*;
public class pesquisaid{
       public static void main(String[]args){
              int idade, genero, nm=0, nf=0, soma=0, i=1;
              double media=0;
              idade=IO.readint("Digite a idade[zero para]:");
              while(idade!=0 || idade<0){
                    genero=IO.readint("Digite 1 para feminino e 0 para masculino:");
                    while(genero!=0 && genero!=1){
                          System.out.println("INVÁLIDO");
                          genero=IO.readint("Digite 1 para feminino e 0 para masculino:");
                    }
                    if(genero==0){
                       if(idade>=18 || idade<=21){
                           nm++;
                       }
                    }
                    if(genero==1){
                       if(idade>=21){
                          nf++;
                       }
                    }
                    soma=soma+idade;
                    i++;
                    idade=IO.readint("Digite a idade[zero para]:");      
              }
              media=(double)soma/(double)i;
              System.out.println("A media de idade:"+media);
              System.out.println("A quantidade de homens de 18 a 21 anos:"+nm);
              System.out.println("A quantidade de mulheres a partir de 21 anos:"+nf);
       }//fim main()
}//fim classe              
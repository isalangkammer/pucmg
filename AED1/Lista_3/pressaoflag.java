import IO.*;
public class pressaoflag{
       public static void main(String[]args){
             double media,menorp,maiorp,p,soma=0;
             int identificador, n=0;
             p=IO.readdouble("Digite a press�o[-1 para]:");
             menorp=p;
             maiorp=p;
             while(p!=-1){
                  p=IO.readdouble("Digite a press�o[-1 para]:");
                  identificador=IO.readint("Digite o identificador:");
                  while(identificador<0){
                        System.out.println("INVALIDO");
                        identificador=IO.readint("Digite o identificador:");
                  }
                  if(p<menorp){
                         menorp=p;
                  }
                  if(p>maiorp){
                         maiorp=p;
                  }
                  soma=soma+p;
                  n++;
              }//fim while
              media=soma/(double)n;
              System.out.println("A menor press�o �:"+menorp);
              System.out.println("A maior press�o �:"+maiorp);
              System.out.println("A m�dia �:"+media);
       }//fim main()
}//fim classe              
  
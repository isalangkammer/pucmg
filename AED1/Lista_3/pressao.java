import IO.*;
public class pressao{
       public static void main(String[]args){
              double pmedia=0, pressao, menorp, maiorp, soma=0;
              int identificador, n;
              do{
                 n=IO.readint("Digite o número de amostras:");
              }while(n<0);
              pressao=IO.readdouble("Digite a pressão:");
              menorp=pressao;
              maiorp=pressao;
              for(int i=1;i<=n;i++){
                  pressao=IO.readdouble("Digite a pressão:");
                  identificador=IO.readint("Digite o identificador:");
                  while(identificador<0){
                        System.out.println("INVALIDO");
                        identificador=IO.readint("Digite o identificador:");
                  }
                  if(pressao<menorp){
                         menorp=pressao;
                  }
                  if(pressao>maiorp){
                         maiorp=pressao;
                  }
                  soma=soma+pressao;
              }//fim for
              pmedia=soma/(double)n;
              System.out.println("A menor pressão é:"+menorp);
              System.out.println("A maior pressão é:"+maiorp);
              System.out.println("A média é:"+pmedia);
       }//fim main()
}//fim classe              
              
              
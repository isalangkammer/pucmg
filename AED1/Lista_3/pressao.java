import IO.*;
public class pressao{
       public static void main(String[]args){
              double pmedia=0, pressao, menorp, maiorp, soma=0;
              int identificador, n;
              do{
                 n=IO.readint("Digite o n�mero de amostras:");
              }while(n<0);
              pressao=IO.readdouble("Digite a press�o:");
              menorp=pressao;
              maiorp=pressao;
              for(int i=1;i<=n;i++){
                  pressao=IO.readdouble("Digite a press�o:");
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
              System.out.println("A menor press�o �:"+menorp);
              System.out.println("A maior press�o �:"+maiorp);
              System.out.println("A m�dia �:"+pmedia);
       }//fim main()
}//fim classe              
              
              
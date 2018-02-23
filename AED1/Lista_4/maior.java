import IO.*;
public class maior{
       public static void main(String[]args){
              double valor,maior,maior2;
              valor=IO.readdouble("Digite um valor:");
              maior=valor;
              maior2=valor;
              for(int i=1;i<10;i++){
                 valor=IO.readdouble("Digite um valor:");
                 if(valor>maior){
                    maior2=maior;
                    maior=valor;
                 }
              }//fim for
              System.out.println("O maior valor: "+maior+" o segundo maior valor: "+maior2);
       }//fim main()
}//fim classe       
                   
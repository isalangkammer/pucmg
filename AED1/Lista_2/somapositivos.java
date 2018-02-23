import IO.*;
public class somapositivos{
       public static void main(String[]args){
              int valor,x,soma=0;
              valor=IO.readint("Digite o valor:");
              for(x=0;x<=valor;x++){
                  soma=soma+x;
              }//fim for
              System.out.println("A soma é:"+soma);
       }//fim main()
}//fim classe              
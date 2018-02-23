import IO.*;
public class mn{
       public static void main(String[]args){
              int m,n,soma=0;
              m=IO.readint("Digite o valor de m:");
              n=IO.readint("Digite o valor de n:");
              while(n<m){
                   System.out.println("Valor de N inválido");
                   n=IO.readint("Digite o valor de n:");
              }     
              for(int i=n;m<n;m++){
                 soma=soma+m;
              }//fim for 
              System.out.println("A soma é:"+soma);
       }//fim main() 
}//fim classe 
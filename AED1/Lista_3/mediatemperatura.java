import IO.*;
public class mediatemperatura{
      public static void main(String[]args){
              int i;
              double n, temp, soma, menor, maior, med=0, a=0;
              do{
              n=IO.readdouble("Digite o numero de amostras:");
                if(n<=0){
                 System.out.println("inválido");
                }
              }while(n<=0);
              temp=IO.readdouble("Digite a temperatura:");
              soma=temp;
              menor=temp;
              maior=temp;
              for(i=2;i<=n;i++){
                  temp=IO.readdouble("Digite a temperatura:");
                  if(temp<menor){
                     menor=temp;
                  }
                  if(temp>maior){
                     maior=temp;
                  }
                  soma=soma+temp;
              }//fim for
              med=soma/i;
              a=maior-menor;
              System.out.println("A média de temperatura é:"+med);
              System.out.println("A amplitude é:"+a);
      }//fim main
}//fim classe      
                    
                    
                    
              
                
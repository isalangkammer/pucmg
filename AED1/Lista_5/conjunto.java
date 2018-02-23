import IO.*;
public class conjunto{
       public static void main(String[]args){
              System.out.println("Programa que lê os termos do Conjunto A e B, mostra quantos termos iguais tem na mesma posição e o maior par"); 
              double a, b, iguais=0, par=0;
              int i=1;
              boolean jaleu=false;
              for(i=1; i<=100; i++){
                  a=IO.readdouble("Digite o termo "+i+" do conjunto A:");
                  b=IO.readdouble("Digite o termo "+i+" do conjunto B:");
                  if(a==b){
                     iguais++;
                  }
                  if(a%2==0){
                    if(jaleu==true){
                     if(a>par){
                        par=a;      
                     }
                    }
                    else {
                      par=a;
                      jaleu=true; 
                    }        
                  } 
              }
              System.out.println("O número de termos iguais:"+iguais);
              System.out.println("O maio termo par de A:"+par);   
       }//fim main()
}//fim classe                     
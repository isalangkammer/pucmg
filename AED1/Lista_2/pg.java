import IO.*;
public class pg{
       public static void main(String[]args){
              double a1,q,n,an=0,i=0, soma;
              a1=IO.readdouble("Digite o primeiro termo:");
              q=IO.readdouble("Digite a razão:");
              n=IO.readdouble("Digite o numero de termos da PG:");
              soma=a1;
              while(i<n){
                   a1=a1*q;
                   soma=soma+a1;
                   System.out.println("="+a1);
                   i++;                   
              }//fim while
              System.out.println("A soma dos termos da PG:"+soma);
       }//fim main()
}//fim classe
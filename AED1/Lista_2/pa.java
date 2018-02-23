import IO.*;
public class pa{
       public static void main(String[]args){
              double a1,r,n,an=0,i=0;
              a1=IO.readdouble("Digite o primeiro termo:");
              r=IO.readdouble("Digite a razão:");
              n=IO.readdouble("Digite o numero de termos da PA:");
              while(i<n){
                   a1=a1+r;
                   System.out.println("="+a1);
                   i++;
              }//fim while
       }//fim main()
}//fim classe
import IO.*;
public class pasoma{
       public static void main(String[]args){
              double a1,r,n,an=0,i=0,soma;
              a1=IO.readdouble("Digite o primeiro termo:");
              r=IO.readdouble("Digite a razão:");
              n=IO.readdouble("Digite o numero de termos da PA:");
              soma=a1;
              while(i<n){
                   a1=a1+r;
                   soma=soma+a1;
                   System.out.println("="+a1);
                   i++;
              }//fim while
              System.out.println("A soma da PA é:"+soma);
       }//fim main()
}//fim classe
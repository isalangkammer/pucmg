import IO.*;
public class temperatura{
       public static void main(String[]args){
              double[]x=new double[5];
              double s,m,p;
              lertemperatura(x);
              s=somatemp(x);
              m=mediatemp(x,s);
              p=percentualtemp(x,m);
              System.out.println("O percentual de notas abaixo da media ou igual:" +p+"%");
       }
       public static void lertemperatura(double[]a){
              for(int i=0;i<a.length;i++){
                  a[i]=IO.readdouble("Digite a temperatura:");
              }//fim for
       }//fim lertemperatura
       public static double somatemp(double[]a){
              double soma=0;
              for(int i=0; i<a.length; i++){
                  soma+=a[i]; 
              }//fim for
              return soma;
       }//fim somatemp
       public static double mediatemp(double[]a, double soma){
              double media=0;
              media=soma/(double)a.length;
              return media;
       }//fim mediatemp
       public static double percentualtemp(double[]a, double media){
              double quant=0,p;
              for(int i=0;i<a.length;i++){
                 if(a[i]<=media){
                        quant++;
                 }          
              }
              p=quant/(double)a.length;
              p=p*100;
              return p;
       }//fim percentualtemp
}//fim classe
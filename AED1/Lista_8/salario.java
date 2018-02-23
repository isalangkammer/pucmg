import IO.*;
public class salario{
       public static void main(String[]args){
              double numhoras, valorhora, salario, amplitude, media, maior=0, menor=1000000000, soma=0, q=0; 
              numhoras=lerNumHoras();
              while(numhoras>=0 && numhoras<=220){
                    valorhora=lerValorHora();
                    salario=calcularSalario(numhoras,valorhora);
                    if(salario<1000){
                       soma=salario+soma;
                       q++;
                    }
                    else if (salario>=1000){
                         if(salario>maior){
                            maior=salario;
                         }
                         if(salario< menor){
                            menor=salario;
                         }      
                    }
                    numhoras=lerNumHoras();
              } 
              amplitude=calcularamplitude(maior, menor);
              media=calcularmedia(soma,q);
              resultado(amplitude, media);     
       }
       public static double lerNumHoras(){
              double h;
              do{
                 h=IO.readdouble("Digite o número de horas:");
                 while(h>220){
                       System.out.println("Inválido");
                       h=IO.readdouble("Digite o número de horas:");
                 }      
                 if(h<0){
                     break;
                 }    
              }while(h<0);
              return h;
       }
       public static double lerValorHora(){
              double v;
              v=IO.readdouble("Digite o valor da hora:");
              return v;
       }
       public static double calcularSalario(double h, double v){
              double s;
              s=h*v;
              return s;
       }
       public static double calcularamplitude(double maior, double menor){
              double a;
              a=maior-menor;
              return a;
       }
       public static double calcularmedia(double soma, double q){
              double m;
              m=soma/q;
              return m;
       }
       public static void resultado(double a, double m){
              System.out.println("A amplitude dos salarios maiores que mil reais: "+a);
              System.out.println("A media dos salarios inferiores a mil reais: "+m);
       }
}
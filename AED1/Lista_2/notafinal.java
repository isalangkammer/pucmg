import IO.*;
public class notafinal{
      public static void main(String[]args){
             int p1,p2,p3,n=0;
             p1=IO.readint("Digite o valor da primeira prova:");
             while(p1>20 || p1<0){
                  System.out.println("Nota inválida");
                  p1=IO.readint("Digite o valor da primeira prova:");
             } 
             p2=IO.readint("Digite o valor da segunda prova:");
             while(p2>30 || p2<0){
                  System.out.println("Nota inválida");
                  p2=IO.readint("Digite o valor da segunda prova:");
             }
             p3=IO.readint("Digite o valor da terceira prova:");
             while(p3>50 || p3<0){
                  System.out.println("Nota inválida");
                  p3=IO.readint("Digite o valor da terceira prova:");
             } 
             n=p1+p2+p3;
             if(n>=60){
                System.out.println("Aprovado");
             }
             else if(n>=40 && n<=60){
                 System.out.println("Em exame especial");
             }
             else{
             System.out.println("Reprovado");
             }
      }//fim main() 
}//fim classe              
             
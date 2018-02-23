import IO.*;
public class nota{
       public static void main(String[]args){
              double n1,n2,n3,n4,nfinal,media=0,soma=0;
              int aluno=1;
              do{
                 System.out.println("Aluno:"+aluno);
                 n1=IO.readdouble("Digite a nota da prova 1[-1 para parar]:");
                 if(n1==-1){
                      break;
                 }
                 while(n1>20 && n1<0){
                      System.out.println("INVÁLIDO");
                      n1=IO.readdouble("Digite a nota da prova 1[-1 para parar]:");
                 }
                 n2=IO.readdouble("Digite a nota da prova 2:");
                 while(n2>20 && n2<0){
                       System.out.println("INVÁLIDO");
                       n2=IO.readdouble("Digite a nota da prova 2:");
                 }
                 n3=IO.readdouble("Digite a nota da prova 3:");
                 while(n3>30 && n3<0){
                      System.out.println("INVÁLIDO");
                      n3=IO.readdouble("Digite a nota da prova 3:");
                 }
                 n4=IO.readdouble("Digite a nota da prova 4:");
                 while(n4>30 && n4<0){
                       System.out.println("INVÁLIDO");
                       n4=IO.readdouble("Digite a nota da prova 4:");
                 }
                 nfinal=n1+n2+n3+n4;
                 if(nfinal>=60){
                    System.out.println("APROVADO");
                 }
                 else{
                    System.out.println("REPROVADO");
                 }
                 soma=soma+nfinal; 
                 aluno++;     
              }while(n1!=-1);  
              media=soma/(double)aluno;
              System.out.println("A média da sala é:"+media);
       }//fim main()
}//fim classe              
              
              
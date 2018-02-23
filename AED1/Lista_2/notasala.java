import IO.*;
public class notasala{
      public static void main(String[]args){
            int aluno=1,p1,p2,p3,n;
            int x=IO.readint("Digite a quantidade de alunos");
            while(aluno<=x){
                  System.out.println("Aluno"+aluno);
                  p1=IO.readint("Digite a prova 1:");
                  while(p1>20 || p1<0){
                       System.out.println("Nota inválida");
                       p1=IO.readint("Digite o valor da primeira prova:");
                  } 
                  p2=IO.readint("Digite a prova 2:");
                  while(p2>30 || p2<0){
                       System.out.println("Nota inválida");
                       p2=IO.readint("Digite o valor da segunda prova:");
                  }
                  p3=IO.readint("Digite a prova 3:");
                  while(p3>50 || p3<0){
                       System.out.println("Nota inválida");
                       p3=IO.readint("Digite o valor da terceira prova:");
                  } 
                  n=p1+p2+p3;
                  if(n>=60){
                    System.out.println("Aprovado");
                  }
                  else if(n<60 && n>=40){
                    System.out.println("Exame especial");
                  }
                  else{
                     System.out.println("Reprovado");
                  }
                  aluno++;
            }//fim while()
      }//fim main()
}//fim classe   
                    
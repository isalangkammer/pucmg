import IO.*;
public class salaalunos{
      public static void main(String[]args){
             int aluno,nota,p1,p2,p3;
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
             nota=p1+p2+p3;
             if(nota>=60){
                System.out.println("Aprovado");
             }
             else if(nota>=40 && nota<=60){
                 System.out.println("Em exame especial");
             }
             else{
             System.out.println("Reprovado");
             }
             char x=IO.readchar("Há mais alunos?s para sim, n para não");             
             while(x=='s'){
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
                  nota=p1+p2+p3;
                  if(nota>=60){
                  System.out.println("Aprovado");
                  }
                  else if(nota>=40 && nota<=60){
                         System.out.println("Em exame especial");
                  }
                  else{
                  System.out.println("Reprovado");
                  }
                  x=IO.readchar("Há mais alunos?s para sim, n para não");
             }
      }
}       
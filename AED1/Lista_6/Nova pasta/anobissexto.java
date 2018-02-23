import IO.*;
public class anobissexto{
       public static void main(String[]args){
              int ano;
              boolean bissexto;
              ano=lerano();
              bissexto=ehbissexto(ano);
              resultado(bissexto);
       }
       public static int lerano(){
              int ano;
              do{
                ano=IO.readint("Digite um ano:");
                if(ano<=0){
                   System.out.println("Inválido");
                }
              }while(ano<=0);  
              return ano;
              
       }
       public static boolean ehbissexto(int ano){
              boolean bissexto;
              if(ano%4==0){
                 if(ano%100==0){
                    if(ano%400==0){
                      bissexto=true;
                    }
                    else{
                      bissexto=false;
                    }
                 }     
                 else{
                   bissexto=true;
                 }
              }
              else{
                bissexto=false;
              }
              return bissexto;
       }
       public static void resultado(boolean bissexto){
              if(bissexto){
                 System.out.println("Ano Bissexto");
              }
              else{
                 System.out.println("Não é bissexto");
              }      
       }
}       
import IO.*;
public class numeroprimo{
       public static void main(String[]args){
              int numero=IO.readint("Digite um número:");
              if(numero%2==1 || numero==2){
                 if(numero%3==1 || numero==3){
                    if(numero%5==1 || numero==5){
                       if(numero%7==1 || numero==7){
                          System.out.println("Número primo");
                       }   
                       else{
                              System.out.println("Número não é primo");
                       }      
                    }    
                 }    
              }
       }//fim main()       
}//fim classe                             
import IO.*;
public class temp{
       public static void main(String[]args){
              System.out.println("Programa que recebe a temperatura e sua escala e faz a conversão");
              double temp,conv;
              char escala,continuar;
              do{
                 temp=IO.readdouble("Digite a temperatura:");
                 escala=IO.readchar("Digite a escala[c para celsius e f para farenheit]:");
                 while(escala!='c' && escala!='f'){
                       System.out.println("Comando Inválido");
                       escala=IO.readchar("Digite a escala[c para celsius e f para farenheit]:");
                 }      
                 if(escala=='c'){
                    conv=temp*1.8+32;
                    System.out.println("Celsius convertido em Farenheit:"+conv);
                 }
                 else if(escala=='f'){
                     conv=temp-32/1.8;
                     System.out.println("Farenheit convertido em Celsius:"+conv);
                 }
                 continuar=IO.readchar("Deseja continuar?[s/n]:");
                 while(continuar!='s' && continuar!='n'){
                       System.out.println("Comando Inválido");
                       continuar=IO.readchar("Deseja continuar?[s/n]:");
                 }
              }while(continuar=='s');   
       }//fim main()
}//fim classe                       
              
              
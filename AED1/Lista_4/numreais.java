import IO.*;
public class numreais{
       public static void main(String[]args){
              double num, menorp, maiorn;
              boolean jaleu=false,leu=false;
              do{
                 num=IO.readdouble("Digite um número[zero para]:");
                 if(num<0){
                    if(jaleu!=true){
                       maiorn=num;
                       jaleu=true;
                    } 
                    else if(num>maiorn){
                         maiorn=num;
                    }        
                 }
                 if(num>0){
                    if(leu!=true){
                       menorp=num;
                       leu=true;
                    }
                    else if(num<menorp){
                        menorp=num;
                    }   
                 }      
              }while(num!=0);
              if(jaleu==true && leu==true){
                 System.out.println("O menor numero positivo é:"+menorp);
                 System.out.println("O maior numero negativo é:"+maiorn);
              }     
       }//fim main()
}//fim classe                 
                 
import IO.*;
public class somapositivosnegativos{
      public static void main(String[]args){
             int x=1,neg=0,pos=0;
             while(x!=0){
                  x=IO.readint("Digite um número:");
                  if(x<0){
                     neg=neg+x;
                  }
                  else{
                      pos=pos+x;
                  }
             }// fim while
             System.out.println("A soma dos positivos é:"+pos);
             System.out.println("A soma dos negativos é:"+neg);
      }//fim main()
}//fim classe      
                 
             
import IO.*;
public class somapositivosnegativos{
      public static void main(String[]args){
             int x=1,neg=0,pos=0;
             while(x!=0){
                  x=IO.readint("Digite um n�mero:");
                  if(x<0){
                     neg=neg+x;
                  }
                  else{
                      pos=pos+x;
                  }
             }// fim while
             System.out.println("A soma dos positivos �:"+pos);
             System.out.println("A soma dos negativos �:"+neg);
      }//fim main()
}//fim classe      
                 
             
import IO.*;
public class fibonacci{
       public static void main(String[]args){
              int n=IO.readint("Digite a quantidade de termos:");
              int f=0, g=1, r;
              System.out.println(""+f);
              for(int i=1; i<n; i++){
                 System.out.println(""+g);
                 r=g;
                 g=f+g;
                 f=r;
              }//fim for
       }//fim main()
}//fim classe                  
              

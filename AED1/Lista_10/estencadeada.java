import IO.*;
public class estencadeada{
      public static void main(String[]args){
            int i,j;
            for(i=3;i>=0;i--){
               for(j=3;j>=i;j--){
                  System.out.print(+j+"\t"+i+"\n");
               }
               System.out.print("\n");
            }  
      }//fim main
}//fim classe
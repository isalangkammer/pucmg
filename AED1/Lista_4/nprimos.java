import IO.*;
public class nprimos{
       public static void main(String[]args){
              int n, valor=2, r, i=1;
              n=IO.readint("Digite a quantidade de termos:");
              while(i<=n){
                 if(valor!=0 && valor>0){
                    if(valor==2 || valor==3 || valor==5 || valor==7){
                       System.out.println(""+valor);
                       i++;
                    } 
                    else if(valor!=2 || valor!=3 || valor!=5 || valor!=7){
                         r=valor%2;
                         if(r!=0){
                            r=valor%3;
                            if(r!=0){
                               r=valor%5;
                               if(r!=0){
                                  r=valor%7;
                                  if(r!=0){
                                     System.out.println(""+valor);
                                     i++;
                                  }
                               }
                            }
                         }
                    }
                 }
                 valor++;                 
              }//fim while
       }//fim main()
}//fim classe              
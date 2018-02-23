import IO.*;
public class somaparesimpares{
       public static void main(String[]args){
              int n,pares=0,impares=0, r=0;
              do{
              n=IO.readint("Digite um valor:");
                 r=n%2;
                 if(r==0){
                  pares=n+pares;
                 }
                 else{
                  impares=n+impares;
                 }
              }while(n!=0);
              System.out.println("A soma dos pares é :"+pares);
              System.out.println("A soma dos impares é :"+impares);
       }// fim main()
}//fim classe     
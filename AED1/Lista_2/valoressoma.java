import IO.*;
public class valoressoma{
       public static void main(String[]args){
              int a,p=0,i=0,x=0,r,n=0, soma=0;
              while(x<10){
                   a=IO.readint("Digite o valor:");
                   soma=soma+a;
                   r=a%2;
                   if(a==0){
                      n++;
                   }
                   else if(r==0){
                      p++;
                   }
                   else{
                      i++;
                   }
                   x++;
              }//fim while
              System.out.println("quantidade de numeros pares:"+p);
              System.out.println("quantidade de numeros impares:"+i);
              System.out.println("Quantidade de nulos:"+n);
              System.out.println("A soma dos números lidos é:"+soma);
       }//fim main()
}//fim classe         
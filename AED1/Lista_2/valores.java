import IO.*;
public class valores{
       public static void main(String[]args){
              int a,p=0,i=0,x=0,r,n=0;
              while(x<10){
                   a=IO.readint("Digite o valor:");
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
       }//fim main()
}//fim classe              
              
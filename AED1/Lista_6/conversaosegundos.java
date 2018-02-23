import IO.*;
public class conversaosegundos{
       public static void main(String[]args){
              int min, conv;
              min=lerminutos();
              conv=conversao(min);
              resposta(conv);
       }//fim main()
       public static int lerminutos(){
              int minutos;
              minutos=IO.readint("Digite os minutos:");
              return minutos;
       }//fim lerminutos
       public static int conversao(int m){
              int seg;
              seg=m*60;
              return seg;
       }//fim conversao  
       public static void resposta(int conv){
              System.out.println("Conversao="+conv);
       }//fim resposta
}                
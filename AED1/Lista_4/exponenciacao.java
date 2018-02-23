import IO.*;
public class exponenciacao{
       public static void main(String[]args){
              double base, expoente, r=0;
              char continuar;
              do{
                base=IO.readdouble("Digite a base:");
                expoente=IO.readdouble("Digite o expoente:");
                r=Math.pow(base,expoente);
                System.out.println("="+r);
                continuar=IO.readchar("Continuar?s/n:");
              }while(continuar=='s');
       }//fim main()
}//fim classe       
              
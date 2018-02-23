import IO.*;
public class campeonatonatacao{
       public static void main(String[]args){
              int n, atleta, menor, nmenor, tempo;
              n=IO.readint("Digite o número de nadadores:");
              atleta=IO.readint("Digite o número do atleta:");
              tempo=IO.readint("Digite o tempo em segundos:");
              nmenor=atleta;
              menor=tempo;
              for(int i=1; i<n; i++){
                 atleta=IO.readint("Digite o número do atleta:");
                 tempo=IO.readint("Digite o tempo em segundos:");
                 if(tempo<menor){
                      menor=tempo;
                      nmenor=atleta;
                 }//fim if
              }//fim for           
              System.out.println("O Nadador:"+nmenor+" venceu com "+menor+" segundos");
       }//fim main()
}//fim classe              
                 
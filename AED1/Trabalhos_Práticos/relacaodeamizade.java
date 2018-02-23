/**
 * Programa para verificar a relação de amizades.
 * Usando uma matriz de adjacência.
 * Onde (1) tem relação de amizade e (0) não tem.
 *
 * Autora: Isabelle H. Alves Langkammer
 */
import IO.*;
public class relacaodeamizade{
   public static void main(String[]args){
      apresentacao();
      int i,j, opcao;
      i=numLinha();
      j=numColuna();
      boolean[][]m=new boolean[i][j];
      opcao=menu();
      opSwitch(opcao,m);
   }//fim main()
   public static void apresentacao(){
      System.out.println("O algoritmo apresenta a relação de amizades através de uma Matriz de adjacencia.");
   }//fim apresentacao()
   /**
    * método para ler o número de linhas para a matriz
    *
    * @return i número de linhas da matriz
    */
   public static int numLinha(){
      int i;
      do{
         i=IO.readint("Digite o número de linhas da matriz[máx 100]:");
         while(i>100 || i<0){
            System.out.println("VALOR INVÁLIDO!");
            i=IO.readint("Digite o número de linhas da matriz[máx 100]:");
         }//fim while
      }while(i>100 || i<0);
      return i;
   }//fim numLinha()
   /**
    * método para ler o número de colunas para a matriz
    *
    * @return j número de colunas da matriz
    */
   public static int numColuna(){
      int j;
      do{
         j=IO.readint("Digite o número de colunas da matriz[máx 100]:");
         while(j>100 || j<0){
            System.out.println("VALOR INVÁLIDO!");
            j=IO.readint("Digite o número de colunas da matriz[máx 100]:");
         }//fim while
      }while(j>100 || j<0);
      return j;
   }//fim numColuna()
   /**
    * método para mostrar ao usuário o menu
    * e recebe a opção desejada.
    *
    * @return opcao número da opção desejada pelo usuário.
    */
   public static int menu(){
      System.out.println("Menu:");
      System.out.println("0-Sair.");
      System.out.println("1-Cadastrar as relações de amizades.");
      System.out.println("2-Pesquisar quais as relações de amizade de uma pessoa.");
      System.out.println("3-Pesquisar o número de relações de amizade de uma pessoa.");
      System.out.println("4-Verificar se há a seguinte anomalia: uma relação de amizade de uma pessoa com ela mesma.");
      System.out.println("5-Cadastrar as pessoas.");
      int opcao;
      do{   
         opcao=IO.readint("Digite a opção desejada:");
         while(opcao>4 && opcao<0){
            System.out.println("Opção errada");
            opcao=IO.readint("Digite a opção desejada:");
         }
      }while(opcao>4 && opcao<0);   
      return opcao;
   }//fim menu()
   /** 
    * método para ler as relações de amizade.
    *
    * @param m matriz booleana
    */
   public static void leMatriz(boolean[][]m){
      int i,j;
      for(i=0;i<m.length;i++){
         for(j=0;j<m[i].length;j++){
            do{
               m[i][j]=IO.readboolean("Digite a relação de amizade da pessoa "+i+" com a pessoa "+j+" :");
               while(m[i][j]!= true && m[i][j]!= false){
                  System.out.println("INVÁLIDO");
                  m[i][j]=IO.readboolean("Digite a relação de amizade da pessoa "+i+" com a pessoa "+j+" :");
               }
            }while(m[i][j]!=true && m[i][j]!=false);
            if(i==j){
               m[i][j]=false;
            }//fim if
         }//fim for
      }//fim for
      System.out.println("Matriz lida com sucesso.");
      int opcao=menu();
      opSwitch(opcao,m); 
   }//fim leMatriz
   /** 
    * método para pesquisar
    * as relações que uma pessoa tem
    *
    * @param m matriz booleana
    */
   public static void pesquisar(boolean[][]m){
      int i,j;
      do{
         i=IO.readint("Digite o número referente a pessoa:");
         while(i>m.length){
            System.out.println("INVALIDO");
            i=IO.readint("Digite o número referente a pessoa:");
         }//fim while
      }while(i>m.length);
      System.out.println("As relações da pessoa "+i+" são com :");
      for(j=0;j<m[i].length;j++){
         if(m[i][j]==true){
            System.out.println(+j+"\t");
         }//fim if
      }//fim for
      int opcao=menu();
      opSwitch(opcao,m);
   }//fim pesquisar
   /**
    * método para pesquisar o número de relações 
    * que uma determinada pessoa possui.
    *
    * @param mmatriz booleana
    */    
   public static void pesquisarNum(boolean[][]m){
      int i,j, qt=0;
      i=IO.readint("Digite o número referente a pessoa:");
      for(j=0;j<m[i].length;j++){
         if(m[i][j]==true){
            qt=qt+1;
         }//fim if
      }//fim for
      System.out.println("A quantidade de relações da pessoa "+i+" são: "+qt);
      int opcao=menu();
      opSwitch(opcao,m); 
   }//fim pesquisarNum
   /** 
    * método para verificar se tem anomalia.
    * uma pessoa é amiga dela mesma.
    *
    * @param m matriz de adjacência.
    */
   public static void verificarAnomalia(boolean[][]m){
      int i,j;
      boolean x=false;
      for(i=0;i<m.length;i++){
         for(j=0;j<m[i].length;j++){
            if(i==j){
               x=true;
            }
         }//fim for
      }//fim for 
      if(x){
         System.out.println("NÃO HÁ ANOMALIA.");
      }
      else{
         System.out.println("HÁ ANOMALIA.");
      }
      int opcao=menu();
      opSwitch(opcao,m);
   }//fim verificarAnomalia
   /**
    * Método para
    *
    * @param opcao opção digitada pelo usuário
    * @param m matriz booleana
    */
   public static void opSwitch(int opcao, boolean[][]m){
      switch(opcao){
         case 0:break;
         case 1:leMatriz(m);
            break;
         case 2:pesquisar(m);
            break;
         case 3:pesquisarNum(m);
            break;
         case 4:verificarAnomalia(m); 
            break;   
         default:
            System.out.println("ERRO!");
      }//fim switch    
   }//fim opswitch
}//fim classe relacaodeamizade

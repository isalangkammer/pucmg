/**
 * Programa para verificar a rela��o de amizades.
 * Usando uma matriz de adjac�ncia.
 * Onde (1) tem rela��o de amizade e (0) n�o tem.
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
      System.out.println("O algoritmo apresenta a rela��o de amizades atrav�s de uma Matriz de adjacencia.");
   }//fim apresentacao()
   /**
    * m�todo para ler o n�mero de linhas para a matriz
    *
    * @return i n�mero de linhas da matriz
    */
   public static int numLinha(){
      int i;
      do{
         i=IO.readint("Digite o n�mero de linhas da matriz[m�x 100]:");
         while(i>100 || i<0){
            System.out.println("VALOR INV�LIDO!");
            i=IO.readint("Digite o n�mero de linhas da matriz[m�x 100]:");
         }//fim while
      }while(i>100 || i<0);
      return i;
   }//fim numLinha()
   /**
    * m�todo para ler o n�mero de colunas para a matriz
    *
    * @return j n�mero de colunas da matriz
    */
   public static int numColuna(){
      int j;
      do{
         j=IO.readint("Digite o n�mero de colunas da matriz[m�x 100]:");
         while(j>100 || j<0){
            System.out.println("VALOR INV�LIDO!");
            j=IO.readint("Digite o n�mero de colunas da matriz[m�x 100]:");
         }//fim while
      }while(j>100 || j<0);
      return j;
   }//fim numColuna()
   /**
    * m�todo para mostrar ao usu�rio o menu
    * e recebe a op��o desejada.
    *
    * @return opcao n�mero da op��o desejada pelo usu�rio.
    */
   public static int menu(){
      System.out.println("Menu:");
      System.out.println("0-Sair.");
      System.out.println("1-Cadastrar as rela��es de amizades.");
      System.out.println("2-Pesquisar quais as rela��es de amizade de uma pessoa.");
      System.out.println("3-Pesquisar o n�mero de rela��es de amizade de uma pessoa.");
      System.out.println("4-Verificar se h� a seguinte anomalia: uma rela��o de amizade de uma pessoa com ela mesma.");
      System.out.println("5-Cadastrar as pessoas.");
      int opcao;
      do{   
         opcao=IO.readint("Digite a op��o desejada:");
         while(opcao>4 && opcao<0){
            System.out.println("Op��o errada");
            opcao=IO.readint("Digite a op��o desejada:");
         }
      }while(opcao>4 && opcao<0);   
      return opcao;
   }//fim menu()
   /** 
    * m�todo para ler as rela��es de amizade.
    *
    * @param m matriz booleana
    */
   public static void leMatriz(boolean[][]m){
      int i,j;
      for(i=0;i<m.length;i++){
         for(j=0;j<m[i].length;j++){
            do{
               m[i][j]=IO.readboolean("Digite a rela��o de amizade da pessoa "+i+" com a pessoa "+j+" :");
               while(m[i][j]!= true && m[i][j]!= false){
                  System.out.println("INV�LIDO");
                  m[i][j]=IO.readboolean("Digite a rela��o de amizade da pessoa "+i+" com a pessoa "+j+" :");
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
    * m�todo para pesquisar
    * as rela��es que uma pessoa tem
    *
    * @param m matriz booleana
    */
   public static void pesquisar(boolean[][]m){
      int i,j;
      do{
         i=IO.readint("Digite o n�mero referente a pessoa:");
         while(i>m.length){
            System.out.println("INVALIDO");
            i=IO.readint("Digite o n�mero referente a pessoa:");
         }//fim while
      }while(i>m.length);
      System.out.println("As rela��es da pessoa "+i+" s�o com :");
      for(j=0;j<m[i].length;j++){
         if(m[i][j]==true){
            System.out.println(+j+"\t");
         }//fim if
      }//fim for
      int opcao=menu();
      opSwitch(opcao,m);
   }//fim pesquisar
   /**
    * m�todo para pesquisar o n�mero de rela��es 
    * que uma determinada pessoa possui.
    *
    * @param mmatriz booleana
    */    
   public static void pesquisarNum(boolean[][]m){
      int i,j, qt=0;
      i=IO.readint("Digite o n�mero referente a pessoa:");
      for(j=0;j<m[i].length;j++){
         if(m[i][j]==true){
            qt=qt+1;
         }//fim if
      }//fim for
      System.out.println("A quantidade de rela��es da pessoa "+i+" s�o: "+qt);
      int opcao=menu();
      opSwitch(opcao,m); 
   }//fim pesquisarNum
   /** 
    * m�todo para verificar se tem anomalia.
    * uma pessoa � amiga dela mesma.
    *
    * @param m matriz de adjac�ncia.
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
         System.out.println("N�O H� ANOMALIA.");
      }
      else{
         System.out.println("H� ANOMALIA.");
      }
      int opcao=menu();
      opSwitch(opcao,m);
   }//fim verificarAnomalia
   /**
    * M�todo para
    *
    * @param opcao op��o digitada pelo usu�rio
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

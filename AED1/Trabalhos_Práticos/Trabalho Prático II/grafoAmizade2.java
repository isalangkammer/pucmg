/**
 * Grafo para ler as rela��es de amizade de uma pessoa. A matriz e as pessoas devem ser gravadas.
 * Trabalho Pr�tico II - Quest�o 3 - AED I
 *
 * Autora: Isabelle Alves Langkammer
 */
 import java.util.Scanner;
 import java.lang.Exception;
 import java.io.File;
 import java.lang.NegativeArraySizeException;
 public class grafoAmizade2{
   public static void main(String[]args){
      int tamanho=1;
      apresentacao();
      Scanner scanner = new Scanner (System.in);
      System.out.print("Digite um nome para o arquivo:");
      String nomearq=scanner.nextLine();
      validaArquivo(nomearq);
      boolean continua=true;
      do{
         try{
            tamanho= leTamanho(); 
            continua=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor v�lido.");
         }//fim catch
      }while (continua);      
      boolean[][]matrizP = new boolean[tamanho][tamanho];
      Pessoa[]pessoa=new Pessoa[tamanho];
      menu(matrizP, pessoa);
   }//fim main()
   public static int leTamanho() throws Exception {
      int t;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Digite o n�mero de pessoas[1 at� 100]:");
      t=scanner.nextInt();
      if (t<1 || t>100){
        throw new Exception();      
      }//fim if
      return t;
   }//fim leTamanho()
   /**
    * M�todo para fazer a apresenta��o do programa
    */   
   public static void apresentacao(){
      System.out.println("O algoritmo apresenta a rela��o de amizades atrav�s de uma Matriz de adjacencia.");
   }//fim apresentacao()
   /**
    * M�todo que apresenta as op��es do programa e recebe a op��o desejada pelo usu�rio.
    *
    * @param matrizP matriz booleana para o cadastro de rela��es de amizade.
    * @param pessoa objeto da classe Pessoa.
    */
   public static void menu(boolean[][]matrizP,Pessoa[] pessoa){
      Scanner scanner=new Scanner(System.in);
      System.out.println("Menu:");
      System.out.println("0-Sair.");
      System.out.println("1-Cadastrar as rela��es de amizades.");
      System.out.println("2-Pesquisar quais as rela��es de amizade de uma pessoa.");
      System.out.println("3-Pesquisar o n�mero de rela��es de amizade de uma pessoa.");
      System.out.println("4-Verificar se h� a seguinte anomalia: uma rela��o de amizade de uma pessoa com ela mesma.");
      System.out.println("5-Cadastrar as pessoas.");
      System.out.print("Digite a op��o desejada:");
      int opcao=scanner.nextInt();
      switch(opcao){
         case 0:
            System.out.println("Programa encerrado");
            break;
         case 1: cadastroRelacao(matrizP, pessoa);
            break;
         case 2: pesquisarRelacao(matrizP, pessoa);
            break;
         case 3: pesquisarNumero(matrizP, pessoa);
            break;
         case 4: verificarAnomalia(matrizP, pessoa);
            break;
         case 5: cadastroPessoa(matrizP, pessoa);
            break;  
         default: System.out.println("Programa encerrado");        
      }//fim switch
   }//fim menu()
   /**
    * M�todo para o cadastro das rela��es de amizade
    *
    * @param matrizP matriz booleana para o cadastro de rela��es de amizade.
    * @param pessoa objeto da classe Pessoa.
    */
   public static void cadastroRelacao(boolean[][]matrizP, Pessoa[] pessoa){
      Scanner scanner=new Scanner(System.in);
      if(pessoa[0]==null){
         System.out.println("Erro! Falta cadastrar o nome das pessoas");
      }//fim if
      else{
         for(int i=0;i<matrizP.length;i++){
            for(int j=0;j<matrizP[i].length;j++){
               do{
                  System.out.print(pessoa[i].getnome()+" � amigo de "+pessoa[j].getnome()+"[true/false] ?");
                  matrizP[i][j]=scanner.nextBoolean();
                  while(matrizP[i][j]!= true && matrizP[i][j]!= false){
                     System.out.println("Rela��o inv�lida");
                     System.out.print(pessoa[i].getnome()+" � amigo de "+pessoa[j].getnome()+"[true/false] ?");
                     matrizP[i][j]=scanner.nextBoolean();
                  }//fim while
               }while(matrizP[i][j]!= true && matrizP[i][j]!= false);   
            }//fim for
         }//fim for
      }//fim else
      menu(matrizP, pessoa);
   }//fim cadastroRelacao()    
   /**
    * M�todo que pesquisa a rela��o de amizade de uma pessoa.
    *
    * @param matrizP matriz booleana para o cadastro de rela��es de amizade.
    * @param pessoa objeto da classe Pessoa.
    */
    public static void pesquisarRelacao(boolean[][]matrizP, Pessoa[] pessoa){
      Scanner scanner=new Scanner(System.in);
      if(pessoa[0]==null){
         System.out.println("Erro! Falta cadastrar o nome das pessoas");
      }//fim if
      else{
         System.out.print("Digite o nome da pessoa:");
         String nome=scanner.nextLine();
         for(int i=0;i<matrizP.length;i++){
            for(int j=0;j<matrizP[i].length;j++){
               if(nome.equals(pessoa[i].getnome())){
                   System.out.println("As amizades de "+nome+" s�o:");
                   System.out.print(pessoa[i].getnome());
               }//fim if
            }//fim for
         }//fim for
      }//fim else   
      menu(matrizP, pessoa);
   }//fim pesquisarRelacao();
   /**
    * M�todo que pesquisa o n�mero de rela��es de amizade de uma pessoa.
    *
    * @param matrizP matriz booleana para o cadastro de rela��es de amizade.
    * @param pessoa objeto da classe Pessoa.
    */
   public static void pesquisarNumero(boolean[][] matrizP,Pessoa[]pessoa){
      Scanner scanner=new Scanner(System.in);
      int p=0;
      if(pessoa[0]==null){
         System.out.println("Erro! Falta cadastrar o nome das pessoas");
      }//fim if
      else{
         System.out.print("Digite o nome da pessoa:");
         String nome=scanner.nextLine();
         for(int i=0;i<matrizP.length;i++){
            for(int j=0;j<matrizP[i].length;j++){
               if(nome.equals(pessoa[i].getnome())){
                   p=p++;
               }//fim if
            }//fim for
         }//fim for
         System.out.println("Possui "+p+" rela��es de amizade");
      }//fim else   
      menu(matrizP, pessoa);
   }//fim pesquisarNumero()
   /**
    * M�todo que verifica se h� anomalia de rela��es, uma pessoa ser amiga dela mesma.
    *
    * @param matrizP matriz booleana para o cadastro de rela��es de amizade.
    * @param pessoa objeto da classe Pessoa.
    */
   public static void verificarAnomalia(boolean[][]matrizP, Pessoa[]pessoa){
      boolean anomalia=false;
      int cont=0;
      if(pessoa[0]==null){
         System.out.println("Erro! Falta cadastrar o nome das pessoas");
      }//fim if
      else{      
         for (int i=0; i<matrizP.length; i++) {
            for (int j=0; j<=matrizP[i].length; j++) {
               if (i==j) {
                  if(matrizP[i][j]==true){
                     anomalia=true;
                     cont++;
                  }//fim if   
               }//fim if   
            }//fim for
         }//fim for
         if(anomalia){
            System.out.println("H� anomalia em "+cont+" casos de rela��es de amizade.");
         }//fim if 
         else{
            System.out.println("N�o h� anomalia");
         }//fim else
      }//fim else   
      menu(matrizP, pessoa);
   }//fim verificarAnomalia 
   /**
    * M�todo para cadastrar as pessoas.
    *
    * @param matrizP matriz booleana para o cadastro de rela��es de amizade.
    * @param pessoa objeto da classe Pessoa.
    */
   public static void cadastroPessoa(boolean[][]matrizP,Pessoa[] pessoa){
      String nome;
      for (int i=0; i<pessoa.length; i++) {
         pessoa[i] = new Pessoa ();
         pessoa[i].setnome (pessoa[i].Nome());
         pessoa[i].setidade (pessoa[i].Idade());
      }//fim for
      menu(matrizP, pessoa);
   }//fim cadastroPessoa()
   /**
    * M�todo para validar e criar um arquivo
    *
    * @param nomearq nome do arquivo a ser verificado/criado
    */
   public static void validaArquivo(String nomearq){
      Scanner scanner=new Scanner(System.in);
      File arquivo=new File(nomearq);
      boolean aux=false;
      if(arquivo.exists()){
         System.out.println("ERRO!Arquivo existente!");
      }//fim if
      else{
         System.out.print("Deseja criar o arquivo?[true/false]");
         aux=scanner.nextBoolean();
         try{
            if(aux){
               arquivo.createNewFile();
               System.out.println("Arquivo foi criado.");
            }//fim if
            else{
               System.out.println("Arquivo n�o foi criado.");
            }//fim else
         }//fim try
         catch(Exception exception){
            System.out.println("Erro!");
         }//fim catch   
      }//fim else
   }//fim validaArquivo
 }//fim class grafoAmizade
 /**
  * Classe Pessoa usada para defini��es de uma pessoa(nome,idade)
  */   
 class Pessoa{
   private String nome;
   private int idade;
   /**
    * M�todo que atribui o nome da pessoa.
    */
   public void setnome(String nome){
      this.nome=nome;
   }//fim setnome()
   /**
    * M�todo que atribui a idade da pessoa.
    */
   public void setidade(int idade){
      this.idade=idade;
   }//fim setidade()
   /**
    * M�todo que recupera o nome da pessoa.
    */
   public String getnome(){
      return nome;
   }//fim getnome()
   /**
    * M�todo que recupera a idade da pessoa.
    */
   public int getidade(){
      return idade;
   }//fim getidade()
   /**
    * M�todo para ler o nome
    */
   public String Nome(){
      Scanner scanner=new Scanner(System.in);
      String nome;
      try{
         System.out.print("Digite o nome :");
         nome=scanner.nextLine();
      }//fim try
      catch(Exception exception ){
         System.err.printf("\nException: %s\n", exception);
			nome=scanner.nextLine();
			System.out.println("Erro! Digite um nome.");
      }//fim catch   
      return nome;
   }//fim Nome()
   /**
    * M�todo para ler a idade
    */
   public int Idade(){
      boolean continua=true;
      Scanner scanner=new Scanner(System.in);
      do{
         try{
            System.out.print("Digite a idade :");
            int idade=scanner.nextInt();
            continua=false;
         }//fim try
         catch(Exception exception){
            System.err.printf("\nException: %s\n", exception);
            System.out.println("Erro! Digite um valor inteiro");
            scanner.nextLine();
         }//fim catch
      }while(continua);   
      return idade;
   }// fim Idade()
 }//fim class Pessoa
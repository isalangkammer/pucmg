import java.io.*;
import java.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.nio.charset.*;
  
class MyIO {
  
  private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
  private static String charset = "ISO-8859-1";
  
  public static void setCharset(String charset_) {
    charset = charset_;
    in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
  }
  
  public static void print() {
  }
  
  public static void print(int x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void print(double x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void print(String x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void print(boolean x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void println() {
  }
  
  public static void println(int x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.println(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void println(double x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.println(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void println(String x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.println(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void println(boolean x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.println(x);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static void printf(String formato, double x) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.printf(formato, x);// "%.2f"
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
  }
  
  public static double readDouble() {
    double d = -1;
    try {
      d = Double.parseDouble(readString().trim().replace(",", "."));
    } catch (Exception e) {}
    return d;
  }
  
  public static double readDouble(String str) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(str);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
    return readDouble();
  }
  
  public static float readFloat() {
    return (float) readDouble();
  }
  
  public static float readFloat(String str) {
    return (float) readDouble(str);
  }
  
  public static int readInt() {
    int i = -1;
    try {
      i = Integer.parseInt(readString().trim());
    } catch (Exception e) {}
    return i;
  }
  
  public static int readInt(String str) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(str);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
    return readInt();
  }
  
  public static String readString() {
    String s = "";
    char tmp;
    try {
      do {
        tmp = (char)in.read();
        if (tmp != '\n' && tmp != ' ' && tmp != 13) {
          s += tmp;
        }
      } while (tmp != '\n' && tmp != ' ');
    } catch (IOException ioe) {
      System.out.println("lerPalavra: " + ioe.getMessage());
    }
    return s;
  }
  
  public static String readString(String str) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(str);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
    return readString();
  }
  
  public static String readLine() {
    String s = "";
    char tmp;
    try {
      do {
        tmp = (char)in.read();
        if (tmp != '\n' && tmp != 13) {
          s += tmp;
        }
      } while (tmp != '\n');
    } catch (IOException ioe) {
      System.out.println("lerPalavra: " + ioe.getMessage());
    }
    return s;
  }
  
  public static String readLine(String str) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(str);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
    return readLine();
  }
  
  public static char readChar() {
    char resp = ' ';
    try {
      resp  = (char)in.read();
    } catch (Exception e) {}
    return resp;
  }
  
  public static char readChar(String str) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(str);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
    return readChar();
  }
  
  public static boolean readBoolean() {
    boolean resp = false;
    String str = "";
  
    try {
      str = readString();
    } catch (Exception e) {}
  
    if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") ||
        str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")) {
      resp = true;
    }
  
    return resp;
  }
  
  public static boolean readBoolean(String str) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(str);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
    return readBoolean();
  }
  
  public static void pause() {
    try {
      in.read();
    } catch (Exception e) {}
  }
  
  public static void pause(String str) {
    try {
      PrintStream out = new PrintStream(System.out, true, charset);
      out.print(str);
    } catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
    pause();
  }
}
class Arq {
  private static boolean write = false;
  private static boolean read = false;
  private static Formatter saida = null;
  private static Scanner entrada = null;
  
  public static boolean openWrite(String nomeArq) {
    boolean resp = false;
  
    close();
  
    try {
      saida = new Formatter(nomeArq);
      resp = write = true;
    }  catch (Exception e) {}
  
    return resp;
  }
  
  public static boolean openWrite(String nomeArq, String charset) {
    boolean resp = false;
  
    close();
  
    try {
      saida = new Formatter(nomeArq, charset);
      resp = write = true;
    }  catch (Exception e) {}
  
    return resp;
  }
  
  public static boolean openRead(String nomeArq) {
    boolean resp = false;
  
    close();
  
    try {
      entrada = new Scanner(new File(nomeArq));
      resp = read = true;
    }  catch (Exception e) {}
  
    return resp;
  }
  
  public static boolean openRead(String nomeArq, String charset) {
    boolean resp = false;
  
    close();
  
    try {
      entrada = new Scanner(new File(nomeArq), charset);
      resp = read = true;
    }  catch (Exception e) {}
  
    return resp;
  }
  
  public static void close() {
    if (write == true) {
      saida.close();
      write = false;
    }
    if (read == true) {
      entrada.close();
      read = false;
    }
  }
  
  public static void print(int x) {
    if (write == true) {
      saida.format( "%d", x);
    }
  }
  
  public static void print(double x) {
    if (write == true) {
      saida.format( "%f", x);
    }
  }
  
  public static void print(String x) {
    if (write == true) {
      saida.format( "%s", x);
    }
  }
  
  public static void print(boolean x) {
    if (write == true) {
      saida.format( "%s", ((x) ? "true" : "false"));
    }
  }
  
  public static void print(char x) {
    if (write == true) {
      saida.format( "%c", x);
    }
  }
  
  public static void println(int x) {
    if (write == true) {
      saida.format( "%d\n", x);
    }
  }
  
  public static void println(double x) {
    if (write == true) {
      saida.format( "%f\n", x);
    }
  }
  
  public static void println(String x) {
    if (write == true) {
      saida.format( "%s\n", x);
    }
  }
  
  public static void println(boolean x) {
    if (write == true) {
      saida.format( "%s\n", ((x) ? "true" : "false"));
    }
  }
  
  public static void println(char x) {
    if (write == true) {
      saida.format( "%c\n", x);
    }
  }
  
  public static int readInt() {
    int resp = -1;
    try {
      resp = entrada.nextInt();
    }  catch (Exception e) {}
    return resp;
  }
  
  public static char readChar() {
    char resp = ' ';
    try {
      resp = (char)entrada.nextByte();
    }  catch (Exception e) {}
    return resp;
  }
  
  public static double readDouble() {
    double resp = -1;
    try {
      resp = entrada.nextDouble();
    }  catch (Exception e) {}
    return resp;
  }
  
  public static String readString() {
    String resp = "";
    try {
      resp = entrada.next();
    }  catch (Exception e) { System.out.println(e.getMessage()); }
    return resp;
  }
  
  public static boolean readBoolean() {
    boolean resp = false;
    try {
      resp = (entrada.next().equals("true")) ? true : false;
    }  catch (Exception e) {}
    return resp;
  }
  
  public static String readLine() {
    String resp = "";
    try {
      resp = entrada.nextLine();
    }  catch (Exception e) { System.out.println(e.getMessage()); }
    return resp;
  }
  
  
  public static boolean hasNext() {
    return entrada.hasNext();
  }
  
  public static String readAll() {
    String resp = "";
    while (hasNext()) {
      resp += (readLine() + "\n");
    }
    return resp;
  }
}

class Pessoa {
   //Declarando as variaveis privadas
	private int id;
	private String nome;
   private String nacionalidade;
	private String dataNasc;
	private String dataMorte;
   private String localNasc;
   private String localMorte;
   private int idade;


   public Pessoa () {
      id = 0;
      nome = "";
      nacionalidade = "";
      dataNasc = "";
		dataMorte = "";
      localNasc = "";
		localMorte = "";
      idade = 0;
   }//fim Construtor()
   
   public Pessoa (int id, String nome, String nacionalidade, String dataNasc, 
                  String dataMorte, String localNasc, String localMorte, int idade) {
                  
      this.id = id;
      this.nome = nome;
      this.nacionalidade = nacionalidade;
      this.dataNasc = dataNasc;
		this.dataMorte = dataMorte;
      this.localNasc = localNasc;
		this.localMorte = localMorte;
      this.idade = idade;
  	}//fim Constructor

	public Pessoa clone () {
		Pessoa p = new Pessoa();
		
		p.id = this.id;
      p.nome = this.nome;
      p.nacionalidade = this.nacionalidade;
      p.dataNasc = this.dataNasc;
      p.dataMorte = this.dataMorte;
      p.localNasc = this.localNasc;
      p.localMorte = this.localMorte;
      p.idade = this.idade;

      return p;
   }
			
   
   public void setId (int id) {
      this.id = id;
   }
   
   public int getId () {
      return id;
   }   
   
   public void setNome (String nome) {
   	this.nome = nome;
   }
   
   public String getNome () {
      return nome;
   } 
      
   public void setNacionalidade (String nacionalidade) {
      this.nacionalidade = nacionalidade;
   }
      
   public String getNacionalidade () {
      return nacionalidade;
   }
   
   public void setDataNasc (String dataNasc) {
      this.dataNasc = dataNasc;
   }
   
   public String getDataNasc () {
      return dataNasc;
   }  

	public void setDataMorte (String dataMorte) {
		this.dataMorte = dataMorte;
	}

	public String getDataMorte () {
		return dataMorte;
   }
   
   public void setLocalNasc (String localNasc) {
      this.localNasc = localNasc;
   }
   
   public String getLocalNasc () {
      return localNasc;
   }  

	public void setLocalMorte (String localMorte) {
		this.localMorte = localMorte;	
	}

	public String getLocalMorte () {
		return localMorte;
	}
   
   public void setIdade (int idade) {
      this.idade = idade;
   }
   
   public int getIdade () {
      return idade;
   }

	public void imprimir(){
         MyIO.println(this.id + " " + 
                     this.nome + " " + 
                     this.nacionalidade + " " +
                     this.dataNasc + " " +
                     this.localNasc + " " +
                     this.dataMorte + " " +
                     this.localMorte + " " +
                     this.idade + " ");
   }
   
   public void parsePessoa(String s){
      String array[] = s.split(" ## ");
      
      this.id = new Integer(array[0]).intValue();
      this.nome = array[1];
      this.nacionalidade = array[2];
      this.dataNasc = array[3];
      this.dataMorte = array[4];
      this.localNasc = array[5];
      this.localMorte = array[6];
      this.idade = new Integer(array[7]).intValue();
   }
 
   public String getSubstringEntre(String s, String antes, String depois){
      String resp = "";
      int posInicio , posFim;
 
      posInicio = s.indexOf(antes) + antes.length();
 
      if(antes.compareTo(depois) != 0){
         posFim = s.indexOf(depois);
      } else {
         posFim = s.indexOf(depois, posInicio);
      }
 
      if(0 <= posInicio && posInicio < posFim && posFim < s.length()){
         resp = s.substring(posInicio, posFim);
      }
 
      return resp;
   }
 
   public String removeTags(String s){
      String resp = "";
 
      for (int i = 0; i < s.length(); i++){
 
         while(i < s.length() && s.charAt(i) == '<'){
            for (i++; s.charAt(i) != '>'; i++);
            i++;
 
            while(i < s.length() && s.charAt(i) == '&'){
               for (i++; s.charAt(i) != ';'; i++);
               i++;
            }
         }
 
         while(i < s.length() && s.charAt(i) == '&'){
            for (i++; s.charAt(i) != ';'; i++);
            i++;
            resp += ' ';
         }
 
         if(i < s.length()){
            resp += s.charAt(i);
         }
      }
 
      while(resp.length() > 0 && resp.charAt(0) == ' '){
         resp = resp.substring(1);
      }
 
      return resp;
   }
 
   public void ler(String nomeArquivo){
      String linha;
 
      Arq.openRead(nomeArquivo, "UTF8");
 
      this.id = (nomeArquivo.charAt(nomeArquivo.length() - 8) - 48) * 100;
      this.id += (nomeArquivo.charAt(nomeArquivo.length() - 7) - 48) * 10;
      this.id += (nomeArquivo.charAt(nomeArquivo.length() - 6) - 48);
 
      for(linha = Arq.readLine(); linha.contains("<h1") == false; linha = Arq.readLine());
      this.nome = getSubstringEntre(linha, "lang=\"pt\">", "</h1>");
       
      for(linha = Arq.readLine(); linha.contains("Nacionalidade") == false; linha = Arq.readLine());
      this.nacionalidade = removeTags(Arq.readLine());
       
      for(linha = Arq.readLine(); linha.contains("Nascimento") == false; linha = Arq.readLine());
      this.dataNasc = removeTags(Arq.readLine());
 
      if(this.dataNasc.charAt(this.dataNasc.length()-1) == ')'){
         String tmp = this.dataNasc.substring(this.dataNasc.indexOf('(') + 1);
         tmp = tmp.substring(0, tmp.indexOf(' '));
         this.idade = (new Integer(tmp)).intValue();
         this.dataNasc = this.dataNasc.substring(0, this.dataNasc.indexOf('('));
         this.dataMorte = "vivo";
         this.localMorte = "vivo";
      }  else {
            this.dataMorte = "";
            this.localMorte = "";
         }
 
      for(linha = Arq.readLine(); linha.contains("Local") == false; linha = Arq.readLine());
      this.localNasc = removeTags(Arq.readLine());
 
      if (this.dataMorte.length() == 0){
         for(linha = Arq.readLine(); linha.contains("Morte") == false; linha = Arq.readLine());
         this.dataMorte = removeTags(Arq.readLine());
 
         if(this.dataMorte.contains("(") == true){
            String tmp = this.dataMorte.substring(this.dataMorte.indexOf('(') + 1);
            tmp = tmp.substring(0, tmp.indexOf(' '));
            this.idade = (new Integer(tmp)).intValue();
            this.dataMorte = this.dataMorte.substring(0, this.dataMorte.indexOf('('));
         }
 
         for(linha = Arq.readLine(); linha.contains("Local") == false; linha = Arq.readLine());
         this.localMorte = removeTags(Arq.readLine());
      }
 
      Arq.close();
   }
}//fim Pessoa

class Lista {
  private Pessoa[] array;
  private int n;
  
  
  /**
   * Construtor da classe.
   */
  public Lista () {
    this(6);
  }
 
  public Lista (int tamanho){
      array = new Pessoa[tamanho];
      n = 0;
  }
 
  public void inserirInicio(Pessoa x) throws Exception {
  
    if (n >= array.length) {
      throw new Exception("Erro ao inserir!");
    }
  
    for (int i = n; i > 0; i--) {
      array[i] = array[i - 1];
    }
  
    array[0] = x;
    n++;
  }
 
  public void inserirFim(Pessoa x) throws Exception {
  
    //validar insercao
    if (n >= array.length) {
      throw new Exception("Erro ao inserir!");
    }
  
    array[n] = x;
    n++;
  }
 
  public void inserir(Pessoa pessoa, int pos) throws Exception {
  
    //validar insercao
    if (n >= array.length || pos < 0 || pos > n) {
      throw new Exception("Erro ao inserir!");
    }
  
    //levar elementos para o fim do array
    for (int i = n; i > pos; i--) {
      array[i] = array[i - 1].clone();
    }
  
    array[pos] = pessoa.clone();
    n++;
  }
 
  public Pessoa removerInicio() throws Exception {
  
    //validar remocao
    if (n == 0) {
      throw new Exception("Erro ao remover!");
    }
  
    Pessoa resp = array[0].clone();
    n--;
 
    for (int i = 0; i < n; i++) {
      array[i] = array[i + 1].clone();
    }
  
    return resp;
  }
  
  public Pessoa removerFim() throws Exception {
  
    //validar remocao
    if (n == 0) {
      throw new Exception("Erro ao remover!");
    }
  
    return array[--n];
  }
  
  public Pessoa remover(int pos) throws Exception {
  
    if (n == 0 || pos < 0 || pos >= n) {
      throw new Exception("Erro a remover!");
    }
  
    Pessoa resp = array[pos].clone();
    n--;
  
    for (int i = pos; i < n; i++) {
      array[i] = array[i + 1].clone();
    }
  
    return resp;
  }
  
  
  /**
   * Mostra os elementos da lista separados por espacos.
   */
  public void mostrar () {
  
    for (int i = 0; i < n; i++) {
  
      array[i].imprimir();
  
    }
  }
  
  public boolean pesquisar(Pessoa x) {
    boolean retorno = false;
    for (int i = 0; i < n && retorno == false; i++) {
      retorno = (array[i] == x);
    }
    return retorno;
  }
}

public class ListaTester {

   public static boolean isEquals ( String str1, String str2) {

      if ( str1.length() != str2.length() )
         return false;

      int i = 0;

      boolean charIgual = str1.charAt( i ) == str2.charAt( i );

      while ( ++i < str1.length() && charIgual )
         charIgual = str1.charAt( i ) == str2.charAt( i );

      return charIgual;

   }//fim isEquals()

   public static boolean equals( String cadeia , String flag ){
      
      if( cadeia.length() != flag.length() ) return false;

      int pos = 0;

      while( cadeia.charAt( pos ) == flag.charAt( pos ) && ++pos < cadeia.length() );

      return ( pos == cadeia.length() );

   }//fim equals()
   
public static void main (String args[])throws Exception {
 
    Lista  lista = new Lista ();
    boolean boo = false;
    String str;
 
    do {
      str = MyIO.readLine();
 
      if (str.equals("FIM")) {
        boo = true;
 
 
      } else {
        Pessoa pessoa = new Pessoa ();
        pessoa.ler(str);
 
        lista.inserirFim(pessoa);
      }
 
 
    } while (!boo);
    //lista.mostrar();
    String le = new String();
    String le2;
    int size = Integer.parseInt(MyIO.readLine());
 
 
    for (int i = 0; i < size; i++) {
      le = MyIO.readLine();
      Pessoa pessoa = new Pessoa ();
 
 
 
      if (le.charAt(0) == 'I') {
 
        int m = 0;
        for ( m = 0; le.charAt(m) != '('; m++ ) {
 
        }
        m++;
 
        int j = 0;
        for ( j = 0; le.charAt(j) != ')'; j++ ) {
 
        }
 
        le2 = le.substring(m, j);
 
        int tes = Integer.parseInt(le2);
 
        String aux = "";
        if (tes < 10) {
          aux = aux + "/tmp/clima/00" + le2 + ".html" ;
        } else if (tes < 100) {
          aux = aux + "/tmp/clima/0" + le2 + ".html" ;
        } else {
          aux = aux + "/tmp/clima/" + le2 + ".html" ;
        }
 
 
        pessoa.ler(aux);
 
 
        if (le.charAt(1) == 'I') {
 
          pessoa.ler(aux);
 
          lista.inserirInicio(pessoa);
 
 
        }
 
        if  (le.charAt(1) == 'F') {
          pessoa.ler(aux);
          lista.inserirFim(pessoa);
 
        }
        if (le.charAt(1) == '*') {
          String p;
          if (le.charAt(le.length() - 2) == ' ') {
            p = "" + le.charAt(le.length() - 1) ;
          } else {
            p = "" +  le.charAt(le.length() - 2) + le.charAt(le.length() - 1)  ;
          }
          int numero = Integer.parseInt(p);
          pessoa.ler(aux);
          lista.inserir(pessoa, numero);
 
 
 
        }
      } else if (le.charAt(0) == 'R') {
        if ( le.charAt(1) == 'I') {
          pessoa = lista.removerInicio();
          MyIO.println("(R) " + pessoa.getNome());
        }
        if ( le.charAt(1) == 'F') {
          pessoa = lista.removerFim();
          MyIO.println("(R) " + pessoa.getNome());
        }
        if (le.charAt(1) == '*') {
          String f;
          if (le.charAt(le.length() - 2) == ' ') {
            f = "" + le.charAt(le.length() - 1) ;
          } else {
            f = "" +  le.charAt(le.length() - 2) + le.charAt(le.length() - 1)  ;
          }
          int numero = Integer.parseInt(f);
          pessoa = lista.remover(numero);
          MyIO.println("(R) " + pessoa.getNome());
 
        }
      }
    }//for
 
    lista.mostrar();
  }
}
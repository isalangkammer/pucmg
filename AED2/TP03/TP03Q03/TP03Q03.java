/**
 *----------------------------------------------------------------------
 * TP 03 - QUESTÃO 03 - Pilha com Alocação Sequencial
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer (Parte Max do Val Machado)
 * Desenvolvido em 2/2016
 * @version: 0.1
 *----------------------------------------------------------------------
 */


 class PilhaPessoa {

	private Pessoa[] arrayPilha;
	private int topo;

	public PilhaPessoa() {

		this(1000);

	}//end PilhaPessoa

	public PilhaPessoa(int tam) {

		arrayPilha = new Pessoa[tam];
		topo = 0;

	}//end PilhaPessoa

	/**
	 * Método que insere um elemento em uma pilha
	 *
	 * @param pessoa Elemento a ser inserido  
	 */
	public void Inserir(Pessoa pessoa) {

		if(topo >= arrayPilha.length) {

			MyIO.println("Erro ao inserir!");
			return;

		}//end if

		arrayPilha[topo] = pessoa;
		topo++;

	}//end inserir()

	public Pessoa Remover() {

		if(topo == 0) {

			MyIO.println("Erro ao remover!");
			return null;

		}//end if

		return arrayPilha[--topo];

	}//end remover()

	public void mostrar() {

		for(int i = 0; i < topo-1 ; i++) {

			MyIO.println(arrayPilha[i].imprimir());

		}//end for

	}//end mostrar()

}//end PilhaPessoa()


class Pessoa {

	private int id = 0;
	private String nome = "";
	private String nacionalidade = "";
	private String dataNasc = "";
	private String localNasc = "";
	private String dataMorte = "";
	private String localMorte = "";
	private int idade = 0;

	//contrutores 

	Pessoa() {

		this.id = this.idade = 0;
		this.nome = this.nacionalidade = this.dataNasc = this.localNasc = this.dataMorte = this.localMorte = "";

	}//end construtor vazio

	Pessoa(int id, String nome, String nacionalidade, String dataNasc, String localNasc, String dataMorte, String localMorte, int idade) {

		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.dataNasc = dataNasc;
		this.localNasc = localNasc;
		this.dataMorte = dataMorte;
		this.localMorte = localMorte;
		this.idade = idade;

	}//end contrutor

	//Método clone
	public Pessoa clone() {

		Pessoa pessoa = new Pessoa();

		pessoa.id = this.id; 
		pessoa.nome = this.nome;
		pessoa.nacionalidade = this.nacionalidade;
		pessoa.dataNasc = this.dataNasc;
		pessoa.localNasc = this.localNasc;
		pessoa.dataMorte = this.dataMorte;
		pessoa.localMorte = this.localMorte;
		pessoa.idade = this.idade;

		return pessoa;

	}//end clone

	// Métodos set's e get's

	public void setId(int id) {

		this.id = id;

	}//end setId

	public int getId() {

		return this.id;

	}//end getId

	public void setNome(String nome) {

		this.nome = nome;

	}//end setNome

	public String getNome() {

		return this.nome;

	}//end getNome

	public void setNacionalidade(String nacionalidade) {

		this.nacionalidade = nacionalidade;

	}//end setNacionalidade

	public String getNacionalidade() {

		return this.nacionalidade;

	}//end getNacionalidade

	public void setDataNasc(String dataNasc) {

		this.dataNasc = dataNasc;

	}//end setDataNasc

	public String getDataNasc() {

		return this.dataNasc;

	}//end getDataNasc

	public void setLocalNasc(String localNasc) {

		this.localNasc = localNasc;

	}//end setLocalNasc

	public String getLocalNasc() {

		return this.localNasc;

	}//end getLocalNasc

	public void setDataMorte(String dataMorte) {

		this.dataMorte = dataMorte;

	}//end setDataMorte

	public String getDataMorte() {

		return this.dataMorte;

	}//end getDataMorte

	public void setLocalMorte(String localMorte) {

		this.localMorte = localMorte;

	}//end setLocalMorte

	public String getLocalMorte() {

		return this.localMorte;

	}//end getLocalMorte

	public void setIdade(int idade) {

		this.idade = idade;

	}//end setIdade

	public int getIdade() {

		return this.idade;

	}//end getIdade

	public Pessoa parseArquivo(String str) {

		String[] array = str.split(" ## ");

		Pessoa p = new Pessoa();

		p.id = new Integer(array[0]).intValue();
		p.nome = array[1];
		p.nacionalidade = array[2];
		p.dataNasc = array[3];
		p.localNasc = array[4];
		p.dataMorte = array[5];
		p.localMorte = array[6];
		p.idade = new Integer(array[7]).intValue();

		return p;

	}//end

	/**
	 * Método para remover tags da String lida
	 *
	 * @param str String lida
	 * @return tmp String com as tags removidas
	 */
	public String removeTags(String str) {

		String tmp = "";

		for(int i=0; i<str.length(); i++) {

			while(i<str.length() && str.charAt(i) == '<') { //Enquanto o i for menor que o tamanho e igual ao < 

				for(i++; str.charAt(i) != '>'; i++); //executarr o for até >
				i++;

				while(i<str.length() && str.charAt(i) == '&') {// enquanro o i for menor que o tamanho e igual ao & para pegar a idade

					for(i++; str.charAt(i) != ';'; i++);
					i++;

				}//end while


			}//end while

			while(i<str.length() && str.charAt(i) == '&') {

				for(i++; str.charAt(i) != ';'; i++);
				i++;
				tmp = tmp + ' ';

			}//end while

			if(i<str.length()) {

				tmp = tmp + str.charAt(i);

			}//end if
 
		}//end for

		while(tmp.length() > 0 && tmp.charAt(0) == ' ') {

			tmp = tmp.substring(1);

		}//end while

		return tmp;

	}//end removeTags

	/**
	 * Método que pega a substring dentro da string lida
	 *
	 * @param str String lida
	 * @param antes
	 * @param depois
	 */
	public String entreSubstring(String str, String antes, String depois) {

		String temp = "";
		int posI, posFim;		
				
		posI = str.indexOf(antes) + antes.length();

		if(antes.compareTo(depois) != 0) {

			posFim = str.indexOf(depois);

		}//end if

		else {

			posFim = str.indexOf(depois, posI);

		}//end else

		if(0 <= posI && posI < posFim && posFim <str.length()) {

			temp = str.substring(posI, posFim);

		}//end if

		return temp;

	}//end  entreSubstring

	/**
	 * Método que pega a substring dentro da string lida
	 *
	 * @param str String lida
	 * @param antes
	 * @param depois
	 */
	public int entreInt(String str, String antes, String depois) {

		return (new Integer(entreSubstring(str, antes, depois).replace(".", "").trim())).intValue();

	}//end entreInt()

	public Pessoa ler(String nomeArquivo) {

		Pessoa pessoa = new Pessoa();

		Arq.openRead(nomeArquivo, "UTF8");

		String tmp = "";

		id = (nomeArquivo.charAt(nomeArquivo.length() - 8) - 48) * 100;
      		id = id + (nomeArquivo.charAt(nomeArquivo.length() - 7) - 48) * 10;
      		id = id + (nomeArquivo.charAt(nomeArquivo.length() - 6) - 48);
		pessoa.setId(id);
		
		for(tmp = Arq.readLine(); tmp.contains("<title>") == false; tmp = Arq.readLine());
		nome = entreSubstring(tmp, "<title>", " – Wikipédia");
		pessoa.setNome(nome);

		for(tmp = Arq.readLine(); tmp.contains("Nacionalidade") == false; tmp = Arq.readLine());
		nacionalidade = removeTags(Arq.readLine());
		pessoa.setNacionalidade(nacionalidade);

		for(tmp = Arq.readLine(); tmp.contains("Nascimento") == false; tmp = Arq.readLine());
		dataNasc = removeTags(Arq.readLine());
		pessoa.setDataNasc(dataNasc);

		//se a pessoa ainda estiver viva
		if(dataNasc.charAt(dataNasc.length()-1) == ')') {

			String aux = dataNasc.substring(dataNasc.indexOf('(') + 1);
			aux =  aux.substring(0, aux.indexOf(' '));
			idade = (new Integer(aux)).intValue();
			dataNasc= dataNasc.substring(0, dataNasc.indexOf('('));
			dataMorte = "vivo";
			localMorte = "vivo";

		}//end else

		else {

			dataMorte = "";
			localMorte = "";

		}//end else

		for(tmp = Arq.readLine(); tmp.contains("Local") == false; tmp = Arq.readLine());
		localNasc = removeTags(Arq.readLine());
		pessoa.setLocalNasc(localNasc);

		if(dataMorte.length() == 0) {
		
			for(tmp = Arq.readLine(); tmp.contains("Morte") == false; tmp = Arq.readLine());
			dataMorte = removeTags(Arq.readLine());

			if(dataMorte.contains("(") == true) {

				String aux = dataMorte.substring(dataMorte.indexOf('(') + 1);
				aux = aux.substring(0, aux.indexOf(' '));
				idade = (new Integer(aux)).intValue();
				dataMorte = dataMorte.substring(0, dataMorte.indexOf('('));

			}//end if
		
			pessoa.setDataMorte(dataMorte);
			pessoa.setIdade(idade);
	
			for(tmp = Arq.readLine(); tmp.contains("Local") == false; tmp = Arq.readLine());
			localMorte = removeTags(Arq.readLine());
			pessoa.setLocalMorte(localMorte);

		}//end if

		Arq.close();

		return pessoa;
		
	}//end ler()

	public String imprimir() {

		String str = this.getId() + " ## " + this.getNome() + " ## " + this.getNacionalidade() + " ## " + this.getDataNasc() + " ## " + this.getLocalNasc() + " ## " + this.getDataMorte() + " ## " + this.getLocalMorte() + " ## " + this.getIdade() + " ";

		return str;

	}//end imprimir

}//end class Pessoa

public class TP03Q03 {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		PilhaPessoa pilhapessoa = new PilhaPessoa(1000);
		int aux = 0;
		String nomeArquivo = " ";
 
		for(nomeArquivo = MyIO.readLine(); nomeArquivo.equals("FIM") == false; nomeArquivo = MyIO.readLine()) {

			pilhapessoa.Inserir(pessoa.ler(nomeArquivo));
				
		}//end for

		aux = Integer.parseInt(MyIO.readLine());

		for(int i = 0; i < aux; i++) {

			nomeArquivo = MyIO.readLine();

			if(nomeArquivo.charAt(0) == 'I') {

				Pessoa p = pessoa.parseArquivo(nomeArquivo.substring(1, nomeArquivo.length()).trim());
				//MyIO.println(pessoa.imprimir());
				pilhapessoa.Inserir(p);

			}//end if

			else if(nomeArquivo.charAt(0) == 'R') {

				MyIO.println("(R) " + pilhapessoa.Remover().getNome());

			}//end if

		}//end for

		pilhapessoa.mostrar();

	}//end main()

}//end class



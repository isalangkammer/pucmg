/**
 *---------------------------------------------------------------------------
 * TP 06 - QUESTÃO 01 - Lista com Alocação Flexível
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer  (Parte Max do Val Machado)
 * Desenvolvido em 2/2016
 * @version: 0.2
 *---------------------------------------------------------------------------
 */

class Celula {

	public Pessoa elemento;
	public Celula prox;

	public Celula() {

		this(null);

	}//end

	public Celula(Pessoa elemento) {

		this.elemento = elemento;
		this.prox = null;

	}//end

}//end celula

class ListaSimples {

	public Celula primeiro;
	public Celula ultimo;
	

	public ListaSimples() {

		primeiro = new Celula();
		ultimo = primeiro;

	}//end construtor


	/**
	 * Método que insere no inicio de uma lista
	 *
	 * @param pessoa Pessoa
	 */
	public void InserirInicio(Pessoa pessoa) {

		Celula tmp = new Celula(pessoa);

		if(primeiro == ultimo) {

			ultimo.prox = tmp;
			ultimo = ultimo.prox;
			
		}

		tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		tmp = null;

	}//end InserirInicio()

	/**
	 * Método que insere no fim de uma lista
	 *
	 * @param pessoa Pessoa
	 */
	public void InserirFim(Pessoa pessoa) {

		ultimo.prox = new Celula(pessoa);
		ultimo = ultimo.prox;

	}//end InserirFim()

	/**
	 * Método que insere  em uma posicao determinada.
	 *
	 * @param pessoa Pessoa
	 * @param posicao Posicao em que o elemento vai ser inserido
	 */
	public void Inserir(Pessoa pessoa, int posicao) {

		int contador = -1;
		Celula tmp = new Celula(pessoa);

		for(Celula i = primeiro; i != null; i = i.prox) {

			if(i.prox == ultimo && (contador + 2) < posicao) {

				MyIO.println("Erro!");
				
			}

			if((contador + 1) == posicao) {

				tmp.prox = i.prox;
				i.prox = tmp;
				
			}

			contador++;
			
		}

		if(ultimo.prox != null) {

			ultimo = ultimo.prox;
			ultimo.prox = null;
			
		}

	}//end Inserir()

	/**
	 * Método que remove um elemento da primeira posicao da lista
	 *
	 * @return resposta Primeiro elemento contido na Lista
	 */
	public Pessoa RemoverInicio() {

		if(primeiro == ultimo) {

			MyIO.println("Erro ao remover!");
			
		}

		Pessoa resposta = primeiro.prox.elemento;
		Celula tmp = primeiro;
		primeiro = primeiro.prox;
		tmp.prox = null;
		tmp = null;

		return resposta;

	}// end RemoverInicio()

	/**
	 * Método que remove o elemento do fim da lista
	 *
	 * @return resposta Elemento contido na ultima posicao da lista
	 */
	 public Pessoa RemoverFim() {

	 	Pessoa resposta = ultimo.elemento.clone();

	 	for(Celula i = primeiro; i != null; i = i.prox) {

	 		if(i.prox == ultimo) {

	 			ultimo = i;
	 			i.prox = null;
	 			
	 		}
	 		
	 	}

	 	return resposta;

	 }//end RemoverFim()

	/**
	 * Método que remove o elemento da posicao desejada
	 * 
	 * @param posicao Posicao em que o elemento vai ser removido
	 * @return resposta  Elemnto contido na posicao
	 */
	public Pessoa Remover(int posicao) {

		int contador = -1;
		Pessoa resposta = primeiro.elemento;
		Celula tmp;

		for(Celula i = primeiro; i != null; i = i.prox) {

			if((contador + 1) == posicao) {

				resposta = i.prox.elemento;
				tmp = i.prox;
				i.prox = i.prox.prox;
				tmp.prox = null;
				tmp = null;
				
			}

			contador++;
			
		}

		return resposta;

	}//end Remover()

	public void mostrar() {

		for(Celula i = primeiro.prox; i != null; i = i.prox) {
			
			System.out.println(i.elemento.imprimir());

		} 

	}//end mostrar

}//end class

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

		this.id = 0;
		this.idade = 0;
		this.nome = "";
		this.nacionalidade = ""; 
		this.dataNasc = "";
		this.localNasc = "";
		this.dataMorte = "";
		this.localMorte = "";

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

	public void parseArquivo(String str) {

		String[] array = str.split(" ## ");

		//int posicao = 0;

		this.id = new Integer(array[0]).intValue();
		//this.posicao = new Integer(array[1]).intValue();
		this.nome = array[1];
		this.nacionalidade = array[2];
		this.dataNasc = array[3];
		this.localNasc = array[4];
		this.dataMorte = array[5];
		this.localMorte = array[6];
		this.idade = new Integer(array[7]).intValue();

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

				for(i++; str.charAt(i) != '>'; i++); //executar o for até >
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
	 * Método que "pega" a substring dentro de uma string
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
	 * Método que "pega" o inteiro dentro de uma string
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

		for(tmp = Arq.readLine(); tmp.contains(">Nacionalidade</td>") == false; tmp = Arq.readLine());
		nacionalidade = removeTags(Arq.readLine());
		pessoa.setNacionalidade(nacionalidade);

		for(tmp = Arq.readLine(); tmp.contains(">Nascimento</td>") == false; tmp = Arq.readLine());
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

		for(tmp = Arq.readLine(); tmp.contains(">Local</td>") == false; tmp = Arq.readLine());
		localNasc = removeTags(Arq.readLine());
		pessoa.setLocalNasc(localNasc);

		if(dataMorte.length() == 0) {
		
			for(tmp = Arq.readLine(); tmp.contains(">Morte</td>") == false; tmp = Arq.readLine());
			dataMorte = removeTags(Arq.readLine());

			if(dataMorte.contains("(") == true) {

				String aux = dataMorte.substring(dataMorte.indexOf('(') + 1);
				aux = aux.substring(0, aux.indexOf(' '));
				idade = (new Integer(aux)).intValue();
				dataMorte = dataMorte.substring(0, dataMorte.indexOf('('));

			}//end if
		
			pessoa.setDataMorte(dataMorte);
			pessoa.setIdade(idade);
	
			for(tmp = Arq.readLine(); tmp.contains(">Local</td>") == false; tmp = Arq.readLine());
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

public class tp {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		ListaSimples listaSimples = new ListaSimples();
		String nomeArquivo = "";
		int aux = 0;
		int posicao = 0;
 
		for(nomeArquivo = MyIO.readLine(); nomeArquivo.equals("FIM") == false; nomeArquivo = MyIO.readLine()) {

			pessoa.ler(nomeArquivo);
			listaSimples.InserirFim(pessoa);
				
		}//end for

		aux = Integer.parseInt(MyIO.readLine());

		for(int i = 0; i < aux; i++) {

			nomeArquivo = MyIO.readLine();

			switch(nomeArquivo.substring(0, 2)) {

				case "II" : 

					pessoa.parseArquivo(nomeArquivo.substring(3, nomeArquivo.length()));
					listaSimples.InserirInicio(pessoa);
					break;

				case "IF" :

					pessoa.parseArquivo(nomeArquivo.substring(3, nomeArquivo.length()));
					listaSimples.InserirFim(pessoa);
					break;

				case "I*" :

					posicao = Integer.parseInt(nomeArquivo.substring(2,5).trim());
					pessoa.parseArquivo(nomeArquivo.substring(5, nomeArquivo.length()).trim());
					listaSimples.Inserir(pessoa, posicao);
					break;

				case "RI" :

					MyIO.println("(R) " + listaSimples.RemoverInicio().getNome());
					break;

				case "RF" :

					MyIO.println("(R) " + listaSimples.RemoverFim().getNome());
					break;
				
				case "R*" :

					posicao = Integer.parseInt(nomeArquivo.substring(2).trim());
					MyIO.println("(R) " + listaSimples.Remover(posicao).getNome());
					break;

				default :

					MyIO.println("Erro!");

			}//end switch

		}//end for

		listaSimples.mostrar();

	}//end main()

}//end class
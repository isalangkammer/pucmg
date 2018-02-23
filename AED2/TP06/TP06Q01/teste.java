/**
 *---------------------------------------------------------------------------
 * TP 06 - QUESTÃO 01 - Lista com Alocação Flexível
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer  (Parte Max do Val Machado)
 * Desenvolvido em 2/2016
 * @version: 0.1
 *---------------------------------------------------------------------------
 */

class Celula {

	public Pessoa elemento;
	public Celula prox;

	public Celula() {

		this(null);

	}

	public Celula(Pessoa elemento) {

		this.elemento = elemento;
		this.prox = null;

	}

}//end Celula


class ListaPessoa {

	private Celula primeiro;
	private Celula ultimo;

	public ListaPessoa() {

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
		tmp.prox = primeiro.prox;
		primeiro.prox = tmp;

		//System.out.println("INSERINDOINICIO  -" + pessoa.imprimir());

		if(primeiro == ultimo) {

			ultimo = tmp;
			primeiro.prox = ultimo;//
			
		}

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
		//System.out.println("INSERINDOFIM  -" + pessoa.imprimir());


	}//end InserirFim()

	/**
	 * Método que insere  em uma posicao determinada.
	 *
	 * @param pessoa Pessoa
	 * @param posicao Posicao em que o elemento vai ser inserido
	 */
	public void Inserir(Pessoa x, int posicao) {
		Celula tmp = new Celula(x);
		if(primeiro == ultimo){
			ultimo.prox = tmp;
			ultimo = ultimo.prox;
		}
		tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		tmp = null;
	}
	
	public void inserirFim(Pessoa x){
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
	}
	
	public void inserirMeio(Pessoa x, int posicao) throws Exception{
		int contador = -1;
		Celula tmp = new Celula(x);
		for(Celula i = primeiro; i != null; i = i.prox){
			if(i.prox == ultimo && (contador + 2) < posicao){
				throw new Exception("Posicao Invalida");
			}
			if((contador + 1) == posicao){
				tmp.prox = i.prox;
				i.prox = tmp;
			}
			contador++;
		}
		if(ultimo.prox != null){
			ultimo = ultimo.prox;
			ultimo.prox = null;
		}

		/*
		int tamanho = tamanho();
		Celula tmp = new Celula(pessoa);

		if(posicao < 0 || posicao > tamanho) {

			MyIO.println("ERRO! Posicao invalida!");

		}//end if

		else if(posicao == 0) {

			InserirInicio(pessoa); 
			
		}

		else if(posicao == tamanho) {

			InserirFim(pessoa);
			
		}

		else {

			int contador = -1;
			
			for(Celula i = primeiro; i != null; i = i.prox) {

				if(contador + 1 == posicao) {

					tmp.prox = i.prox;
					i.prox = tmp;
					
				}

				contador++;
				
			}

			/*Celula i = primeiro;

			for(int x = 0; x < posicao; x++, i = i.prox);
			Celula tmp = new Celula(pessoa);
			tmp.prox = i.prox;
			i.prox = tmp;
			tmp = null;
			i = null;
			//System.out.println("INSERINDO  -" + pessoa.imprimir());*/


		//}

	}//end Inserir()

	/**
	 * Método que remove um elemento da primeira posicao da lista
	 *
	 * @return resposta Primeiro elemento contido na Lista
	 */
	public Pessoa RemoverInicio() {

		Pessoa resposta = null;

		if(primeiro == ultimo) {

			MyIO.println("ERRO! Nao e possivel remover no Inicio da Lista!");
			
		}
			
		resposta = primeiro.prox.elemento;
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

	 	Pessoa resposta = null;

	 	if(primeiro == ultimo) {

	 		MyIO.println("ERRO! Nao e possivel remover no Fim da Lista!");
	 		
	 	}
	 	
	 	resposta = ultimo.elemento;	 		
	 	Celula i;

	 	for(i = primeiro; i.prox != null; i = i.prox);

	 	ultimo = i;
	 	i.prox = null;
	 	i = null;


	 	return resposta;

	 }//end RemoverFim()

	/**
	 * Método que remove o elemento da posicao desejada
	 * 
	 * @param posicao Posicao em que o elemento vai ser removido
	 * @return resposta  Elemnto contido na posicao
	 */
	public Pessoa Remover(int posicao) {

		int tamanho = tamanho();
		Pessoa resposta = null;

		if(primeiro == ultimo) {

			MyIO.println("ERRO! Nao e possivel remover!");
			
		}

		else if(posicao < 0 || posicao >= tamanho) {

			MyIO.println("ERRO! Posicao invalida!");
			
		}

		else if(posicao == 0) {

			resposta = RemoverInicio();
			
		}

		else if(posicao == tamanho - 1) {

			resposta = RemoverFim();
			
		}

		else {

			Celula i = primeiro;

			for(int x = 0; x < posicao; x++, i = i.prox);

			Celula tmp = i.prox;
			resposta = tmp.elemento;
			i.prox = tmp.prox;
			tmp.prox = null;
			i = null;
			tmp = null;

		}//end

		return resposta;

	}//end Remover()

	public void mostrar() {

		for(Celula i = primeiro.prox; i != null; i = i.prox) {

			System.out.println(i.elemento.imprimir());

		}//end for

	}//end mostrar()

	public int tamanho() {

		int tamanho = 0;

		for(Celula i = primeiro; i != null; i = i.prox, tamanho++);

		return tamanho;

	}

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

			pessoa.setIdade(idade);

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

		MyIO.setCharset("UTF-8");
		String str = this.getId() + " ## " + this.getNome() + " ## " + this.getNacionalidade() + " ## " + this.getDataNasc() + " ## " + this.getLocalNasc() + " ## " + this.getDataMorte() + " ## " + this.getLocalMorte() + " ## " + this.getIdade() + " ";

		return str;

	}//end imprimir

}//end class Pessoa

public class teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		ListaPessoa listapessoa = new ListaPessoa();
		String nomeArquivo = "";
		int aux = 0;
		int posicao = 0;
 
		for(nomeArquivo = MyIO.readLine(); nomeArquivo.equals("FIM") == false; nomeArquivo = MyIO.readLine()) {

			listapessoa.InserirFim(pessoa.ler(nomeArquivo));
				
		}//end for

		aux = Integer.parseInt(MyIO.readLine());

		/*for(int i = 0; i < aux; i++) {

			nomeArquivo = MyIO.readLine();

			switch(nomeArquivo.substring(0, 2)) {

				case "II" : 

					pessoa.parseArquivo(nomeArquivo.substring(3, nomeArquivo.length()));
					listapessoa.InserirInicio(pessoa);
					break;

				case "IF" :

					pessoa.parseArquivo(nomeArquivo.substring(3, nomeArquivo.length()));
					listapessoa.InserirFim(pessoa);
					break;

				case "I*" :

					posicao = Integer.parseInt(nomeArquivo.substring(2,5).trim());
					pessoa.parseArquivo(nomeArquivo.substring(5, nomeArquivo.length()).trim());
					listapessoa.Inserir(pessoa, posicao);
					break;

				case "RI" :

					MyIO.println("(R) " + listapessoa.RemoverInicio().getNome());
					break;

				case "RF" :

					MyIO.println("(R) " + listapessoa.RemoverFim().getNome());
					break;
				
				case "R*" :

					posicao = Integer.parseInt(nomeArquivo.substring(2).trim());
					MyIO.println("(R) " + listapessoa.Remover(posicao).getNome());
					break;

				default :

					MyIO.println("Erro!");

			}//end switch*/

		for(int i = 0; i < aux; i++) {


			nomeArquivo = MyIO.readLine();
			if(nomeArquivo.charAt(0) == 'I') {

				if(nomeArquivo.contains("II")) {

					pessoa.parseArquivo(nomeArquivo.substring(3, nomeArquivo.length()));
					listapessoa.InserirInicio(pessoa);

				}//end if

				else if(nomeArquivo.contains("IF")) {

					pessoa.parseArquivo(nomeArquivo.substring(3, nomeArquivo.length()));
					listapessoa.InserirFim(pessoa);
   	
				}//end else id

				else if(nomeArquivo.contains("I*")) {

					posicao = Integer.parseInt(nomeArquivo.substring(2,5).trim());
					pessoa.parseArquivo(nomeArquivo.substring(5, nomeArquivo.length()).trim());
					listapessoa.Inserir(pessoa, posicao);
   	
				}//end else if


			}//end if

			else if(nomeArquivo.charAt(0) == 'R') {

				if(nomeArquivo.contains("RI")) {

					MyIO.println("(R) " + listapessoa.RemoverInicio().getNome());

				}//end else if

				else if(nomeArquivo.contains("RF")) {

					MyIO.println("(R) " + listapessoa.RemoverFim().getNome());

				}//end else if

				else if(nomeArquivo.contains("R*")) {


					posicao = Integer.parseInt(nomeArquivo.substring(2).trim());
					MyIO.println("(R) " + listapessoa.Remover(posicao).getNome());

				}//end else if

			}//end else if

		}//end for

		listapessoa.mostrar();

	}//end main()

}//end class

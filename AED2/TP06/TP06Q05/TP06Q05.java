/**
 *---------------------------------------------------------------------------
 * TP 06 - QUESTÃO 05 - Matriz
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer 
 * Desenvolvido em 2/2016
 * @version: 0.2
 *---------------------------------------------------------------------------
 */



class Celula {

	public int elemento;
	public Celula inf, sup, esq, dir;

	public Celula() {

		this(0, null, null, null, null);

	}

	public Celula(int elemento) {

		this(elemento, null, null, null, null);

	}

	public Celula(int elemento, Celula inf, Celula sup, Celula esq, Celula dir) {

		this.elemento = elemento;
		this.inf = null;
		this.sup = null;
		this.esq = null;
		this.dir = null;

	}

}//end class Celula

class Matriz {

	private Celula inicio;
	private int linha, coluna;

	public Matriz() {

		this.linha = 3;
		this.coluna = 3;

	}

	/**
	 * Construtor da matriz e que inicializa a matriz
	 */
	public Matriz(int linha, int coluna) {

		this.linha = linha;
		this.coluna = coluna;

		Celula on = null;
		Celula below = null;
		Celula atual = null;
		int condicao = 0; 

		for(int i = 0; i <= linha; i++) {

			if(i == 0) {

				inicio = new Celula();
				atual = inicio;
				
			}

			else {

				on = atual;
				for(int j = 0; j < coluna - 1; j++) {

					on.dir = new Celula();
					on = on.dir;
					
				}

				if(i == linha) {

					i++;
					
				}

				else {

					atual.inf = new Celula();
					atual = atual.inf;
					on = atual;

				}

			}//end else
			
		}//end for

		atual = inicio;
		on = atual;
		below = on.inf;
		for(int i = 0; i < linha - 1; i++) {

			atual = below;

			for(int j = 0; j < coluna; j++) {

				on.inf = below;
				below.sup = on;
				condicao = coluna - j;

				if(condicao == 1) {
					
					j++;

				}
				
				else {

					on.dir.esq = on;
					below.dir.esq = below;
					on = on.dir;
					below = below.dir;

				}

				condicao = 0;
			} // end for

			on = atual;
			below = on.inf;

		}//end for

		on = below = atual = null;

	}//end

	/**
	 * Método que insere na matriz
	 */
	public void inserirMatriz() {

		Celula l = inicio;
		Celula c = l;

		c.elemento = MyIO.readInt();

		for(int i = 0; i < linha; i++) {

			for(int j = 0; j < coluna - 1; j++) {

				c = c.dir;
				c.elemento = MyIO.readInt();
				
			}

			l = l.inf;
			c = l;

			if(i != linha - 1) {

				c.elemento = MyIO.readInt();
				
			} //end if
			
		}//end for

	}//end 

	/*
	 * Método que soma a matriz
	 */
	public Matriz soma(Matriz matriz) {

		Matriz resposta = null;

		if(this.linha == matriz.linha && this.coluna == matriz.coluna) {
		
			resposta = new Matriz(linha,coluna);

         	Celula i = inicio, i1 = matriz.inicio, i2 = resposta.inicio;
         	Celula j = i, j1 = i1, j2 = i2;

         	for(int lin = 0; lin < linha; lin++) {
            	
            	for(int col = 0; col < coluna; col++) {
               	
               		j2.elemento = j.elemento + j1.elemento;
               
               		j2 = j2.dir;
               		j1 = j1.dir;
               		j = j.dir; 
            	
            	}
            
            	i = i.inf;
            	i1 = i1.inf;
            	i2 = i2.inf;
            	j = i;
            	j1 = i1;
            	j2 = i2;
         }
      }

      return resposta;

	}//end soma

	/*
	 * Método que multiplica a matriz
	 */
	public Matriz multiplicacao(Matriz matriz) {

		Matriz resposta = null;

      	if(this.linha == matriz.linha && this.coluna == matriz.coluna){

         	resposta = new Matriz(linha,coluna);
         	
         	Celula i = inicio;
         
         	Celula i1 = matriz.inicio;
         	
         	Celula i2 = resposta.inicio;
         	
         	Celula j = i;
         
         	Celula j1 = i1;
         
         	Celula j2 = i2;

         	for(int l = 0; l < linha; l++) {
            	
            	for(int c = 0; c < coluna; c++){
               		
               		j2.elemento = multiplicar(j,j1);   // guarda  o valor do produto com o método auxiliar
             
               		j1 = j1.dir;
               		j2 = j2.dir; 
            	
            	}
            
            	i = i.inf;
            	j = i;
            	j1 = i1;
            	i2 = i2.inf;
            	j2 = i2;
      
         	}
      	}
 
      return resposta;

	}//end multiplicacao

	
   	public int multiplicar(Celula j, Celula j1){ 
      	int soma = 0;

      	for(int c = 0; c < coluna; c++) {

        	soma += (j.elemento * j1.elemento);
   
         	j = j.dir;// 1 linha(m1)
         	j1 = j1.inf;// 1 coluna(m2)
      
      	}

      	return soma;

   	}


	public boolean isQuadrada() {

		boolean resposta = false;

      	if(this.linha == this.coluna) {
        
         	resposta = true;
      	
      	}
        
        return resposta;

	}//end isQuadrada

	/*
	 * Método que mostra a Diagonal principal
	 */
	public void mostrarDiagonalPrincipal() {

		Celula c,i;
      
      	if(isQuadrada() == true){
         
         	for(c = inicio; c.dir != null; c = c.dir);
         		
         	for(c = c; c.inf != null; c = c.inf);   
          	
          	System.out.print(inicio.elemento+" ");
         	
         	for(i  = inicio; i != c; i = i.inf.dir) {

            	System.out.print(i.inf.dir.elemento +" ");
         	} 
         
         System.out.println("");
      	
      	}

	}//end mostrarDiagonalPrincipal

	/*
	 * Método que mostra a Diagonal secundária
	 */
	public void mostrarDiagonalSecundaria() {

		Celula i,c;
      	
      	if(isQuadrada() == true){
         	
         	for(i = inicio; i.dir != null; i = i.dir);
         	
         	for(c = inicio; c.inf != null; c = c.inf);
         	
         	System.out.print(i.elemento+" ");
         
         	for(i = i; i != c; i = i.inf.esq) {
            
            	System.out.print(i.inf.esq.elemento+" ");
         
         	} 
         
         	System.out.println("");
      
      	}  

	}//end mostrarDiagonalSecundaria

	public void mostrar() {

		Celula i = inicio, j = i;
      	
      	for(i = inicio; i != null; i = i.inf) {
         	
         	for(j = i; j != null; j = j.dir) {
            	
            	System.out.print(j.elemento+" ");
         	}
         
        	System.out.println();
      
      	}

	}

}//end Matriz

class TP06Q05 {

	public static void main(String[] args) {

		Matriz matriz = new Matriz();

		int tamanho = MyIO.readInt();

		for(int i = 0; i < tamanho; i++) {

			int linha = MyIO.readInt();
			int coluna = MyIO.readInt();

			Matriz matriz1 = new Matriz(linha, coluna);
			matriz1.inserirMatriz();
			matriz1.mostrarDiagonalPrincipal();
			matriz1.mostrarDiagonalSecundaria();

			linha = MyIO.readInt();
			coluna = MyIO.readInt();

			Matriz matriz2 = new Matriz(linha, coluna);
			matriz2.inserirMatriz();

			matriz1.soma(matriz2).mostrar();
			matriz1.multiplicacao(matriz2).mostrar();
			
		}
		
	}

}//end 

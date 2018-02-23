/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 07 - Algebra Booleana
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

/**
 Crie um método iterativo que recebe uma string contendo uma expressão
booleana e o valor de suas entradas e retorna um booleano indicando se a expressão é verdadeira
ou falsa. Cada string de entrada é composta por um número inteiro n indicando o número de
entradas da expressão booleana corrente. Em seguida, a string contém n valores binários (um
para cada entrada) e a expressão booleana. Na saı́da padrão, para cada linha de entrada, escreva
uma linha de saı́da com SIM / NÃO indicando se a expressão corrente é verdadeira ou falsa.
 */

public class TP01Q07Algebra {

	public static boolean algebraBooleana(String str) {

	//usar replace para trocar a porta 

	}//end algebraBooleana()

	public static void main(String[] args) {

		String[] string = new String[1000]
		String str;
		int num = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			MyIO.println();

		}//end for 

	}//end main()

}//end class

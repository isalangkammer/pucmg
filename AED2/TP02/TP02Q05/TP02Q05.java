/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 05 - Alteração Aleatoria
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

import java.util.Random;

public class TP02Q05 {

	/**
	 * Método que gera as letras aleatorias e chama o metodo recursivo
	 *
	 * @param str String
	 * @param gerador Gerador de letras aleatorias
 	 */
	public static String aleatoria(String str, Random gerador) {

		String aux = "";

		char letra1 = (char)('a'+(Math.abs(gerador.nextInt())%26));
		char letra2 = (char)('a'+(Math.abs(gerador.nextInt())%26));
		
		return aleatoria(str, letra1, letra2, aux, 0);

	}//end aleatoria()

	/**
	 * Método que altera as letras geradas pelo Random gerador
	 *
	 * @param str String lida
	 * @param letra1 Caracter gerado aleatorio
	 * @param letra2 Caracter gerado aleatorio
	 * @param aux String modificada
	 * @param num Contador
 	 */
	public static String aleatoria(String str, char letra1, char letra2, String aux, int num) {

		if(num > str.length()-1) {

			return aux;

		}//end if

		else if(str.charAt(num) == letra1) {

			return aleatoria(str, letra1, letra2, aux+letra2, num+1);

		}//end else if

		else {

			return aleatoria(str, letra1, letra2, aux+str.charAt(num), num+1);

		}//end else

	}//end aleatoria()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;

		Random gerador = new Random();
		gerador.setSeed(4);

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			MyIO.println(aleatoria(string[i], gerador));

		}//end for 

	}//end main()

}//end class

/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 05 - Alteração Aleatoria
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


import java.util.Random;

public class TP01Q05AlteracaoAleatoria {

	/**
	 * Método que troca uma letra da String por outra
	 *
	 * @param str String lida
	 * @param gerador Gerador de letra aleatoria
	 * @return tmp String alterada
	 */
	public static String aleatoria(String str, Random gerador) {

		String tmp = "";
		char letra1, letra2;

		letra1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
		letra2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

		for(int i=0; i<str.length(); i++) {

			if(str.charAt(i) == letra1) {

				tmp = tmp + letra2;

			}//end if
			
			else {

				tmp = tmp + str.charAt(i);

			}//end else

		}//end for 

		return tmp;

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

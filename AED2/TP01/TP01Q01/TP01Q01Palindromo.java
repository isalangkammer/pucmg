/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 01 - Palindromo
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP01Q01Palindromo {

	/**
	 * Método que verifica se uma String é palindromo.
	 *
	 * @param str String lida
	 * @return palindromo 
	 */
	public static boolean isPalindromo(String str) {

		boolean palindromo = true;
		char inicio;
		char ultimo;
		int tam = str.length();

		for(int i=0; i<tam/2; i++) {

			inicio = str.charAt(i);
			ultimo = str.charAt((tam-1)-i);
			if(inicio != ultimo) {

				palindromo = false;

			}//end if

		}//end for

		return palindromo;

	}//end isPalindromo()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str = "";
		int num = 0;
		boolean palindromo;
		
		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;
		
		for(int i=0; i<num; i++) {

			palindromo = isPalindromo(string[i]);
			if(palindromo) {

				MyIO.println("SIM");

			}//end if

			else {

				MyIO.println("NAO");

			}//end else
		}//end for

	}//end main()

}//end class

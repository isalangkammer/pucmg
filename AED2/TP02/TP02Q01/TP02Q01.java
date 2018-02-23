/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 01 - Palindromo Recursivo
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP02Q01 {

	/**
	 * Método que inicializa o contador e chama o método recursivo.
	 *
	 * @param str String lida
	 */
	public static boolean isPalindromo(String str) {

		return isPalindromo(str, 0);

	}//end isPalindromo()

	/**
	 * Método recursivo que verifica se uma palavra é palindroma
	 *
	 * @param str String lida
	 * @param num Contador e condição de parada
	 */
	public static boolean isPalindromo(String str, int num) {

		if(num > str.length()/2) {
		
			return true;

		}//end if

		else if(str.charAt(num) != str.charAt(str.length()-1-num)) {

			return false;

		}//end else if

		else {

			return isPalindromo(str, num+1);

		}//end else

	}//end isPalindromo()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;
		boolean palindromo = false;

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

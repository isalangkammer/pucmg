/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 06 - Equals
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP02Q06 {

	/**
	 * Método que inicializa o metodo recursivo
	 *
	 * @param str1 String lida
	 * @param str2 String lida
 	 */
	public static int isEquals(String str1, String str2) {

		return isEquals(str1, str2, 0, 0);

	}//end isEquals()

	/**
	 * Método recursivo que verifica se duas strings são iguais
	 *
	 * @param
	 * @return
 	 */
	public static int isEquals(String str1, String str2, int num, int igual) {

		if(str1.length()-1 != str2.length()-1) {

			return 0;

		}//end if

		else {

			if(num > str1.length()-1) {

				return igual;

			}//end if

			else if(str1.charAt(num) == str2.charAt(num)) {

				return isEquals(str1, str2, num+1, igual+1);

			}//end else if

			else {

				return isEquals(str1, str2, num+1, igual);

			}//end else

		}//end else

	}//end isEquals()

	/**
	 * Método que ignora as letras Maiusculas
	 *
	 * @param str String lida
	 * @return tmp String com as letras maiusculas ignoradas
	 */
	public static String ignoraMaiusculas(String str) {

		String tmp = "";
		char aux;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if(aux >= 'A' && aux <= 'Z') {

				tmp = tmp + (char)((int)aux + 32);

			}//end if

			else {

				tmp = tmp + (char)aux;

			}//end else

		}//end for

		return tmp;

	}//end ignoraMaiusculas()

	/**
	 * Método que inicializa o método recursivo
	 *
	 * @param str1 String lida
	 * @param str2 String lida
	 */
	public static int isEqualsM(String str1, String str2) {

		return isEqualsM(ignoraMaiusculas(str1), ignoraMaiusculas(str2), 0, 0);

	}//end isEqualsM

	/**
	 * Método recursivo que verifica se duas Strings são iguais ignorando as letras Maiusculas
	 *
	 * @param str1 String lida convertida
	 * @param str2 String lida convertida
	 */
	public static int isEqualsM(String str1, String str2, int num, int igual) {

		if(str1.length()-1 != str2.length()-1) {

			return 0;

		}//end if

		else {
			
			if(num > str1.length()-1) {

				return igual;

			}//end if

			else if(str1.charAt(num) == str2.charAt(num)) {

				return isEquals(str1, str2, num+1, igual+1);

			}//end else if

			else {

				return isEquals(str1, str2, num+1, igual);

			}//end else			
		
		}//end else

	}//end isEqualsM

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;
		int iguais = 0, iguaisM = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			if(num % 2 != 0) {

				iguais = isEquals(string[i], string[i]);
				iguaisM = isEqualsM(string[i], string[i]);

			}//end if

			else {
				iguais = isEquals(string[i], string[i+1]);
				iguaisM = isEqualsM(string[i], string[i+1]);

			}//end else

			if(iguais == string[i].length()) {

				MyIO.print("SIM ");

			}//end if

			else {

				MyIO.print("NAO ");

			}//end else

			if(iguaisM == string[i].length()) {

				MyIO.println("SIM");

			}//end if

			else {

				MyIO.println("NAO");

			}//end else			

		}//end for 

	}//end main()

}//end class

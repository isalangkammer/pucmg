/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 10 - Converte
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP02Q10 {

	/**
	 * Método que chama o recursivo e inicializa o contador
	 *
	 * @param str String lida
 	 */
	public static String converteMaiuscula(String str1) {

		String str2 = "";
		return converteMaiuscula(str1, str2, 0);

	}//end converteMaiuscula()

	/**
	 * Método recursivo que converte uma string minuscula em maiuscula.
	 *
	 * @param str1 String lida
	 * @param str2 String auxiliar que retornara a string modificada
	 * @param num Int contador 
 	 */
	public static String converteMaiuscula(String str1, String str2, int num) {

		if(numero(str1) == true) {

			return str2;

		}//end if

		else {

			if(num > str1.length()-1) {
	
				return str2;

			}//end if

			else if(str1.charAt(num) >= 'a' && str1.charAt(num) <= 'z' || str1.charAt(num) >= 'à' && str1.charAt(num) <= 'ý') {
	
				return converteMaiuscula(str1, str2 + (char)(str1.charAt(num) - 32), num + 1);

			}//end else

			else {

				return converteMaiuscula(str1, str2 + str1.charAt(num), num+1);			

			}//ende else

		}//end else if

	}//end converteMaiuscula()

	/**
	 * Método que chama o recursivo e inicializa o contador
	 *
	 * @param str String lida
 	 */
	public static String converteMinuscula(String str1) {

		String str2 = "";
		return converteMinuscula(str1, str2, 0);

	}//end converteMinuscula()

	/**
	 * Método recursivo que converte uma string maiuscula em minuscula.
	 *
	 * @param str1 String lida
	 * @param str2 String auxiliar que retornara a string modificada
	 * @param num Int contador 
 	 */
	public static String converteMinuscula(String str1, String str2, int num) {

		if(numero(str1) == true) {

			return str2;

		}//end if

		else {

			if(num > str1.length()-1) {
	
				return str2;

			}//end if

			else if(str1.charAt(num) >= 'A' && str1.charAt(num) <= 'Z' || str1.charAt(num) >= 'À' && str1.charAt(num) <= 'Ỳ') {
	
				return converteMinuscula(str1, str2+(char)(str1.charAt(num) + 32), num + 1);

			}//end else

			else {

				return converteMinuscula(str1, str2 + str1.charAt(num), num + 1);			

			}//ende else

		}//end else if

	}//end converteMinuscula()

	/**
	 * Método que verifica se a STring é composta por numero
	 *
	 * @param str String lida
	 */
	public static boolean numero(String str) {

		char aux = ' ';
		int cont = 0;
		boolean isNumero = false;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if(aux >= 0 && aux <= 9) {

				cont++;

			}//end if

			else {

				isNumero = false;

			}//else

		}//end for	

		if(cont == str.length()) {

			isNumero = true;

		}//end if

		else {

			isNumero = false;

		}//end else	

		return isNumero;

	}//end numero()

        /**
         * Método que inicializa o método recursivo 
         *
         * @param str1 String lida
         */
        public static String removeEspaco(String str1) {

		String str2 = "";
		return removeEspaco(str1, str2, 0);

        }//end 

	/**
	 * Método recursivo que remove os espaços
	 *
	 * @param str1 String lida
	 * @param str2 String modificada
	 * @param cont Contador
	 */
	public static String removeEspaco(String str1, String str2, int cont) {

		if(cont > str1.length()-1) {

			return str2;

		}//end if

		else if(str1.charAt(cont) == ' ') {

			return removeEspaco(str1, str2+"", cont+1);

		}//end else if

		else {

			return removeEspaco(str1, str2 + str1.charAt(cont), cont+1);

		}//end else

	}//end removeEspaco ()

        /**
         * Método que inicializa o método recursivo 
         *
         * @param str1 String lida
         */
        public static String removeCaractere(String str, char c) {

		String str2 = "";
		return removeCaractere(str, c, str2, 0);

        }//end 

	/**
	 * Método recursivo que remove determinado caractere em uma string
	 *
	 * @param str String
	 * @param c caracter
	 * @param str2 String 
	 * @param cont contador
 	 */
	public static String removeCaractere(String str, char c, String str2, int cont) {

		if(cont > str.length()-1) {

			return str2;

		}//end if

		else if( str.charAt(cont) == c) {

			return removeCaractere(str,c, str2, cont+1);

		}//end else if

		else {

			return removeCaractere(str,c,str2+str.charAt(cont), cont+1);

		}//end else

	}//end removeCaractere()


	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			MyIO.println(converteMaiuscula(string[i]));
			MyIO.println(converteMinuscula(string[i]));
			MyIO.println(removeEspaco(string[i]));
			MyIO.println(removeCaractere(string[i], string[i].charAt(0)));

		}//end for 

	}//end main()

}//end class





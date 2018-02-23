/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 10 - Conversão
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP01Q10Conversao {

	/**
 	 * Método converte letras minusculas em maiusculas
 	 *
 	 * @param str String
	 * @return maiuscula String convertida para maiuscula
 	 */
	public static String converteMaiusculo(String str) {

		char aux = ' ';
		String maiuscula = "";

                if(numero(str) == true) {
 
                       return str;

                }//end if

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);
		
			if(aux >= 'a' && aux <= 'z') {

				maiuscula = maiuscula + (char)((int)aux - 32);

			}//end if
 
			else if(aux >= 'à' && aux <= 'ý') {

				maiuscula = maiuscula + (char)((int)aux - 32);

			}//end else if

			else {

				maiuscula = maiuscula + (char)aux;

			}//end else 

		}//end for

		return maiuscula;

	}//end converteMaiusculo

        /**
         * Método converte letras maiusculas em minusculas
         *
         * @param str String
         * @return minuscula String convertida para minuscula
         */
        public static String converteMinusculo(String str) {

                char aux = ' ';
                String minuscula = "";

		if(numero(str)==true) {

                	return str;

                }//end if

		else {

                	for(int i=0; i<str.length(); i++) {

                        	aux = str.charAt(i);

                        	if(aux >= 'A' && aux <= 'Z') {

                                	minuscula = minuscula + (char)((int)aux + 32);

                        	}//end if
          
		              	else if(aux >= 'À' && aux <= 'Ý') {

                                	minuscula = minuscula + (char)((int)aux + 32);

                        	}//end else if

                        	else {

                                	minuscula = minuscula + (char)aux;

                        	}//end else 
    
	            	}//end for

		}//end else

                return minuscula;

        }//end converteMinusculo

	/**
	 * Método que verifica se a string é composta por numeros
	 *
	 * @param str String
	 * @return true/false
	 */
	public static boolean numero(String str) {

		char aux = ' ';
		int contador = 0;
		boolean isNumero = false;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if(aux >= 0 && aux <= 9) {

				contador++;

			}//end if

			else {

				isNumero=false;

			}//end else

		}//end for

		if(contador == str.length()) {

			isNumero=true;

		}//end if

		else {

			isNumero=false;

		}//end else

		return isNumero;

	}//end numero

	/**
	 * Método que remove os espaços
	 *
	 * @param str String
	 * @return string String sem espaços
	 */
	public static String removeEspaco(String str) {

		char aux = ' ';
		String string = "";

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if(aux == ' ') {

				string = string + "";

			}//end if

			else{

				string = string + (char)aux;

			}//end else

		}//end for

		return string;

	}//end removeEspaco

	/**
	 * Método que remove determinado caractere em uma string
	 *
	 * @param str String
	 * @param c caracter
	 * @return string String convertida
 	 */
	public static String removeCaractere(String str, char c) {

		char aux = ' ';
		String string = "";

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);
			
			if(aux == c){

				string = string + "";

			}//end if

			else{

				string = string + (char)aux;

			}//end else

		}//end for

		return string;

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

			MyIO.println(converteMaiusculo(string[i]));
			MyIO.println(converteMinusculo(string[i]));
			MyIO.println(removeEspaco(string[i]));
			MyIO.println(removeCaractere(string[i], string[i].charAt(0)));

		}//end for 

	}//end main()

}//end class

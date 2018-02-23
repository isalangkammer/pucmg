/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 08 - Contar
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

public class TP01Q08Contar {

	/**
	 * Método que conta as ocorrencias de um caractere em uma string
	 *
	 * @param str String
	 * @param caract Caractere
	 * @return contador número de ocorrencias
	 */
	public static int contaCaracteres(String str, char caract) {

		int contador = 0;

		for(int i=0; i<str.length(); i++) {

			if(caract == str.charAt(i)) {

				contador++;

			}//end if

		}//end for

		return contador;

	}//end contaCaracteres

        /**
         * Método que conta quantas letras tem na string
         *
         * @param str String
         * @return contador número de letras que tem na string
         */
	public static int contaLetras(String str) {

		int contador = 0;
		char letra = ' ';

		for(int i=0; i<str.length(); i++) {

			letra = str.charAt(i);

			if(Letra(letra) == true) {

				contador++;

			}//end if

		}//end for

		return contador;

	}//end contaLetras

	/**
	 * Método que verifica se um caracter é uma letra
	 *
	 * @param caract Caractere
	 * @return true or false
	 */
        public static boolean Letra(char caract) {
                
		boolean letra = false;

                if(caract >= 'a' && caract <= 'z' || caract >= 'A' && caract <= 'Z') {

               		letra = true;

                }//end if

                else {

                	letra = false;

                }//end else

                return letra;

        }//end letras

	/**
	 * Método que verifica se uma string é  consoante
	 *
	 * @param caract Caractere
	 * @return true or false
	 */
	public static boolean Consoante(char caract) {

		if(Letra(caract) == true && Vogal(caract) == false) {
			
			return true;

		}//end if

		else{

			return false;

		}//end else

	}//end Consoante

	/**
	 * Método que verifica se um caractere é uma vogal
	 *
	 * @param caract Caractere
	 * @return vogal true/false;
	 */
        public static boolean Vogal(char caract) {

                boolean vogal = false;

                if(caract == 'a' || caract == 'A' || caract == 'E' || caract == 'e' || caract == 'I' || caract == 'i' || caract == 'O' || caract == 'o' || caract == 'U' || caract == 'u') {

                	vogal = true;

                }//end if

                else {
                	
			vogal = false;

                }//end else

                return vogal;

        }//end vogal()

        /**
         * Método que verifica se é um número
         *
         * @param num Caractere
         * @return true or false
         */
        public static boolean Numero(char num) {

                if(num >= 0 && num <= 9) {

                        return true;

                }//end if

                else {
                     
			return false;
                
		}//end else

        }//end Numero

        /**
         * Método conta quantos caracteres são diferentes de letras
         *
         * @param str String
         * @return contador número de caracteres diferentes de letras
         */
	public static int caracteresDiferentes(String str) {

		char aux = ' ';
		int contador = 0;

		for(int i=0; i< str.length(); i++) {

			aux = str.charAt(i);

			if(Letra(aux) == false) {

				contador++;

			}//end if

		}//end for

		return contador;

	}//end caracteresDiferentes

	/**
	 * Método que verifica a quantidade de doidoes
	 *
	 * @param str String
	 * @return contador quantidade de doidoes
	 */
	public static int quantidadeDoidao(String str) {

		char aux = ' ';
		int contador = 0;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if(Numero(aux) && aux % 2 != 0 || Consoante(aux) && (int)aux %5 == 0 && (int)aux % 2 != 0 ||  Vogal(aux) && (int)aux  % 5 != 0 &&  (int)aux % 8 !=0) {

			contador++;

			}//end if

		}//end for

		return contador;

	}//end quantidadeDoidao()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0, contador = 0, letras = 0, caracteres = 0, diferentes = 0, doidoes = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			contador = contaCaracteres(string[i],string[i].charAt(0));
			letras = contaLetras(string[i]);
			diferentes = caracteresDiferentes(string[i]);
			doidoes = quantidadeDoidao(string[i]);
			MyIO.println(+contador+" "+letras+" "+diferentes+" "+doidoes+" ");

		}//end for 

	}//end main()

}//end class ()


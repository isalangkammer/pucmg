/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 08 - Contar
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP02Q08 {

	/**
	 * Método que verifica se um caractere é letra
	 *
	 * @param caract Caractere
	 * @return isLetra true/false
 	 */
	public static boolean letra(char caract) {

		boolean isLetra = false;

		if(caract >= 'a' && caract <= 'z' || caract >= 'A' && caract <= 'Z') {

			isLetra = true;

		}//end if

		else {

			isLetra = false;

		}//end else

		return isLetra;

	}//end letra()

	/**
	 * Método que verifica se um caractere é consoante
	 *
	 * @param caract Caractere
	 * @return isConsoante true/false
 	 */
	public static boolean consoante(char caract) {

		if(letra(caract) == true && vogal(caract) == false) {

			return true;

		}//end if

		else {

			return false;

		}//end else

	}//end consoante()

	/**
	 * Método que verifica se um caractere é vogal
	 *
	 * @param caract Caractere
	 * @return isVogal true/false
 	 */
	public static boolean vogal(char caract) {

		boolean isVogal = false;

		if(caract == 'a' || caract == 'e' || caract == 'i' || caract == 'o' || caract == 'u' || caract == 'A' || caract == 'E' || caract == 'I' || caract == 'O' || caract == 'U') {

			isVogal = true;

		}//end if

		else {

			isVogal = false;

		}//end else

		return isVogal;	

	}//end vogal()

	/**
	 * Método que verifica se um caractere é numero
	 *
	 * @param caract Caractere
	 * @return isNum true/false
 	 */
	public static boolean numero(char caract) {

		if(caract >= 0 && caract <= 9) {

			return true;

		}//end if

		else {

			return false;

		}//end else

	}//end numero()

	/**
	 * Método que inicializa o método recursivo
	 *
	 * @param str String lida
	 * @param caract Caracter lida
 	 */
	public static int contaCaracter(String str, char caract){

		return contaCaracter(str, caract, 0, 0);

	}//end contaCaracter()

	/**
	 * Método recursivo que conta a quantidade de caracter em uma String
	 *
	 * @param str String lida
	 * @param caract Caracter lida
	 * @param num Condição de parada
	 * @param cont Quantidade de caracter
 	 */
	public static int contaCaracter(String str, char caract, int num, int cont){

		if(num > str.length()-1) {

			return cont;

		}//end if

		else if(caract == str.charAt(num)) {

			return contaCaracter(str, caract, num+1, cont+1);
		
		}//end else if

		else {

			return contaCaracter(str, caract, num+1, cont);

		}//end else

	}//end contaCaracter()

	/**
	 * Método que inicializa o método recursivo
	 *
	 * @param str String lida
 	 */
	public static int contaLetras(String str){

		return contaLetras(str, 0, 0);

	}//end contaLetras()

	/**
	 * Método recursivo que conta a quantidade de letras na String
	 *
	 * @param str String lida
	 * @param num Condição de parada
	 * @param cont Quantidade de caracter
 	 */
	public static int contaLetras(String str, int num, int cont){

		if(num > str.length()-1) {

			return cont;

		}//end if

		else if(letra(str.charAt(num)) == true) {

			return contaLetras(str, num+1, cont+1);
		
		}//end else if

		else {

			return contaLetras(str, num+1, cont);

		}//end else

	}//end contaLetras()

	/**
	 * Método que inicializa o método recursivo
	 *
	 * @param str String lida
 	 */
	public static int contaDiferentes(String str){

		return contaDiferentes(str, 0, 0);

	}//end 

	/**
	 * Método recursivo que conta a quantidade de caracteres diferentes
	 *
	 * @param str String lida
	 * @param num Condição de parada
	 * @param cont Quantidade de caracter
 	 */
	public static int contaDiferentes(String str, int num, int cont){

		if(num > str.length()-1) {

			return cont;

		}//end if

		else if(letra(str.charAt(num)) == false) {

			return contaDiferentes(str, num+1, cont+1);
		
		}//end else if

		else {

			return contaDiferentes(str, num+1, cont);

		}//end else

	}//end 

	/**
	 * Método que inicializa o método recursivo
	 *
	 * @param str String lida
 	 */
	public static int contaDoidoes(String str){

		return contaDoidoes(str, 0, 0);

	}//end 

	/**
	 * Método recursivo que conta a quantidade de caracteres doidoes
	 *
	 * @param str String lida
	 * @param num Condição de parada
	 * @param cont Quantidade de caracter
 	 */
	public static int contaDoidoes(String str, int num, int cont){

		if(num > str.length()-1) {

			return cont;

		}//end if

		else if(numero(str.charAt(num)) && (str.charAt(num)) % 2 != 0 ||  consoante(str.charAt(num)) && (int)str.charAt(num) %5 == 0 && (int)str.charAt(num) % 2 != 0 ||  vogal(str.charAt(num)) && (int)str.charAt(num)  % 5 != 0 &&  (int)str.charAt(num) % 8 !=0) {

			return contaDoidoes(str, num+1, cont+1);
		
		}//end else if

		else {

			return contaDoidoes(str, num+1, cont);

		}//end else

	}//end

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;
		int numLetras = 0, numCaracteres = 0, numDiferentes = 0, numDoidoes = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			numLetras = contaLetras(string[i]);
			numCaracteres = contaCaracter(string[i], string[i].charAt(0));
			numDiferentes = contaDiferentes(string[i]);
			numDoidoes = contaDoidoes(string[i]);
			MyIO.println(+numLetras+" "+numCaracteres+" "+numDiferentes+" "+numDoidoes);

		}//end for 

	}//end main()

}//end class

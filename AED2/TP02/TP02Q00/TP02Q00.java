/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 00 - Aquecimento
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

/**
Crie um método iterativo que receba como parâmetro uma string e retorne seu número de
caracteres maiúsculos.
 */

public class TP02Q00 {


	/**
	 * Método que inicializa o contador e chama o método recursivo
	 *
	 * @param str String lida
	 */
	public static int contarCaracteresMaiusculos(String str) {

		return contarCaracteresMaiusculos(str, 0, 0);

	}//contarCaracteresMaiusculos()

	/**
	 * Método recursivo que conta a quantidade de caracteres maiusculos
	 *
	 * @param str String lida
	 * @param cont Contador de maiusculas
	 * @param num Contador de caracteres para condição de parada
	 */
	public static int contarCaracteresMaiusculos(String str, int cont, int num) {

		if(num > str.length()-1) {

			return cont;

		}//end if

		else if(str.charAt(num) >= 'A' && str.charAt(num) <= 'Z') { 

			return contarCaracteresMaiusculos(str, cont+1, num+1);

		}//end else if

		else {

			return contarCaracteresMaiusculos(str, cont, num+1);

		}//end else

	}//contarCaracteresMaiusculos()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0, contador = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			contador = contarCaracteresMaiusculos(string[i]);
			MyIO.println(contador);

		}//end for 

	}//end main()

}//end class

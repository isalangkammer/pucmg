/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 04 - Inversão
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP02Q04 {

	/**
	 * Método que chama o método recursivo
	 *
	 * @param str String lida
 	 */
	public static String inverte(String str) {

		String aux = "";
		return inverte(str, aux, str.length()-1);

	}//end inverte

	/**
	 * Método recursivo que inverte uma palavra
	 *
	 * @param str String lida
	 * @param aux String invertida
	 * @param tam Tamanho da String
 	 */
	public static String inverte(String str, String aux, int tam) {

		if(tam < 0) {

			return aux;

		}//end if

		else {

			return inverte(str, aux+(char)(str.charAt(tam)), tam-1);

		}//end else

	}//end inverte

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			MyIO.println(inverte(string[i]));

		}//end for 

	}//end main()

}//end class

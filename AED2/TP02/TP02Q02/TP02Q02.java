/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 02 - Ciframento
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP02Q02 {

	/**
	 * Método de inicialização do contador e que chama o método recursivo
	 *
	 * @param str String lida
 	 */
	public static String ciframento(String str) {

		String aux = "";
		return ciframento(str, aux, 0);

	}//end ciframento()

	/**
	 * Método recursivo que codifica uma string
	 *
	 * @param str String lida
	 * @param aux String auxiliar codificada
	 * @param num Condição de parada
 	 */
	public static String ciframento(String str, String aux, int num) {

		if(num > str.length()-1) {

			return aux;

		}//end if

		else {

			return ciframento(str, aux+(char)(str.charAt(num)+3), num+1);

		}//end else

	}//end ciframento()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			MyIO.println(ciframento(string[i]));

		}//end for 

	}//end main()

}//end class

/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 03 - Deciframento
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP02Q03 {

	/**
	 * Método de inicialização do contador e que chama o método recursivo
	 *
	 * @param str String lida
 	 */
	public static String deciframento(String str) {

		String aux = "";
		return deciframento(str, aux, 0);

	}//end ciframento()

	/**
	 * Método recursivo que decodifica uma string
	 *
	 * @param str String lida
	 * @param aux String auxiliar decodificada
	 * @param num Condição de parada
 	 */
	public static String deciframento(String str, String aux, int num) {

		if(num > str.length()-1) {

			return aux;

		}//end if

		else {

			return deciframento(str, aux+(char)(str.charAt(num)-3), num+1);

		}//end else

	}//end deciframento()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			MyIO.println(deciframento(string[i]));

		}//end for 

	}//end main()

}//end class

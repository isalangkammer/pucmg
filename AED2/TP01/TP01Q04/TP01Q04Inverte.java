/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 04 - Inverte
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP01Q04Inverte {

	/**
	 * Método que inverte uma string
	 *
	 * @param str String lida
	 * @return tmp String invertida
	 */
	public static String inverte(String str) {

		String tmp = "";
		for(int i=str.length(); i>0; i--) {

			tmp = tmp + (char)(str.charAt(i-1));

		}//end for

		return tmp;

	}//end inverte()

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

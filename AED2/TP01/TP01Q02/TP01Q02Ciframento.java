/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 02 - Ciframento
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */


public class TP01Q02Ciframento {

	/**
	 * Método que codifica uma String
	 *
	 * @param str String lida
	 * @return tmp STring codificada 
	 */
	public static String ciframento(String str) {

		String tmp = "";
		for(int i=0; i<str.length(); i++) {

			tmp = tmp + (char)(str.charAt(i) + 3);

		}//end for

		return tmp;

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

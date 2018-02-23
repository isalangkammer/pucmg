/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 06 - Equals
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

/**
Crie um método iterativo que recebe duas strings e retorna true se elas forem iguais
e false, caso contrário. Em seguida, crie outro método iterativo que recebe duas strings, ignora
letras maiúsculas e minúsculas para retornar true se elas forem iguais e false, caso contrário. Na
saı́da padrão, para cada par de linhas de entrada (primeira e segunda, terceira e quarta, quinta
e sexta, ...), escreva uma linha de saı́da da seguinte forma X1 X2, onde X1, X2 ∈ {SIM, NÃO}
e ambos indicam se as strings de entrada são iguais. X2 ignora letras maiúsculas e minúsculas.
Se o número de linhas de entrada for ı́mpar, compare a última linha com ela mesma.
 */


public class TP01Q06Equals {

	/**
	 * Método que verifica se duas Strings são iguais
	 *
	 * @param str1 String 1 a ser comparada
	 * @param str2 String 2 a ser comparada
	 * @return iguais Se as strings são ou não iguais
	 */
	public static boolean isEquals(String str1, String str2) {

		boolean iguais = false;

		if(str1.length() != str2.length()) {

			iguais = false;
			//MyIO.println("1");

		}//end if

		else if(str1.length() == str2.length()) {
		
			for(int i=0; i<str1.length(); i++) {

				if(str1.charAt(i) != str2.charAt(i)) {
					
					iguais = false;
					//MyIO.println("2");

				}//end if
				
				else if (str1.charAt(i) == str2.charAt(i)) {
					
					iguais = true;
					//MyIO.println("3");

				}//end else

			}//end for

		}//end else
		 
		 return iguais;

	}//end isEquals()

	/**
	 * Método que verifica se duas Strings são iguais ignorando as Maiusculas
	 *
	 * @param str1 String 1 a ser comparada
	 * @param str2 String 2 a ser comparada
	 * @return iguais Se as strings são ou não iguais
	 */
	public static boolean isEqualsM(String str1, String str2) {

		boolean iguais = false;

		if(str1.length() != str2.length()) {

			iguais = false;
			//MyIO.println("4");

		}//end if

		else {

			str1 = ignoraMaiusculas(str1);
			str2 = ignoraMaiusculas(str2);
	
			for(int i=0; i<str1.length(); i++) {
				
				if(str1.charAt(i) != str2.charAt(i)) {
					
					iguais = false;	
					//MyIO.println("5");		
	
				}//end if

				else if(str1.charAt(i) == str2.charAt(i)) {
				
					iguais = true;
					//MyIO.println("6");

				}//end else

			}//end for

		}//end else
		
		return iguais;

	}//end isEqualsM()

	/**
	 * Método que ignora as letras Maiusculas
	 *
	 * @param str String lida
	 * @return tmp String com as letras maiusculas ignoradas
	 */
	public static String ignoraMaiusculas(String str) {

		String tmp = "";
		char aux;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if( aux >= 'A' && aux <= 'Z') {

				tmp = tmp + (char)((int)aux + 32);

			}//end if

			else {

				tmp = tmp + (char)aux;

			}//end else

		}//end for

		return tmp;

	}//end ignoraMaiusculas()

	public static void main(String[] args) {

		String[] string = new String[10000];
		String str;
		int num = 0;
		boolean iguais, iguaisM;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i=i+2) {

			if(num%2 != 0) {

				iguais = isEquals(string[i], string[i]);
				iguaisM = isEqualsM(string[i], string[i]);

			}//end if

			else {

				iguais = isEquals(string[i], string[i+1]);
				iguaisM = isEqualsM(string[i], string[i+1]);

			}//end else
			
			if(iguais) {
				
				MyIO.print("SIM ");

			}//end if

			else {

				MyIO.print("NAO ");

			}//end else

			if(iguaisM) {

				MyIO.println("SIM");
				
			}//end if

			else {

				MyIO.println("NAO");

			}//end else

		}//end for

	}//end main()

}//end class

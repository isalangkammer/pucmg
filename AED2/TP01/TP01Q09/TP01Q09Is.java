/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 09 - Is
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

public class TP01Q09Is {

	/*
	 * Método que verifica se a string é composta somente por letras
	 *
	 * @param str String
	 * @return boolean
	 */
        public static boolean letras(String str) {

		char aux = ' ';
		int num = 0;
		boolean isLetra = false;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);
			
			if(aux >= 'a' && aux <= 'z' || aux >= 'A' && aux <= 'Z') {

				num++;

			}//end if            	

			else {

				isLetra = false;                       

                        }//end else

                }//end for

		if(num == (str.length()-1)) {

			isLetra = true;

		}//end if

		else {

			isLetra = false;

		}//end else

		return isLetra;

	}//end letras()

	/*
	 * Método que verifica se uma string é composta somente por vogais
	 *
	 * @param str String
	 * @return boolean
	 */
	public static boolean vogais(String str) {

		char aux = ' ';
		boolean isVogal = false;
		int num = 0;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if(aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u' || aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {

				num++;

			}//end if

			else {

				isVogal = false;

			}//end else

		}//end for

		if(num == (str.length()-1)) {

			isVogal = true;

		}//end if

		else {

			isVogal = false;

		}//end else

		return isVogal;

	}//end vogais()

	/*
	 * Método que verifica se uma string é composta por apenas consoantes
	 *
	 * @param str String
	 * @return boolean
	 */
        public static boolean consoantes(String str) {

		boolean isConsoante = false;
		int num = 0;

		for(int i=0; i<str.length(); i++) {

			if(letras(str)) {

				if(vogais(str)) {

					isConsoante = false;

				}//end if

				else {

					num++;

				}//end else

			}//end if

			else {

				isConsoante = true;

			}//end else

		}//end for

		if(num == (str.length()-1)) {

			isConsoante = true;

		}//end if

		return isConsoante;

	}//end consoantes()


	/*
	 * Método que verifica se a String lida é composta por inteiros
	 *
	 * @param str String
	 * @return boolean true or false
	 */
        public static boolean inteiros(String str) {

		char aux = ' ';
		int num = 0;
		boolean isInteiro = false;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if((int)aux >= 9 && (int)aux <= 0) {

				num++;

			}//end if

			else {

				isInteiro = false;

			}//end else

		}//end for

		if(num == (str.length()-1)) {

			isInteiro = true;

		}//end if

		return isInteiro;
		
	}//end inteiros()

	/*
	 * Método de Reais, verifica se a string é composta por reais
	 *
	 * @param str String
	 * @return boolean true or false
	 */
        public static boolean reais(String str) {

		char aux = ' ';
		boolean isReal = false;

		for(int i=0; i<str.length(); i++) {

			aux = str.charAt(i);

			if(aux == '.' || aux == ',') {

				isReal = true;

			}//end if

			else {

				isReal = false;

			}//end else

		}//end for

		return isReal;

	}//end reais()

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0;
		boolean vogais, consoantes, inteiro, real;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			vogais = vogais(string[i]);
			consoantes = consoantes(string[i]);
			inteiro = inteiros(string[i]);
			real = reais(string[i]);

			if(vogais) {

				MyIO.print("SIM ");

			}//end if

			else {
				
				MyIO.print("NAO ");

			}//end else

                        if(consoantes) {

                                MyIO.print("SIM ");

                        }//end if

                        else {

                                MyIO.print("NAO ");

                        }//end else

                        if(inteiro) {

                                MyIO.print("SIM ");

                        }//end if

                        else {

                                MyIO.print("NAO ");

                        }//end else

                        if(real) {

                                MyIO.println("SIM ");

                        }//end if

                        else {

                                MyIO.println("NAO ");

                        }//end else

		}//end for 

	}//end main()

}//end class

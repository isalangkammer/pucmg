/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 09 - Is
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

public class TP02Q09 {

	/**
	 * Método que verifica se a string é composta somente por letras
	 *
	 * @param str String
	 */
        public static boolean letras(String str) {

                char caract = ' ';
                int cont = 0;
                boolean isLetra = false;

                for(int i=0; i<str.length(); i++) {

                        caract = str.charAt(i);

                        if(caract >= 'a' && caract <= 'z' || caract >= 'A' && caract <= 'Z') {

                                cont++;

                        }//end if

                        else {

                                isLetra = false;

                        }//end else

                }//end for

                if(cont == str.length()-1) { 

                        isLetra = true;

                }//end if;

                else {

                        isLetra = false;

                }//end else

                return isLetra;

        }//end letras

	/**
	 * Método que inicializa o metodo recursivo
	 *
	 * @param str String lida
	 */
	public static int vogais(String str) {

		return vogais(str, 0, 0);

	}//end 

        /**
         * Método recursivo que verifica se uma string é composta por vogais
         *
         * @param str String
         * @param num Contador de parada
	 * @param contador Contador que conta quantas vogais tem na string
         */
        public static int vogais(String str, int num, int contador) {

		if(num > str.length()-1) {

			return contador;

		}//end if

		else if(str.charAt(num) == 'a' || str.charAt(num) == 'e' || str.charAt(num) == 'i' || str.charAt(num) == 'o' || str.charAt(num) == 'u' || str.charAt(num) == 'A' || str.charAt(num) == 'E' || str.charAt(num) == 'I' || str.charAt(num) == 'O' || str.charAt(num) == 'U') {

			return vogais(str, num + 1, contador + 1);

		}//end else if

		else {

			return vogais(str, num + 1, contador);

		}//end else
	
	}//end

        /**
         * Método que inicializa o método recursivo Consoantes
         *
         * @param str String lida
         */
        public static int consoantes(String str) {

		return consoantes(str, 0, 0);

        }//end 

        /**
         * Método que verifica se uma string é composta por consoantes
         *
         * @param str String lida
         * @param num contador de parada
	 * @param contador contador
         */
        public static int consoantes(String str, int num, int contador) {

		if(num > str.length()-1) {

			return contador;

		}//end if

		else if( (str.charAt(num) >= 'a' && str.charAt(num) <= 'z' || str.charAt(num) >= 'A' && str.charAt(num) <= 'Z')  && str.charAt(num) == 'a' || str.charAt(num) == 'e' || str.charAt(num) == 'i' || str.charAt(num) == 'o' || str.charAt(num) == 'u' || str.charAt(num) == 'A' || str.charAt(num) == 'E' || str.charAt(num) == 'I' || str.charAt(num) == 'O' || str.charAt(num) == 'U'){


			return consoantes(str, num + 1, contador + 1);

		}//end else if

		else {

			return consoantes(str, num + 1, contador);

		}//end else

        }//end 

	/**
         * Método que inicializa o método recursivo inteiros
         *
         * @param str String lida
         */
        public static int inteiros(String str) {

		return inteiros(str, 0, 0);

        }//end 

        /**
         * Método recursivo que verifica se uma stirng é composta por inteiros
         *
         * @param str String
         * @param num contador de parada
	 * @param contador contador 
         */
        public static int inteiros(String str, int num, int contador) {

		if(num > str.length()-1){

			return contador;

		}//end if

		else if(str.charAt(num) >= 0 && str.charAt(num) <= 9) {

			return inteiros(str, num + 1, contador+1);

		}//ende else if

		else{

			return inteiros(str, num + 1, contador);

		}//end else

        }//end 

        /**
         * Método que inicializa o metodo recursivo
         *
         * @param str String lida
         */
        public static int reais(String str) {

		return reais(str, 0, 0);

        }//end 

        /**
         * Método recursivo que verifica se um número é real
         *
         * @param str String lida
         * @param num Contador de parada
	 * @param contador 
         */
        public static int reais(String str, int num, int contador) {

		if(num > str.length()-1) {

			return contador;

		}//end if

		else if(str.charAt(num) == ',' || str.charAt(num)  == '.') {

			return reais(str, num + 1, contador + 1);

		}//end else if

		else {

			return reais(str, num + 1, contador);

		}//end else

        }//end 

	public static void main(String[] args) {

		String[] string = new String[1000];
		String str;
		int num = 0, numConsoantes = 0, numVogais = 0, numInteiros = 0, numReais = 0;

		do {

			string[num] = MyIO.readLine();

		} while(string[num++].equals("FIM") == false);
		num--;

		for(int i=0; i<num; i++) {

			numConsoantes = consoantes(string[i]); 
			numVogais = vogais(string[i]); 
			numInteiros = inteiros(string[i]) ; 
			numReais = reais(string[i]);

			if(numVogais == string[i].length()-1) {

				MyIO.print("SIM ");
			
			}//end if

			else {

				MyIO.print("NAO ");

			}//end else

			if(numConsoantes == string[i].length()-1) {

				MyIO.print(" SIM ");
			
			}//end if

			else {

				MyIO.print(" NAO ");

			}//end

			if(numInteiros == string[i].length()-1) {

				MyIO.print(" SIM ");
			
			}//end if

			else {

				MyIO.print(" NAO ");

			}//end

			if(numReais == string[i].length()-1) {

				MyIO.println(" SIM ");
			
			}//end if

			else {

				MyIO.println(" NAO ");

			}//end

		}//end for 

	}//end main()

}//end class


/**
 * TP 01 - Q09_IS
 * Disciplina AED II - 1/2016
 * Autor: Isabelle Hirle Alves Langkammer
 */
public class is{
	/*
	 * Método que verifica se a string é composta somente por letras
	 *
	 * @param str String
	 * @return boolean
	 */
        public static boolean letras( String str){
                char c= ' ';
                int cont=0;
                boolean letra=false;
                for(int i=0; i<str.length(); i++){
                        c=str.charAt(i);
                        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                                cont++;
                        }//end if
                        else{
                                letra=false;
                        }//end else
                }//end for
                if(cont == str.length()-1){
                        letra=true;
                }//end if;
                else{
                        letra=false;
                }//end else
                return letra;
        }//end letras
	/*
	 * Método que verifica se uma string é composta somente por vogais
	 *
	 * @param str String
	 * @return boolean
	 */
	public static boolean vogais(String str){
		char c=' ';
		boolean vogal=false;
		int cont=0;
		for(int i=0; i<str.length();i++){
			c=str.charAt(i);
			if(c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u'){
				cont++;
			}//end if
			else{
				vogal=false;
			}
		}//end for
		if(cont == str.length()-1){
			vogal=true;
		}//end if
		else{
			vogal=false;
		}//end else
		return vogal;
	}//end vogais()
	/*
	 * Método que verifica se uma string é composta por apenas consoantes
	 *
	 * @param str String
	 * @return boolean
	 */
        public static boolean consoantes(String str){
		boolean consoante=false;
		int c=0;
		for(int i=0; i< str.length(); i++){
			if(letras(str)){
				if(vogais(str)){
					consoante=false;
				}//end if
				else{
					c++;
				}//end else
			}//end if
			else{
				consoante=false;
			}//end else
		}//end for
		if(c == str.length()-1){
			consoante=true;
		}//end if
		return consoante;
        }//end consoantes()
	/*
	 * Método que verifica se a String lida é composta por inteiros
	 *
	 * @param str String
	 * @return boolean true or false
	 */
        public static boolean inteiros(String str){
		char c= ' ';
		int t=0;
		boolean inteiro=false;
		for( int i=0; i< str.length(); i++){
			c= str.charAt(i);
			if((int)c >= 9 && (int)c <= 0){
				t++;	
			}//end if
			else{
				inteiro= false;
			}
		}//end for
		if( t == str.length()-1){
			inteiro= true;
		}//end if
		return inteiro;
        }//end inteiros()
	/*
	 * Método de Reais, verifica se a string é composta por reais
	 *
	 * @param str String
	 * @return boolean true or false
	 */
        public static boolean reais(String str){
		char a=' ';
		boolean real=false;
		for(int i=0; i<str.length();i++){
			a=str.charAt(i);
			if(a == '.' || a == ','){
				real=true;
			}//end if
			else{
				real= false;
			}//end else
		}//end for
		return real;
        }//end reais()
	public static void main(String[]args){
		String[] string = new String [1000];
		String str;
		int num=0;
		boolean vogais, consoantes, inteiro, real;
		//lê string
		do{
			string[num]=MyIO.readLine();
		}while(string[num++].equals("FIM")==false);
		num--;
		//
		for(int i=0; i<num; i++){
			vogais=vogais(string[i]);
			consoantes=consoantes(string[i]);
			inteiro=inteiros(string[i]);
			real=reais(string[i]);
			if(vogais){
				MyIO.print(" SIM ");
			}//end if
			else{
				MyIO.print(" NAO ");
			}//end else
                        if(consoantes){
                                MyIO.print(" SIM ");
                        }//end if
                        else{
                                MyIO.print(" NAO ");
                        }//end else
                        if(inteiro){
                                MyIO.print(" SIM ");
                        }//end if
                        else{
                                MyIO.print(" NAO ");
                        }//end else
                        if(real){
                                MyIO.println(" SIM ");
                        }//end if
                        else{
                                MyIO.println(" NAO ");
                        }//end else

		}//end for
	}//end main()
}//end class is

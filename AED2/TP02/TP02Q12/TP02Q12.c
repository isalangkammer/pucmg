/**
 *-------------------------------------------------
 * TP 02 - QUESTÃO 12 - Palindromo em C recursivo
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int palindromo(char string[], int inicio, int ultimo, int result) {

	if(inicio > strlen(string)/2) {

		return result;

	}//end if

	else if(string[inicio] == string[ultimo]) {

		return palindromo(string, inicio+1, ultimo-1, result+1);

	}//end 

	else {

		return palindromo(string, inicio+1, ultimo-1, result);

	}//end

}//end palindromo()


int main() {

	char string[1000];
	scanf("%s" ,string);

	while(strcmp(string,"FIM") != 0) {

		if(palindromo(string, 0, strlen(string)-1, 0) == strlen(string)-1)
			printf("SIM\n");

		else 
			printf("NAO\n");

		scanf("%s" ,string);

	}//end while

	return 0;

}//end main()

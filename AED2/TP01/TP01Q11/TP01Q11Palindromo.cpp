/**
 *-------------------------------------------------
 * TP 01 - QUESTÃO 11 - Palindromo em C
 * Disciplina: AED II	Professores: Max e Felipe
 * @author: Isabelle Hirle Alves Langkammer
 * Desenvolvido em 2/2016
 * @version: 0.1
 *-------------------------------------------------
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int palindromo(char string[]) {

	int ultimo = strlen(string) -1;
	int ispalindromo = 1;

	for(int i=0; i<strlen(string)/2; i++, ultimo--) {

		if(string[i] != string[ultimo]) {

			ispalindromo = 0;

		}//end if

	}//end for

	return ispalindromo;	

}//end palindromo()


int main() {

	char string[1000];
	scanf(string);

	while(strcmp(string,"FIM") != 0) {

		if(palindromo(string) == 1)
			printf("SIM\n");

		else 
			printf("NAO\n");

		scanf(string);

	}//end while

	return 0;

}//end main()

#include <stdio.h>
#include <stdlib.h>
#define TAM 10

/*Funcion que mediante el paso por parametro de un caracter y un array de caracteres, devuelve la posicion del primero en el segundo*/

void imprimir (int p){
	
	while(p!=0){
		
		for(int i=1;i<=p;i++){
			printf("%i", i);
		}
		
		
		printf("\n");
		
		for(int i=p; i>0 ;i--){
			
			printf("%i",i);	
		}
		
		printf("\n");
		
	p--;
	
	}	
}

/*Funcion que imprime por pantalla una serie de numeros tal y como muestra el ejemplo mostrado psoteriormente
*/

void buscar(char c, char ar[]){
	
	for (int i=0; i<=10 ; i++){
		
		if (ar[i]==c){
			
			imprimir(i);
			break;
		}
		
	}
}
	

/*
El programa principal utilizara dichas funciones descritas con anterioridad, para solicitar un caracter pro pantalla y desplegar una serie de numeros en funcion de la posicion
que ocupe dicho caracter en un array de caracteres declarado en el programa
*/
main(){
	  
    int i=0;
	char car, arr[TAM]={'#', '$', '(', '&', '%', '#', '@', '¿', '?', ')'};
    
    printf("# $ ( & % # @ ? ? )");
    printf("\nIntroduce un caracter: ");
    scanf("%c", &car);
    	
	buscar(car, arr);
}

 

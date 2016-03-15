#include <stdio.h>
#include <stdlib.h>
#define TAM 10

/*Funcion que obtiene un valor, en este caso la posicion del caracter en el array, datos obtenidos en funBusca*/

void funPinta (int p){
	
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

/*Funcion que va a buscar el caracter pasado por parametro en un array pasado por parametro tambien
una vez lo encuentra, hace la llamada a la funcion funPinta que realizara la impresion de numeros
*/

void funBusca(char c, char ar[]){
	
	for (int i=0; i<=10 ; i++){
		
		if (ar[i]==c){
			
			funPinta(i);
			break;
		}
		
	}
}
	


main(){
	  
    int i=0;
	char car, arr[TAM]={'#', '$', '(', '&', '%', '#', '@', '¿', '?', ')'};
    
    printf("Introduce un caracter: ");
    scanf("%c", &car);
    	
	funBusca(car, arr);
}

 

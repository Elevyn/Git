package evaluacion1;

import java.util.Scanner;

public class SACARPAR {

	public static void main(String[] args) {
		//Realiza el pseudocódigo para el programa SACAPAR que pide un número 
		//entero por teclado y muestra los números pares desde él inclusive hasta 0.
		//Con MIENTRAS
		
		//necesidades
		int numero,posicion;
	
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	
	//Secuencia de pasos o algoritmos
	
		//leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		//cierro teclado
		teclado.close();//libero la memoria asignada al objeto llamado teclado
		
		//muestralos numeros desde 1 hasta el inclusive
		//inicializo posicion
		posicion=0;
		while(posicion<=numero){
			//Escribir posicion
			System.out.println(posicion);
			//actualizo posicion
			posicion= posicion + 2;
		
		
    }
	}
	}


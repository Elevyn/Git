package evaluacion1;

import java.util.Scanner;

public class SUMANUMD {

	public static void main(String[] args) {
		//Realiza el pseudocódigo para el programa LEERNUMD que pide un número 
		//entero por teclado, si el número entero que se pide por teclado es
		// negativo sigue pidiendo números hasta que se introduzca un número 
		//positivo que muestra por pantalla (con HACER MIENTRAS).
		
		//necesidades
		int numero;
	
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	
	//Secuencia de pasos o algoritmos
		do{
		//leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		
		//inicializo posicion
		
		}while(numero < 0);
	//cierro teclado
		teclado.close();//libero la memoria asignada al objeto llamado teclado
			//Escribir posicion
			System.out.println("El numero introducido  es el " + numero );
			
			
		
		
    }
	
	}


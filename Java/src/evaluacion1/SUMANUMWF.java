package evaluacion1;

import java.util.Scanner;

public class SUMANUMWF {

	public static void main(String[] args) {
		//Realiza el pseudocódigo para el programa SUMANUMW que pide un numero entero por 
		//teclado y muestra la suma de todos los números desde 1 hasta el inclusive. 
		//Con MIENTRAS
		
		//necesidades
		int numero,posicion,suma;
	
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
		suma=0;
		
		for(posicion=1;posicion<=numero;posicion=posicion+1) {
				//calculo suma
			suma=suma+posicion;
				
			//Muestra suma
			System.out.println("La suma de los " + numero + " Los primeros números es " + suma);
			
			
		
		
    }
	}
	}


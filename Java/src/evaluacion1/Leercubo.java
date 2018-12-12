package evaluacion1;

import java.util.Scanner;

public class Leercubo {

	public static void main(String[] args) {
		/*
		 *  lee el valor del radio por teclado y muestra el valor del área 
		 *  del círculo de ese radio por pantalla con dos decimales
		 */
		
		//Necesidades
		
		double n;
		double resultado;
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	//antes de ller el valor
			//muestra un mensaje informativo
		System.out.println("introduce un valor n: ");
		n = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		teclado.close();//libero la memoria asignada al objeto llamado teclado
		
		//Secuencia de pasos o algoritmos
	
		resultado = n*n*n;
		
		//Escribir Resultado
		
		System.out.println("El valor del cubo es " + resultado);
		
	}
	
}

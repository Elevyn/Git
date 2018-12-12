package evaluacion1;

import java.util.Scanner;

public class Leerreal {

	public static void main(String[] args) {
		/*
		 * lee un numero real por teclado y muestra por pantalla el 
		 * mensaje "El valor de la variable introducida es"
		 */
		double n;
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
		//antes de leer el valor
		//muestra un mensaje informativo
		System.out.println("introduce un valor real: ");
		n = teclado.nextDouble();//asigno el valor leido por teclado a la variable n
		System.out.println("El valor de la variable es " + n);
		teclado.close();//libero la memoria asignada al objeto llamado teclado
	}

}

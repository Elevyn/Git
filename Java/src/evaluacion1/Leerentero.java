package evaluacion1;

import java.util.Scanner;

public class Leerentero {

	public static void main(String[] args) {
		/*
		 * lee un numero por teclado y muestra por pantalla el 
		 * mensaje "El valor de la variable introducida es"
		 */
		int n;
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	//antes de ller el valor
			//muestra un mensaje informativo
		System.out.println("introduce un valor entero: ");
		n = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		System.out.println("El valor de la variable es " + n);
		teclado.close();//libero la memoria asignada al objeto llamado teclado
	}

}

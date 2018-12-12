package evaluacion1;

import java.util.Scanner;

public class Leerloncircu {

	public static void main(String[] args) {
		/*
		 * lee el valor del radio por teclado y muestra el valor de
		 *  la circunferencia de ese radio por pantalla con dos decimales
		 */
		double radio;
		double resultado;
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	//antes de ller el valor
			//muestra un mensaje informativo
		System.out.println("introduce un valor para el radio: ");
		radio = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		teclado.close();//libero la memoria asignada al objeto llamado teclado
	
		
		resultado = 2*Math.PI*radio;
		System.out.println("El valor de la variable es " + resultado);
		
	}
	
}

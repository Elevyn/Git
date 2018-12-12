package evaluacion1;

import java.util.Scanner;

public class Leerenteroreal {

	public static void main(String[] args) {
		/*
		 *  Lee  un  número  real  por  teclado  y 
		 *   muestra  por  separado  su parte  entera  y  su  parte real
		 */
		
		double n;
		int parteentera;
		double partereal;

			
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	//antes de ller el valor
			//muestra un mensaje informativo
	//Secuencia de pasos o algoritmos
		//leer cantidad
		System.out.println("N: ");
		n = teclado.nextDouble();//asigno el valor leido por teclado a la variable n
		
		teclado.close();//libero la memoria asignada al objeto llamado teclado
		//calculo parte entera
		parteentera=(int)n;
		
		partereal= n - parteentera;
		//Escribir Las Partes
		
		System.out.println(parteentera  + " Parte Entera " + partereal + " Parte Real " );
		
	}
	
}

package evaluacion1;

import java.util.Scanner;

public class Leercapital {

	public static void main(String[] args) {
		/*
		 *  Realiza el pseudoc�digo para el programa CAPITAL que pide una cantidad 
		 *  en euros, un tipo de inter�s (ej: 3,6 %), y  un  per�odo  de  tiempo  
		 *  expresado  en  d�as  por  pantalla  y  calcula  el  inter�s  producido 
		 *   en  ese  tiempo  en  base  a  la  f�rmula
		 *   Interes=(Cantidad*TipoInteres*Tiempo)/(360*100) 
		 */
		
		//Necesidades
		
		double cantidad;
		double tipointeres;
		int tiempo;
		double interes;
		
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	//antes de ller el valor
			//muestra un mensaje informativo
	//Secuencia de pasos o algoritmos
		//leer cantidad
		System.out.println("cantidad: ");
		cantidad = teclado.nextDouble();//asigno el valor leido por teclado a la variable n
		//Leer tipointeres
		System.out.println("Tipo de interes (3,5%): ");
		tipointeres = teclado.nextDouble();//asigno el valor leido por teclado a la variable n
		//Leer Tiempo
		System.out.println("Tiempo en dias: ");
		tiempo = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		//calcula el interes
		teclado.close();//libero la memoria asignada al objeto llamado teclado
		interes= (cantidad* tipointeres * tiempo)/(360*100);
		
		//Escribir Interes
		
		System.out.println("El interes es " + interes);
		
	}
	
}

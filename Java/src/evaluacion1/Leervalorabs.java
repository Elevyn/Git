package evaluacion1;

import java.util.Scanner;

public class Leervalorabs {

	public static void main(String[] args) {
		//Lee el valor de un número entero por teclado y
		//muestra su valor absoluto por pantalla
		
		//necesidades
		int n;
		int resultado;


			
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	
	//Secuencia de pasos o algoritmos
	
		//leer cantidad
		System.out.println("N: ");
		n = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		
		teclado.close();//libero la memoria asignada al objeto llamado teclado
		
		//Si n es positivo
		if(n>0) {
		resultado= n;
		//Si n es negativo
	}
	else {
		resultado=-n;
	}
		//Muestra el resultado por pantalla
		System.out.println("El valor absoluto de " + n   + " es " +  resultado );
		
	}
	
}

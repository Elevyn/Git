package evaluacion1;

import java.util.Scanner;

public class Leercentimoseuro {

	public static void main(String[] args) {
		//lee una cantidad en euros por teclado y muestra por separado el número de euros y el número de céntimos de euro.
		//Necesidades
		
		double cantidad;
		int euros;
		int centimos;

			
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	//antes de ller el valor
			//muestra un mensaje informativo
	//Secuencia de pasos o algoritmos
	
		//leer cantidad
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble();//asigno el valor leido por teclado a la variable n
		
		teclado.close();//libero la memoria asignada al objeto llamado teclado
		
		//calculo euros
		euros=(int)cantidad;
		
		//calculo centimos
		centimos= (int)((cantidad - euros)*100);
		
		//Muestra el resultado por pantalla
		System.out.println("Euros: " + euros   + " Centimos: " +  centimos  );
		
	}
	
}

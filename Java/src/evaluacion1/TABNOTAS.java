package evaluacion1;

import java.util.Scanner;

public class TABNOTAS {

	public static void main(String[] args) {
		//Lee la nota de un alumno por teclado y muestra por  
		//pantalla la calificación que le corresponde sabiendo que si
		
		//necesidades
		int nota;
	
		Scanner teclado;//informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); //creo el objeto de la clase scanner llamado teclado 
	
	//Secuencia de pasos o algoritmos
	
		//leer nota
		System.out.println("N: ");
		nota = teclado.nextInt();//asigno el valor leido por teclado a la variable n
		
		teclado.close();//libero la memoria asignada al objeto llamado teclado
		
		//Si nota mayor que 0
		if(nota>=0) {
		if(nota<3) {
			System.out.println("MD");
		}
		else if(nota<5) {
		System.out.println("INS");
		}
		else if(nota<6) {
		System.out.println("SUF");
		}
	else if(nota<7) {
	System.out.println("BIEN");
    }
   else if(nota<9) {
    System.out.println("NOT");}
    else if(nota<=10) {
   System.out.println("SOBRE");
    }
	}
	}
}

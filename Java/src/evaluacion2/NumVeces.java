package evaluacion2;

import java.util.Scanner;

public class NumVeces {

	public static void main(String[] args) {
		//pide numero de 0 a 9 por pantalla y
		//calcula el numero de veces que han sido introducidas
		//
		int n,posicion;
		int[] arrayenteros=new int[10];
	
		 Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado
		 teclado= new Scanner(System.in);//creo el objeto de la clase Scanner llamado teclado
		 //leo otro valor
		 System.out.println("Introduce un valor:");
		 //libero memoria
		 n=teclado.nextInt(); 
		 //calcula el numero de veces que se ha introducido utilizando array.
		 //finaliza la introduccion 
		 while(n>=0 && n<=9) {
			 arrayenteros[n]= arrayenteros[n]+1;
			//leo otro valor
			 System.out.println("Introduce un valor:");
			 n=teclado.nextInt();}
			//libero memoria asignada al objeto llamado teclado
			 teclado.close();
			 //Al finalizar la introduccion de datos muestra por pantalla el numero de 
			 //veces que se ha introducido el numero
			 posicion=0;
			 while(posicion <10){
				 System.out.println(posicion + ":"+ arrayenteros[posicion]+"veces");
				 posicion=posicion+1;
				 }
			
		 
	}
}

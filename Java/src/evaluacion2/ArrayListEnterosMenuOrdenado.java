package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenado {

	public static void main(String[] args) {
		
		int valor;
		ArrayList<Integer> arrayListEntero = new ArrayList<Integer>();
		int opcion;
		
		
		
		//Creo objeto Scanner teclado
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//escribo menu
		System.out.println("1.Añadir Palabra");
		System.out.println("2.Buscar Palabra");
		System.out.println("3.Borrar Palabra");
		System.out.println("4.Listar Diccionario");
		System.out.println("0.Salir");
		
		//pido la opcion
		System.out.println("Opción: ");
		opcion=teclado.nextInt();
		
		while(opcion!=0 && opcion<5) {
			//con cada opcion
			switch(opcion) {
			case 1:
				//pido una palabra
				//limpio el burfer
				teclado.nextLine();
				System.out.println("Introduce una cadena: ");
				valor = teclado.nextInt();
				//si todavia no existe
				if(!arrayListEntero.contains(valor)) {
					//añado palabra
					arrayListEntero.add(valor);
					}
				break;
				
				
			case 2:
				teclado.nextLine();
				System.out.println("Introduce una cadena: ");
				valor = teclado.nextInt();
				//la
				if(arrayListEntero.contains(valor)) {
					System.out.println("El numero " + valor + " está en el diccionaro ");
				}
				else {
					//muestro mensaje de error
					
					System.out.println("Error.El numero " + valor + " no está en el diccionaro ");
				
				}
				break;
				
			case 3:	
				teclado.nextLine();
				System.out.println("Introduce una cadena: ");
				valor = teclado.nextInt();
				if(arrayListEntero.contains(valor)) {
					arrayListEntero.remove(valor);
				System.out.println("El numero " + valor + " ha sido borrada del diccionaro ");
				}
				
				else {
					System.out.println("Error.El numero " + valor + " no esta en el diccionaro ");
					}
				break;
				
			case 4:
			//Muestro todos los elementos del diccionario
			//si es que tienen elementos
			//ordenados alfabeticamente
			Collections.sort(arrayListEntero);
			
			for(int posicion = 0; posicion < arrayListEntero.size(); posicion++) {
				System.out.println(arrayListEntero.get(posicion));
				}
			break;
			}

			//pido otra opcion
			System.out.println("Opción: ");
			opcion=teclado.nextInt();
		}
		teclado.close();
	}

}


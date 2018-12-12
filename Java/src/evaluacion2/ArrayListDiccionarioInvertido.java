package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListDiccionarioInvertido {

	public static void main(String[] args) {
		String palabra;
		ArrayList <String> diccionario = new ArrayList<String>();
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
				palabra = teclado.nextLine();
				//si todavia no existe
				if(!diccionario.contains(palabra)) {
					//añado palabra
					diccionario.add(palabra);
					}
				break;
				
				
			case 2:
				teclado.nextLine();
				System.out.println("Introduce una cadena: ");
				palabra = teclado.nextLine();
				//la
				if(diccionario.contains(palabra)) {
					System.out.println("La palabra " + palabra + " está en el diccionaro ");
				}
				else {
					//muestro mensaje de error
					
					System.out.println("Error.La palabra " + palabra + " no está en el diccionaro ");
				
				}
				break;
				
			case 3:	
				teclado.nextLine();
				System.out.println("Introduce una cadena: ");
				palabra = teclado.nextLine();
				if(diccionario.contains(palabra)) {
					diccionario.remove(palabra);
				System.out.println("La palabra " + palabra + " ha sido borrada del diccionaro ");
				}
				
				else {
					System.out.println("Error.La palabra " + palabra + " no esta en el diccionaro ");
					}
				break;
				
			case 4:
			//Muestro todos los elementos del diccionario
			//si es que tienen elementos
			//ordenados alfabeticamente pero en orden inverso
				Comparator<String> comparador = Collections.reverseOrder(); 
				Collections.sort(diccionario, comparador); 
			
			for(int posicion = 0; posicion < diccionario.size(); posicion++) {
				System.out.println(diccionario.get(posicion));
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

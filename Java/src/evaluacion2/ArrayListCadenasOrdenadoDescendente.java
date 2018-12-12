package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListCadenasOrdenadoDescendente {

	public static void main(String[] args) {
		 ArrayList<String> arrayListCadenas = new ArrayList<String>();
		 String cadena;
		 
		
		 Scanner teclado;
			teclado = new Scanner(System.in);
			
			System.out.println("Introduce una cadena: ");
			cadena = teclado.nextLine();
			
			while(!cadena.isEmpty()) {	
				arrayListCadenas.add(cadena);
				System.out.println("Introduce una cadena: ");
				cadena = teclado.nextLine();
				}
			teclado.close();
			//en orden descendente
			Comparator<String> comparador = Collections.reverseOrder(); 
			Collections.sort(arrayListCadenas, comparador); 
			
			for(int posicion = 0; posicion < arrayListCadenas.size(); posicion++) {
				System.out.println(arrayListCadenas.get(posicion));}

	}

}

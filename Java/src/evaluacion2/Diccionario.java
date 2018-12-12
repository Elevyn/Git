package evaluacion2;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		String cadena;		
		int elementos,posicion;
		String diccionario[] =new String[10];
		 
		 Scanner teclado;
		 teclado= new Scanner(System.in);
		 //leo una palabra
		 System.out.println("Introduce un palabra:");
		 
		 cadena=teclado.nextLine();
		//libero memoria
		 teclado.close(); 
		 elementos=0;
		 while(!cadena.isEmpty() && elementos < 10){
			 //añado àlabra al diccionario
			 //de manera ordenada
			 //buscar la posicion
			 posicion=0;
			 while(posicion<elementos){
			 //compruebo si es la posicion
				if(cadena.compareTo(diccionario[posicion])<0){
				//si es la posicion
				break;
				
			 }
				 //voy a la siguiente posicion
				 posicion=posicion+1;
			 }
			 //desplazo los elementos desde la posicion una posicion a la derecha
			 for(int posmov=elementos; posmov>posicion; posmov--) {
			 diccionario[posmov]=diccionario[posmov-1];
		
			 //inserto la cadena en la posicion
			 diccionario[posicion]=cadena;
			 //incremento el numero de elementos
			 elementos=elementos+1;}
			 //leo otra palabra
		 System.out.println("Introduce una palabra:");
		 cadena=teclado.nextLine();
		 }
		 teclado.close();
		 
		for(posicion=0;posicion<elementos; posicion++){
			System.out.println(diccionario[posicion]);
		
		}
 
	}

}

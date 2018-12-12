package evaluacion1;

public class Mostrformato{


	public static void main(String[] args) {
		/*
		 * coge el valor de una variable de tipo String  y lo muestra por pantalla
		 */
		double n;
		n =Math.PI;
		String cadena="Hola Mundo";
		System.out.println("El valor de la variable es " + n);
		System.out.printf("El valor de n es  %.2f y el valor de cadena es %s",n, cadena);
	}

}

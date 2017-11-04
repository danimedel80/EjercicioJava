import java.util.Scanner;

/*Introducir una frase por teclado. Imprimirla cinco veces en filas consecutivas, pero cada
 *  impresión ir desplazada cuatro columnas hacia la derecha.
 */

public class Ejercicio22 {

	public static void main(String[] args) {
		String frase=" ";
		String columnas="    ";
		Scanner teclado=new Scanner (System.in);
		System.out.println("Escribe 1 frase");
		frase=teclado.nextLine();
		for (int i = 0; i < 5; i++) {
			System.out.println(frase);
			frase=columnas+frase;
			
			
			
		
				
		}
		

	}

}

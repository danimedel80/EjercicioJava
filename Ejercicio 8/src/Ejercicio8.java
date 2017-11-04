
/* Hacer un Pseudocodigo que solo permita
 * introdurcir S o N
 */
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String palabra = "";
		int i = 1;
		int j = 1;

		System.out.println("Solo deja seleccionar S o N");
		System.out.println("Introduce una letra");
		Scanner teclado = new Scanner(System.in);
		while (i == j) {
			palabra = teclado.nextLine();

			if (!palabra.equalsIgnoreCase("S") && !palabra.equalsIgnoreCase("n")) {
				System.out.println("NO");

			} else {

				System.out.println("CORRECTO");
			}

		}

	}

}

// palabra s o palabra
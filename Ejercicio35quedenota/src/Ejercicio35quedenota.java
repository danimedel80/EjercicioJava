import java.util.Scanner;

/*35.-Usando el segundo ejemplo, hacer un programa que busque una nota en el vector.
 */
public class Ejercicio35quedenota {

	public static void main(String[] args) {
		int[] calificaciones = new int[5];
		int media = 0;
		int buscarnota = 0;
		// ¿como se hace para que entre en un rango de numeros?
		String[] asignaturas = { "Matematicas", "Ingles", "Lengua", "Programacion", "Naturales" };
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < calificaciones.length; i++) {

			do {
				System.out.println("Escribe la nota de Daniel en:" + asignaturas[i]);
				calificaciones[i] = teclado.nextInt();

			} while (calificaciones[i] < 1 || calificaciones[i] > 10);

			media = media + calificaciones[i];
		}
		media = media / 5;
		System.out.println("la nota media es:" + media);

		System.out.println("Buscar la nota");
		buscarnota = teclado.nextInt();
		for (int j = 0; j < calificaciones.length; j++) {
			if (calificaciones[j] == buscarnota) {
				System.out.println("Ha sacado en:" + asignaturas[j]);

			}

		}

	}

}

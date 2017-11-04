/*Imprime los numeros del 0 al 100, controlando las filas y las 
 * columnas
 */
public class Ejercicio23 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				System.out.print(i*10+j + " ");

			}

			System.out.println();

		}
	}
}

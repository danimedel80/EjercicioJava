import java.util.Random;
import java.util.Scanner;

/*Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, e imprimirla.
*/
public class Ejercicio36 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][5];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100 + 1);
				System.out.print("[" + matriz[i][j] + "]");

			}
			System.out.println();

		}

	}

}
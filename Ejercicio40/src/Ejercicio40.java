//Crear una tabla de 3 páginas, 4 filas y 5 columnas donde el primer elemento valga 1, el segundo 2, el tercero 3 y así sucesivamente, e imprimirla.
public class Ejercicio40 {
	public static void main(String[] args) {
		int cont = 0;
		int[][][] numeros = new int[3][4][5];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				for (int j2 = 0; j2 < numeros[0][0].length; j2++) {
					cont++;
					numeros[i][j][j2] = cont;

					System.out.print(numeros[i][j][j2]);

				}
				System.out.println();

			}
			System.out.println();
		}

	}

}

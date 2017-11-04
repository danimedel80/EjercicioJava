import java.util.Scanner;

//Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, y hacer su matriz transpuesta.
public class Ejercicio37 {
public static void main(String[] args) {
	
	
	int[][] matriz = new int[4][5];
	Scanner teclado = new Scanner(System.in);

	for (int i = 0; i < matriz.length; i++) {// filas
		for (int j = 0; j < matriz[0].length; j++) {//columnas
			matriz[i][j] = (int) (Math.random() * 100 + 1);
			System.out.print("[" + matriz[i][j] + "]");

		}
		System.out.println();

	} // lo de abajo es para transponer la matriz.
		System.out.println();
		for (int j = 0; j < matriz[0].length; j++) {     //filas
			for (int i = 0; i < matriz.length; i++) {    //columnas
				
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
			
		}
	
	
	
	
	
	
	
	
	
}
}

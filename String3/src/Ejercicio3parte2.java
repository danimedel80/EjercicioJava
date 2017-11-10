//Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la frase y si no la encuentra devuelva un cero.
import java.util.Scanner;

public class Ejercicio3parte2 {
	public static void main(String[] args) {
		String frase;
		String palabra;
		int posicion = 0;
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Escribe una palabra");
		palabra = teclado.nextLine();
		while (posicion != -1) {
			posicion = frase.indexOf(palabra, posicion);
			if (posicion != -1) {
				System.out.println("La palabra esta en la posición" + posicion);
				contador++;
				posicion++;

			}

		}
		System.out.println("La palabra se repite:"+contador+"veces");
		teclado.close();
	}

}

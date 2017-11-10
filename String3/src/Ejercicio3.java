import java.util.Scanner;

//Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la frase y si no la encuentra devuelva un cero.
public class Ejercicio3 {
	public static void main(String[] args) {
		String frase;
		String palabra;
		int posicion = 0;
		int contador = 0;
		int contador2 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Escribe una palabra");
		palabra = teclado.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			posicion = frase.indexOf(palabra, i);

			if (posicion == -1) {
				contador2++;

			} else {
				contador++;

				i = palabra.length() + posicion;
				System.out.println("las posición es:" + posicion);

			}

		}
		if (contador2 > 0) {
			System.out.println("La palabra no esta");

		}

		System.out.println("La palabra se repite:" + contador + " " + "veces");

	}

}

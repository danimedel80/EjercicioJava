import java.util.Scanner;

//Leer una cadena de hasta 80 caracteres y pasarla en función de una variable de opción a mayúsculas ó a minúsculas e imprimir la cadena resultante
public class Ejericicio4 {
	public static void main(String[] args) {
		String frase;
		String mayusculas;
		String minusculas;
		int opcion = 0;
		System.out.println("Escribe una frase");
		Scanner teclado = new Scanner(System.in);
		do {
			frase = teclado.nextLine();

		} while (frase.length() > 80);
		System.out.println("Seleccion 1 para MAYUSCULAS");
		System.out.println("Seleccion 2 para minusculas");
		opcion = teclado.nextInt();

		switch (opcion) {

		case 1:
			mayusculas = frase.toUpperCase();

			System.out.println(mayusculas);

			break;

		case 2:
			minusculas = frase.toLowerCase();

			System.out.println(minusculas);
			break;
		}

	}

}

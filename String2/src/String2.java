import java.util.Scanner;

//2. Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas y minúsculas tiene y lo imprima

public class String2 {
	public static void main(String[] args) {

		String frase = " ";
		String caracter = "";
		int mayusculas = 0;
		int minusculas = 0;
		int espacio = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase");
		do {
			frase = teclado.nextLine();

		} while (frase.length() < 0 || frase.length() > 80);

		for (int i = 0; i < frase.length(); i++) {

			caracter = frase.substring(i, i + 1);
			if (caracter.equals(" ")) {
			}

			else if (caracter.equals(caracter.toUpperCase())) {
				mayusculas++;

			} else {
				minusculas++;
			}
		}
		System.out.println(mayusculas);
		System.out.println(minusculas);

	}

}

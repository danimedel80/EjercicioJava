import java.util.Scanner;

/*Leer una frase por teclado (máximo 80 car) y 
construir otras dos cadenas de forma que una contenga los caracteres en posición par y la otra los caracteres en posición impar.*/
public class String5 {

	public static void main(String[] args) {
		String frase;
		String letras;
		String letras2;
		String pares = " ";
		System.out.println("Escribe una frase");
		int j = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			frase = teclado.nextLine();

		} while (frase.length() > 80);

		for (int i = 0; i < frase.length(); i++) {
			if (i % 2 == 0) {
				letras = frase.substring(i, i + 1);
				if (letras.equals(" ")) {

				} else {
					System.out.print(letras);
				}
			}
		}
		System.out.println();
		for (int i = 0; i < frase.length(); i++) {
			if (i % 2 != 0) {
				letras = frase.substring(i, i + 1);
				if (letras.equals(" ")) {

				} else {
					System.out.print(letras);
				}
			}
		}
	}
}

import java.util.Scanner;

/*1. Leer una frase de máximo 80 caracteres y escribirla 
progresivamente es decir si la frase es: “ciervo”, el programa debe imprimir*/

public class String1 {
	public static void main(String[] args) {
		String caracter = "";
		String frase = "";
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduce una frase");
			frase = teclado.nextLine();
			
		} while (frase.length()<1 || frase.length()>80);
		
		
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.substring(0,i+1); // el subtring sirve para devolver caracter.
			System.out.println(caracter);

		}

	}

}

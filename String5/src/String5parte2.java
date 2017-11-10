import java.util.Scanner;

/*Leer una frase por teclado (máximo 80 car) y 
construir otras dos cadenas de forma que una contenga los caracteres en posición par y la otra los caracteres en posición impar.*/

public class String5parte2 {
	public static void main(String[] args) {
		String frase = "", pares = "", impares = "";
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Imprime una frase<80");
			frase = teclado.nextLine();

		} while (frase.length() > 80);
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.substring(i,i+1).equals(" ")) {
				
			}
				
			else if (i%2==0) {
				pares=pares.concat(frase.substring(i, i+1));
				//pares=pares+frase.substring(i, i+1);
			}
			else {
				impares=impares.concat(frase.substring(i, i+1));
			}
		}
		System.out.println("Las letras pares son:"+ pares);
		System.out.println("Las letras impares son:"+ impares);
		teclado.close();

	}
}

import java.util.Scanner;

// comprobar si un número mayor o igual que la unidad es primo//
public class Ejercicio24 {
	public static void main(String[] args) {
		int numero = 0;
		int k = 1, l = 1;
		int primos = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		while (k==l) {
			numero = teclado.nextInt();

			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					primos++;
					
				}

			}
			if (primos >= 1) {
				System.out.println("NO");
				primos=0;

			} 
			else {
				System.out.println(numero + " Es PRIMO");
				primos=0;
				
			}

		}

	}

}

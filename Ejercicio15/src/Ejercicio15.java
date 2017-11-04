import java.util.Scanner;

/*Introducir dos números por teclado. 
 * Imprimir los números naturales que hay entre ambos 
 * números empezando por el mas pequeño, contar cuantos hay y cuántos de ellos son pares. 
 * Calcular la suma de los impares
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		int numeroA = 0;
		int numeroB = 0;
		int sum = 0;
		int cont2 = 0;// contador de los números que hay entre los 2
		int cont3 = 0;// contador de los pares
		int comodin = 0;
		int comodin2 = 0;
		int impar = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe dos número");
		numeroA = teclado.nextInt();
		numeroB = teclado.nextInt();

		// la inversa
		if (numeroA > numeroB) {
			comodin2 = numeroA;
			comodin = numeroB;
			numeroA = comodin;
			numeroB = comodin2;

		}
		System.out.println("Los números naturales son:");
		for (int i = numeroA; i <= numeroB; i++) {
			System.out.println(i);// imprime los números
			cont2++; // la suma de cuantos pares hay.
			if (i % 2 == 0) {
				cont3++;
			}
			if (i % 2 != 0) { // falta la suma de los impares

				impar = impar + i;

			}

		}
		System.out.println("el numero total de numeros es: " + cont2);

		System.out.println("El número total de pares es: " + cont3);

		System.out.println("La suma de los impares es: " + impar);

	}
}

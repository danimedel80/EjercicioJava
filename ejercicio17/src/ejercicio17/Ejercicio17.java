/*Imprimir, contar y sumar los múltiplos de 2 que hay entre 
 * una serie de números, tal que el segundo sea mayor o igual que el primero.
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int contador2 = 0;
		int suma = 0;
		int comodin=0;
		System.out.println("Escribe 2 números");

		Scanner teclado = new Scanner(System.in);
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		
		if (numero1>numero2) {
			comodin=numero1;
			numero1=numero2;
			numero2=comodin;
			
			
		}

		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);// multiplos de 2
				contador2 = contador2 + 1;// cuantos multiplos de 2 hay
				suma = suma + i;// suma de los multiplos de 2

			}

		}
		System.out.println("Hay" + " " + contador2 + " " + "multiplos de 2");
		System.out.println("la suma es:" + suma);

	}

}

import java.util.Scanner;

//Realizar la tabla de multiplicar de un numero entre 0 y 10.
public class Ejercicio27Tablademultiplicar {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero = -1;
		int resultado = 0;
		/*
		 * System.out.println("introduce un numero entre 0 y 10"); while (numero
		 * <0 || numero >10) {
		 */
		do {
			System.out.println("introduce un numero entre 0 y 10");
			numero = teclado.nextInt();

		} while (numero < 0 || numero > 10);
	
		for (int i = 0; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + "*" + i + "=" + resultado);

		}

	}

}
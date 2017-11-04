import java.util.Scanner;

/*Hacer un programa que nos permita introducir un número 
por teclado y sobre el se realicen las siguientes operaciones: comprobar si es primo, 
hallar su factorial e imprimir su tabla de multiplicar.*/
public class Ejercicio32Menulargo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int resultado = 0;
		int resultado2 = 0;
		int resultado3 = 1;

		System.out.println("Introduce un número");
		numero = teclado.nextInt();
		for (int i = 0; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + "*" + i + "=" + resultado);
		}

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				resultado2++;
			}

		}
		for (int i = 1; i <= numero; i++) {
			resultado3 = i * resultado3;

		}
		System.out.println("EL factorial de numero es" + ":" + resultado3);
	
		if (resultado2 == 0) {
			System.out.println("El número es primo");
		}

		else {
			System.out.println("El número no es primo");

		}

	}

}

import java.util.Scanner;

import org.omg.IOP.Codec;

/*Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro primeros 
 * sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo (H ó M) sexo, el sexto un numero 
 * que representa el curso 1 ó 2 y los caracteres séptimo y octavo pueden tener cualquier valor.Ddeben rechazarse los códigos que no cumplan estas
   condiciones, la finalización de entrada de códigos se produce cuando se introduce el código “00000000”. Al final el programa 
debe sacar un informe indicando cuántos hombres y mujeres hay matriculados en primero y segundo y cuántos códigos correctos han sido leídos.
*/
public class Ejercicio8 {

	public static void main(String[] args) {
		String codigo = "";
		int fecha;
		Scanner teclado = new Scanner(System.in);
		int correctos = 0;
		int hombres = 0;
		int mujeres = 0;
		int primero = 0;
		int segundo = 0;

		do {

			System.out.println("introduce un código");
			codigo = teclado.nextLine();
			codigo = codigo.toUpperCase();
			fecha = Integer.valueOf(codigo.substring(0, 4));
			if (codigo.length() == 8) {

				if (fecha >= 1990 && fecha <= 1995) {

					if (codigo.charAt(4) == 'H' || codigo.charAt(4) == 'M') {
						if (codigo.charAt(4) == 'H') {
							hombres++;

						} else {
							mujeres++;
						}

						if (codigo.charAt(5) == '1' || codigo.charAt(5) == '2') {
							if (codigo.charAt(5) == '1') {
								primero++;
								correctos++;

							} else {
								segundo++;
								correctos++;
							}

						}

					}

				}

			} else {
				System.out.println("***********Introduce bien el código***********");
			}

		} while (!codigo.equals("00000000"));

		System.out.println("los codigos correctos son:" + correctos);
		System.out.println("El número de hombres son::" + hombres);
		System.out.println("El número de mujeres es:" + mujeres);
		System.out.println("El número de matriculados en primero es:" + primero);
		System.out.println("El número de matriculados en segundo es:" + segundo);

	}

}

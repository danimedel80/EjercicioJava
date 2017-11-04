/*Hacer un programa que calcule independientemente 
 * la suma de los pares y los impares de los números 
 * entre 1 y 1000, utilizando un switch
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;

		for (int i = 1; i <= 1000; i++) {
			switch (i % 2) {
			case 0:
				sum = i + sum;
				break;// el break es muy importante

			case 1: //también se puede poner default
				sum2 = i + sum2;
				break;

			}

		}// final del for
		System.out.println(sum);
		System.out.println(sum2);
	}
}

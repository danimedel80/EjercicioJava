/*Hacer un pseudocódigo que imprima los números del 1 al 100. 
 * Que calcule la suma de todos los números pares por un lado, 
 * y por otro, la de todos los impares.
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		int NumPares=0;
		int NumImpares=0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			if (i%2==0) {
				NumPares=i+NumPares;
			}
			
			else
				NumImpares=NumImpares+i;
			
		}
		System.out.println(NumPares);
		System.out.println(NumImpares);
		
	}

}

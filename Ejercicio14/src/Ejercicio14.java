import java.util.Scanner;

/*Hacer un pseudocódigo que imprima el mayor y el menor de 
 * una serie de cinco números que vamos introduciendo por teclado.
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		int NumMaximo=0;
		int NumMinimo=999999999;
		int numero;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe 5 números");
		for (int i = 0; i < 5; i++) {
			numero=teclado.nextInt();
			if (numero>NumMaximo) {
				NumMaximo=numero;
			}
			
			if (numero<NumMinimo) {
				NumMinimo=numero;
			}
			
			
		}
		System.out.println(NumMaximo);
		System.out.println("Es el número mayor");
		System.out.println(NumMinimo);
		System.out.println("Es el número menor");
		
	
		
	
		
		
		
	}
	

}

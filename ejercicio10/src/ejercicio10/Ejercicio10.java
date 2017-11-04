	package ejercicio10;
	
	import java.util.Scanner;
	
	public class Ejercicio10 {
		public static void main(String[] args) {
			int numero=0;
			int a=1;
			int b=1;
				
			System.out.println("Introduce un número");
			while (a==b) {
				
			
			Scanner teclado=new Scanner (System.in);
			
			
			numero=teclado.nextInt();
			if (numero%2==0) {
				System.out.println("el número es par");
				
				
			} 
			else {
				System.out.println("El numero es impar");
				
				
			}
			}
			
		}
	
	}

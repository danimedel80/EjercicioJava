import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int numero=1;
		int b=1;
		int a=1;
		
		Scanner teclado=new Scanner (System.in);
		System.out.println( "Escribe un número");
		while (numero!=0 ){ // !=distinto
			numero=teclado.nextInt();
			if (numero>0){
				System.out.println("El número es positivo");
				 
				}
			else if (numero==0){
				System.out.println("Ok");
			}
			else {
				System.out.println("el número es negativo");
		}
		
			
		

			
	}
	}

	}

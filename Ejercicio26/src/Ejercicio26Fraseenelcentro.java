import java.util.Scanner;

//Introducir una frase por teclado. Imprimirla en el centro de la pantalla.
public class Ejercicio26Fraseenelcentro {
	public static void main(String[] args) {
		String frase;
		Scanner teclado=new Scanner (System.in);		
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		System.out.println("\n");
		for (int i = 0; i < (240-frase.length())/2; i++) {
			frase=" "+(frase);
		}
		System.out.println(frase);
		teclado.close();
			
		}

	}



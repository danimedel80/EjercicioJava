import java.util.Scanner;

/*Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y 
dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del modo siguiente , si el numero 
por ejemplo es 3, transforme la frase de manera que cada carácter se transforme en 3 códigos ASCII mas es decir :
Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
Desarrollar los programas de codificar y descodificar mediante dos funciones.*/
public class String7 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase = ""; 
		int codificacion=0, numero=0;
		do {
			System.out.println("Introduce una frase");
			frase=teclado.nextLine();
		    frase=frase.toUpperCase();
			
		} while (frase.length()>80);
		do {
			System.out.println("Introduce un número del 1 al 10");
			numero=teclado.nextInt();
		} while (numero<0 || numero>10);
		System.out.println("Pulsa 1 para codificar");
		System.out.println("Pulsa 2 para descodificar");
		int deco = teclado.nextInt();
		switch (deco) {
		case 1:
			for (int i = 0; i < frase.length(); i++) {
				codificacion = (int)frase.charAt(i)+numero;
				//codificacion=Integer.parseInt(frase.substring(0,i))+numero;
				
				System.out.print((char)codificacion);
				

			}
			break;
		case 2:
			for (int i = 0; i < frase.length(); i++) {
				codificacion = (int)frase.charAt(i)-numero;
				
				System.out.print((char)codificacion);
				
		
		
		
		
	
		
	}
	
		}
	
	}
}


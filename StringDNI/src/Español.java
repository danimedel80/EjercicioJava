import java.util.Scanner;


public class Español {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		String Tabla ="TRWAGMYFPDXBNJZSQVHLCKE";
		String dni;
		int entero, posicionletra;
		
		
		do {
			System.out.println("Introduce tu dni");
			dni=teclado.nextLine();
			dni=dni.toUpperCase();
		} while (dni.length()!=9);
		
		entero=Integer.valueOf(dni.substring(0,8));
		posicionletra=entero%23;
			if (dni.charAt(8)==(Tabla.charAt(posicionletra))) {
				System.out.println("El DNI es correcto");
			}
			else {
				System.out.println("El DNI no es correcto");
				
				
				
				
			}
			
		}

	}



import java.util.Scanner;

//ejercicio DNi
public class DNIdefinitivo {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String Tabla ="TRWAGMYFPDXBNJZSQVHLCKE";
		String uno ="0123456789XYZ";
		String dni;
		boolean correcto=false; //repasar
		int entero, posicionletra, extranjero, posicionletra2;
		do {
			correcto=false;
			System.out.println("Introduce tu dni");
			
			dni=teclado.nextLine().toUpperCase();
			if (dni.length()!=9 ) {
				correcto=true;
			}
			
			for (int i = 0; i < dni.length()-1; i++) {
				
				if (uno.indexOf(dni.substring(i, i+1))==-1) {
					correcto=true;
				}
			}
				if (Tabla.indexOf(dni.substring(8,9))==-1) {
					correcto=true;
				}
			
		} while (correcto);
extranjero=Integer.valueOf(dni.substring(1,8));
		
		String resultado;

			if (dni.charAt(0)=='X') {
			posicionletra=extranjero%23;
			
			if (dni.charAt(8)==Tabla.charAt(posicionletra)) {
				System.out.println("El DNI es correcto");
				}
			else {
				System.out.println("El DNI no es correcto");
			}
		}
		else if (dni.charAt(0)=='Y') {
			resultado="1"+dni.substring(1, 8);
			posicionletra2=Integer.valueOf(resultado);
			posicionletra=posicionletra2%23;
			if (dni.charAt(8)==Tabla.charAt(posicionletra)) {
				System.out.println("El DNI es correcto");
				}
			else  {
				System.out.println("El DNI no es correcto");
			}
		}
		else if (dni.charAt(0)=='Z') {
			resultado="2"+dni.substring(1, 8);
			posicionletra2=Integer.valueOf(resultado);
			posicionletra=posicionletra2%23;

			if (dni.charAt(8)==Tabla.charAt(posicionletra)) {
				System.out.println("El DNI es correcto");
				}
			else  {
				System.out.println("El DNI no es correcto");
			}
		}
		else if (dni.charAt(0) >0 || dni.charAt(0)<10) {
			entero=Integer.valueOf(dni.substring(0,8));
			posicionletra=entero%23;
			
			
			if (dni.charAt(8)==Tabla.charAt(posicionletra)) {
				System.out.println("El DNI es correcto");
				}
			else  {
				System.out.println("El DNI no es correcto");
			}
		
	}

}
}

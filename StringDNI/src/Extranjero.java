import java.util.Scanner; //if (dni.charAt(0)!='X' || dni.charAt(0)!='Y' || dni.charAt(0)!='Z' ) {



//Extranjero X=0 Y=1 Z=2  y7754886j
public class Extranjero {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String Tabla ="TRWAGMYFPDXBNJZSQVHLCKE";
		String dni;
		int entero, posicionletra, extranjero, posicionletra2;
		
		
		do {
			System.out.println("Introduce tu dni");
			
			dni=teclado.nextLine();
			dni=dni.toUpperCase();
		} while (dni.length()!=9 || dni.charAt(0)!='X' && dni.charAt(0)!='Y' && dni.charAt(0)!='Z' && dni.charAt(0)!='1' && dni.charAt(0)!='2'
				&& dni.charAt(0)!='3' && dni.charAt(0)!='4'&& dni.charAt(0)!='5'&& dni.charAt(0)!='6' && dni.charAt(0)!='7' && dni.charAt(0)!='8'
				&& dni.charAt(0)!='9');
		dni=dni.toUpperCase();
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

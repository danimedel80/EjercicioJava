import java.util.Scanner;

//31.-Introducir dos números por teclado y mediante un menú, calcule su suma, su resta, su multiplicación o su división.
public class Ejercicio31EleccionOperacion {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		float numeroA=0;
		float numeroB=0;
		int operacion=0;
		float resultado=0;
		System.out.println("Introduce un número");
		numeroA=teclado.nextInt();
		System.out.println("Introduce el segundo número");
		numeroB=teclado.nextInt();
		System.out.println("Elige una opción");
		System.out.println("1-suma");
		System.out.println("2-resta");
		System.out.println("3-multiplicación");
		System.out.println("4-división");
		
		operacion=teclado.nextInt();
				
		switch (operacion) {
		case 1:
		resultado=numeroA+numeroB;
		System.out.println(resultado);
			
			break;
		case 2:
		resultado=numeroA-numeroB;
		System.out.println(resultado);
			
			break;

		case 3:
		resultado=numeroA*numeroB;
		System.out.println(resultado);
	
			break;

		case 4:
		resultado=numeroA/numeroB;
		System.out.println(resultado);
	
			break;


	
		}
		
		
	}

}

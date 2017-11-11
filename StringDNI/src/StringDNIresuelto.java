import java.util.Scanner;

public class StringDNIresuelto {
	public static void main(String[] args) {
		
		String Tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		String Resultado = "";
		String Frase = "";
		int Nie = 0;
		int error = 1, resto = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce un DNI/NIE al completo.");
			Frase = teclado.nextLine();
			Frase = Frase.toUpperCase();
		} while (Frase.length() != 9);
		if (Frase.charAt(0)=='X'){ // Modificamos el valor de la letra inicial del NIE.
			error = 0;
			Nie = 1;
			Resultado = "0" + Frase.substring(1, Frase.length()-1); 
		}
		if (Frase.charAt(0)=='Y'){ // Modificamos el valor de la letra inicial del NIE.
			error = 0;
			Nie = 1;
			Resultado = "1" + Frase.substring(1, Frase.length()-1);
		}
		if (Frase.charAt(0)=='Z'){ // Modificamos el valor de la letra inicial del NIE.
			error = 0;
			Nie = 1;
			Resultado = "2" + Frase.substring(1, Frase.length()-1);
		}
		if ((Integer.valueOf(Frase.charAt(0)) >= 0 || Integer.valueOf(Frase.charAt(0))<=9) && Nie == 0){
			error = 0;
			Resultado = Frase.substring(0, Frase.length()-1);}
		if (error == 1) {
			System.out.println("El dni no tiene el formato adecuado");
		}
		if (error == 0){
			resto = Integer.valueOf(Resultado)%23;
			if(Frase.charAt(8)==Tabla.charAt(resto)){
				System.out.println("La letra es correcta.");
			}
			else{
				System.out.println("La letra es incorrecta");

		
	}
		}
	}

}

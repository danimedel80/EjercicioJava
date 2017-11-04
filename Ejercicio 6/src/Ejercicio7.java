import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String frase = "";// las frases se inicializan con String
		int cont = 0; // va a ser el contador de las frases
		System.out.println("Escribe frases hasta que pongas fin");
		Scanner teclado = new Scanner(System.in); //inicializamos lectura

		while (!frase.equals("fin")) {  /* ! siginifica no y equals siginifica igual*/
			frase = teclado.nextLine();
			cont++;   

		}
		System.out.println(cont);

		// el ejercicio cuenta el fin. si no queremos que lo cuente, podemos
		// declarar la lectura de frase antes y despues de while
	}

}

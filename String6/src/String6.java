import java.util.Scanner;

//Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales, consonantes y caracteres numéricos posee.
public class String6 {
public static void main(String[] args) {
	String frase = "";
	String vocales = "aeiou";
	String consonantes = "bcdhjklmnñpqrstvwxyz";
	String numeros = "0123456789";
	int cont1=0;
	int cont2=0;
	int cont3=0;
	
	Scanner teclado = new Scanner(System.in);

	do {
		System.out.println("Imprime una frase<80");
		frase = teclado.nextLine();

	} while (frase.length() > 80);
	
	for (int i = 0; i < frase.length(); i++) {
		if (vocales.indexOf(frase.substring(i, i+1))!=-1) {
			cont1++;
			

		}
		else if (consonantes.indexOf(frase.substring(i, i+1))!=-1) {
			cont2++;
		}else if (numeros.indexOf(frase.substring(i, i+1))!=-1) {
			cont3++;
			
		}
		
	}
	System.out.println(cont1);
	System.out.println(cont2);
	System.out.println(cont3);
	
	
	
}
}

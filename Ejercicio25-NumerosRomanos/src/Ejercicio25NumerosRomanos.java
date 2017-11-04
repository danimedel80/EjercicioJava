import java.util.Scanner;

//ejercicio de los números romanos M,D,C,L,X,V,I
public class Ejercicio25NumerosRomanos {
	public static void main(String[] args) {
		int numero = -1;
		String romanos = " ";
		Scanner teclado = new Scanner(System.in);
		int miles, centenas, num, decenas;

		System.out.println("Introduce un número");
		while (numero < 0 || numero > 5000) {
			numero = teclado.nextInt();
			switch (miles = numero / 1000) { // 4200 miles es 4
			case 1:
				romanos = "M";
				break;

			case 2:
				romanos = "MM";
				break;

			case 3:
				romanos = "MM";
				break;

			case 4:
				romanos = "MMMM";
				break;
			}
			numero = numero - (1000 * miles); // numero es 200

			switch (centenas = numero / 100) {

			case 1:
				romanos = romanos + "C";
				break;

			case 2:
				romanos = romanos + "CC";
				break;

			case 3:
				romanos = romanos + "CCC";
				break;

			case 4:
				romanos = romanos + "CD";
				break;
			case 5:
				romanos = romanos + "D";
				break;
			case 6:
				romanos = romanos + "CD";
				break;
			case 7:
				romanos = romanos + "DCC";
				break;
			case 8:
				romanos = romanos + "DCCC";
				break;
			case 9:
				romanos = romanos + "CM";
				break;

			}

			numero = numero - (100 * centenas);
			switch (decenas = numero / 10) {
			case 1:
				romanos = romanos + "X";
				break;

			case 2:
				romanos = romanos + "XX";
				break;

			case 3:
				romanos = romanos + "XXX";
				break;

			case 4:
				romanos = romanos + "XL";
				break;
			case 5:
				romanos = romanos + "L";
				break;
			case 6:
				romanos = romanos + "LX";
				break;
			case 7:
				romanos = romanos + "LXX";
				break;
			case 8:
				romanos = romanos + "LXXX";
				break;
			case 9:
				romanos = romanos + "XC";
				break;
			}
			numero = numero - (10 * decenas);
			
			switch (num = numero ) {
			
			case 1:
				romanos = romanos + "I";
				break;

			case 2:
				romanos = romanos + "II";
				break;

			case 3:
				romanos = romanos + "III";
				break;

			case 4:
				romanos = romanos + "IV";
				break;
			case 5:
				romanos = romanos + "V";
				break;
			case 6:
				romanos = romanos + "VI";
				break;
			case 7:
				romanos = romanos + "VII";
				break;
			case 8:
				romanos = romanos + "VIII";
				break;
			case 9:
				romanos = romanos + "IX";
				break;
			}

		}
		System.out.println(romanos);

	}

}

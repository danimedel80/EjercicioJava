	import java.util.Scanner;
	
	public class Ejercicio11 { /*-Imprimir y contar los múltiplos de 3 
	desde la unidad hasta un numero que introducimos por teclado.*/
		public static void main(String[] args) {
			int numero;
			int ContNum=0;
			System.out.println("Escribe un número");
			Scanner teclado=new Scanner(System.in);
			numero=teclado.nextInt();
			for (int i = 1; i <= numero; i++) {
				
				
				if (i%3==0) {
					System.out.println(i);
					ContNum++;

				}

			}
			System.out.println(ContNum);
	
		}
	
	}

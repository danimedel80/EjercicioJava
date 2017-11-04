import java.util.Scanner;

/*Crear un array unidimensional de 5 elementos con nombres de personas. Visualizar los elementos 
 * de la lista debiendo ir cada uno en una fila distinta y lo ordenas.
 */
public class Ejercicio34Array {
	public static void main(String[] args) {
		String[] nombres=new String[5];
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Escribe 5 nombres de personas");
		for (int i = 0; i < 5; i++) {
			nombres[i]=teclado.nextLine();	

		}
		for (int i = 0; i < nombres.length-1; i++) {
			for (int j= 0; j < nombres.length-1; j++) {
				if (nombres[j].compareTo(nombres[j+1])>0) { //codigo ASCII
					String apoyo=nombres[j+1];
					nombres[j+1]=nombres[j];
					nombres[j]=apoyo;
					
					//metodo burbuja
				}			
			}
			
		}
		for (int i = 0; i < nombres.length; i++) {
			
		
		System.out.println(nombres[i]);
		}
		teclado.close();
	}

}

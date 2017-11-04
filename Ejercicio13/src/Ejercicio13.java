/*Imprimir y contar los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.*/
public class Ejercicio13 {
	public static void main(String[] args) {
		int numero=0;
		int m2=0;
		int m3=0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.println(i);
				System.out.println("Es un multiplo de 2");
				m2=m2+i;
			}
			else if (i%3==0) {
				System.out.println(i);
				System.out.println("Es un multiplo de 3");
				m3=m3+i;
		
			}
		}
			System.out.println(m2);
		System.out.println("es la suma de los multiplos de 2");
			System.out.println(m3);
			System.out.println("es la suma de los multiplos de 3");
	}
}

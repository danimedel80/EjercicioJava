import java.util.Scanner;

/*34.-Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, las 
 * almacene en un vector y calcule e imprima su media.
 */
public class Ejercicio34 {

	public static void main(String[] args) {
		int[] calificaciones = new int[5];// las calificaciones que le vamos a dar
		float media = 0;
//¿como se hace para que entre en un rango de numeros?
		String[] asignaturas = { "matematicas", "ingles", "lengua", "programacion", "ingles" };// un array con asignaturas
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < calificaciones.length; i++) {
			
			System.out.println("Escribe la nota de Daniel en:" + asignaturas[i]);
			calificaciones[i] = teclado.nextInt();
			media = media + calificaciones[i];
		}
		media= media/5;
		System.out.println("la nota media es:"+media);
    teclado.close();
	}
   

}

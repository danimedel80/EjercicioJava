/*Cargar en una matriz las notas de los alumnos de un colegio en función 
 * del número de cursos (filas) y del número de alumnos por curso (columnas).
 */
public class Ejercicio38 {
	public static void main(String[] args) {
		System.out.println("Las notas de los alumnos");
		int notas [][]=new int [5][15];
		for (int i = 0; i < notas.length; i++) {
			System.out.print(i+1 +":");
			for (int j = 0; j < notas[0].length; j++) {
				notas[i][j]=(int) (Math.random()*10);
				System.out.print(" "+notas[i][j]);
			}
			System.out.println();
				
			}
		
			
		
		
		

	}
}

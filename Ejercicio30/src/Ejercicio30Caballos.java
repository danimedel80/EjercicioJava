//30.-Simular una carrera de dos caballos si cada uno tiene igual probabilidad de ganar.
public class Ejercicio30Caballos {
	public static void main(String[] args) {
		double caballo1;
		double caballo2;
		int ganadas1 = 0, ganadas2 = 0;

		for (int i = 0; i < 10; i++) {
			caballo1 =  (Math.random() );
			caballo2 =  (Math.random() );
			if (caballo1 > caballo2) {
				ganadas1++;
			}
			else {
				ganadas2++;
			}
		}
		if (ganadas1>ganadas2) {
			System.out.println("Ganador Ponferradero");
		}
		else {
			System.out.println("Ganador Nostramuro");
			
		}
	}
}

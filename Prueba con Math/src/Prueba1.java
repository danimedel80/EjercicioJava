// ejercicio con Match
public class Prueba1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int valor=(int) (Math.random()*6)+1; // si queremos un int hay que decirle a un math que es int
			System.out.println( valor);
			
			double valor1= (Math.random()*6)+1; // la variable ha de ser double y el math elijes random
			System.out.println( valor1);
			
			
		}
		
	}

}
/* Números aleatorios entre a y b
int (Math. random()+(b-a)+a */
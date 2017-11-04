//Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz
public class Ejercicio28Moneda {
	public static void main(String[] args) {
		System.out.println("Lanzar una moneda");
		int w=1,s=1;
		int moneda;
		while (w==s) {
			moneda=(int) (Math.random()*2);
			if (moneda==0) {
				System.out.println("ES CARA");
			}
				else {
					System.out.println("ES CRUZ");
				
					
				}
		
			}
			
			
			
		}
	}



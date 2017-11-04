import java.util.Scanner;

/*Hacer un pseudocódigo que simule el funcionamiento 
 * de un reloj digital y que permita ponerlo en hora
 */
public class Ejercicio19 {
	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		int segundos = -1;
		int minutos = -1;
		int horas = -1;
		int x = 1;
		int s = 1;
		
	
		while (horas<0||horas>24){
		System.out.println("Introduce la hora");
		horas = teclado.nextInt();
		}
		
		while (minutos<0||minutos>59){
		System.out.println("Introduce los minutos");
		minutos = teclado.nextInt();
		}
		
		while (segundos<0||segundos>59){
		System.out.println("Introduce los segundos");
		segundos = teclado.nextInt();
		}

		while (x == s) {
			for (int mhoras=horas; mhoras < 24; mhoras++) {

				for (int mminutos=minutos; mminutos < 60; mminutos++) {

					for (int msegundos=segundos; msegundos < 60; msegundos++) {
						System.out.printf("%02d:%02d:%02d\n",mhoras,mminutos,msegundos);
						Thread.sleep(1000);
					}
					segundos = 0;
				}
				minutos = 0;
			}
			horas=0;
			
		}
		
	}
}

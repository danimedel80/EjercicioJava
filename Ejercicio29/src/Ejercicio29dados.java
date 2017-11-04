//Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.
public class Ejercicio29dados {
	public static void main(String[] args) {
	int dado1,dado2;
	int cuenta=0;
	for (int i = 0; i < 100; i++) {
		dado1=(int)(Math.random()*6);
		dado2=(int)(Math.random()*6);
		if (dado1+dado2==10) {
			cuenta++;
			
			
		}
	}
	System.out.println("Las veces que los dados cuentan 10 es" +"="+cuenta);
	

}

}

import java.util.*;

public class AdivinaAdivinanza {

	public static void main(String[] args) {
		
		int aleatorio = (int) (Math.random() * 100);
		
		System.out.println(aleatorio);
		
		Scanner entrada = new Scanner(System.in);
			
		int numero = 0;
		
		int intentos = 0;
		
		do {
			
			System.out.println("Introduce un numero por favor:");
			
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("Mas bajo wey!!");
				
				intentos++;
				
			}
			
			else if (aleatorio > numero) {
				
				System.out.println("Mas alto wey");
				
				intentos++;
			}
			
			else {
				
				System.out.println("Acertaste!!!");
				
			}
			
			
		}
		
		while (numero != aleatorio);

		System.out.println("Correcto. Solo has necesitado " + intentos + " intentos");
	
		entrada.close();
	}

}

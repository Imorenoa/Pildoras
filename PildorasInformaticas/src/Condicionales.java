import java.util.*; //Importamnos el paquete java utils para poder utilziar scanner

public class Condicionales {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad:");
		
		int edad = entrada.nextInt();
		
		if(edad < 18) {
			
			System.out.println("Eres diminuto! Vete a tu casa");
			
			
			}
			else if (edad > 60){
			
				System.out.println("Wow! Cuanta veterania");
			
			}
			
			else if (edad > 18) {
				
				System.out.println("Mayorcito eres ya e! Responsabilizate");
				
			}
		
		entrada.close();
		

	}

}

import javax.swing.*;

import java.util.*;

public class CalculoAreas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1:{
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			
			break;
			
		}
		
		case 2:{
			
			int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce uno de los lados"));
			
			int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo de los lados"));
			
			System.out.println("El area del rectangulo es: " + (lado1*lado2));
			
			break;
			
		}
		
		case 3:{
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el base del triangulo"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el base del triangulo"));
			
			System.out.println("El area del triangulo es: " + (base*altura)/2 );
			
			break;
		}
		
		case 4:{
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El area del circulo es ");
			
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			
			break;
			
		}
		
		default: 
			
			System.out.println ("No seas pendajo, solo tenias que eleguir entre 4 numeros tio");
		
		
		}
		
		entrada.close();

	}

}

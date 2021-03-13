import javax.swing.*;
import java.util.*;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner insertDato = new Scanner(System.in);
		
		int longitudMatriz = Integer.parseInt(JOptionPane.showInputDialog("Inserte longitud de matriz"));
		
		int [] miMatriz = new int [longitudMatriz];
										
		for (int i=0; i<longitudMatriz; i++) {
			
			System.out.println("Introduce el valor de la posicion " + (i+1) + ":");
			
			miMatriz [i] = insertDato.nextInt();
			
		}
		
		for (int i=0; i<longitudMatriz; i++) {
			
			System.out.println("El valor introducido para la posicion " + i + " es: " + miMatriz[i]);
		
			insertDato.close();
		}
		
	}

}

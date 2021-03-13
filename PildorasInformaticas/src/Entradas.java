import javax.swing.*;

public class Entradas {

	public static void main(String[] args) {

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		
		String edad_usuario = JOptionPane.showInputDialog("Introduce tu edad por favor");
		
		int edad = Integer.parseInt(edad_usuario);
		
		System.out.println("Hola " + nombre_usuario + ". Tienes " + (edad + 1) + " años.");

	}

}
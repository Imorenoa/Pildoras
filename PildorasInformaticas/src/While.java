import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {
		
		String pass = "igor";
		
		String password = "";
		
		while (pass.contentEquals(password) == false) {
			
			password = JOptionPane.showInputDialog("Introduce la contraseña por favor");
			
			if (pass.contentEquals(password) == false) {
				
				System.out.println("Contraseña incorrecta!");
								
			}	
					
			
		}
		
		System.out.println("Contraseña correcta!!");
		
	}

}

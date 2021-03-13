
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		
		int [][] dosDMatrix = {
				{10,15,12,13,18},
				{5,4,7,58,59},
				{56,14,1,69,38},
				{98,87,56,23,45}
				
		};
		
		for (int[]fila:dosDMatrix) {
			System.out.println(" ");
			
			for(int z: fila) {
				System.out.print(z + " ");
				
			}
			
		}
		
				
				
	}
}
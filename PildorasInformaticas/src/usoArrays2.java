public class usoArrays2 {

	public static void main(String[] args) {
	
		int [] randomMatriz = new int[150];
		
		for (int i = 0; i < randomMatriz.length; i++) {
			
			randomMatriz[i] = (int)Math.round(Math.random()*100);
			
		}
		
		for (int numeros:randomMatriz) {
			
			System.out.print(numeros + " ");
			
		}
			
	}
}

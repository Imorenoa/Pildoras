
public class ClaseMath {

	public static void main(String[] args) {
		
		//double raiz = Math.sqrt(9);
		
		double num1 = 5.85F;
		
		int resultado = (int)Math.round(num1);
					
		/*Refundiciones int raiz = (int)Math.round(num1); El metodo Math.round, si de entrada le damos un double, nos dara de salida un long,
		no un int*/
		
		System.out.println(resultado);
		
		double resultado2 = Math.pow(num1, (double)resultado);
		
		System.out.println(resultado2);
		

	}

}


public class EjercicioString428 {

	public static void main(String[] args) {
		// 1.8.- 4.2 apartado 8
		
		String c1="Ana";
		String c2="Samuel";
		
		//comparamos las dos cadenas alfabeticamente
		int orden=c1.compareTo(c2);
		
		//la a va primero 
		if (orden<0) {
			System.out.println(c1 + " precede alfabeticamente a " + c2);
			
		}


	}

}

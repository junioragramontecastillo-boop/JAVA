package POO;

public class ejercicio1Practica {

	public static void main(String[] args) {
		// Decir por qué letra empieza un texto, luego por qué letra termina.
		
		String texto = "acabar";
		

		
		for (int i=0;i>=texto.length();i++) {
			System.out.println(texto.charAt(0));
			
		}
		
		System.out.println("El texto empieza por la letra " + texto.charAt(0));
		
		
		for (int i=0;i>=texto.length();i++) {
			System.out.println(texto.charAt(i));

		}
		
		System.out.println("El texto termina por la letra " + texto.charAt(texto.length()-1));

	}
	

}

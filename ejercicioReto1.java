package Tema2;

public class ejercicioReto1 {

	public static void main(String[] args) {
		//Ejercicio1
		
		//variables de tipo primitivo
		
		//probamos con todos los tipos que hay , cambiamos los casting y vemos qye ocurre
		
		byte octeto;
		short numeroPequeño;
		int numero;
		long numeroGrande;
		float real;
		double realGrande;
		String texto;
		char caracter;
		float combinado;
		boolean booleano;
		
		
		octeto = 6;
		System.out.println("octeto: " + octeto);
		
		numeroPequeño = (short) 300;
		System.out.println("numero pequeño: " + numeroPequeño);
		
		numero = (int) 40022;
		System.out.println("numero: " + numero);
		
		numeroGrande = (long) 9000000000L;
		System.out.println("numero Grande: " + numeroGrande);
		
		numeroGrande = (long) 7L;
		System.out.println("numero real: " + numeroGrande);
		
		realGrande = (double) 6.6;
		System.out.println("real grande: " + realGrande);
		
		combinado = (float) 6.7f;
		System.out.println("float combinado: " + combinado);
		
		caracter = (char) 'B';
		System.out.println("caracter: " + caracter);
		
		texto = (String) "texto";
		System.out.println("texto: " + texto);
		
		booleano = (boolean) true;
		System.out.println("booleano: " + booleano);
		
		/* en principio no me da ninguna error, en algunas conversiones
		 * si se pierden datos como en la de float combiando(lo llame asi para no liarme)
		 * no muestra la f al final y en otros ejemplos como en el numero 7L igual nos muestra
		 * solo el número 7
		*/
		
		//casting de numeros
		
		real = (float) 6.6;
		int numeroTruncado = (int) 6.6;
		System.out.println("Casting de 6.6 a int: " + numeroTruncado);
		
		octeto = (byte) 300;
		
		System.out.println("Casting de 300 a byte: " + octeto);
		
		
	}

}

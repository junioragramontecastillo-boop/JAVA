package Tema2;

public class definirDatos {

	public static void main(String[] args) {
		
		//variables de tipo primitivo
		
		//probamos con todos los tipos que hay , cambiamos los casting y vemos qye ocurre
		
		byte octeto;
		short numeroPequeño;
		int numero;
		long numeroGrande;
		float real;
		double realGrande;
		char caracter;
		String texto;
		boolean booleano;
		
		octeto = 5;
		System.out.println(octeto);
		octeto = (byte) 5L;
		System.out.println(octeto);
		octeto = (byte) 3.5;
		System.out.println(octeto);
		octeto = (byte) 3.5f;
		System.out.println(octeto);
		octeto = (byte) 300;
		System.out.println(octeto);
		octeto = (byte) 40000;
		System.out.println(octeto);
		octeto = (byte) 5000000000L;
		System.out.println(octeto);
		octeto = 'A';
		System.out.println(octeto);
		
		
	}

}

package Tema2;

public class ejercicio4Reto {

	public static void main(String[] args) {
		
		//Ejerccio 4 pasar de texto a numero
		
		byte octeto;
		short numeroPequeño;
		int numero;
		long numeroGrande;
		float real;
		double realGrande;
		float combinado;
		
		octeto = Byte.parseByte("6");
		
		System.out.println("octeto = " + octeto);
		
		numeroPequeño = Short.parseShort("300");
		
		System.out.println("numeroPequeño = " + numeroPequeño);
		
		numero = Integer.parseInt("40022");
		
		System.out.println("numero = " + numero);
		
		numeroGrande = Long.parseLong("9000000000");
		
		System.out.println("numeroGrande = " + numeroGrande);
		
		real = Float.parseFloat("6.7f");
		
		System.out.println("real = " + real);
		
		realGrande = Double.parseDouble("6.6");
		
		System.out.println("realGrande = " + realGrande);
		

	}

}

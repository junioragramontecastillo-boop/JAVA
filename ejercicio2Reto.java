package Tema2;

public class ejercicio2Reto {

	public static void main(String[] args) {
		
		//Ejercicio 2 
		
		byte octeto;
		short numeroPequeño;
		int numero;
		long numeroGrande;
		float real;
		double realGrande;
		char caracter;
		float combinado;

		
		
		numero = 7/2;
		System.out.println("7 / 2 a int = " + numero);
		
		caracter = (char)(7/2);
		real = 7/2 ;
		System.out.println("7 / 2 en float= " + real);
		
		numero = 100*100*100*100*100;
		System.out.println("100^5 a int = " + numero);
		
		numeroGrande = 100L*100*100*100*100;
		System.out.println("100^5 a long = " + numeroGrande);
		
		real = (float) (7.0/2);
		System.out.println("7.0 / 2 a float = " + real);
		
		
		realGrande = (double)(7/0);
		System.out.println("7 / 0 a double = " + realGrande);
		
		
		/*
		 * en el real grande me da error ya que no se puede por que se hace
		 * como si fuese division entre enteros y yo le puse double, para que funcione
		 * deberiamos de poner el 7 como double y dividirlo entre 0
		 */
		

	}

}

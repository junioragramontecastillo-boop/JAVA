package Tema2;

public class ejercicio3Reto {

	public static void main(String[] args) {
		
		//Ejercicio 3
		
		
		short numeroPequeño;
		int numero;
		long numeroGrande;

		
		numeroGrande = 900000000L;
		numero = 500;
		
		numeroGrande=numero;
		
		System.out.println(numeroGrande==numero);
		
		numero = 200;
		numeroPequeño = 300;
		numero=numeroPequeño;
		
		System.out.println(numero==numeroPequeño);
		
		System.out.println("A la inversa");
		
		numeroGrande=9000000000L;
		numero=40000;
		numeroGrande=numero;
				
		System.out.println(numero==numeroGrande);
		System.out.println(numeroPequeño==numero);
		
		

	}

}

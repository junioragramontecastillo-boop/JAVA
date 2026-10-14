package POO;

import java.util.Scanner;

public class ejercicio3Practica {

	public static void main(String[] args) {
		// Compara con otro texto para ver si son iguales sin importar mayúsculas y minúsculas
		
		
		Scanner entrada = new Scanner(System.in);
		
		String texto1="";
		String texto2="";
		
		System.out.println("Introduce el primer texto: ");
		
		texto1=entrada.nextLine();
		
		System.out.println("Introduce el segundo texto: ");
		
		texto2=entrada.nextLine();
		
		if (texto1.equalsIgnoreCase(texto2)) {
			System.out.println(texto1 + " y " + texto2 + " son textos iguales");
			
		}else {
			System.out.println(texto1 + " y " + texto2 + " son textos diferentes");
		}

	}

}

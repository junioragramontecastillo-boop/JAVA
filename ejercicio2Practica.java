package POO;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio2Practica {

	public static void main(String[] args) {
		// Determinar si contiene al menos una letra vocal
		
		String vocales = "aeiou";
		String texto="";
		int contador =0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un texto");
		
		texto = entrada.nextLine();
		
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			
			if(vocales.indexOf(letra)!=-1) { // devuelve una posicion si esta, si no esta -1
				contador++;
			}
			
		}
		
		if (contador > 0) {
			System.out.println("El texto contiene " + contador + " vocales");
		}else {
			System.out.println("Tu texto no tiene vocales ");
		}

	}

}

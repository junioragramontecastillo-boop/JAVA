package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio4 {
	
	public static boolean EsNumero(String texto) {
		
		if(texto.isEmpty()) {
			return false;
		}
		
		//si no es caracter es false si es caracter es true
		
		for(int i=0;i<texto.length();i++) {
			if(!Character.isDigit(texto.charAt(i))) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		/// A partir de un String, examina si 
		///solo contiene números y por lo tanto podría pasarse a 
		///decimal con Integer.parseInt (por pantalla solo diga 
		///si es un número correcto o no) 
		///Avanzado: mediante una función que devuelva boolean.

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena para comprobar si son números: ");
		
		String texto = entrada.nextLine();
		
		if (EsNumero(texto)) {
			
			System.out.println("Es ún numero correcto");
			
		} else {
			
			System.out.println("No es correcto tu cadena no contiene números");
		}
	}
	

		
		
	}
	

	


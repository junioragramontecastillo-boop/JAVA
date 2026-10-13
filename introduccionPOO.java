package POO;

import java.util.Iterator;
import java.util.Scanner;

public class introduccionPOO {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto1="hola";
		String texto2="hol";
		texto2=texto2 + "a";
		System.out.println(texto1);
		System.out.println(texto2);
		
		
		
		System.out.println(texto1==texto2);
		
		System.out.println(texto1.equals(texto2));
		
		System.out.println(texto1.charAt(2)); //nos pasa el caracter en el numero que le digamos
		
		System.out.println(texto1.length()); //nos pasa la cantidad de caracteres que tiene
		
		String texto;
		
		
		
		System.out.println("Introduce un texto");
		texto = entrada.nextLine();
		
		
		for (int i=0;i<texto.length();i++) {
			System.out.println(texto.charAt(i));
		}
		
		//lo mismo pero al reves
		
		for (int i=texto.length()-1;i>=0;i--) {
			System.out.println(texto.charAt(i));
			
	}
		
		String textoNormal="hola";
		String textoAlreves="";
		
		for (int i=textoAlreves.length()-1;i>=0;i--) {
			System.out.println(textoAlreves + textoNormal.charAt(i));
			i = i+1;
			}
		
		System.out.println(textoAlreves);

}
	{
		
	}
	
	{
	
		//para que nos muestre el mismo texto pero al reves letra por letra
	
	String texto1="hola";
	String texto2="";
	
	for (int i=texto1.length()-1;i>=0;i--) {
		texto1 = texto2 + texto1.charAt(i);
	}
	
	
	System.out.println(texto2);
	
	if (texto1.equals(texto2)) {
		System.out.println("Es un palíndromo");
		
	} else {
		System.out.println(texto1 + "No es un palindromo ");

	}
	
}
	
}

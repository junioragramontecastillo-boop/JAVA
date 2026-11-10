package EstructurasDeControl;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		///
		///Ir pidiendo notas al usuario y al terminar (línea vacía) 
		///saque un resumen con el número de notas introducidas, la media, 
		///la nota máxima y la mínima, el número de aprobados y el número de suspensos.
		///
		
		int cantidad=0;
		double suma=0;
		double max=0;
		double min=10;
		int aprobados=0;
		int suspensos=0;
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce nota: ");
		String linea=entrada.nextLine();
		
		while (!linea.isEmpty()) {
			int nota=Integer.parseInt(linea);
			
			if(nota < 0 || nota > 10) {
				
				System.out.println("Nota incorrecta debe de estar entre 0 y 10");
				
			} else {
			cantidad++;
			
			suma+=nota;
			
			if (nota>max) {
				max=nota;	
			}
			
			if (nota<min) {
				
				min=nota;
				
			}
			
			if (nota>=5) {
				aprobados++;				
			}else {
				suspensos++;
			}
			
			}
			
			System.out.println("Introduce una nota: ");
			
			linea=entrada.nextLine();
			
		}
		
		if (cantidad==0) {
			System.out.println("No has introducido ninguna nota");
		}else {
			System.out.println("---NOTAS---");
			System.out.println("Notas introducidas: " + cantidad);
			System.out.println("Media: " + (double) suma / cantidad);
			System.out.println("Nota máxima: " + max);
			System.out.println("Nota mínima: " + min);
			System.out.println("Suspensos: " + suspensos);
			System.out.println("Aprobados: " + aprobados);
		}
			
		}

		}
	

		
		
	
		
		
		

	



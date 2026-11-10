package EstructurasDeControl;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador=0;
		//ponemos 100 + 1 para que llegue al 100 si no es a 99
		int numero= new Random().nextInt(100) + 1;
		
		int numeroUsuario=0;
		
		while (numeroUsuario!=numero) {
			System.out.println("Introduce un número para adivinarlo: ");
			numeroUsuario=entrada.nextInt();
			contador++;
			
			if (numeroUsuario<numero) {
				System.out.println("El numero es mayor");
			}else if(numeroUsuario>numero) {
				System.out.println("El numero es menor");
				
			}
			
			
			
			
		}
		
		System.out.println("El número que había pensado era el " + numero);
		
		System.out.println("Felicidades te ha costado " + contador + " intentos");
		

	}

}

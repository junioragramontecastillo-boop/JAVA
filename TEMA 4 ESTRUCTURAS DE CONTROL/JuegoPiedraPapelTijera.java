package EstructurasDeControl;
import java.util.Random;
import java.util.Scanner;

public class JuegoPiedraPapelTijera {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// Pedimos la jugada al usuarios
		
		System.out.println("Introduce tu Jugada (Piedra, Papel, Tijera): ");
		
		String jugada = entrada.nextLine().trim();
		while(!jugada.equalsIgnoreCase("Piedra")
				&& !jugada.equalsIgnoreCase("Papel")
				&& !jugada.equalsIgnoreCase("Tijera")) {
			
			System.out.println("Jugada no válida. Introduzca Piedra, Papel, o Tijera");
			jugada = entrada.nextLine().trim();
		}
		
		//Añadí lo de las victorias para que se pueda ver
		Random random = new Random();
		int victoriasJugador=0;
		int victoriasOrdenador=0;
		int numero = random.nextInt(3);
		
		//definimos la jugada del ordenador, si es 0 1 2 le asignamos a cada numero la jugada
		String jugadaOrdenador="";
		if(numero==0) {
			jugadaOrdenador="Piedra";
		}else if(numero==1) {
			jugadaOrdenador="Papel";
		} else {
			jugadaOrdenador="Tijera";
		}
		
		System.out.println("El ordenador ha elegido: " + jugadaOrdenador);
		
		//ponemos todos los casos posibles y los comparamos 
		
		if(jugada.equalsIgnoreCase(jugadaOrdenador)) {
			System.out.println("Empate");
		} else if (jugada.equalsIgnoreCase("Piedra")) {
			if (jugadaOrdenador.equalsIgnoreCase("Tijera")) {
				System.out.println("Gana el Usuario: Piedra Gana a tijera");
				victoriasJugador++;
			}else {
				System.out.println("Gana el ordenador");
				victoriasOrdenador++;
					
				}
		} else if (jugada.equalsIgnoreCase("Papel")) {
			if (jugadaOrdenador.equalsIgnoreCase("Piedra")) {
				System.out.println("Gana el usuario: Papel Gana a Piedra");
				victoriasJugador++;
			}else {
				System.out.println("Gana el ordenador");
				victoriasOrdenador++;
			}
			
			
		} else if (jugada.equalsIgnoreCase("Tijera")){
			if(jugadaOrdenador.equalsIgnoreCase("Papel")) {
				System.out.println("Gana el usuario: Tijera gana a Papel");
				victoriasJugador++;
			}else {
				System.out.println("Gana el ordenador");
				victoriasOrdenador++;
			}
			
			
			
		}
		
		System.out.println("ESTADÍSTICAS: ");
		
		System.out.println("Victorias Ordenador: " + victoriasOrdenador);
		System.out.println("Victorias Jugador: " + victoriasJugador);
			
			
			
			
			
				
			}
			
		} 
			
		
		
		
		

		
		
		





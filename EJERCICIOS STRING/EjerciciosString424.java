
public class EjerciciosString424 {

	public static void main(String[] args) {
		// 1.5,- 4.2 apartado 4
		
		String textoVacio="";
		
		String espacios="   ";
		
		//nos da true por que esta vacio
		
		System.out.println("textoVacio.isEmpty: " + textoVacio.isEmpty());
		
		//nos da falso por que hay espacios y esta "relleno" por asi decirlo
		
		System.out.println("soloEspacios.isEmpty: " + espacios.isEmpty());
		
		//da true por que hay espacios
		System.out.println("espacios.isBlank: " + espacios.isBlank());
	}

}

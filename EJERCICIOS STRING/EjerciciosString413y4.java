
public class EjerciciosString413y4 {

	public static void main(String[] args) {
		// 1.2.- 4.1, apartados 3 y 4
		
		String entrada = "   admin_moodle   ";
		
		String entradaLimpia = entrada.trim();
		
		System.out.println("Original: " + entrada);
		System.out.println("Limpia: " + entradaLimpia + "");
		
		String textoVacio= "";
		String soloEspacios="   ";
		//nos saldra true porque está vacío
		System.out.println("textoVacio.isEmpty(): " + textoVacio.isEmpty());
		
		//nos sale false por que hay espacios y no esta vacío
		System.out.println("soloEspacios.isEmpty(): " + soloEspacios.isEmpty());
		
		//nos da true por que hay espacios con isBlank
		System.out.println("soloEspacios.isBlank(): " + soloEspacios.isBlank());

	}

}

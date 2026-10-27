
public class EjercicioString425 {

	public static void main(String[] args) {
		// 1.6.- 4.2 apartado 5
		
		//convertimos la clave en un vector de caracteres para sacarlos 1 a 1
		
		String clave="PROGRAMACION";
		
		char[] letras=clave.toCharArray();
		
		for(char c :letras) {
			System.out.println("Caracter individual: " + c);
		}

	}

}

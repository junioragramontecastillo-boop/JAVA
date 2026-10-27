
public class EjercicioString422 {

	public static void main(String[] args) {
		// 1.3.- 4.2 apartado 2
		
		String frase = "Aprender Java es genial con Java";
		
		//nos devuelve la posicion del primer Java que hay en la frase
		int primerJava=frase.indexOf("Java");
		
		//nos devuelve la posicion del ultimo
		int ultimoJava = frase.lastIndexOf("Java");
		
		int noExiste=frase.indexOf("Phyton");
		
		System.out.println("Primer Java en el indice: " + primerJava);
		System.out.println("Ultimo Java en el indice: " + ultimoJava);
		
		//nos da false por que no existe
		System.out.println("Existe phyton?: " + (noExiste!=-1));

	}

}

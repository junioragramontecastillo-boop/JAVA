
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Samuel Junior Agramonte Castillo";
		
		//2.1.- Muestra cuántos caracteres contiene la variable nombre, el primer y el último carácter (letra) en minúscula.
		
		
		int caracteres = nombre.length();
		
		System.out.println("Caracteres del nombre: " + nombre.length());
		System.out.println("Primer caracter es: " + nombre.charAt(0));
		System.out.println("Último caracter: " + nombre.charAt(nombre.length()-1));
		
		//2.2.- Muestra la posición de la primera aparición de un espacio en el texto de la variable nombre y la de última aparición.

		int primeraPosicion=nombre.indexOf(' ');
		int ultimaPosicion=nombre.lastIndexOf(' ');
		
		System.out.println("Primera posición del primer espacio: " + primeraPosicion);
		System.out.println("Última posición del último espacio: " + ultimaPosicion);
			
		
		//2.3.- Muestra la cuenta de cuántos espacios hay en el texto contenido en la variable nombre.
		
		int espacios=0;
		
		for(int i=0;i<nombre.length();i++) {
			if(nombre.charAt(i)==' ') {
				espacios++;
			}
			
			
		}
		
		System.out.println("Total de espacios: " + espacios);
		
		//2.4.- Obtén la letra anterior al primer espacio, si es una a di que es nombre de chica, si es una o de chico y en caso contrario que es neutro.
		
		if (primeraPosicion>0) {
			char letraAnterior=Character.toLowerCase(nombre.charAt(primeraPosicion-1));
			System.out.println("Letra anterior al primer espacio: " + letraAnterior);
			if (letraAnterior=='a') {
				System.out.println("El nombre es de chica");
			}else if (letraAnterior=='o') {
				System.out.println("El nombre es de chico");
				
			}else {
				System.out.println("El nombre es neutro");
			}
				
			}
		
		//2.5.- Muestra el texto que haya entre el primer y el último espacio.
		
		if (primeraPosicion!=-1 && ultimaPosicion!=-1 && primeraPosicion<ultimaPosicion) {
			String textoPrimerYUltimo=nombre.substring(primeraPosicion + 1,ultimaPosicion);
			System.out.println("Texto entre el primer y ultimo espacio: " + textoPrimerYUltimo);
			
			//2.6.-Muestra el texto que haya entre el primer y el segundo espacio
			
			//// Buscamos el segundo espacio empezando a buscar justo después del primer espacio
			/// 
			int segundaPosicion=nombre.indexOf(' ', primeraPosicion+1);
			
			if (primeraPosicion!=-1 && segundaPosicion!=-1 && primeraPosicion<segundaPosicion) {
				
				String textoEntreEspacios=nombre.substring(primeraPosicion+1,segundaPosicion);
				System.out.println("Texto entre el primer y el segundo espacio: " + textoEntreEspacios);
			}
		}
				
		}
	
	
		}
		

	
	
	
		
		
		
		
			
			
		
		
		
		
	



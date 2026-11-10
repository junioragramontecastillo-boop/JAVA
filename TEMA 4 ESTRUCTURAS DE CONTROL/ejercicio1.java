package EstructurasDeControl;

public class ejercicio1 {

	public static void main(String[] args) {
		
		///Muestre un texto en orden inverso y con cada letra (carácter) en una línea distinta o A partir de un texto, generar otro que sea al mismo 
		///pero con un espacio añadido entre cada dos letras.
		
		
		String texto1="Hola mundo";
		
		for (int i = texto1.length()-1; i >=0; i--) {
			System.out.println(texto1.charAt(i));
			
				
			}
		
		String texto2="";
		
		for(int i =0;i<texto1.length();i++) {
			
			texto2+= texto1.charAt(i) + " ";
		}
		System.out.println(texto2.trim());
			
		}

		
		
		
	}

	


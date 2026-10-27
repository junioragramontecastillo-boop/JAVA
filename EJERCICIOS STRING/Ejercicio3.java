
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto1 = "";

		String texto2 = new String(texto1);

		String texto3 = null;
		
		//en estas dos aparece 0 por que los hemos definido vacíos

		System.out.println(texto1.length() );

		System.out.println(texto2.length() );
		
		//aqui da error por que el texto esta definido null y no podemos llamar a algo que esta puesto como null
		
		
		//corregido por que el texto 3 es null y no apunta a nada por asi decirlo
		
		if (texto3!=null) {
			System.out.println(texto3.length());
		}else {
			System.out.println("Texto 3 es null no se puede calcular la longitud");
		}

	}

}

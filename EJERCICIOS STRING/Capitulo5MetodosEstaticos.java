
public class Capitulo5MetodosEstaticos {

	public static void main(String[] args) {
		// 1.9.- Código de ejemplo del capítulo 5.
		
		int numero = 2026;
		
		double precio = 49.99;
		
		boolean activo = true;
		
		String str1=String.valueOf(numero);
		String str2=String.valueOf(precio);
		String str3=String.valueOf(activo);
		
		//join une elementos debemos de indicarle lo primero que queramos que le ponga
		
		String fecha = String.join("/", "11","10","2026");
		String lista = String.join(", ", "Java","Phyton","C++");
		
		
		String informe = String.format("Producto: %s | Precio: %.2f €", "Teclado", 25.50);
		
		System.out.println(str1);
		System.out.println(str2);
		System.err.println(str3);
		System.out.println(fecha);
		System.out.println(lista);
		System.out.println(informe);

	}

}

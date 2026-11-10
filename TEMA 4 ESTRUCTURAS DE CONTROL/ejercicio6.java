package EstructurasDeControl;

public class ejercicio6 {

	public static void main(String[] args) {
		// Muestre en pantalla la tabla de multiplicar de los números del 1 al 10.
		
		int contador=0;
		
		for(int i = 0;i<=10;i++) {
			
			System.out.println("Tabla del: " + i);
			
			for (int j = 1; j <=10; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
				
			}
			
			System.out.println();
			
			
		}

	}

}

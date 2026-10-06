package Tema2;

public class ejercicio5Reto {

	public static void main(String[] args) {
		
		//Tabla AND
		
		System.out.println("-TABLA OPERACION AND-");
		
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && flase: " + (false && false));
		
		System.out.println();
		
		
		System.out.println("-TABLA OPERACION OR-");
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && flase: " + (false && false));
		
		System.out.println();
		
		System.out.println("TABLA OPERADOR TERNARIO");
		
		boolean condicion = true && false;
		
		String texto = condicion ? "verdadero" : "falso";
		System.out.println("true && false " + texto);
		
		System.out.println();
		
		System.out.println("-Tabla de NAND-");
		System.out.println("!true && !true: " + (!true && !true));
		System.out.println("!true && !false: " + (!true && !false));
		System.out.println("!false && !true: " + (!false && !true));
		System.out.println("!false && !flase: " + (!false && !false));
		
		System.out.println();
		

	}

}

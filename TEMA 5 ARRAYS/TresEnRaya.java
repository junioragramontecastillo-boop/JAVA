
public class TresEnRaya {

	public static void main(String[] args) {
		
		char [][] tablero=new char[3][3];
		
		rellenarTablero(tablero,'_');
		mostrarTablero(tablero);

	}

	private static void mostrarTablero(char[][] tablero) {
		for (int fila = 0; fila < tablero.length; fila++) {
			for(int columna=0;columna<tablero[fila].length;columna++) {
				System.out.print(tablero[fila][columna]);
			}
			
			System.out.println();
		}
		
	}

	private static void rellenarTablero(char[][] tablero, char caracter) {
		
		for (int fila = 0; fila < tablero.length; fila++) {
			for(int columna=0;columna<tablero[fila].length;columna++) {
				tablero[fila][columna]=caracter;
			}
			
			
			
		}
		
		
		
	}

}

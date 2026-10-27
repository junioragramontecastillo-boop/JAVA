
public class EjericiosString423 {

	public static void main(String[] args) {
		// 1.4.- 4.2 apartado 3
		
		String correo="alumnosamuel@gmail.com";
		
		//nos devuelve alumno , recorremos del 0 al 6
		String usuario=correo.substring(0,6);
		
		// nos devuelve la posicion 7 hasta el final
		String dominio=correo.substring(13);
		
		System.out.println("Usuario: " + usuario + "| Dominio: " + dominio);

	}

}

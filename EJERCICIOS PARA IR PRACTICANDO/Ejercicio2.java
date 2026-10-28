
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Samuel Junior";
		
		String nombreInverso="";
		
		int contador=nombre.length()-1;
		for(int i=nombre.length()-1;i>=0;i--) {
			nombreInverso=nombreInverso + nombre.charAt(contador);
			contador--;

		}
		
		System.out.println(nombreInverso);

	}

}

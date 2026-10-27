
public class EjercicioString426 {

	public static void main(String[] args) {
		// 1.7.- 4.2 apartado 6
		
		String fecha="2016-10-11";
		
		//reemplazamos los guiones de la fecha normal por barras
		
		String fechaFormato=fecha.replace('-', '/');
		
		//quitamos los digitos
		
		String soloTexto="ClaveA1234B".replaceAll("\\d", "");
		
		System.out.println("Fecha formateada: " + fechaFormato);
		System.out.println("Sin números: " + soloTexto);
		
	}

}

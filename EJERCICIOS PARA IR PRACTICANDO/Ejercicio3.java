
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto="hola mundo";
		int contador=0;
		String vocales="AEIOUaeiou";
		for(int i=0;i<texto.length();i++) {
			char letra=texto.charAt(i);
			
			if(vocales.indexOf(letra)!=-1) {
				contador++;
			}
		}
		
		if (contador>0) {
		
		System.out.println("El texto contiene " + contador + " vocales");

	}else {
		System.out.println("El texto No tiene vocales");
	}
	}

}

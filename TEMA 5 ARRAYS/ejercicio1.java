import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numeros[] = {2.3,4.5,1.0,20,19,19,19};
		
		System.out.println(suma(numeros));
		double suma=suma(numeros);
		
		System.out.println(maximo(numeros));
		double maximo=maximo(numeros);
		
		System.out.println(minimo(numeros));
		double minimo=minimo(numeros);
		
		System.out.println(buscar(numeros,19));
		System.out.println(apariciones(numeros,19));
	}
	
	
	public static double suma(double[]nums) {
		double total=0;
		for (int i = 0; i < nums.length; i++) {
			total=nums[i]+total;
			
			
		}
		
		return total;
		
		
		
		
	}
	
	public static double maximo(double[]nums) {
		double maximo=nums[0];
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]>nums[0]) {
				maximo=nums[i];
				
			}
			

			
		}
		return maximo;
		
	}
	
	public static double minimo(double[]nums) {
		double minimo=nums[0];
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]<nums[0]) {
				minimo=nums[i];
			}
		}
		
		return minimo;
	}
	
	public static int buscar(double[] numeros,double valor) {
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i]==valor) {
				return i;
				
				}			
		}
		return -1;
	}
	
	public static int apariciones(double[]numeros, double valor) {
		int contador=0;
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i]==valor) {
				contador++;

			}
			
		}
		return contador;
	}
	
	
	

}

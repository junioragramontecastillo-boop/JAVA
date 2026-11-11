

public class PiramideAsteriscos {

	public static void main(String[] args) {
		
		int base=5;
		
		for(int i=1;i<=base;i++) {
			
			for(int j=i;j<base;j++) {
				System.out.println(" ");
			}
			
			for (int k = 1; k <=(2*i-1) ; k++) {
				System.out.println("*");
				
			}
			
			System.out.println();
		}
		
	

	}

}

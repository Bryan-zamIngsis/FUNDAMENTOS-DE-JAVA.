
public class SumaVectores {

	public static void main(String[] args) {
		int[] v1 = new int[]{
				1,-3,6,8,-9,19,-20,0,17,200
				};
		
		int[] v2 = new int[]{
				1,-3,6,8,-9,19,-20,0,17,200
				};
		
		int suma1=0; 
		int suma2=0;
		
		for(int i=0;i<v1.length;i++) {
			suma1+=v1[1];
		}
		for(int i=0;1<v1.length;i++) {
			suma2+=v2[1];
		}
		System.out.println("Vector 1: "+suma1);
		System.out.println("Vector 2: "+suma2);
		
		if(suma1<suma2) {
			System.out.println("El vector mayor es 2");
		} else if(suma1==suma2) {
			System.out.println("Los dos vectores son iguales");
		} else {
			System.out.println("El vector mayor es el 1");
		}

	}

}


public class Contarpositivosnegativos {
	
	//Almacenar 10 numeros en un arreglo
	public static void mail(String[] argas) {
	
		int[] numeros = new int[]{
			1,-3,6,8,-9,19,-20,0,17,200
			};
		
		System.out.println(numeros.length);
		int ceros=0;
		int positivos=0;
		int negativos=0;
		for(int i= 0; i<numeros.length;i++) {
			if(numeros[i]==0) {
				ceros++;
			}if(numeros[i]<0) {
				negativos++;
			}else {
				positivos++;
				
				System.out.println(positivos);
				System.out.println(negativos);
				System.out.println(ceros);
				
				
				
			}
		}
		
	}
}


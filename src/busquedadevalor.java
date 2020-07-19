import java.util.Scanner;

public class busquedadevalor {

	public static void main(String[] args) {
		int numeros;
		
		System.out.println("leer numero: ");
		Scanner in = new Scanner(System.in);
		numeros = in.nextInt();
		
		int[] numero = new int[5];
		numero[0] =1;
		numero[1]= 10;
		numero[2]= 100;
		numero[3]= 1000;
		numero[4]= 10000;
		
		int posicion = -1;
		
		for(int i=0; i<numero.length; i++) {
			if(numeros == numero[i]) {
				posicion = i;
				
			}
		}
		
	
		

		
		if(posicion != -1) {
			System.out.println(" El numero fue encontrado en: " + posicion);
		}else {
			System.out.println("El numero" + numero + "no fue encontrado");
			
		}
		
	}
}
		
	

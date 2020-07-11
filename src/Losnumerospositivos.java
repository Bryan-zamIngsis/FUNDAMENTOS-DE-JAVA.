import java.util.Scanner;

public class Losnumerospositivos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=0;
		while(1<5) {
			//i++;
			System.out.println("Leer numero (" + 1 + "): ");
			int numero = in.nextInt();
			if(numero>0)
				System.out.println("Numero: " + numero);
			i++;
		}
		
		/*
		for(int i = 0; i<5; i++) {
			System.out.println("leer numero: ");
			Scanner in = new Scanner(System.in);
			int numero = in.nextInt();
			if(numero>0)
			
			System.out.println("Numero: " + numero);
		}
		*/

	}

}

import java.util.Scanner;

public class Pareimpar {
	
	public static void main(String arg[]) {
		int numero = 12;
		
		System.out.println("leer numero: ");
		Scanner in = new Scanner(System.in);
		numero = in.nextInt();
		
		
		if(numero%2==0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("EL numero " + numero + " es impar ");
		}
		String result = "" + numero;
		result = Integer.toString(numero);
		}

	}

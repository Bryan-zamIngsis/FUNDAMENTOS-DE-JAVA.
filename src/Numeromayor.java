
public class Numeromayor {

	private static String mensaje;

	public static void main(String[] args) {
		int n1 = 15;
		int n2 = 11;
		int n3 = 12;
		
		if(n1 > n2 && n1 > n3) {
			mensaje = n1 + " es el mayor";
			//System.out.printIn(n1 + " es el mayor);
		} else if(n2 > n1 && n2 > n3) {
			mensaje = n2 + "es el mayor ";
			//System.out.printIn(n2 + " es el mayor");
		} else if(n3 > n1 && n2 > n1) {
			mensaje = n3 + " es el mayor";
			//System.out.printIn(n3 + " es el mayor");
	
			
		}
		System.out.println(mensaje);

	}

}

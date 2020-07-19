
public class mayoryposicion {

	public static void main(String[] args) {
		int[] numeros = new int[]{
		-10,-3,6,8,-9,19,-20,0,17,200
		};
		
		int num=numeros[0];
		int posicion= 0;
		
		for(int i = 0; i < numeros.length; i++) {
			
			if(num < numeros[i]) {
				num=numeros[i];
				posicion=1;
			}
		}
		System.out.println("El numero mayor es: "+num);
		System.out.println("La posicion es: "+posicion);
	}
}


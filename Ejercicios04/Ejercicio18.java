public class Ejercicio18{
	public static void main(String [] args){
		System.out.println("Introduce un número que como máximo tenga 5 cifras: ");
		int n = Integer.parseInt(System.console().readLine());
		int resto = n % 10;
		int contador = 10;
		
		
		for (int i = 0; i <= 5; ++i){
			resto = n % 10;
			if (i == 1){
				n = n - resto;
			}
			n = n - resto * contador;
			contador = contador * 10;
			System.out.println("El n es" + n);
		}
		System.out.println("El primer numero es " + n);
	}
}

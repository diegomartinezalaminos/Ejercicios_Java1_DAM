public class Ejercicio09{
	public static void main(String [] args){
		System.out.println("Introduce un número: ");
		int numero = Integer.parseInt(System.console().readLine());
		int contador = 10;
		int contadorb = 1;
		int rompe = 0;
		while (rompe == 0){
			if ( numero < contador ){
				System.out.println("El numero que has introducido tiene: " + contadorb + " cifras" );
				rompe++;
			}
			contador*=10;
			contadorb++;
		}
	}
}

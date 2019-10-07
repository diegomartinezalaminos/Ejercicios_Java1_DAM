public class Ejercicio17{
	public static void main(String [] args){
		System.out.println("Introduce un número entero: ");
		int n = Integer.parseInt(System.console().readLine());
		System.out.println("El último número es: " + (n % 10));
	}
}

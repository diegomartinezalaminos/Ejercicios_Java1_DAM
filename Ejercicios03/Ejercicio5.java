public class Ejercicio5{
	public static void main(String [] args){
		System.out.println("Introduce un lado del rectangulo: ");
		int lado1 = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce un lado del rectangulo:");
		int lado2 = Integer.parseInt(System.console().readLine());
		System.out.println("El area del rectangulo es: " + (lado1 * lado2));
	}
}

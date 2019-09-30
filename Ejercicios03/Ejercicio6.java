public class Ejercicio6{
	public static void main(String [] args){
		System.out.println("Introduce la base del triangulo: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce la altura del triangulo:");
		int altura = Integer.parseInt(System.console().readLine());
		System.out.println("El area del triangulo es: " + (base * altura)/2);
	}
}

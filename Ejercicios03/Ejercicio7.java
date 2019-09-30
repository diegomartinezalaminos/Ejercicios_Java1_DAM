public class Ejercicio7{
	public static void main(String [] args){
		System.out.println("Introduce la Base: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.println("La factura total es: " + (base + (base * 0.21)));
	}
}

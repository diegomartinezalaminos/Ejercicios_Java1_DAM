public class Ejercicio1{	
	public static void main(String [] args){
		System.out.println("Escribe un numero: ");
		int x = Integer.parseInt(System.console().readLine());
		System.out.println("Escribe un numero: ");
		int y = Integer.parseInt(System.console().readLine());
		System.out.println(x + " * " + y + " = " + (x * y));
	}
}

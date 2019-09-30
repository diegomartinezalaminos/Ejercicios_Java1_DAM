public class Ejercicio2{
	public static void main(String [] args){
		System.out.println("Escribe un numero en €: ");
		int euros = Integer.parseInt(System.console().readLine());
		System.out.println( euros + " € son " + (euros * 166.386) + " pesetas ");
	}
		
}

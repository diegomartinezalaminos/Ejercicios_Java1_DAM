public class Ejercicio11{
	public static void main(String [] args){
		System.out.println("Introduce una hora: ");
		int hora = Integer.parseInt(System.console().readLine());
		int medianoche = 12 * 3600;
		int segundos = hora *3600;
		System.out.println("Quedan " + (medianoche - segundos) + " segundos para media noche");
	}
}

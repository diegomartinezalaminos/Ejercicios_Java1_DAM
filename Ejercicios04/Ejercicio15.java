public class Ejercicio15{
	public static void main(String [] args){
		System.out.println("Introduce un caracter: ");
		String simbolo = System.console().readLine();
		System.out.println("a) Izquierda b) Derecha c) Arriba d) Abajo");
		String eleccion = System.console().readLine();
		switch(eleccion){
			case "a":
				System.out.println("  *");
				System.out.println(" **");
				System.out.println("*" + simbolo + "*");
				System.out.println(" **");
				System.out.println("  *");
				break;
			case "b":
				System.out.println("*");
				System.out.println("**");
				System.out.println("*" + simbolo + "*");
				System.out.println("**");
				System.out.println("*");
				break;
			case "c":
				System.out.println("   *");
				System.out.println("  **");
				System.out.println(" *" + simbolo + "**");
				System.out.println("******");
				break;
			case "d":
				System.out.println("*****");
				System.out.println(" *" + simbolo + "*" );
				System.out.println("  *  ");
				break;
			default:
				System.out.println("Tienes que introducir unas de las letras del menú");
				
		}
		 
	}
}

public class Ejercicio7{
	public static void main( String [] args){
		System.out.println("Este programa calcula la media de 3 notas");
		System.out.println("Introduce la nota a: ");
		double Na = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce la nota b: ");
		double Nb = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce la nota c: ");
		double Nc = Double.parseDouble(System.console().readLine());
		System.out.println("La media de todas las notas es: " + (Na + Nb + Nc) / 3);
	}
}

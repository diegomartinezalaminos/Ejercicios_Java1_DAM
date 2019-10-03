public class Ejercicio6{
	public static void main( String [] args){
		System.out.println("Calcula el tiempo que tarda en caer un objeto dependiendo de la altura (h)");
		System.out.println("Introduzca la altura en metros: ");
		double g = 9.81;
		double h = Double.parseDouble(System.console().readLine());
		if (h >= 0){
			double t = Math.sqrt(2 * h / g);
			System.out.println(t);
		}else if (h < 0){
			System.out.println("La altura no puede ser un número negativo");
		}
	}
}

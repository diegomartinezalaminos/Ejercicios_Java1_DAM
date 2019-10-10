public class Ejercicio11{
	public static void main(String [] args){
		System.out.println("Introduce un número: ");
		double numero = Double.parseDouble(System.console().readLine());
		System.out.println("------------------------------");
		System.out.println(" ");
		System.out.printf("%-20s %-20s %-20s \n","Numero","Cuadrado","Cubo");
		for (int i = 0; i < 5; i++){
			numero++;
			System.out.printf("%-20s %-20s %-20s \n", (int)numero , (int)Math.pow(numero, 2.0), (int)Math.pow(numero, 3.0));
		}
		
	}
}

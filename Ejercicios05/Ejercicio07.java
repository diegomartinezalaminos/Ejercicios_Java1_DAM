public class Ejercicio07{
	public static void main(String [] args){
		boolean acertado = false;
		for (int x = 3; (x >= 0) && (! acertado); x--){
			System.out.println("Introduce el pin de la caja fuerte");
			int pin = Integer.parseInt(System.console().readLine());
			if (1234 == pin){
				System.out.println("Enhora buena ha puesto el pin correcto");
				acertado = true;
			}else{
				System.out.println("Ese no es el pin. Te queda " + x + " intentos.");
			}
		}
	}
}

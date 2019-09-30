import java.util.Scanner;
import static java.lang.Math. *;
public class Ejercicio9{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el radio del cono: ");
		double r = entrada.nextDouble();
		System.out.println("Introduce la altura del cono: ");
		double h = entrada.nextDouble();
		System.out.println("El volumen del cono es: " + (Math.PI * Math.pow(r,2) * h) / 3);
	}
}

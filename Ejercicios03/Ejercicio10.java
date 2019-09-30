import java.util.Scanner;
public class Ejercicio10{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número en MB: ");
		double mb = entrada.nextDouble();
		System.out.println(mb + "MB son: " + mb * 1000 + "KB");
	}
}

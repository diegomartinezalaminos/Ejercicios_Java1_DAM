public class Ejercicio08{
	public static void main(String [] args){
		System.out.println("Introduce un númro");
		int numero = Integer.parseInt(System.console().readLine());
		for (int i = 0; i <= 10; i++){
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
	}
}

public class Ejercicio12{
	public static void main(String [] args){
		System.out.println("Introduce un número de filas ");
		int filas = Integer.parseInt(System.console().readLine());
		int numero1 = 0;
		int numero2 = numero1 + 1;
		int contador = 1;
		int suma = 0;
		System.out.print(numero1 + " , " + numero2);
		
		while (contador <= filas){
			suma = numero1 + numero2;
			System.out.print(" , " + suma);
			numero1 = suma - numero1;
			numero2 = suma;
			contador++;
		}
	}
}

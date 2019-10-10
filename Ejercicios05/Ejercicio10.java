public class Ejercicio10{
	public static void main(String [] args){
		System.out.println("Introduce numeros para hacer la media. Para salir introduzca un número negativo");
		double numero = 0;
		double media = 0;
		int contador = 1;
		while (numero >= 0){
			System.out.println("Introduce un número: ");
			numero = Double.parseDouble(System.console().readLine());
			if (numero >= 0){
				if (contador == 1){
					media = numero;
				}
				media = (numero + media) / 2;
				contador++;
			}
		}
			System.out.println("La media es: " + media);
	}
}

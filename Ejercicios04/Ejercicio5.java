public class Ejercicio5{
	public static void main(String [] args){
		System.out.println("Ecuacion ax + b = 0 ");
		System.out.println("Introduce el valor de a: ");
		double a = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce el valor de b: ");
		double b = Double.parseDouble(System.console().readLine());
		if ( a > 0){
			double x = 0/a -b;
			System.out.println("X = " + x);
		}else{
			System.out.println("La ecuación no tiene resultado lógico (NaN)");
		}
	}
}

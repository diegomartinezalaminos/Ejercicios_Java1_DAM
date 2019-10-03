public class Ejercicio9{
	public static void main( String [] args){
		System.out.println("Este programa calcula el valor de x en una ecuación de 2º grado");
		System.out.println("Introduce el valor de a: ");
		double a = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce el valor de b: ");
		double b = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce el valor de c: ");
		double c = Double.parseDouble(System.console().readLine());
		
		double contRaiz = Math.pow(b, 2.0) - 4 * a * c;
		double contDivi = 2 * a;
		 
		 if ( contRaiz < 0 ){
			 System.out.println("1El resultado de la ecuación no tiene sentido (NaN)");
		 }else if ( contDivi == 0 ){
			 System.out.println("2El resultado de la ecuación no tiene sentido (NaN)");
		 }else{
			 System.out.println("Los resultados son: \n x1 = " + (-b + Math.sqrt(contRaiz) / contDivi) + "\n x2 = " + (+b + Math.sqrt(contRaiz) / contDivi));
		 }
	}
}

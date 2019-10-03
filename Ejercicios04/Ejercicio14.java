public class Ejercicio14{
	public static void main(String [] args){
		System.out.println("Introduce un número: ");
		double numero = Double.parseDouble(System.console().readLine());
		double restoprimo = numero % 2;
		double restocinco = numero % 5;
		 if (restoprimo == 0){
			 System.out.println("El número " + numero + " es primo");
		 }else{
			 System.out.println("El número " + numero + " no es primo");
		 }
		 
		 if (restocinco == 0){
			 System.out.println("El número " + numero + " es divisor de 5");
		 }else{
			 System.out.println("El número " + numero + " no es divisor de 5");
		 }
	}
}

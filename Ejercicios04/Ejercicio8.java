public class Ejercicio8{
	public static void main( String [] args){
		System.out.println("Este programa calcula la media de 3 notas");
		System.out.println("Introduce la nota a: ");
		double Na = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce la nota b: ");
		double Nb = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce la nota c: ");
		double Nc = Double.parseDouble(System.console().readLine());
		double media = (Na + Nb + Nc) / 3;
		if ( media < 5){
			System.out.println("Tienes un suspenso. Tu media es de " + media);
		}else if ( media >= 5 && media <= 6.9){
			System.out.println("Tienes un bien. Tu media es de " + media);
		}else if ( media >= 7 && media <= 8.9){
			System.out.println("Tienes un notable. Tu media es de " + media);
		}else{
			System.out.println("Tienes un sobresaliente. Tu media es de " + media);
		}
	}
}


public class Ejercicio21{
	public static void main(String [] args){
		System.out.println("Este programa calcula la media de 3 notas");
		System.out.println("Introduce la nota a: ");
		double Na = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce la nota b: ");
		double Nb = Double.parseDouble(System.console().readLine());
		double media = (Na + Nb) / 2;
		
		if ( media < 5){
			System.out.println("Cual ha sido el resultado de la recuperación");
			String recuperacion = System.console().readLine();
			if (recuperacion.equalsIgnoreCase("Apto")){
				System.out.println("Tu media es un 5");
			}else{
				System.out.println("Tu media es un " + media + " Estas suspenso");
			}
		}else if ( media >= 5 && media <= 6.9){
			System.out.println("Tienes un bien. Tu media es de " + media);
		}
	}
}

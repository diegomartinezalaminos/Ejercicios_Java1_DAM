public class Ejercicio8{
	public static void main(String [] args){
		System.out.println("¿Cuántas horas trabajas por día?");
		int horastrabajo = Integer.parseInt(System.console().readLine());
		System.out.println("Tu salario semanal es de: " + (12 * horastrabajo * 5) + "€");
	}
}

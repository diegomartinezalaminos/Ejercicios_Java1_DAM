
public class Ejercicio4{
	public static void main(String [] args){
		System.out.println("Introduce las horas trabajadas a lo largo de la semana: ");
		int horas = Integer.parseInt(System.console().readLine());
		if (horas < 41){
			System.out.println("Tu salario es de: " + horas * 12 + " € ");
		}else{
			System.out.println("Tu salario es de: " + (((horas - 40) * 16) + 480) + " € ");
		}
		
	}
}


public class Ejercicio1{
	public static void main(String [] args){
		System.out.println("Introduce un día de la semana: ");
		switch (System.console().readLine()){
			case "Lunes":
				System.out.println(" \n PRO");
				break;
			case "Martes":
				System.out.println(" \n EDD");
				break;
			case "Miercoles":
				System.out.println(" \n PRO");
				break;
			case "Jueves":
				System.out.println(" \n PRO");
				break;
			case "Viernes":
				System.out.println(" \n SINF");
				break;
			default:
				System.out.println("Tienes que introducir un de la semana sin incluir el sabado ni domingo.");
				break;
		}
	}
}

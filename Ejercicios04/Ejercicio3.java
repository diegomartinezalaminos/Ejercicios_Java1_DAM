public class Ejercicio3{
	public static void main(String [] args){
		System.out.println("Introduce un número del 1 al 7");
		switch (Integer.parseInt(System.console().readLine())){
			case 1:
				System.out.println(" \n Lunes");
				break;
			case 2:
				System.out.println(" \n Martes");
				break;
			case 3:
				System.out.println(" \n Miercoles");
				break;
			case 4:
				System.out.println(" \n Jueves");
				break;
			case 5:
				System.out.println(" \n Viernes");
				break;
			case 6:
				System.out.println(" \n Sábado");
				break;
			case 7:
				System.out.println(" \n Domingo");
			default:
				System.out.println("Tienes que introducir un nñumero del 1 al 7");
				break;
		}
	}
}

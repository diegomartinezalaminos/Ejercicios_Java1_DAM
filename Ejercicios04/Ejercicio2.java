import java.util.Scanner;
public class Ejercicio2{
	public static void main(String [] args){
		Scanner hora = new Scanner(System.in);
		System.out.println("Introduce 0 para salir del programa. Introduce una hora ");
		int contador = 0;
		while (contador == 0){
			int h = hora.nextInt();
			System.out.println("Introduce 0 para salir del programa. Introduce una hora ");
			if ( h > 5 && h < 13){
				System.out.println("Buenos dias");
			
			}else if ( h > 12 && h < 21){
				System.out.println("Buenas Tardes");
			
			}else if ( h > 20 ){
				System.out.println("Buenas noches");
			
			}else if (h == 0){
				System.out.println("Exit");
				contador++;
			}else{
				System.out.println("Tienes que escibir una hora.");
			}
		}
	}
}

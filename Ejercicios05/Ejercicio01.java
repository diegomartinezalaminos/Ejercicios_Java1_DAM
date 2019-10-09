public class Ejercicio01{
	public static void main(String [] args){
		System.out.println("Los multiplos de 5 de 0 - 100 son: ");
		System.out.println("----------------------------------------");
		for (int i = 0; i <= 100; i++){
			if ( (i % 5) == 0 ){
				System.out.println(i);
			}
		}
	}
}

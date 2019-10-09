public class Ejercicio02{
	public static void main(String [] args){
		System.out.println("Los multiplos de 5 de 0 - 100 son: ");
		System.out.println("----------------------------------------");
		int contador = 0;
		while ( contador <= 100 ){
			if ( (contador % 5) == 0 ){
				System.out.println(contador);
			}
			contador++;
		}
	}
}

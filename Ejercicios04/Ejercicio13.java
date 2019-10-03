public class Ejercicio13{
	public static void main(String [] args){
		
		System.out.println("Introduce el 1º número: ");
		double n1 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduce el 2º número: ");
		double n2 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduce el 3º número: ");
		double n3 = Double.parseDouble(System.console().readLine());
		System.out.println("..................");
		
		if (n1 < n2 && n1 < n3){
			System.out.println(n1);
			if (n2 < n3){
				System.out.println(n2);
				System.out.println(n3);
			}else{
				System.out.println(n3);
				System.out.println(n2);
			}
			
		}else if (n2 < n1 && n2 < n3){
			System.out.println(n2);
			if (n1 < n3){
				System.out.println(n1);
				System.out.println(n3);
			}else{
				System.out.println(n3);
				System.out.println(n1);
			}
			
		}else if (n3 < n1 && n3 < n2){
			System.out.println(n3);
			if (n1 < n2){
				System.out.println(n1);
				System.out.println(n2);
			}else{
				System.out.println(n2);
				System.out.println(n1);
			}
		}
	}
}

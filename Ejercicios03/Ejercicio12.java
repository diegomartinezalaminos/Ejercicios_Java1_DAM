public class Ejercicio12 {
	public static void main (String [] args) {
  
    System.out.println("Introduce la nota del primer examen");
    double notaA = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la nota que deseas sacar");
    double notaB = Double.parseDouble(System.console().readLine());
    
    System.out.print("La nota que necesitas es " + ((notaA - (0.4 * notaB)) / 0.6));
  }
}


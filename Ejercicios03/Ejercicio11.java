public class Ejercicio11{
	public static void main (String [] args) {
    System.out.println("Introduce el numero de kb que quieres convertir a mb");
    int kb = Integer.parseInt(System.console().readLine());
    System.out.println(kb + " kb son " + (kb / 1000) + "mb");
  }
}

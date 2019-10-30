import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String [] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = n.nextInt();
        System.out.println("Introduce el exponente: ");
        int exponente = n.nextInt();
        System.out.println("El resultado es: " +  (int)Math.pow(base, exponente));
    }
}

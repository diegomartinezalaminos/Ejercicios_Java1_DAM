import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String [] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double base1 = n.nextDouble();
        double base2 = base1;
        System.out.println("Introduce el exponente: ");
        int exponente = n.nextInt();
        for (int i = 1; i <= exponente; i++){
            System.out.println(base2 + " elevado a " + i + " = " + base1);
            base1 = base1 * base2;
        }
    }   
}

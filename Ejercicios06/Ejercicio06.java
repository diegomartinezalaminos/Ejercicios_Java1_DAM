
import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args) {
    int random = (int)(Math.random() * 101);
    System.out.println(random);
    Scanner n = new Scanner(System.in);
    for (int i = 5; i >= 1; i--){
      System.out.println("Introduce un número entre el 0 - 100 ");
      int numero = n.nextInt();
      if (numero < random){
        System.out.println("El numero es menor ");
      }else if (numero > random){
        System.out.println("El numero es mayor ");
      }else{
        System.out.println("Enhorabuena el numero es " + numero + " has acertado");
        i = 0;
      }
    }
  }
  
}


import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Introduce un número positivo: ");
    int numero = n.nextInt();
    if (numero < 0){
      System.out.println("El número no puede ser negativo");
    }else{
      for (int x = numero + 1; x <= 100; x++){
        numero = numero + x;
      }
      System.out.println("El resultado es: " + numero);
    }
    
  }
  
}

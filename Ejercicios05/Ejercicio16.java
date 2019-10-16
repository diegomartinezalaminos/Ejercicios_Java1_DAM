
import java.util.Scanner;
public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int numero = n.nextInt();
    int primo = 0;
    for ( int i = 1; i <= 10; i++ ){
      if (numero % i == 0){
        primo++;
      }
    }
    if (primo == 2){
      System.out.println("El número " + numero + " es un número primo");
    }else{
      System.out.println("El número " + numero + " no es un número primo");
    }
  }
  
}

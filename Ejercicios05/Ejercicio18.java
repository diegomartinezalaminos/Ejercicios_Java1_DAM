
import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el primer número: ");
    int n1 = s.nextInt();
    System.out.println("Introduce el segundo número: ");
    int n2 = s.nextInt();
    System.out.println("---------------------------------");
    if ((n1 == n2) || (n1 < 0) || (n2 < 0)){
      System.out.println("Los numero introducidos no pueden ser iguales o ser negativos");
    }else{
      if (n1 < n2){
        for (int i = n1; i <= n2; i+=7){
          System.out.println(i);
        }
      }else{
        for (int i = n2; i <= n1; i+=7){
          System.out.println(i);
        }
      }
    }
  }
  
}

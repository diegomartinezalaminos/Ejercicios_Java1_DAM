
package tema7;

import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int[] array = new int[10];
    for (int i = 9; i >= 0; i--){
      System.out.println("Introducca un número: ");
      array[i] = n.nextInt();
    }
    System.out.println("Los numeros ");
    for (int e: array){
      System.out.print(e + " , ");
    }
  }
  
}


package tema7;

import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int[] array = new int[10];
    int maximo = Integer.MIN_VALUE;
    for (int i = 0; i < 10; i++){
      System.out.println("Intoduce un número: ");
      array[i] = n.nextInt();
      if (array[i] > maximo){
        maximo = array[i];
      }
    }
    for (int e: array){
      System.out.print(e + " , ");
    }
    System.out.println("");
    System.out.println("El valor máximo es: " + maximo);
  }
  
}

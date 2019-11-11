
package tema7;

public class Ejercicio01 {

  public static void main(String[] args) {
    System.out.println("Indice: | 0  | 1  | 2 | 3 | 4 | 5 | 6  | 7 | 8 | 9   | 10 | 11 |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Valor:  | 39 | -2 |   |   | 0 |   | 14 |   | 5 | 120 |    |    |");
    
    int[] array = new int[12];
    array[0] = 39;
    array[1] = -2;
    array[4] = 0;
    array[6] = 14;
    array[8] = 5;
    array[9] = 120;
    for (int i : array) {
      System.out.print(i + " , ");
    }
  }
  
}

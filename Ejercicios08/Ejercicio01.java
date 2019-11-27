
package ejercicios08;
public class Ejercicio01 {
  public static void main(String[] args) {
    //Declaramos el array
    int num[][] = {
      {0, 30, 2, 0, 0, 5},
      {75, 0, 0, 0, 0, 0},
      {0, 0, -2, 9, 0, 11}
    };
    
    // Mostramos el array
    System.out.printf("%20s", "columna0  ");
    for (int y = 1; y < 6; y++){
      System.out.printf("%-10s","columna" + y);
    }
    System.out.println();
    for (int i = 0; i < 3; i++){
      System.out.print("Fila " + i +  ": |  ");
      for (int x = 0; x < 6; x++){
        System.out.printf("%-11s",num[i][x]);
      }
      System.out.println();
    }
  }
  
}


package tema6;

public class Ejercicio12 {

  public static void main(String[] args) throws InterruptedException {
    char y;
    int contador = 0;
    while (true){
      int x = (int)(Math.random() * 95 + 32);
      y = (char)x;
      System.out.print("\033[32m");
      System.out.print(y);
      if (contador == 80){
        Thread.sleep(50);
        System.out.print("\n");
        contador = 0;
      }
      contador++;
    }
  }
  
}

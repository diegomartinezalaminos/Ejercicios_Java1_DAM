
package tema6;
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Introduce la altura de la pecera (como mínimo 4)");
    int h = n.nextInt();
    System.out.println("Introduce el ancho de la pecera (como mínimo 4)");
    int ancho = n.nextInt();
    int aleatorio1 = (int)(Math.random() * (h - 2) + 2);
    int aleatorio2 = (int)(Math.random() * (ancho - 2) + 2);
    for (int i = 1; i <= h; i++){
      for (int x = 1; x <= ancho; x++){
        if (i == 1){
          System.out.print("* ");
        }else if (i == h){
          System.out.print("* ");
        }else if (x == 1){
          System.out.print("* ");
        }else if (x == ancho){
          System.out.print("* ");
        }else if ((aleatorio1 == i) && (aleatorio2 == x)){
          System.out.print("& ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
  }
  
}

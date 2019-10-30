
import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int h = entrada.nextInt();
    int espacios = h;
    int altura = 1;
    int x = 1;
        
    for (int i = 1; i <= h; i++){
      for (int y = 1; y < espacios; y++){
        System.out.print(" ");
      }
      espacios--;
      for (x = 1; x < altura; x++ ){
        System.out.print(x);
      }
      
      for (x = altura; x > 0; x--){
        System.out.print(x);
      }
      System.out.println("");
    }
  }
  
}

import java.util.Scanner;
public class Ejercicio69 {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Introduce la altura: ");
    int h = n.nextInt();
    int altura = h;
    int nsigno = 1;
    System.out.println("Introduce los signos: ");
    String signo = n.next();
    
    for (int i = 0; i < h; i++){
      for (int x = 1; x < altura; x++){
        System.out.print(" ");
      }
      altura--;
      // Pinta el flanco izquierdo
      for (int y = 1; y <= nsigno; y++){
        System.out.print(signo);
      }
      // Pinta la parte central
      //cuamdo i es par
      if (i % 2 == 0){
        System.out.print(signo + signo + signo + signo);
      }else{
        System.out.print("    ");
      }
      // Pinta el flaco derecho
      for (int y = 1; y <= nsigno; y++){
        System.out.print(signo);
      }
      System.out.println("");
      nsigno++;
    }
  }
  
}

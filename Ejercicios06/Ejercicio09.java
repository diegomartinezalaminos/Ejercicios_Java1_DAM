
public class Ejercicio09 {
  public static void main(String[] args) {
    int contador = 0;
    boolean rompe = true;
    while (rompe){
      int random = (int)(Math.random() * 101);
      if (random % 2 == 0){
        System.out.print(random + " - ");
        contador++;
        if (random == 24){
          rompe = false;
        }
      }
    }
  }
  
}

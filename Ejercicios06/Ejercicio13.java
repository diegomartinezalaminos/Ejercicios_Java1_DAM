
package tema6;
public class Ejercicio13 {
  public static void main(String[] args) {
    boolean rompe = true;
    while (rompe){
      int random1 = (int)(Math.random() * 6 + 1);
      int random2 = (int)(Math.random() * 6 + 1);
      System.out.println("Dado 1");
      System.out.println("------------------");
      switch (random1){
        case 1:
          System.out.println("⚀");
          System.out.println("---------------");
          break;
        case 2:
          System.out.println("⚁");
          System.out.println("---------------");
          break;
        case 3:
          System.out.println("⚂");
          System.out.println("---------------");
          break;
        case 4:
          System.out.println("⚃");
          System.out.println("---------------");
          break;
        case 5:
          System.out.println("⚄");
          System.out.println("---------------");
          break;
        case 6:
          System.out.println("⚅");
          break;
      }
      System.out.println("Dado 2");
      System.out.println("----------------------");
      switch (random2){
        case 1:
          System.out.println("⚀");
          System.out.println("---------------");
          break;
        case 2:
          System.out.println("⚁");
          System.out.println("---------------");
          break;
        case 3:
          System.out.println("⚂");
          System.out.println("---------------");
          break;
        case 4:
          System.out.println("⚃");
          System.out.println("---------------");
          break;
        case 5:
          System.out.println("⚄");
          System.out.println("---------------");
          break;
        case 6:
          System.out.println("⚅");
          System.out.println("---------------");
          break;
      }
      if (random1 == random2){
        System.out.println("El número de los dos dados cuinciden");
        rompe = false;
      }
    }
  }
  
}

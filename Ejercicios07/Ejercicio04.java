
package tema7;

public class Ejercicio04 {

  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    for (int i = 0; i < 20; i++){
      int random = (int)(Math.random() * 101);
      numero[i] = random;
      cuadrado[i] = (int)(Math.pow(random, 2));
      cubo[i] = (int)(Math.pow(random, 3));
    }
    System.out.println("Mostrando array aleatorio");
    for (int w: numero){
      System.out.print(w + " , ");
    }
    System.out.println("");
    System.out.println("Mostrando array al cuadrado");
    for (int y: cuadrado){
      System.out.print(y + " , ");
    }
    System.out.println("");
    System.out.println("Mostrando array al cubo");
    for (int z: cubo){
      System.out.print(z + " , ");
    }
  }
  
}


package tema6;

public class Ejercicio19 {

  public static void main(String[] args) {
    int maximo = -101;
    int maximopares = -101;
    int minimoimpar = 101;
    int suma = 0;
    for (int i = 1; i <= 50; i++){
      int random = (int)(Math.random() * 201 - 100);
      System.out.print(random + " , ");
      if (random > maximo){
        maximo = random;
      }
      if (((random % 2) == 0) && (random > maximopares)){
        maximopares = random;
      }
      if (((random % 2) != 0) && (random < minimoimpar)){
        minimoimpar = random;
      }
      suma = suma + random;
    }
    System.out.println("");
    System.out.println("La media de los números es: " + (suma / 50));
    System.out.println("El número par máximo es: " + maximopares);
    System.out.println("El número impar mínimo es: " + minimoimpar);
  }
  
}

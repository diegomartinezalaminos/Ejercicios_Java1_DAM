
package tema6;

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int ganar = 0;
    System.out.println("Piensa en un número entre el 0 - 100");
    int aleatorio = (int)(Math.random() * 101);
    int numeroinicial = aleatorio;
    for (int i = 1; i <= 5; i++ ){
      System.out.println("El nuemro es: " + aleatorio);
      System.out.println("Si he acertado pon 1 | Si el numero es mayor pon 2 | Si el numero es menor pon 3");
      int numero = n.nextInt();
      switch (numero){
        case 1:
          System.out.println("He ganadooo !!");
          ganar = 1;
          break;
        case 2:
          boolean rompe1 = true;
          while (rompe1){
            int aleatorio2 = (int)(Math.random() * 101);
            if (aleatorio > aleatorio2){
              aleatorio = aleatorio - aleatorio2;
              rompe1 = false;
            }
          }
          break;
        case 3:
          boolean rompe2 = true;
          while (rompe2){
            int aleatorio2 = (int)(Math.random() * 101);
            if (((aleatorio + aleatorio2) <= 100) && ((aleatorio + aleatorio2) != numeroinicial)){
              aleatorio = aleatorio + aleatorio2;
              rompe2 = false;
            }
          }
          break;
        default:
          System.out.println("La opccion introducida no es válida");
          break;
      }
    }
    if (ganar == 0){
      System.out.println("He perdido :(");
    }else{
      System.out.println("He ganado :)");
    }
  }
  
}

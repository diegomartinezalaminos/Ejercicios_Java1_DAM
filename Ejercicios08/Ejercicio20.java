
package ejercicios08;

import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca el número total de reyes: ");
    int numeroTotalReyes = Integer.parseInt(entrada.nextLine());
    System.out.println("Vaya introduciendo los nombres de los reyes: ");
    String[] nombreDeReyes = new String[numeroTotalReyes];
    System.out.println("");
    
    for (int i = 0; i < numeroTotalReyes;i++){
      nombreDeReyes[i] = entrada.nextLine();
    }
    for (int i = 0; i < numeroTotalReyes;i++){
      int numeroDeRey = 1;
      for (int j = 0; j < i; j++){
        if (nombreDeReyes[i].equals(nombreDeReyes[j])){
          numeroDeRey++;
        }
      }
      System.out.println(nombreDeReyes[i] + " " + numeroDeRey + "º");
    }
  }
  
}

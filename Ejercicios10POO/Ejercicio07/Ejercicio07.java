
package ejercicios10_poo.ejercicio07;
import java.util.Scanner;
public class Ejercicio07 {

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    Zona entrada1 = new Zona(1000);
    //Menu
    int elige = 0;
    while(elige != 3){
      System.out.println("1. Mostrar número de entradas: ");
      System.out.println("2. Vender entradas: ");
      System.out.println("3. Salir: ");
      elige = Integer.parseInt(entrada.next());
      switch(elige){
        case 1:
          System.out.println("Quedan " + entrada1.getEntradasPorVender() + " entradas");
          break;
        case 2:
          boolean rompe = true;
          while (rompe){
            int n = Integer.parseInt(entrada.next());
            if (entrada1.getEntradasPorVender() < n){
              System.out.println("No hay tantas entradas disponibles para vender.");
            }else{
              System.out.println("Vendiddododod");
              rompe = false;
            }
          }
          break;
        case 3:
          break;
        default:
          System.out.println("Se tiene que introducir uno de los siguientes números (1,2,3)");
          break;
      }
    }
  }
  
}

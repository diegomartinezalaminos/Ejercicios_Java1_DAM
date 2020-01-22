
package ejercicios10_poo.ejercicio07;
import java.util.Scanner;
public class Ejercicio07 {

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    Zona entrada1 = new Zona(1000);
    Zona entrada2 = new Zona(200);
    Zona entrada3 = new Zona(25);
    //Menu
    int elige = 0;
    while(elige != 3){
      System.out.println("1. Mostrar número de entradas: ");
      System.out.println("2. Vender entradas: ");
      System.out.println("3. Salir: ");
      System.out.println("");
      elige = Integer.parseInt(entrada.next());
      switch(elige){
        case 1:
          System.out.println("Entradas comunes --> " + entrada1.getEntradasPorVender());
          System.out.println("Entradas especiales --> " + entrada2.getEntradasPorVender());
          System.out.println("Entradas vip --> " + entrada3.getEntradasPorVender());
          System.out.println("");
          break;
        case 2:
          boolean empieza = true;
          while(empieza){
            System.out.println("1. Entrada comun:");
            System.out.println("2. Entrada especial:");
            System.out.println("3. Entrada vip:");
            System.out.println("4. Salir:");
            int opcion = Integer.parseInt(entrada.next());
            switch(opcion){
              case 1:
                System.out.println("");
                System.out.println("Numero de entradas a comprar: ");
                entrada1.vender(Integer.parseInt(entrada.next()));
                System.out.println("");
                break;
              case 2:
                System.out.println("");
                System.out.println("Numero de entradas a comprar: ");
                entrada2.vender(Integer.parseInt(entrada.next()));
                System.out.println("");
                break;
              case 3:
                System.out.println("");
                System.out.println("Numero de entradas a comprar: ");
                entrada3.vender(Integer.parseInt(entrada.next()));
                System.out.println("");
                break;
              case 4:
                System.out.println("Saliendo......");
                empieza = false;
                System.out.println("");
              default:
                System.out.println("Tienes que intruducir uno de los siguientes valores; 1,2,3,4");
                break;
            }
          }
          break;
        case 3:
          System.out.println("Saliendo....");
          break;
        default:
          System.out.println("Se tiene que introducir uno de los siguientes números (1,2,3)");
          break;
      }
    }
  }
  
}


import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean condicion = true;
    int contador = 0;
    double mediaimpar = 0;
    double numeromayor = 0;
    double numeroscanner = 0;
    while (condicion){
      
      System.out.println("Introduce un número: ");
      numeroscanner = s.nextInt();
      
      if (numeroscanner < 0){
        System.out.println("Se a introducido un número negativo. Saliendo...");
        condicion = false;
      }
      
      contador++;
      
      if (numeroscanner % 2 == 0){
        if (numeroscanner > numeromayor){
          numeromayor = numeroscanner;
        }
      }else{
        if (contador == 1){
          mediaimpar = numeroscanner;
        }else{
          mediaimpar = mediaimpar + numeroscanner;
        }
      }
    }
    System.out.println("----------------------------");
    System.out.println("El numero mayor de los pares es: " + numeromayor);
    System.out.println("Se han introducido " + (contador - 1)  + " números");
    if (mediaimpar > 0){
      System.out.println("La media de los impares es: " + mediaimpar / (contador - 1));
    }else{
      System.out.println("Nos se han introducido numeros impares. Por lo tanto no hay media");
    }
  }
}

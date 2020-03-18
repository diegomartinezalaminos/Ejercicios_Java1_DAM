
package tema11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio02 {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String linea;
      do {
        linea = br.readLine();
        if (linea != null){
          System.out.println(linea);
        }
      } while (linea != null);
      br.close();
    } catch (IOException ioe){
      System.out.println("Ha ocurrido un error de escritura");
    }
  }
}

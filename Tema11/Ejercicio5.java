
package tema11;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FilterWriter;
import java.util.ArrayList;
import static java.util.Collections.sort;

public class Ejercicio5 {

  public static void main(String[] args) {
    int cont = 0;
    for (String arg : args) {
      cont++;
    }
    if (cont != 2) {
      System.out.println("No se ha intruducido por parametro los dos ficheros");
      System.exit(1);
    } else {
      File fichero1 = new File(args[0]);
      if (fichero1.exists() != true) {
        System.out.println("Error, el fichero introducidos no existen");
        System.exit(2);
      }
    }
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
      String linea = "";
      while (linea != null){
        linea = br.readLine();
        if (linea != null){
          
        }
      }
      
        
    } catch (IOException ioe) {
      System.out.println("Ha ocurrido un error de escritura");     
    }
  }
  
}

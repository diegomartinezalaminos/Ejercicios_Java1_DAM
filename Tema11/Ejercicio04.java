
package tema11;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import static java.util.Collections.sort;
//Exit 1 -- No se han introducido 2 parametros
//Exit 2 -- Los ficheros introducidos por parametro no existen

public class Ejercicio04 {

  public static void main(String[] args) {
    //Comprobaciones
    int cont = 0;
    for (String parametro : args) {
      cont++;
    }
    if (cont != 1) {
      System.out.println("No se ha intruducido por parametro los dos ficheros");
      System.exit(1);
    } else {
      File fichero1 = new File(args[0]);
      if (fichero1.exists() != true) {
        System.out.println("Error, el fichero introducidos no existen");
        System.exit(2);
      }
    }
    
    //Inicio
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String linea;
      ArrayList<String> arraylista = new ArrayList<>();
      do {
        linea = br.readLine();
        if ((linea != null) && (!"".equals(linea))) {
          arraylista.add(linea);
        }
      } while (linea != null);
      br.close();
      sort(arraylista);
      for (String palabras : arraylista) {
        bw.write(palabras);
      }
      bw.close();
    } catch (IOException ioe) {
      System.out.println("Ha ocurrido un error de escritura");
    }
    
  }
  
}

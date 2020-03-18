
package tema11;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
//Exit 1 -- No se han introducido 2 parametros
//Exit 2 -- Los ficheros introducidos por parametro no existen
public class Ejercicio03 {

  public static void main(String[] args) {
    int cont = 0;
    for (String arg : args) {
      cont++;
    }
    if (cont != 2){
      System.out.println("No se ha intruducido por parametro los dos ficheros");
      System.exit(1);
    }else{
      File fichero1 = new File(args[0]);
      File fichero2 = new File(args[0]);
      if ((fichero1.exists() != true) || (fichero2.exists() != true)){
        System.out.println("Error, los ficheros introducidos no existen");
        System.exit(2);
      }
    }
    try{
      BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter bw = new BufferedWriter(new FileWriter("resultado.txt"));
      String linea1 = "";
      String linea2 = "";
      while ((linea1 != null) || (linea2 != null)){
        linea1 = br1.readLine();
        linea2 = br2.readLine();
        if (linea1 != null){
          bw.write(linea1 + "\n");
        }
        if (linea2 != null){
          bw.write( linea2 + "\n");
        }
      }
    } catch (IOException ioe){
      System.out.println("Ha ocurrido un error de escritura");
    }
  }
  
}

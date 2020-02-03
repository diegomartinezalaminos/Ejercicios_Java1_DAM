
package ejercicios10_poo.ArraysPoo.Ejercicio02;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    
    //Rellenamos la lista 
    //Del 10 al 20 hay 11 posivilidades
    //El 10 es el numero mínimo
    int aleatorio = (int)(Math.random() * 11 + 10);
    for (int i = 0; i <= aleatorio; i++){
      lista.add((int)(Math.random() * 101));
    }
    
    //Calcular la suma de los numeros de la lista
    int suma = 0;
    for (int x = 0; x < lista.size(); x++){
      suma += lista.get(x);
      System.out.print(lista.get(x) +  " | ");
    }
    System.out.println("");
    //Calcula la media
    int media = suma / lista.size();
    
    //Calcula el maximo numero de la lista
    Collections.sort(lista);
    int maximo = lista.get(lista.size() - 1);
    
    //Calcula el minimo numero de la lista
    int minimo = lista.get(0);
    
    
    //Mostramos los datos
    
    System.out.println("La suma de todos los numeros es: " + suma);
    System.out.println("La media de todos los numeros es: " + media);
    System.out.println("El maximo de todos los numeros es: " + maximo);
    System.out.println("El minimo de todos los numeros es: " + minimo);
  }
  
}

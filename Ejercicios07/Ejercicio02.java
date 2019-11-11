
package tema7;

public class Ejercicio02 {

  public static void main(String[] args) {
    System.out.println("Indice: | 0 | 1 | 2 | 3 | 4 | 5 | 6  | 7 | 8 | 9 |");
    System.out.println("----------------------------------------------------");
    System.out.println("Valor:  | a | x |   |   | @ |   | '' | + | Q | 1 |");
    String[] array = new String[10];
    array[0] = "a";
    array[1] = "x";
    array[4] = "@";
    array[6] = "";
    array[7] = "+";
    array[8] = "Q";
    array[9] = "1";
    for (String i: array){
      System.out.print(i + " , ");
    }
    
  }
  
}

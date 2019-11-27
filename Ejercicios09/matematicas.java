
package funciones.matematicas;
/**
 * Funciones matemáticas
 * @author diegomartinezalaminos
 */
public class matematicas {
  
  /**
   * 
   * @param n Valor de entrada de tipo long
   * @return Devuelve el número introducid anteriormente volteado
   */
  public static long voltea(long n){
    long aux = 0;
    while (n > 0 ){
      aux = (aux * 10) + (n % 10);
      n /= 10;
    }
    return aux;
  }
  
  /**
   * 
   * @param n Valor de tipo long
   * @return Devuelve true o false dependiendo de si el número introducido es capicuo o no
   */
  public static boolean esCapicua(long n){
    return n == voltea(n);
  }
  
  /**
   * 
   * @param n Intruducimos valor n de tipo int
   * @return Devuelve true si es primo o false si no lo es
   */
  public static boolean esPrimo(int n){
    int cont = 0;
    for (int i = 1; i <= n; i++){
      if (n % i == 0){
        cont++;
      }
    }
    return cont == 2;
  }
  
  /**
   * 
   * @param n es el numero de tipo int que introducimos
   * @return Devuelve el número primo mas próximo del introducido anteriormente
   */
  public static int siguientePrimo(int n){
    boolean rompe = true;
    while (rompe){
      n++;
      if (esPrimo(n)){
        return n;
      }
    }
    return 0;
  }
  
  /**
   * 
   * @param base Se intruduce la base (variable de tipo double)
   * @param exp Se intruduce el exponente (variable de tipo double)
   * @return Se muestra el resultado de la base al exponente
   */
  public static double potencia(double base, double exp){
    return Math.pow(base, exp);
  }
  
  /**
   * 
   * @param n Se introduce un número de tipo int
   * @return Muestra el número de dígitos de ese número
   */
  public static int digitos(int n){
    return String.valueOf(n).length();
  }
  
  public static long digitoN(long n1, long p1){
    System.out.println(n1);
    n1 = voltea(n1);
    System.out.println(n1);
    long resultado = 0;
    for (int i = 0; i <= p1; i++){
      resultado = n1 % 10;
      n1 = n1 / 10;
    }
    return resultado;
  }
  
  
  
  
  
  
  
  
  //-----------------------------------------
  
  /**
   * 
   * @param n1 Un número con decimales
   * @param n2  Un número con decimales
   * @param n3  Un número con decimales
   * @return Devuelve la media de los 3 números introducidos
   */
  public static double media(double n1, double n2, double n3){
    return (n1 + n2 + n3) / 3;
  }
  
  /**
   * 
   * @param array El valor tiene que ser un array de tipo double
   * @return Devuelve la media de los números del array introducido
   */
  public static double media(double[] array){
    double suma = 0;
    for (double n : array) {
      suma += n;
    }
    return suma / array.length;
  }
  
  /**
   * 
   * @param array El valor tiene que ser un array de tipo double
   * @return Devuelve la media de los números del array introducido 
   */
  public static int media(int[] array){
    int suma = 0;
    for (int n : array) {
      suma += n;
    }
    return suma / array.length;
  }
  
  /**
   * 
   * @param minimo El valor mínimo del numero aleatorio. Tiene que ser un entero
   * @param maximo El valor máximo del numero aleatorio. Tiene que ser un entero
   * @return Devuelve un numero aleatorio comprendido entre los dos valores intruducidos [n1 - n2]
   */
  public static int aleatorio(int minimo, int maximo){
    return (int)(Math.random() * (maximo - minimo + 1) + minimo);
  }
  
  /**
   * 
   * @param array El valor tiene que ser una array de tipo int
   * @param n El valor que determina como se va a leer el array
   * @return Devuelve cada valor del array
   */
  public static String pintaArray(int[] array, int n){
    String resultado = "";
    for (int i = 0; i < array.length; i = i + n){
      resultado = (resultado + array[i] + " ");
    }
    return resultado;
  }
  
  /**
   * 
   * @param array
   * @return 
   */
  public static String pintaArray(int[] array){
    String resultado = "";
    for (int n : array){
    resultado = (resultado + n + " ");
  }
    return resultado;
  }
}

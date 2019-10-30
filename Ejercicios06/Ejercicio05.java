
public class Ejercicio05 {
  public static void main(String[] args) {
    int random;
    int maximo = 0;
    int minimo = 200;
    int suma = 0;
    for (int i = 1; i <= 4; i++){
      random = (int)(Math.random() * 199 + 1);
      if (random >= 100 && random <= 199){
        System.out.print(random + " - ");
        if (random > maximo){
          maximo = random;
        }
        if (random < minimo){
          minimo = random;
        }
        suma = suma + random;
      }else{
        i--;
      }
      
    }
    System.out.println("");
    System.out.println("El número mas grande es: " + maximo);
    System.out.println("El número mas pequeño es: " + minimo);
    System.out.println("La media de los números es: " + (suma / 4));
  }
  
}

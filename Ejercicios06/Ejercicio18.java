
package tema6;
public class Ejercicio18 {
  public static void main(String[] args) {
    //rojo, azul, verde, amarillo, violeta y naranja
    String color = "";
    int contador = 1;
    String coloraux = "";
    while (contador <= 3){
      switch ((int)(Math.random() * 6)){
        case 0:
          color = "rojo";
          break;
        case 1:
          color = "azul";
          break;
        case 2:
          color = "verde";
          break;
        case 3:
          color = "amarillo";
          break;
        case 4:
          color = "violeta";
          break;
        case 5:
          color = "naranja";
          break;
      }
      if (coloraux != color){
        coloraux = color;
        System.out.println(color);
        contador++;
      }
    }
  }
  
}


public class Ejercicio03 {
  public static void main(String[] args) {
    int random = (int)(Math.random() * 10 + 1);
    String letra = "";
    String palos = "";
    switch (random){
      case 1:
        letra = "AS";
        break;
      case 8:
        letra = "SOTA";
        break;
      case 9:
        letra = "CABALLO";
        break;
      case 10:
        letra = "REY";
        break;
      default:
        letra = String.valueOf(random);
        break;
    }
    switch ((int)(Math.random() * 4)){
      case 0:
        palos = "BASTOS";
        break;
      case 1:
        palos = "OROS";
        break;
      case 2:
        palos = "ESPADAS";
        break;
      case 3:
        palos = "COPAS";
        break;
    }
    System.out.println(letra + " de " + palos);
  }
  
}

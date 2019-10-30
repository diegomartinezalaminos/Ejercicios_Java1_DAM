public class Ejercicio02 {
  public static void main(String[] args) {
    int random = (int)(Math.random() * 14 + 1);
    System.out.println(random);
    String letra = "";
    String palos = "";
    switch (random){
      case 1:
        letra = "A";
        break;
      case 11:
        letra = "J";
        break;
      case 12:
        letra = "Q";
        break;
      case 13:
        letra = "K";
        break;
      default:
        letra = String.valueOf(random);
        break;
    }
    switch ((int)(Math.random() * 4)){
      case 0:
        palos = "PICAS";
        break;
      case 1:
        palos = "CORAZÓN";
        break;
      case 2:
        palos = "DIAMANTES";
        break;
      case 3:
        palos = "TRÉBOLES";
        break;
    }
    System.out.println(letra + " de " + palos);
  }
  
}

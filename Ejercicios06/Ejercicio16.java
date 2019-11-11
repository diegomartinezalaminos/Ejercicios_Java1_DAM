
package tema6;
public class Ejercicio16 {
  public static void main(String[] args) {
    //corazón, diamante, herradura, campana y limón
    String cosa = "";
    String n1 = "";
    String n2 = "";
    String n3 = "";
    int random = 0;
    for (int i = 1; i <= 3; i++){
      random = (int)(Math.random() * 5);
      switch (random){
        case 0:
          cosa = "corazón";
          System.out.print("corazón ");
          break;
        case 1:
          cosa = "diamante";
          System.out.print("diamante ");
          break;
        case 2:
          cosa = "herradura";
          System.out.print("herradura ");
          break;
        case 3:
          cosa = "campana";
          System.out.print("campana ");
          break;
        case 4:
          cosa = "limón";
          System.out.print("limón ");
          break;
      }
      switch (i){
        case 1:
          n1 = cosa;
          break;
        case 2:
          n2 = cosa;
          break;
        case 3:
          n3 = cosa;
          break;
      } 
    }
    System.out.println("");
    if ((n1 == n2) && (n1 == n3)){
      System.out.println("Enhorabuena ha ganado 10 monedas :)");
    }else if ((n1 == n2) || (n1 == n3) || (n2 == n3)){
      System.out.println("Bien ha recuperado su moneda :|");
    }else{
      System.out.println("Lo siento has perdido :(");
    }
  }
  
}

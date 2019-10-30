public class Ejercicio08 {
  public static void main(String[] args) {
    String letra2 = "";
    for (int i = 1; i <= 14;i++){
      String letra = "";
      int contador = 1;
      System.out.print(i + "." + " | ");
      while(contador <= 3){
        
        switch ((int)(Math.random() * 3)){
          case 0:
            letra = "1";
            break;
          case 1:
            letra = "2";
            break;
          case 2:
            letra = "x";
            break;
        }
        System.out.print( letra + " | ");
        contador++;
      }
      System.out.println("");
    }
    switch ((int)(Math.random() * 4)){
      case 0:
        letra2 = "1";
        break;
      case 1:
        letra2 = "2";
        break;
      case 2:
        letra2 = "x";
        break;
      case 3:
        letra2 = "m";
        break;
    }
    System.out.print(15 + "." + " | " + letra2 + " | \n");
    
  }
  
}

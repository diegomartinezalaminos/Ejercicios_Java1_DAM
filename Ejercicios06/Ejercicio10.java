
public class Ejercicio10 {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 10; i++){
      int longitud = (int)(Math.random() * 40 + 1);
      String signo = "";
      int contador = 1;
      while (contador <= longitud){
        switch ((int)(Math.random() * 6)){
          case 0:
            signo = "*";
            break;
          case 1:
            signo = "-";
            break;
          case 2:
            signo = "=";
            break;
          case 3:
            signo = ".";
            break;
          case 4:
            signo = "|";
            break;
          case 5:
            signo = "@";
            break;
        }
        System.out.print(signo);
        contador++;
      }
      System.out.println("");
    }
  }
}

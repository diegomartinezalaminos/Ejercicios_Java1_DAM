
public class Ejercicio01 {
  public static void main(String[] args) {
    int contador = 1;
    int suma = 0;
    while (contador <= 3){
      int aleatorio = (int)((Math.random() * 10) - 3);
      contador++;
      if (aleatorio >= 1){
        System.out.println(aleatorio);
        suma = suma + aleatorio;
      }else{
        contador--;
      }
    }
    System.out.println("La suma de los numeros es: " + suma);
  }
  
}


package ejercicios10_poo;

public class Ejercicio04 {

  public static void main(String[] args) {
    Fraccion fraccion1 = new Fraccion(40, 60);
    System.out.println(fraccion1.mostrar());
    fraccion1.invierte();
    System.out.println(fraccion1.mostrar());
    fraccion1.simplifica();
    System.out.println(fraccion1.mostrar());
    System.out.println(fraccion1.multiplica());
    System.out.println(fraccion1.divide());
    
  }
  
}

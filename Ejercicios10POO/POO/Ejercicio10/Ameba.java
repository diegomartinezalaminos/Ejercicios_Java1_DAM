
package ejercicios10_poo.Ejercicio10;

public class Ameba {
  
  //Variable
  private int peso;
  
  //Constructor
  public Ameba() {
    this.peso = 3;
  }
  
  //Metodos
  public void come(int pesoparticula) {
    this.peso += pesoparticula - 1;
  }
  
  public void come(Ameba x){
    this.peso += x.peso - 1;
    x.peso = 0;
  }
  
  //ToString
  @Override
  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos.";
  }
  
}

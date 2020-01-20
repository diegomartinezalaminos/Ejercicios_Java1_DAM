
package ejercicios10_poo.ejercicio6;

public class Tiempo {
  
  //Variables
  private int h;
  private int m;
  private int s;

  //Constructor
  public Tiempo(int h, int m, int s) {
    this.h = h;
    this.m = m;
    this.s = s;
  }
  
  //Metodos
  public Tiempo suma(int h,int m, int s) {
    return new Tiempo(this.h + h, this.m + m, this.s + s);
  }
  
  public Tiempo resta(int h,int m, int s) {
    if (h < this.h && m < this.m && s < this.s){
      return new Tiempo(this.h - h, this.m - m, this.s - s);
    }else{
      System.out.println("Los numeros introducidos son demasiado grandes");
      return null;
    }
  }
 
  //toString
  @Override
  public String toString() {
    boolean rompe = true;
    while (rompe){
      if (this.s > 59){
        this.m++;
        this.s = this.s - 60;
      }else if (this.m > 59){
        this.h++;
        this.m = this.m - 60;
      }else{
        rompe = false;
      }
    }
    return "Tiempo: " + this.h + "h " + this.m + "m " + this.s + "s" ;
  }
  
  
  
  
  
  
}

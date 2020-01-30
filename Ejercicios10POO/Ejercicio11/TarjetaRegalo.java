
package ejercicios10_poo.Ejercicio11;

public class TarjetaRegalo {
  
  //Variables
  private double saldo;
  private int identificador;
  
  //Constructor
  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.identificador = (int)(Math.random() * 10000 + 1);
  }
  
  //Metodos
  public TarjetaRegalo fusionaCon(TarjetaRegalo x) {
    return new TarjetaRegalo(this.saldo + x.saldo);
  }
  
  public void gasta(double n){
    if (this.saldo >= n){
      this.saldo = this.saldo - n;
    }else{
      System.out.println("No tienes suficiente saldo para gastar " + n + "€");
    }
  }
  
  //toString
  @Override
  public String toString() {
    return "Tarjeta nº " + this.identificador + " - Saldo " + String.format("%.2f", this.saldo) + "€";
  }
  
  
}

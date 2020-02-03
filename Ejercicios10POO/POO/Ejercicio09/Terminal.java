
package ejercicios10_poo.Ejercicio09;
public class Terminal{
  String numt;
  int sconversacion = 0;
  String conversacion;
  
  //Constructor
  public Terminal(String n) {
    this.numt = n;
    this.conversacion = "Nº" + this.numt + " - " + this.sconversacion + "s de conversación";
  }
  
  //Metodos
  public void llama(Terminal x,int sconversacion) {
    x.conversacion = "Nº" + x.numt + " - " + sconversacion + "s de conversación";
  }

  @Override
  public String toString() {
    return this.conversacion;
  }
}
  
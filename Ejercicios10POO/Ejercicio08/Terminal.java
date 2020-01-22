/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios10_poo.ejercicio08;

/**
 *
 * @author sueltaesteportatilahoramismo
 */
public class Terminal {
  
  //Varibles
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


package ejercicios10_poo.Ejercicio09;

import java.util.Arrays;

public class Movil extends Terminal{
  
  //Variables
  String[] tipos = {"rata", "mono", "bisonte"};
  int[] costo = {6, 12, 30};
  String tipotarifa;
  
  
  //Constructor
  public Movil(String n, String tipo) {
    super(n);
    if (Arrays.asList(tipos).contains(tipo)){
      this.tipotarifa = tipo;
    }else{
      System.out.println("El segundo parametro tiene que ser; rata,mono o bisonte");
    }
  }
  
  //Metodos
  @Override
  public void llama(Terminal x,int sconversacion){
    x.conversacion = "Nº" + x.numt + " - " + sconversacion + "s de conversación - tarificados"
    + (costo[Arrays.asList(tipos).indexOf(this.tipotarifa)] * sconversacion) + " euros";
  }
  
  
  
}

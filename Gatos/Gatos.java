/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatos;

import GatoSimple.GatoSimple;


/**
 *
 * @author sueltaesteportatilahoramismo
 */
public class Gatos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    GatoSimple gatomacho = new GatoSimple("Macho");
    GatoSimple gatohembra = new GatoSimple("Hembra");
    GatoSimple gatobebe = gatomacho.apareaCon(gatohembra);
    if (gatobebe != null){
      gatobebe.ronronea();
    }
  }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios10_poo;

/**
 *
 * @author sueltaesteportatilahoramismo
 */
public class Fraccion {
  
  //Variables
  double numerador;
  double denominador;
  
  //Constructor
  public Fraccion(double numerador, double denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  //Metodos

  public void invierte() {
    double aux;
    aux = numerador;
    numerador = denominador;
    denominador = aux;
  }

  public void simplifica(){
    while ((numerador % 2 == 0) && (denominador % 2 == 0)){
      numerador = numerador / 2;
      denominador = denominador / 2;
    }
  }
  
  public double multiplica(){
    return numerador * denominador;
  }
  
  public double divide(){
    return numerador / denominador;
  }
  
  public String mostrar(){
    return numerador + " / " + denominador;
  }
  
}

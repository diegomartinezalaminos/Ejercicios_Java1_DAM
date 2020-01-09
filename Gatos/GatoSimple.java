/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GatoSimple;

/**
 *
 * @author sueltaesteportatilahoramismo
 */
public class GatoSimple {
  
  //Variables
  String color, raza, sexo;
  int edad;
  double peso;
  
  //Metodos-----------
  
  //Constructor
  public GatoSimple( String s){
    this.sexo = s;
  }
  
  //getter
  String getSexo(){
    return this.sexo;
  }
  
  //Hacer que el gato maulle
  void maulla(){
    System.out.println("Miauuuuuuuu");
  }
  
  //Hacer que el gato ronrone
  public void ronronea(){
    System.out.println("mrrrrrrrrrr");
  }
  
  //Hacer que el gato coma (solo le gusta el pescado)
  void come(String comida){
    if (comida.equals("pescado")){
      System.out.println("Hmmm, gracias");
    } else {
      System.out.println("Lo siento yo solo como pescado");
    }
  }
  
  public GatoSimple apareaCon(GatoSimple pareja){
    if (!this.sexo.equals(pareja.getSexo())){
      System.out.println("Apareando !!!");
      if ((int)(Math.random() * 10 + 1) <= 2){
        System.out.println("!OOOO Un abortoooooo !!!");
        return null;
      }else {
        if ((int)(Math.random() * 2) == 0){
          return new GatoSimple("Hembra");
        }else{
          return new GatoSimple("Hombre");
        }
      }
      
    } else {
      return null;
    }
  }
}

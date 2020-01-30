/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios10_poo.Ejercicio12;

/**
 *
 * @author sueltaesteportatilahoramismo
 */
public class Libro extends Publicacion implements Prestable{

  public Libro(String isbn, String titulo, int anio) {
    super(isbn, titulo, anio);
  }

   
}

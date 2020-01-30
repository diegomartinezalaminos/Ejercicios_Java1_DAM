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
  
  @Override
  public void presta() {
    CambiaPresta(true);
  }

  @Override
  public void devuelve() {
    CambiaPresta(false);
  }

  @Override
  public boolean estaPrestado() {
    return GetPresta();
  }

  @Override
  public String toString() {
    if (GetPresta()){
      return super.toString() + " (prestado)";
    }else{
      return super.toString() + " (no prestado)";
    }
  }
  
  
   
}

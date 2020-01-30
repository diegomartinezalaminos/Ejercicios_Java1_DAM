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
public abstract class Publicacion {
  
  //Variables
  private String isbn;
  private String titulo;
  private int anio;
  private boolean prestado;
  private int numero;

  //Constructor
  public Publicacion(String isbn, String titulo, int anio) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anio = anio;
    this.prestado = false;
  }

  public Publicacion(String isbn, String titulo, int anio, int numero) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anio = anio;
    this.numero = numero;
  }

}

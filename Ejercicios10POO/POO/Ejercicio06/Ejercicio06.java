/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios10_poo.ejercicio6;


public class Ejercicio06 {
  public static void main(String[] args) {
    Tiempo tiempo1 = new Tiempo(3, 40, 30);
    System.out.println(tiempo1);
    Tiempo tiempo2 = tiempo1.suma(30, 30, 600);
    System.out.println(tiempo2);
    System.out.println(tiempo1);
    
  }
}

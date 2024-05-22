/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Procesador {

    private String marca;
    private double costo;
<<<<<<< HEAD
    
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerCosto (double c){
        costo = c;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public double obtenerCosto(){
=======

    public Procesador(String m, double c) {
        marca = m;
        costo = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerCosto(double c) {
        costo = c;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerCosto() {
>>>>>>> 6db33b9e4552f9279ebaab67455a22461ab0ea08
        return costo;
    }
}

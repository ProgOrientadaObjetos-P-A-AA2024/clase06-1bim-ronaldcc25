/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;

    private ArrayList<Computador> computadoras;

    public void calcularValorVenta() {

        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta += computadoras.get(i).obtenerCosto();
        }
    }

    public void estalecerComputadoras(ArrayList<Computador> c) {
        computadoras = c;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    String cadena = "VENTAS\n";

    @Override
    public String toString() {
        for (int i = 0; i < computadoras.size(); i++) {
            cadena = String.format("%s=========================================\n"
                    + "Marca del computador: %s\n"
                    + "Marca de la memoria: %s\n"
                    + "Costo de la memoria: %.2f\n"
                    + "Marca del procesador: %s\n"
                    + "Costo del procesador: %.2f\n"
                    + "Costo de la computadora: %.2f\n",
                    cadena,
                    computadoras.get(i).obtenerMarca(),
                    computadoras.get(i).obtenerMemoria().obtenerMarca(),
                    computadoras.get(i).obtenerMemoria().obtenerCosto(),
                    computadoras.get(i).obtenerProcesador().obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerCosto(),
                    computadoras.get(i).obtenerCosto());
        }
        cadena = String.format("%s=========================================\n"
                + "Valor total de venta: %.2f\n"
                + "=========================================",
                cadena, obtenerValorVenta());

        return cadena;
    }
}

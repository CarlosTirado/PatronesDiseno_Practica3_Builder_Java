/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno_practica3_builder_java.Models;

/**
 *
 * @author LENOVO
 */
public class ReciboPagoDetalle {
    private String Producto;
    private int Cantidad;
    private double Valor;

    public ReciboPagoDetalle(String Producto, int Cantidad, double Valor) {
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Valor = Valor;
    }

    
    
    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno_practica3_builder_java.Models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class ReciboPago {
     
    private String NumeroRecibo;
    private String Identificacion; 
    private String Nombre;
    private Date FechaGeneracion;
    private ArrayList<ReciboPagoDetalle> DetallesRecibo;
    private ArrayList<ReciboPagoProyeccion> ProyeccionesRecibo;
    
    public ReciboPago() { 
        DetallesRecibo = new ArrayList<>();
        ProyeccionesRecibo = new ArrayList<>();
    }

    public String getNumeroRecibo() {
        return NumeroRecibo;
    }

    public void setNumeroRecibo(String NumeroRecibo) { 
        this.NumeroRecibo = NumeroRecibo;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaGeneracion() {
        return FechaGeneracion;
    }
 
    public void setFechaGeneracion(Date FechaGeneracion) {
        this.FechaGeneracion = FechaGeneracion;
    }
    
    public void agregarDetalle(ReciboPagoDetalle detalle){
        this.DetallesRecibo.add(detalle);
    }
    
    public void agregarProyeccion(ReciboPagoProyeccion proyeccion){
        this.ProyeccionesRecibo.add(proyeccion);
    }
    
    @Override
    public String toString(){
        String Cadena = "";
        Cadena += "\nDATOS RECIBO --> ";
        Cadena += "\nNumero: " + NumeroRecibo;
        Cadena += "\nIdentificacion: " + Identificacion;
        Cadena += "\nNombre: " + Nombre;
        Cadena += "\nFecha generacion: " + FechaGeneracion;
        Cadena += "\nDETALLES: ";
        
        for (ReciboPagoDetalle detalle : DetallesRecibo){
            Cadena += "\nDETALLE: Producto: " + detalle.getProducto() + " , Cantidad: " + detalle.getCantidad() + " , Valor: " + detalle.getCantidad();
        }
        
        for (ReciboPagoProyeccion proyeccion : ProyeccionesRecibo){
            Cadena += "\nPROYECCION: Fecha: " + proyeccion.getFechaPago() + " , Valor A Pagar: " + proyeccion.getValorAPagar();
        }
        
        return Cadena;
    }
}

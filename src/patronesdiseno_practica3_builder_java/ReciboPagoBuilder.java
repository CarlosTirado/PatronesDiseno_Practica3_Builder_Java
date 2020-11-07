/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno_practica3_builder_java;

import java.util.ArrayList;
import java.util.Date;
import patronesdiseno_practica3_builder_java.Models.ReciboPago;
import patronesdiseno_practica3_builder_java.Models.ReciboPagoDetalle;
import patronesdiseno_practica3_builder_java.Models.ReciboPagoProyeccion;

/**
 *
 * @author LENOVO
 */
public class ReciboPagoBuilder {
    private String NumeroRecibo;
    private String Identificacion; 
    private String Nombre;
    private Date FechaGeneracion;
    private ArrayList<ReciboPagoDetalle> DetallesRecibo;
    private ArrayList<ReciboPagoProyeccion> ProyeccionesRecibo; 

    public ReciboPagoBuilder() { 
        DetallesRecibo = new ArrayList<>();
        ProyeccionesRecibo = new ArrayList<>();
    }

    
    
    
    public ReciboPagoBuilder setNumeroRecibo(String NumeroRecibo) {
        this.NumeroRecibo = NumeroRecibo;
        return this;
    }

    public ReciboPagoBuilder setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
        return this;
    }

    public ReciboPagoBuilder setNombre(String Nombre) {
        this.Nombre = Nombre;
        return this;
    }

    public ReciboPagoBuilder setFechaGeneracion(Date FechaGeneracion) {
        this.FechaGeneracion = FechaGeneracion;
        return this;
    }

    public ReciboPagoBuilder setDetallesRecibo(ArrayList<ReciboPagoDetalle> DetallesRecibo) {
        this.DetallesRecibo = DetallesRecibo;
        return this;
    }

    public ReciboPagoBuilder setProyeccionesRecibo(ArrayList<ReciboPagoProyeccion> ProyeccionesRecibo) {
        this.ProyeccionesRecibo = ProyeccionesRecibo;
        return this;
    }
    
    public ReciboPago build(){
        ReciboPago reciboPago = new ReciboPago();
        reciboPago.setNumeroRecibo(NumeroRecibo);
        reciboPago.setIdentificacion(Identificacion);
        reciboPago.setNombre(Nombre);
        reciboPago.setFechaGeneracion(FechaGeneracion);
        
        for(ReciboPagoDetalle detalle : DetallesRecibo){
            reciboPago.agregarDetalle(detalle);
        }
        
        for(ReciboPagoProyeccion proyeccion : ProyeccionesRecibo){
            reciboPago.agregarProyeccion(proyeccion);
        }
        
        return reciboPago;
    }

    
    
}

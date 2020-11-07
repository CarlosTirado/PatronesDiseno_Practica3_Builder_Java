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
public class PatronesDiseno_Practica3_Builder_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<ReciboPagoDetalle> detallesRecibo = new ArrayList<ReciboPagoDetalle>();
        detallesRecibo.add(new ReciboPagoDetalle("Papas Margarita", 1, 1500));
        detallesRecibo.add(new ReciboPagoDetalle("Gaseosa Manzana", 1, 1500));
        
        ArrayList<ReciboPagoProyeccion> proyecciones = new ArrayList<ReciboPagoProyeccion>();
        proyecciones.add(new ReciboPagoProyeccion(new Date(), 2000000));
        
        
        ReciboPagoBuilder builder = new ReciboPagoBuilder();
        builder
                .setNumeroRecibo("20200001")
                .setIdentificacion("11111111")
                .setNombre("Carlos Tirado") 
                .setDetallesRecibo(detallesRecibo)
                .setProyeccionesRecibo(proyecciones);
        
        ReciboPago reciboPago1 = builder.build();
        System.out.println(reciboPago1.toString());
            
        
        
    }
    
}

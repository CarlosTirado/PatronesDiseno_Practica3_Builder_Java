/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno_practica3_builder_java.Models;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class ReciboPagoProyeccion {
    private Date FechaPago; 
    private double ValorAPagar;

    public ReciboPagoProyeccion(Date FechaPago, double ValorAPagar) {
        this.FechaPago = FechaPago;
        this.ValorAPagar = ValorAPagar;
    }

    public Date getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    public double getValorAPagar() {
        return ValorAPagar;
    }

    public void setValorAPagar(double ValorAPagar) {
        this.ValorAPagar = ValorAPagar;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionmatriz.puntoventa.servicios;

import com.gestionmatriz.puntoventa.bean.RegistroVenta;
import java.util.List;

/**
 *
 * @author zholo
 */
public interface RegistroVentaService_I {
    
    public abstract List<RegistroVenta> listarRegistroVenta(String fechaInicial,String fechaFinal);
    
}

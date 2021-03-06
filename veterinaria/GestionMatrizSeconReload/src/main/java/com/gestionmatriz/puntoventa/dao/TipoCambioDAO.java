/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionmatriz.puntoventa.dao;

import com.gestionmatriz.puntoventa.bean.TipoCambio;
import java.util.List;

/**
 *
 * @author cesareo
 */
public interface TipoCambioDAO {
    
    public abstract boolean registrarTipoCambio(TipoCambio objTipoCambio);
    
    public abstract boolean verificarTipoCambio(String fechaDia);
    
    public abstract TipoCambio obtenerTipoCambio(String fechaDia);
    
    public abstract List<TipoCambio> listarTipoCambio();
}

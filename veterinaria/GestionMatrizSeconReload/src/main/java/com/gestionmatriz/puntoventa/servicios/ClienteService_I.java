/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionmatriz.puntoventa.servicios;

import com.gestionmatriz.puntoventa.bean.Cliente;
import java.util.List;

/**
 *
 * @author cesareo
 */
public interface ClienteService_I {
    
    public abstract boolean registrarCliente(Cliente objCliente);
    
    public abstract List<Cliente> listarCliente(String razonSocial, String rucdni, String direccion, String telefono);
    
    public abstract boolean modificarCliente(Cliente objCliente);
    
    public abstract boolean inactivarCliente(Cliente objCliente);
    
    
}

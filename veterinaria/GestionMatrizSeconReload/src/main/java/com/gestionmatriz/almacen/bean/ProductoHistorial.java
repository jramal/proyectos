/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionmatriz.almacen.bean;

import java.math.BigDecimal;

/**
 *
 * @author cesareo
 */
public class ProductoHistorial {
    
    private int int_idProductoHistorial;
    private int int_idProveedor;
    private int int_idProducto;
    private BigDecimal dbl_precio;
    private BigDecimal dbl_descuento;
    private BigDecimal dbl_peso;
    private String str_estado;
    private String str_usuarioCreador;
    private String str_fechaCreacion;
    private String str_usuarioModificador;
    private String str_fechaModificacion;

    public BigDecimal getDbl_descuento() {
        return dbl_descuento;
    }

    public void setDbl_descuento(BigDecimal dbl_descuento) {
        this.dbl_descuento = dbl_descuento;
    }

    public BigDecimal getDbl_precio() {
        return dbl_precio;
    }

    public void setDbl_precio(BigDecimal dbl_precio) {
        this.dbl_precio = dbl_precio;
    }

    public int getInt_idProducto() {
        return int_idProducto;
    }

    public void setInt_idProducto(int int_idProducto) {
        this.int_idProducto = int_idProducto;
    }

    public int getInt_idProductoHistorial() {
        return int_idProductoHistorial;
    }

    public void setInt_idProductoHistorial(int int_idProductoHistorial) {
        this.int_idProductoHistorial = int_idProductoHistorial;
    }

    public int getInt_idProveedor() {
        return int_idProveedor;
    }

    public void setInt_idProveedor(int int_idProveedor) {
        this.int_idProveedor = int_idProveedor;
    }

    public String getStr_estado() {
        return str_estado;
    }

    public void setStr_estado(String str_estado) {
        this.str_estado = str_estado;
    }

    public String getStr_fechaCreacion() {
        return str_fechaCreacion;
    }

    public void setStr_fechaCreacion(String str_fechaCreacion) {
        this.str_fechaCreacion = str_fechaCreacion;
    }

    public String getStr_fechaModificacion() {
        return str_fechaModificacion;
    }

    public void setStr_fechaModificacion(String str_fechaModificacion) {
        this.str_fechaModificacion = str_fechaModificacion;
    }

    public String getStr_usuarioCreador() {
        return str_usuarioCreador;
    }

    public void setStr_usuarioCreador(String str_usuarioCreador) {
        this.str_usuarioCreador = str_usuarioCreador;
    }

    public String getStr_usuarioModificador() {
        return str_usuarioModificador;
    }

    public void setStr_usuarioModificador(String str_usuarioModificador) {
        this.str_usuarioModificador = str_usuarioModificador;
    }
    
    public BigDecimal getDbl_peso() {
        return dbl_peso;
    }

    public void setDbl_peso(BigDecimal dbl_peso) {
        this.dbl_peso = dbl_peso;
    }
}

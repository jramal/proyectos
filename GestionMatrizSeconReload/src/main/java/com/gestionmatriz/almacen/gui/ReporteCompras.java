/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReporteCompras.java
 *
 * Created on 30-ago-2012, 10:45:54
 */
package com.gestionmatriz.almacen.gui;

import com.gestionmatriz.almacen.bean.MedidaRotacion;
import com.gestionmatriz.almacen.opciones.Opciones;
import com.gestionmatriz.almacen.reportes.Ireport;
import com.gestionmatriz.dao.PaqueteBusinessDelegate;
import com.gestionmatriz.principal.gui.Principal;
import com.gestionmatriz.reutilizable.util.Filtro;
import com.gestionmatriz.util.Mensaje;
import com.gestionmatriz.util.Util;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jarcon
 */
public class ReporteCompras extends javax.swing.JInternalFrame {
    
    private Principal gui;
    private Ireport ireport=new Ireport();
    private List<MedidaRotacion>listaMR=new ArrayList<>();
    
    /** Creates new form ReporteCompras */
    public ReporteCompras(Principal gui) {
        this.gui=gui;
        initComponents();
        
        cargarComboRotacion();
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        cboRotacion = new org.jdesktop.swingx.JXComboBox();
        btnReporteRotacion = new org.jdesktop.swingx.JXButton();
        dtpFechaInicial = new org.jdesktop.swingx.JXDatePicker();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        dtpFechaFinal = new org.jdesktop.swingx.JXDatePicker();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        btnTodasCompras = new org.jdesktop.swingx.JXButton();
        btnLaMadreDeLasCompras = new org.jdesktop.swingx.JXButton();
        jXPanel4 = new org.jdesktop.swingx.JXPanel();
        btnRankingProducto = new org.jdesktop.swingx.JXButton();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        dtpFechaInicial1 = new org.jdesktop.swingx.JXDatePicker();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        dtpFechaFinal1 = new org.jdesktop.swingx.JXDatePicker();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        dtpFechaInicialProveedor = new org.jdesktop.swingx.JXDatePicker();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        dtpFechaFinalProveedor = new org.jdesktop.swingx.JXDatePicker();
        btnRankingProveedor = new org.jdesktop.swingx.JXButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("REPORTE DE COMPRAS");

        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Reporte compra de productos por medida de rotación"));

        jXLabel3.setText("Rotación :");

        btnReporteRotacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/reporterotacion.png"))); // NOI18N
        btnReporteRotacion.setText("Reporte por Rotación ");
        btnReporteRotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteRotacionActionPerformed(evt);
            }
        });

        jXLabel1.setText("Fecha Inicial :");

        jXLabel2.setText("Fecha Final :");

        btnTodasCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/vistaprevia.png"))); // NOI18N
        btnTodasCompras.setText("Todas las compras por fechas");
        btnTodasCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasComprasActionPerformed(evt);
            }
        });

        btnLaMadreDeLasCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/reportefechas.png"))); // NOI18N
        btnLaMadreDeLasCompras.setText("Reporte detallado de compras por fechas");
        btnLaMadreDeLasCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaMadreDeLasComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLaMadreDeLasCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jXPanel1Layout.createSequentialGroup()
                                .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTodasCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTodasCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLaMadreDeLasCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Ranking de Productos"));

        btnRankingProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/productosmascomprados.png"))); // NOI18N
        btnRankingProducto.setText("Producto más comprado");
        btnRankingProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingProductoActionPerformed(evt);
            }
        });

        jXLabel4.setText("Fecha Inicial :");

        jXLabel5.setText("Fecha Final :");

        javax.swing.GroupLayout jXPanel4Layout = new javax.swing.GroupLayout(jXPanel4);
        jXPanel4.setLayout(jXPanel4Layout);
        jXPanel4Layout.setHorizontalGroup(
            jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dtpFechaInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dtpFechaFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRankingProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jXPanel4Layout.setVerticalGroup(
            jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRankingProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jXPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Ranking Proveedor Más Comprado"));

        jXLabel6.setText("Fecha Inicial :");

        jXLabel7.setText("Fecha Final :");

        btnRankingProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/productosmascomprados.png"))); // NOI18N
        btnRankingProveedor.setText("Proveedor más comprado");
        btnRankingProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dtpFechaInicialProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dtpFechaFinalProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRankingProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaInicialProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaFinalProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRankingProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cargarComboRotacion(){
//    listaFamilia ;
        cboRotacion.removeAllItems();
        cboRotacion.addItem(".::Seleccionar una Opción::.");
      
            listaMR = PaqueteBusinessDelegate.getMedidaRotacionService().listarMR();
            for (MedidaRotacion objMR : listaMR) {
                cboRotacion.addItem(objMR.getStr_nombreMR());
            }
        
}
    
    
private void btnTodasComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasComprasActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTETODASCOMPRAS())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial.getDate()==null||dtpFechaFinal.getDate()==null){
        Mensaje.mensaje(this, "Debe Seleccionar un rango de Fechas", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial.getDate().after(dtpFechaFinal.getDate())){
        Mensaje.mensaje(this, "La fecha inicial no puede ser mayor que de final", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    
     ireport.todasCompras(Util.getFecha("yyyy-MM-dd", dtpFechaInicial.getDate()), 
            Util.getFecha("yyyy-MM-dd", dtpFechaFinal.getDate()));
}//GEN-LAST:event_btnTodasComprasActionPerformed

private void btnLaMadreDeLasComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaMadreDeLasComprasActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTEDETALLADOCOMPRAS())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial.getDate()==null||dtpFechaFinal.getDate()==null){
        Mensaje.mensaje(this, "Debe Seleccionar un rango de Fechas", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial.getDate().after(dtpFechaFinal.getDate())){
        Mensaje.mensaje(this, "La fecha inicial no puede ser mayor que de final", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    ireport.ComprasFechas(Util.getFecha("yyyy-MM-dd", dtpFechaInicial.getDate()), 
            Util.getFecha("yyyy-MM-dd", dtpFechaFinal.getDate()));
    
}//GEN-LAST:event_btnLaMadreDeLasComprasActionPerformed

private void btnReporteRotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteRotacionActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btnReporteRotacionActionPerformed

private void btnRankingProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingProductoActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTEPRODUCTOMASCOMPRADO())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial1.getDate()==null||dtpFechaFinal1.getDate()==null){
        Mensaje.mensaje(this, "Debe Seleccionar un rango de Fechas", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial1.getDate().after(dtpFechaFinal1.getDate())){
        Mensaje.mensaje(this, "La fecha inicial no puede ser mayor que de final", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    ireport.ProductoMasComprado(Util.getFecha("yyyy-MM-dd", dtpFechaInicial1.getDate()), 
            Util.getFecha("yyyy-MM-dd", dtpFechaFinal1.getDate()));
    
}//GEN-LAST:event_btnRankingProductoActionPerformed

private void btnRankingProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingProveedorActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTEPROVEEDORMASCOMPRADO())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
}//GEN-LAST:event_btnRankingProveedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnLaMadreDeLasCompras;
    private org.jdesktop.swingx.JXButton btnRankingProducto;
    private org.jdesktop.swingx.JXButton btnRankingProveedor;
    private org.jdesktop.swingx.JXButton btnReporteRotacion;
    private org.jdesktop.swingx.JXButton btnTodasCompras;
    private org.jdesktop.swingx.JXComboBox cboRotacion;
    private org.jdesktop.swingx.JXDatePicker dtpFechaFinal;
    private org.jdesktop.swingx.JXDatePicker dtpFechaFinal1;
    private org.jdesktop.swingx.JXDatePicker dtpFechaFinalProveedor;
    private org.jdesktop.swingx.JXDatePicker dtpFechaInicial;
    private org.jdesktop.swingx.JXDatePicker dtpFechaInicial1;
    private org.jdesktop.swingx.JXDatePicker dtpFechaInicialProveedor;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        gui.getBarraEstado().cerraVentana();
    }
}

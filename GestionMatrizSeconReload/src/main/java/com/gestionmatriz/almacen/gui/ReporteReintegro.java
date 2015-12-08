/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReporteReintegro.java
 *
 * Created on 29-ago-2012, 15:23:08
 */
package com.gestionmatriz.almacen.gui;

import com.gestionmatriz.almacen.opciones.Opciones;
import com.gestionmatriz.almacen.reportes.Ireport;
import com.gestionmatriz.principal.gui.Principal;
import com.gestionmatriz.reutilizable.util.Filtro;
import com.gestionmatriz.util.Mensaje;
import com.gestionmatriz.util.Util;

/**
 *
 * @author jarcon
 */
public class ReporteReintegro extends javax.swing.JInternalFrame {
    private Principal gui;
    private Ireport ireport=new Ireport();
    
    
    /** Creates new form ReporteReintegro */
    public ReporteReintegro(Principal gui) {
        this.gui=gui;
        initComponents();
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
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        dtpFechaInicial = new org.jdesktop.swingx.JXDatePicker();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        dtpFechaFinal = new org.jdesktop.swingx.JXDatePicker();
        btnReporteGlobal = new org.jdesktop.swingx.JXButton();
        btnReporteDetallado = new org.jdesktop.swingx.JXButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("REPORTE DE REINTEGRO");

        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Reporte de Reintegro"));

        jXLabel1.setText("Fecha Inicial :");

        jXLabel2.setText("Fecha Final :");

        btnReporteGlobal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/vistaprevia.png"))); // NOI18N
        btnReporteGlobal.setText("Reporte Total Reintegro");
        btnReporteGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteGlobalActionPerformed(evt);
            }
        });

        btnReporteDetallado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/vistaprevia.png"))); // NOI18N
        btnReporteDetallado.setText("Reintegro por Orden Compra");
        btnReporteDetallado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDetalladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReporteDetallado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReporteGlobal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporteDetallado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnReporteGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteGlobalActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTE_REINTEGROGLOBAL())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial.getDate()==null||dtpFechaFinal.getDate()==null){
        Mensaje.mensaje(this, "Debe selecciona un Rango de fechas", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial.getDate().after(dtpFechaFinal.getDate())){
        Mensaje.mensaje(this, "Fecha inicial no puede ser mayor que la fecha final", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    ireport.ReintegroFechas(Util.getFecha("yyyy-MM-dd", dtpFechaInicial.getDate()),
            Util.getFecha("yyyy-MM-dd", dtpFechaFinal.getDate()) );
}//GEN-LAST:event_btnReporteGlobalActionPerformed

private void btnReporteDetalladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDetalladoActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTE_REINTEGRO())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaInicial.getDate().after(dtpFechaFinal.getDate())){
        Mensaje.mensaje(this, "Fecha inicial no puede ser mayor que la fecha final",Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    ireport.ReintegroFechas(Util.getFecha("yyyy-MM-dd", dtpFechaInicial.getDate()),
            Util.getFecha("yyyy-MM-dd", dtpFechaFinal.getDate()) );
    
}//GEN-LAST:event_btnReporteDetalladoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnReporteDetallado;
    private org.jdesktop.swingx.JXButton btnReporteGlobal;
    private org.jdesktop.swingx.JXDatePicker dtpFechaFinal;
    private org.jdesktop.swingx.JXDatePicker dtpFechaInicial;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        gui.getBarraEstado().cerraVentana();
    }
}

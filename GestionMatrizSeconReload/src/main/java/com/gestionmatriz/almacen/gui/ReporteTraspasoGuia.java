/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReporteTraspasoGuia.java
 *
 * Created on 25-ago-2012, 10:37:51
 */
package com.gestionmatriz.almacen.gui;

import com.gestionmatriz.almacen.opciones.Opciones;
import com.gestionmatriz.almacen.reportes.Ireport;
import com.gestionmatriz.dao.PaqueteBusinessDelegate;
import com.gestionmatriz.principal.gui.Principal;
import com.gestionmatriz.recursoshumanos.bean.Local;
import com.gestionmatriz.reutilizable.util.Filtro;
import com.gestionmatriz.util.Mensaje;
import com.gestionmatriz.util.Util;
import java.util.List;

/**
 *
 * @author jarcon
 */
public class ReporteTraspasoGuia extends javax.swing.JInternalFrame {

    private List<Local>listaLocal;
    private Principal gui;
    private Ireport ireport=new Ireport();
    
    /** Creates new form ReporteTraspasoGuia */
    public ReporteTraspasoGuia(Principal gui) {
        this.gui=gui;
        initComponents();
        cargarComboLocal();
    }

    
    public void cargarComboLocal(){
    
        cboLocal.removeAllItems();
        cboLocal.addItem(".::Seleccionar Local::.");
        
//        listaLocal = new ArrayList<>();
        listaLocal = PaqueteBusinessDelegate.getContratoService().buscarLocal(gui.getEmpresa().getInt_idEmpresa());

        for (Local local : listaLocal) {
            cboLocal.addItem(local.getStr_direccion());
        }
    
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
        cboLocal = new org.jdesktop.swingx.JXComboBox();
        btnTaspasosLocalFecha = new org.jdesktop.swingx.JXButton();
        dtpFechaInicial = new org.jdesktop.swingx.JXDatePicker();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        dtpFechaFinal = new org.jdesktop.swingx.JXDatePicker();
        btnTraspasosFechas = new org.jdesktop.swingx.JXButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        setClosable(true);
        setIconifiable(true);
        setTitle("REPORTE DE TRASPASOS Y GUIAS ");

        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Traspasos por local en un rango de fechas"));

        jXLabel1.setText("Local :");

        btnTaspasosLocalFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/reportelocalfecha.png"))); // NOI18N
        btnTaspasosLocalFecha.setText("Reporte de traspasos por Local y fechas");
        btnTaspasosLocalFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaspasosLocalFechaActionPerformed(evt);
            }
        });

        jXLabel2.setText("Fecha Inicia :");

        jXLabel3.setText("Fecha Final :");

        btnTraspasosFechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/reportefechas.png"))); // NOI18N
        btnTraspasosFechas.setText("Todos los traspasos por fechas");
        btnTraspasosFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraspasosFechasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(cboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaspasosLocalFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTraspasosFechas, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaspasosLocalFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraspasosFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnTaspasosLocalFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaspasosLocalFechaActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTE_TRASPASOYGUIAXLOCAL())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(cboLocal.getSelectedIndex()<=0){
        Mensaje.mensaje(this, "Debe seleccionar un local", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaFinal.getDate()==null|| dtpFechaInicial.getDate()==null){
        Mensaje.mensaje(this, "Debe elegir un rango de fechas", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    String nomLocal=listaLocal.get(cboLocal.getSelectedIndex()-1).getStr_nombre();
//    System.out.println("Local---:"+listaLocal.get(cboLocal.getSelectedIndex()-1).getStr_nombre());
    
    String fchInical=Util.getFecha("yyyy-MM-dd", dtpFechaInicial.getDate());
    String fchFinal=Util.getFecha("yyyy-MM-dd", dtpFechaFinal.getDate());
    
    
    ireport.traspasoInterno(nomLocal, fchInical, fchFinal);
    
}//GEN-LAST:event_btnTaspasosLocalFechaActionPerformed

private void btnTraspasosFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraspasosFechasActionPerformed
    if (!Filtro.opcionPermitida(gui.getLstFuncionesUsuario(), Opciones.getREPORTE_TRASPASOYGUIAXFECHA())) {
        Mensaje.mensaje(this, "Opción no autorizada para su Usuario", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
    
    if(dtpFechaFinal.getDate()==null|| dtpFechaInicial.getDate()==null){
        Mensaje.mensaje(this, "Debe elegir un rango de fechas", Mensaje.TITULO_ME, Mensaje.ERROR);
        return;
    }
        
    String fchInical=Util.getFecha("yyyy-MM-dd", dtpFechaInicial.getDate());
    String fchFinal=Util.getFecha("yyyy-MM-dd", dtpFechaFinal.getDate());
    
    
    ireport.traspasoInterno("%%", fchInical, fchFinal);
}//GEN-LAST:event_btnTraspasosFechasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnTaspasosLocalFecha;
    private org.jdesktop.swingx.JXButton btnTraspasosFechas;
    private org.jdesktop.swingx.JXComboBox cboLocal;
    private org.jdesktop.swingx.JXDatePicker dtpFechaFinal;
    private org.jdesktop.swingx.JXDatePicker dtpFechaInicial;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        gui.getBarraEstado().cerraVentana();
    }
}

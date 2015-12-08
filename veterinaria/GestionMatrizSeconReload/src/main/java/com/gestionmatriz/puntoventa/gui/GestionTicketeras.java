/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionmatriz.puntoventa.gui;

import com.gestionmatriz.dao.PaqueteBusinessDelegate;
import com.gestionmatriz.principal.gui.Principal;
import com.gestionmatriz.recursoshumanos.bean.Local;
import com.gestionmatriz.util.ComboUtil;
import com.gestionmatriz.util.Mensaje;
import com.gestionmatriz.util.Util;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author pc
 */
public class GestionTicketeras extends javax.swing.JInternalFrame {

     private static final Logger log=Logger.getLogger(GestionTicketeras.class); 
    private Principal gui;
    /**
     * Creates new form GestionTicketeras
     */
    public GestionTicketeras(Principal gui) {
        
        this.gui = gui;
        initComponents();
        cargarComboLocal();
        this.setTitle("" + gui.getTitle().concat(" - ").concat(" - [Modulo: Gestion de Ticketeras]"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        cboLocal = new org.jdesktop.swingx.JXComboBox();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        txtMarca = new org.jdesktop.swingx.JXTextField();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        txtModelo = new org.jdesktop.swingx.JXTextField();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        cboBuscar = new org.jdesktop.swingx.JXButton();
        txtNumeroSerie = new org.jdesktop.swingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImpresora = new org.jdesktop.swingx.JXTable();
        btnEliminar = new org.jdesktop.swingx.JXButton();
        btnNuevo = new org.jdesktop.swingx.JXButton();
        btnModificar = new org.jdesktop.swingx.JXButton();
        btnDesactivar = new org.jdesktop.swingx.JXButton();

        setClosable(true);
        setIconifiable(true);

        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Filtro"));

        jXLabel1.setText("Local: ");

        jXLabel2.setText("Marca: ");

        jXLabel3.setText("Modelo: ");

        jXLabel4.setText("N/S: ");

        cboBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/buscar.png")));
        cboBuscar.setText("Buscar");
        cboBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblImpresora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Local", "Marca", "Modelo", "N/S", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblImpresora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblImpresoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblImpresora);
        if (tblImpresora.getColumnModel().getColumnCount() > 0) {
            tblImpresora.getColumnModel().getColumn(0).setResizable(false);
            tblImpresora.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblImpresora.getColumnModel().getColumn(1).setResizable(false);
            tblImpresora.getColumnModel().getColumn(2).setResizable(false);
            tblImpresora.getColumnModel().getColumn(3).setResizable(false);
            tblImpresora.getColumnModel().getColumn(4).setResizable(false);
            tblImpresora.getColumnModel().getColumn(5).setResizable(false);
            tblImpresora.getColumnModel().getColumn(6).setResizable(false);
        }

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/eliminar.png")));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/agregar.png")));
        btnNuevo.setText("Nueva");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/modificar.png")));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/inactivo.png")));
        btnDesactivar.setText("Desactivar");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        abrirNuevaTicketera();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cboBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_cboBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        aliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        desactivar();
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void tblImpresoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblImpresoraMouseClicked
        int indice = tblImpresora.getSelectedRow();
        if (indice>=0 && tblImpresora.getModel().getValueAt(indice, 6).equals("INACTIVO")){
            btnDesactivar.setText("ACTIVAR");
        }else{
            btnDesactivar.setText("DESACTIVAR");
        }
    }//GEN-LAST:event_tblImpresoraMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnDesactivar;
    private org.jdesktop.swingx.JXButton btnEliminar;
    private org.jdesktop.swingx.JXButton btnModificar;
    private org.jdesktop.swingx.JXButton btnNuevo;
    private org.jdesktop.swingx.JXButton cboBuscar;
    private org.jdesktop.swingx.JXComboBox cboLocal;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTable tblImpresora;
    private org.jdesktop.swingx.JXTextField txtMarca;
    private org.jdesktop.swingx.JXTextField txtModelo;
    private org.jdesktop.swingx.JXTextField txtNumeroSerie;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla(List<com.gestionmatriz.puntoventa.bean.Impresora> lista) {
        Object[] filaTabla = new Object[7];
        DefaultTableModel modelo = (DefaultTableModel) tblImpresora.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        for (com.gestionmatriz.puntoventa.bean.Impresora objImpresora : lista) {
            filaTabla[0] =  objImpresora.getInt_impresora();
            filaTabla[1] =  objImpresora.getStr_nombre();
            filaTabla[2] =  objImpresora.getObjLocal().getStr_nombre();
            filaTabla[3] =  objImpresora.getStr_marca();
            filaTabla[4] =  objImpresora.getStr_modelo();
            filaTabla[5] =  objImpresora.getStr_NumeroSerie();
            filaTabla[6] =  objImpresora.getStr_estado();
            modelo.addRow(filaTabla);
        }

        tblImpresora.setModel(modelo);
    }
    
   private void cargarComboLocal() {
        cboLocal = ComboUtil.getListaLocales(cboLocal, this.gui.getListaLocal());
    }

    private void abrirNuevaTicketera() {
        try {
            Util.hiloProgressBar(1, gui);
            Impresora frmImpresora = new Impresora(gui,Impresora.REGISTRAR,null);
            Util.hiloProgressBar(0, gui);
            frmImpresora.setVisible(true);
        } catch (Exception ex) {
            log.error("ERROR: "+ex.getMessage());
        }
    }

    private void buscar() { 
        if (!validar()){
             Mensaje.mensaje(this, "Debe seleccioar al menor un campo para la busqueda", Mensaje.TITULO_ME, Mensaje.ERROR);
             return;
        }
        int indice = cboLocal.getSelectedIndex()-1;
        com.gestionmatriz.puntoventa.bean.Impresora objImpresora = new com.gestionmatriz.puntoventa.bean.Impresora();
        if (indice != -1){
            objImpresora.setObjLocal(new Local(this.gui.getListaLocal().get(indice).getInt_idLocal()));
        }
        objImpresora.setStr_marca(txtMarca.getText().trim());
        objImpresora.setStr_modelo(txtModelo.getText().trim());
        objImpresora.setStrNumeroSerie(txtNumeroSerie.getText().trim());
        objImpresora.setStr_estado("");
        List<com.gestionmatriz.puntoventa.bean.Impresora> lstImpresoras = PaqueteBusinessDelegate.getImpresoraService().listarImpresora(objImpresora);
        if (lstImpresoras!=null && !lstImpresoras.isEmpty()){
            cargarTabla(lstImpresoras);
        }else{
           cargarTabla(lstImpresoras);
           Mensaje.mensaje(this, "No se encontraron resultados para su busqueda", Mensaje.TITULO_ME, Mensaje.ERROR); 
        }
    }
    
    private boolean validar(){
        boolean respuesta = false;
        if (cboLocal.getSelectedIndex()!=0){
            respuesta = true;
        }if (!respuesta && !txtMarca.getText().trim().equals("")){
            respuesta = true;
        }if (!respuesta && !txtModelo.getText().trim().equals("")){
             respuesta = true;
        }if (!respuesta && !txtNumeroSerie.getText().trim().equals("")){
            respuesta = true;
        }
        return respuesta;
    }

    private void aliminar() {
        int indice = tblImpresora.getSelectedRow();
        if (indice>=0){
            com.gestionmatriz.puntoventa.bean.Impresora objImprimir = new com.gestionmatriz.puntoventa.bean.Impresora();
            objImprimir.setInt_impresora((int) tblImpresora.getModel().getValueAt(indice, 0));
            objImprimir.setStr_nombre((String) tblImpresora.getModel().getValueAt(indice, 1));
            objImprimir.setStr_marca((String) tblImpresora.getModel().getValueAt(indice, 3));
            objImprimir.setStr_modelo((String) tblImpresora.getModel().getValueAt(indice, 4));
            objImprimir.setStrNumeroSerie((String) tblImpresora.getModel().getValueAt(indice, 5));
            objImprimir.setStr_estado(Util.ELIMINADO);
            objImprimir.setStr_usuarioModificador(this.gui.getBarraEstado().getUsuario());
            if (PaqueteBusinessDelegate.getImpresoraService().actualizarImpresora(objImprimir)){
                Mensaje.mensaje(this, "Se Elimino la ticketera", Mensaje.TITULO_ME, Mensaje.INFORMACION); 
                 buscar();
            }else{
                Mensaje.mensaje(this, "No Se Pudo Eliminar la ticketera", Mensaje.TITULO_ME, Mensaje.ERROR); 
            }
        }else{
             Mensaje.mensaje(this, "Debe seleccionar una ticketera", Mensaje.TITULO_ME, Mensaje.ERROR); 
        }
    }

    private void desactivar() {
        int indice = tblImpresora.getSelectedRow();
        if (indice>=0){
            com.gestionmatriz.puntoventa.bean.Impresora objImprimir = new com.gestionmatriz.puntoventa.bean.Impresora();
            objImprimir.setInt_impresora((int) tblImpresora.getModel().getValueAt(indice, 0));
            objImprimir.setStr_nombre((String) tblImpresora.getModel().getValueAt(indice, 1));
            objImprimir.setStr_marca((String) tblImpresora.getModel().getValueAt(indice, 3));
            objImprimir.setStr_modelo((String) tblImpresora.getModel().getValueAt(indice, 4));
            objImprimir.setStrNumeroSerie((String) tblImpresora.getModel().getValueAt(indice, 5));
            objImprimir.setStr_estado(
                    tblImpresora.getModel().getValueAt(indice, 6).equals(Util.ACTIVO)?Util.INACTIVO:
                            tblImpresora.getModel().getValueAt(indice, 6).equals(Util.ASIGNADO)?Util.ASIGNADO:Util.ACTIVO);
            objImprimir.setStr_usuarioModificador(this.gui.getBarraEstado().getUsuario());
            if (PaqueteBusinessDelegate.getImpresoraService().actualizarImpresora(objImprimir)){
                Mensaje.mensaje(this, "Se Desactivo la ticketera", Mensaje.TITULO_ME, Mensaje.INFORMACION); 
                 buscar();
            }else{
                Mensaje.mensaje(this, "No Se Pudo Desactivar la ticketera", Mensaje.TITULO_ME, Mensaje.ERROR); 
            }
        }else{
             Mensaje.mensaje(this, "Debe seleccionar una ticketera", Mensaje.TITULO_ME, Mensaje.ERROR); 
        }
    }

    private void actualizar() {
        try {
            int indice = tblImpresora.getSelectedRow();
            if (indice>=0 && ((String)tblImpresora.getModel().getValueAt(indice, 6)).equals("ACTIVO")){
                com.gestionmatriz.puntoventa.bean.Impresora objImprimir = new com.gestionmatriz.puntoventa.bean.Impresora();
                Local objLocal = new Local((String) tblImpresora.getModel().getValueAt(indice, 2));
                objImprimir.setObjLocal(objLocal);
                objImprimir.setInt_impresora((int) tblImpresora.getModel().getValueAt(indice, 0));
                objImprimir.setStr_nombre((String) tblImpresora.getModel().getValueAt(indice, 1));
                objImprimir.setStr_marca((String) tblImpresora.getModel().getValueAt(indice, 3));
                objImprimir.setStr_modelo((String) tblImpresora.getModel().getValueAt(indice, 4));
                objImprimir.setStrNumeroSerie((String) tblImpresora.getModel().getValueAt(indice, 5));
                objImprimir.setStr_usuarioModificador(this.gui.getBarraEstado().getUsuario());
                Util.hiloProgressBar(1, gui);
                Impresora frmImpresora = new Impresora(gui,Impresora.ACTUALIZAR,objImprimir);
                Util.hiloProgressBar(0, gui);
                frmImpresora.setVisible(true);
            }else{
                Mensaje.mensaje(this, "No se puede actualizar ticketera con estado distinto a Activo", Mensaje.TITULO_ME, Mensaje.ERROR); 
            }
            } catch (Exception ex) {
                log.error("ERROR: "+ex.getMessage());
            }
    }
}
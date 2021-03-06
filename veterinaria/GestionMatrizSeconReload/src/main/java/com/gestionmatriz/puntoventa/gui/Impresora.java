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

/**
 *
 * @author pc
 */
public class Impresora extends javax.swing.JDialog {

    private Principal gui;
    private int tipoOperacion;
    public static final int REGISTRAR = 1;
    public static final int ACTUALIZAR = 2;
    private com.gestionmatriz.puntoventa.bean.Impresora objImpresora;
    /**
     * Creates new form Impresora
     */
    public Impresora(Principal gui, int tipoOperacion,com.gestionmatriz.puntoventa.bean.Impresora objImpresora) {
        super(gui, true);
        this.gui=gui;
        initComponents();
        this.tipoOperacion = tipoOperacion;
        this.setTitle("" + gui.getTitle().concat(" - ").concat(" - [".concat(tipoOperacion==REGISTRAR?"REGISTRAR TICKETERA":"ACTUALIZAR TICKETERA").concat("]")));
        setLocationRelativeTo(null);
        cargaInicial(objImpresora);
        this.objImpresora = objImpresora;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        cboLocal = new org.jdesktop.swingx.JXComboBox();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        txtMarca = new org.jdesktop.swingx.JXTextField();
        txtModelo = new org.jdesktop.swingx.JXTextField();
        txtNumeroSerie = new org.jdesktop.swingx.JXTextField();
        btnAceptar = new org.jdesktop.swingx.JXButton();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        txtNombre = new org.jdesktop.swingx.JXTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jXLabel1.setText("Local: ");

        jXLabel2.setText("Marca: ");

        jXLabel3.setText("Modelo:");

        jXLabel4.setText("N/S: ");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/aceptar.png")));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jXLabel5.setText("Nombre: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 204, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumeroSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (this.tipoOperacion==REGISTRAR){
            registrarNuevaTicketera();
        }else{
            actualizarTicketera();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnAceptar;
    private org.jdesktop.swingx.JXComboBox cboLocal;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXTextField txtMarca;
    private org.jdesktop.swingx.JXTextField txtModelo;
    private org.jdesktop.swingx.JXTextField txtNombre;
    private org.jdesktop.swingx.JXTextField txtNumeroSerie;
    // End of variables declaration//GEN-END:variables

    private void cargaInicial(com.gestionmatriz.puntoventa.bean.Impresora objImpresora) {
        this.cboLocal = ComboUtil.getListaLocales(cboLocal, this.gui.getListaLocal());
        if (this.tipoOperacion==REGISTRAR){
            btnAceptar.setText("Registrar");
        }else{
            txtMarca.setText(objImpresora.getStr_marca());
            txtNombre.setText(objImpresora.getStr_nombre());
            txtModelo.setText(objImpresora.getStr_modelo());
            txtNumeroSerie.setText(objImpresora.getStr_NumeroSerie());
            cboLocal.setSelectedItem(objImpresora.getObjLocal().getStr_nombre());
            btnAceptar.setText("Aceptar");
            cboLocal.setEnabled(false);
        }
    }

    private void registrarNuevaTicketera() {
        if (!validarDatos()){
            return;
        }
        com.gestionmatriz.puntoventa.bean.Impresora objImpresora = new com.gestionmatriz.puntoventa.bean.Impresora();
        if (cboLocal.getSelectedIndex() <= 0){
            Mensaje.mensaje(this, "Debe seleccionar Local", Mensaje.TITULO_ME, Mensaje.INFORMACION);
            this.setVisible(false);
            return;
        }else{
            objImpresora.setObjLocal(new Local(this.gui.getListaLocal().get(cboLocal.getSelectedIndex()-1).getInt_idLocal()));
            objImpresora.setStr_nombre(txtNombre.getText().trim());
            objImpresora.setStr_marca(txtMarca.getText().trim());
            objImpresora.setStr_modelo(txtModelo.getText().trim());
            objImpresora.setStrNumeroSerie(txtNumeroSerie.getText().trim());
            objImpresora.setStr_estado(Util.ACTIVO);
            objImpresora.setStr_usuarioCreador(this.gui.getBarraEstado().getUsuario());
        }
        if (PaqueteBusinessDelegate.getImpresoraService().registrarImpresora(objImpresora)){
            Mensaje.mensaje(this, "Se Registro Ticketera", Mensaje.TITULO_ME, Mensaje.INFORMACION);
        }else{
             Mensaje.mensaje(this, "No se pudo registrar Ticketera", Mensaje.TITULO_ME, Mensaje.ERROR);
        }
        this.setVisible(false);
    }

    private void actualizarTicketera() {
        if (!validarDatos()){
            return;
        }
        this.objImpresora.setStr_nombre(txtNombre.getText().trim());
        this.objImpresora.setStr_marca(txtMarca.getText().trim());
        this.objImpresora.setStr_modelo(txtModelo.getText().trim());
        this.objImpresora.setStrNumeroSerie(txtNumeroSerie.getText().trim());
        this.objImpresora.setStr_estado(Util.ACTIVO);
        this.objImpresora.setStr_usuarioCreador(this.gui.getBarraEstado().getUsuario());
        if (PaqueteBusinessDelegate.getImpresoraService().actualizarImpresora(objImpresora)){
            Mensaje.mensaje(this, "Se Actualizo Ticketera", Mensaje.TITULO_ME, Mensaje.INFORMACION);
        }else{
             Mensaje.mensaje(this, "No se pudo Actualizar Ticketera", Mensaje.TITULO_ME, Mensaje.ERROR);
        }
        this.setVisible(false);
    }
    
    private boolean validarDatos(){
        if (cboLocal.getSelectedIndex()==0){
            Mensaje.mensaje(this, "Debe seleccioar un local", Mensaje.TITULO_ME, Mensaje.ERROR);
            return false;            
        }else if (txtNombre.getText().trim().equals("")){
            Mensaje.mensaje(this, "Debe ingresar el campo nombre", Mensaje.TITULO_ME, Mensaje.ERROR);
            return false;            
        }else if (txtMarca.getText().trim().equals("")){
            Mensaje.mensaje(this, "Debe ingresar el campo Marca", Mensaje.TITULO_ME, Mensaje.ERROR);
            return false;            
        }else if (txtModelo.getText().trim().equals("")){
            Mensaje.mensaje(this, "Debe ingresar el campo Modelo", Mensaje.TITULO_ME, Mensaje.ERROR);
            return false;            
        }else if (txtNumeroSerie.getText().trim().equals("")){
            Mensaje.mensaje(this, "Debe ingresar el campo N/S", Mensaje.TITULO_ME, Mensaje.ERROR);
            return false;
        }
        return true;
    }
}

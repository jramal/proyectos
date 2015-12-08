/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BarraEstado.java
 *
 * Created on 17-abr-2012, 8:51:30
 */
package com.gestionmatriz.principal.gui;


import java.awt.Color;
import java.sql.SQLException;

import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.EdgedBalloonStyle;

import org.apache.log4j.Logger;

import com.gestionmatriz.dao.PaqueteBusinessDelegate;
import com.gestionmatriz.sql.ConexionSql;

/**
 *
 * @author YESM
 */
public class BarraEstado extends javax.swing.JPanel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log=Logger.getLogger(BarraEstado.class);  
	
    /** Creates new form BarraEstado */
       
    public BarraEstado() {
        initComponents();
        jProgressBar1.setStringPainted(true);
        
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {

        jXStatusBar1 = new org.jdesktop.swingx.JXStatusBar();
        lblUsuario = new org.jdesktop.swingx.JXLabel();
        lblBD = new org.jdesktop.swingx.JXLabel();
        lblVentanasAbiertas = new org.jdesktop.swingx.JXLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnMensajes = new org.jdesktop.swingx.JXButton();
        btnActualizar = new org.jdesktop.swingx.JXButton();
        btnHoraFecha = new org.jdesktop.swingx.JXButton();
        btnSistema = new org.jdesktop.swingx.JXButton();

        setLayout(new java.awt.BorderLayout());

        jXStatusBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUsuario.setFont(new java.awt.Font("Consolas", 0, 12));
        lblUsuario.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);
        jXStatusBar1.add(lblUsuario);

        lblBD.setFont(new java.awt.Font("Consolas", 0, 12));
        lblBD.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);
        jXStatusBar1.add(lblBD);

        lblVentanasAbiertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentanasAbiertas.setFont(new java.awt.Font("Consolas", 0, 12));
        jXStatusBar1.add(lblVentanasAbiertas);

        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXStatusBar1.add(jProgressBar1);

        btnMensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/generico.png"))); // NOI18N
        btnMensajes.setPreferredSize(new java.awt.Dimension(33, 16));
        btnMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajesActionPerformed(evt);
            }
        });
        jXStatusBar1.add(btnMensajes);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/actualizar.png"))); // NOI18N
        btnActualizar.setPreferredSize(new java.awt.Dimension(33, 16));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jXStatusBar1.add(btnActualizar);

        btnHoraFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/horasistema.png"))); // NOI18N
        btnHoraFecha.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnHoraFecha.setMaximumSize(new java.awt.Dimension(33, 16));
        btnHoraFecha.setMinimumSize(new java.awt.Dimension(33, 16));
        btnHoraFecha.setPreferredSize(new java.awt.Dimension(33, 16));
        btnHoraFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraFechaActionPerformed(evt);
            }
        });
        jXStatusBar1.add(btnHoraFecha);

        btnSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gestionmatriz/icon/principal.png"))); // NOI18N
        btnSistema.setMaximumSize(new java.awt.Dimension(33, 16));
        btnSistema.setMinimumSize(new java.awt.Dimension(33, 16));
        btnSistema.setPreferredSize(new java.awt.Dimension(33, 16));
        btnSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaActionPerformed(evt);
            }
        });
        jXStatusBar1.add(btnSistema);

        add(jXStatusBar1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

private void btnMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajesActionPerformed
    String msg="<html>" + "<font color=\"#188E5B\">" + "<b>" + 
    "Usted No Cuenta con Mensajes." + "</b>" + "</font>" + "</html>";
    BalloonTip myBalloonTip = new BalloonTip(btnMensajes, msg);
}//GEN-LAST:event_btnMensajesActionPerformed

private void btnSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaActionPerformed
  
    InfoSystem info=new InfoSystem("/com/gestionmatriz/icon/version.png");
    info.repaint();
    BalloonTipStyle edgedLook = new EdgedBalloonStyle(Color.WHITE, Color.BLUE);
    BalloonTip myBalloonTip = new BalloonTip(btnSistema, info, edgedLook, true);
    
}//GEN-LAST:event_btnSistemaActionPerformed

private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            
            ConexionSql.cerrarConexionAll(ConexionSql.getConexion());
            ConexionSql.getConexion();
            
             String msg="<html>" + "<font color=\"#188E5B\">" + "<b>" + 
             "La Conexión se Actualizo Correctamente" + "</b>" + "</font>" + "</html>";
              BalloonTip myBalloonTip = new BalloonTip(btnActualizar, msg);
    
        } catch (SQLException ex) {
            log.error("Error: "+ex.getMessage());
        }
    
}//GEN-LAST:event_btnActualizarActionPerformed

private void btnHoraFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraFechaActionPerformed
    
            try {
            
            ConexionSql.cerrarConexionAll(ConexionSql.getConexion());
            ConexionSql.getConexion();
            String hf=PaqueteBusinessDelegate.getUtilMysqlServices().getFechaMysql();
             String msg="<html>" + "<font color=\"#188E5B\">" + "<b>" + 
             "Hora y Fecha: "+hf + "</b>" + "</font>" + "</html>";
              BalloonTip myBalloonTip = new BalloonTip(btnHoraFecha, msg);
    
        } catch (SQLException ex) {
            log.error("Error: "+ex.getMessage());
        }
            
    
}//GEN-LAST:event_btnHoraFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnActualizar;
    private org.jdesktop.swingx.JXButton btnHoraFecha;
    private org.jdesktop.swingx.JXButton btnMensajes;
    private org.jdesktop.swingx.JXButton btnSistema;
    private javax.swing.JProgressBar jProgressBar1;
    private org.jdesktop.swingx.JXStatusBar jXStatusBar1;
    private org.jdesktop.swingx.JXLabel lblBD;
    private org.jdesktop.swingx.JXLabel lblUsuario;
    private org.jdesktop.swingx.JXLabel lblVentanasAbiertas;
    // End of variables declaration//GEN-END:variables

    private static int ventanas;
    private int punteroBarra=-1;

    public int getPunteroBarra() {
        return punteroBarra;
    }

    public void setPunteroBarra(int punteroBarra) {
        this.punteroBarra = punteroBarra;
    }
    
    
            
   public void setUsuario(String usuario){
       lblUsuario.setText("Usuario: "+usuario);
   }
   
   public void setBD(String bd){
       lblBD.setText("BD: "+bd);
   }
   
   public void ventanaInicial(){
       lblVentanasAbiertas.setText("N° Ventanas: "+0);
   }
   public void nuevaVentanas(){
       ventanas++;
       lblVentanasAbiertas.setText("N° Ventanas: "+ventanas);
       this.repaint();
   }
   public void cerraVentana(){
       ventanas--;
       lblVentanasAbiertas.setText("N° Ventanas: "+ventanas);
       this.repaint();
   }
   
   public String getUsuario(){
       return lblUsuario.getText().split(":")[1].trim();
   }

 
   
    @Override
    public void run() {
        int i=0;
        while(true){
            try {
                
                i++;
                jProgressBar1.setValue(i);
                
                if (getPunteroBarra()==-1)
                    Thread.sleep(i*10);
                else
                    Thread.sleep(1);
                
                
                if (i==100){
                   break;
                }
                
            } catch (InterruptedException ex) {
            	log.error(ex.getMessage());
            }
            
        }
    }

    
    public void setStringBarra(String s){
        jProgressBar1.setString(s);
    }
  
}

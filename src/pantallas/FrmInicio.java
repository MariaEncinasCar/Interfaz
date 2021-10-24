/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import clasesfaceboot.Publicacion;
import Datos.CtrlPublicacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.text.BadLocationException;



/**
 *
 * @author Orlando Mendivil
 */
public class FrmInicio extends javax.swing.JFrame {

    
    /**
     * Creates new form frmPrincipal
     */
    public FrmInicio() {
        initComponents(); 
        setLocationRelativeTo(null);
        mostrarPublicaciones();
    }

    //Método para cambiar de línea
    private void nuevaLinea(JTextPane text) {

        try {
            text.getStyledDocument().insertString(
                    text.getStyledDocument().getLength(),
                    System.getProperty("line.separator"), null);
        } catch (BadLocationException ex) {

        }

    }
    
    private void mostrarPublicaciones() {
        CtrlPublicacion ctrl=new CtrlPublicacion();
        List<Publicacion> p= new ArrayList<>();
        p = ctrl.consultar();
        for (int i = 0; i < p.size(); i++) {
            txtMuro.setText("prueba: "+p.get(i).getFechaHora().toString());
            txtMuro.setText(p.get(i).getContenidoTex());
            nuevaLinea(txtMuro); nuevaLinea(txtMuro);
            txtMuro.setCaretPosition(txtMuro.getStyledDocument().getLength());
            JButton boton = new JButton("Comentar");
            txtMuro.insertComponent(boton);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMuro = new javax.swing.JTextPane();
        btnPublicar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        memu_Inicio = new javax.swing.JMenu();
        menu_Notificaciones = new javax.swing.JMenu();
        menu_Perfil = new javax.swing.JMenu();
        menu_Buscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi perfil");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 244, 244), 5));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        txtMuro.setEditable(false);
        jScrollPane1.setViewportView(txtMuro);

        btnPublicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/publicar_Nom.png"))); // NOI18N
        btnPublicar.setBorder(null);
        btnPublicar.setBorderPainted(false);
        btnPublicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/publicar_Press.png"))); // NOI18N
        btnPublicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/publicar_Roll.png"))); // NOI18N
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mensaje_Nom.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mensaje_Press.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mensaje_Roll.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnPublicar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPublicar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        memu_Inicio.setText("Inicio");
        memu_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memu_InicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(memu_Inicio);

        menu_Notificaciones.setText("Notificaciones");
        jMenuBar1.add(menu_Notificaciones);

        menu_Perfil.setText("Perfil");
        menu_Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_PerfilMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_Perfil);

        menu_Buscar.setText("Buscar");
        jMenuBar1.add(menu_Buscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_PerfilMouseClicked
        FrmPerfil frmPerfil = new FrmPerfil();
        frmPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_PerfilMouseClicked

    private void memu_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memu_InicioMouseClicked
        FrmInicio frmInicio = new FrmInicio();
        frmInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_memu_InicioMouseClicked

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        FrmPublicacion frmPublicacion = new FrmPublicacion();
        frmPublicacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPublicarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmMensaje frmMensaje = new FrmMensaje();
        frmMensaje.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPublicar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu memu_Inicio;
    private javax.swing.JMenu menu_Buscar;
    private javax.swing.JMenu menu_Notificaciones;
    private javax.swing.JMenu menu_Perfil;
    private javax.swing.JTextPane txtMuro;
    // End of variables declaration//GEN-END:variables
}

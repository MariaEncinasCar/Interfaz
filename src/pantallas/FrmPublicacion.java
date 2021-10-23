/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import otroPaquetito.TextPrompt;

/**
 *
 * @author Zarith
 */
public class FrmPublicacion extends javax.swing.JFrame {
    
    private FileNameExtensionFilter filter= new FileNameExtensionFilter("Archivo de imagen", "jpeg");

    /**
     * Creates new form frmPublicacion
     */
    public FrmPublicacion() {
        initComponents();
        setLocationRelativeTo(null);
        new TextPrompt("En este cuadro va el texto de una publicación", txtPublicacion);
        new TextPrompt("La ubicación en el equipo de la imagen seleccionada", txtImagen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnImagen = new javax.swing.JButton();
        txtImagen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPublicacion = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Publicación");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_Nom.png"))); // NOI18N
        btnImagen.setBorder(null);
        btnImagen.setBorderPainted(false);
        btnImagen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_Press.png"))); // NOI18N
        btnImagen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_Roll.png"))); // NOI18N
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        txtImagen.setEditable(false);
        txtImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 430, 30));

        txtPublicacion.setColumns(20);
        txtPublicacion.setRows(5);
        jScrollPane1.setViewportView(txtPublicacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 190));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar_Nom.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar_Press.png"))); // NOI18N
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar_Roll.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar_Nor.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar_Press.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar_Roll.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        JFileChooser im = new JFileChooser();
        im.setFileFilter(filter);
        int seleccion = im.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            String archivo = im.getSelectedFile().toString();
            txtImagen.setText(archivo);
        }
    }//GEN-LAST:event_btnImagenActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        FrmInicio frmInicio = new FrmInicio();
        frmInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmInicio frmInicio = new FrmInicio();
        frmInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtImagen;
    private javax.swing.JTextArea txtPublicacion;
    // End of variables declaration//GEN-END:variables
}
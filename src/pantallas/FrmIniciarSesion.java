/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Datos.UsuariosDatos;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FrmIniciarSesion extends javax.swing.JFrame {
    
    UsuariosDatos ctrl = new UsuariosDatos();
    
    /**
     * Creates new form PantallaInicio
     */
    public FrmIniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
//        System.err.println("Usuarios: " + this.ctrl.toString());

    }

    public FrmIniciarSesion(UsuariosDatos ctrl) {
        initComponents();
        setLocationRelativeTo(null);
        this.ctrl = ctrl;
//        System.err.println("Usuarios: " + this.ctrl.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelUsuarioMuestra = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pwdContrasenia = new javax.swing.JPasswordField();
        btn_IniciarSesion = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelUsuarioMuestra.setBackground(new java.awt.Color(255, 255, 255));
        labelUsuarioMuestra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Perfil.jpg"))); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setText("Correo Electrónico");
        txtEmail.setToolTipText("Correo Electrónico");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        pwdContrasenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdContrasenia.setText("Contraseña");
        pwdContrasenia.setToolTipText("Contraseña");
        pwdContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdContraseniaFocusLost(evt);
            }
        });

        btn_IniciarSesion.setBackground(new java.awt.Color(66, 102, 183));
        btn_IniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_IniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio_Nom.png"))); // NOI18N
        btn_IniciarSesion.setBorder(null);
        btn_IniciarSesion.setBorderPainted(false);
        btn_IniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_IniciarSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio_Press.png"))); // NOI18N
        btn_IniciarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio_Roll.png"))); // NOI18N
        btn_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarSesionActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(95, 184, 45));
        btnCrearCuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearCuenta_Nom.png"))); // NOI18N
        btnCrearCuenta.setBorder(null);
        btnCrearCuenta.setBorderPainted(false);
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearCuenta_Press.png"))); // NOI18N
        btnCrearCuenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearCuenta_Roll.png"))); // NOI18N
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("o");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(labelUsuarioMuestra))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pwdContrasenia)
                        .addComponent(txtEmail)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(btnCrearCuenta)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_IniciarSesion)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelUsuarioMuestra)
                .addGap(39, 39, 39)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pwdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_IniciarSesion)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(btnCrearCuenta)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        String email = txtEmail.getText().trim();
        if (email.equals("Correo Electrónico")) {
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void pwdContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdContraseniaFocusGained
        String contrasenia = pwdContrasenia.getText().trim();
        if (contrasenia.equals("Contraseña")) {
            pwdContrasenia.setText("");
        }
    }//GEN-LAST:event_pwdContraseniaFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String email = txtEmail.getText().trim();
        if (email.isEmpty()) {
            txtEmail.setText("Correo Electrónico");
        }
        else {
            Pattern pattern = Pattern
                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            Matcher mather = pattern.matcher(email);

            if (mather.find() == false) {
                JOptionPane.showMessageDialog(null, "El email ingresado es inválido.",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                txtEmail.setText("Correo Electrónico");
            }
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void pwdContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdContraseniaFocusLost
        String contrasenia = pwdContrasenia.getText().trim();
        if (contrasenia.isEmpty()) {
            pwdContrasenia.setText("Contraseña");
        }
    }//GEN-LAST:event_pwdContraseniaFocusLost

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        new FrmRegistrar(ctrl).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarSesionActionPerformed
        String email = txtEmail.getText().trim().toLowerCase();
                       
        char contra[] = pwdContrasenia.getPassword();
        String contraLib = new String(contra);
       
        if (ctrl.usuario(email, contraLib) != null) {
            FrmInicio frmInicio = new FrmInicio();
            frmInicio.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Bienvenido\n", 
                    "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n Datos incorrectos",
                    "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_IniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btn_IniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelUsuarioMuestra;
    private javax.swing.JPasswordField pwdContrasenia;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}

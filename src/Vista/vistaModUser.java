/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author leito
 */
public class vistaModUser extends javax.swing.JFrame {

    /**
     * Creates new form vistaModUser
     */
    public vistaModUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        nombreTx = new javax.swing.JTextField();
        correoTx = new javax.swing.JTextField();
        passTx = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        confPass = new javax.swing.JPasswordField();
        bttnReg = new javax.swing.JButton();
        bttnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Nueva Contraseña");

        nombreTx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreTxFocusGained(evt);
            }
        });

        correoTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoTxActionPerformed(evt);
            }
        });

        passTx.setText("jPasswordField1");
        passTx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passTxMouseClicked(evt);
            }
        });
        passTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxActionPerformed(evt);
            }
        });

        jLabel5.setText("Comfirmar Contraseña:");

        confPass.setText("jPasswordField2");
        confPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confPassMouseClicked(evt);
            }
        });

        bttnReg.setText("Registrar");
        bttnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegActionPerformed(evt);
            }
        });

        bttnCancel.setText("Cancelar");
        bttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Modificar usuario");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Correo: ");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confPass, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombreTx, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(correoTx, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passTx, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(bttnReg)
                        .addGap(18, 18, 18)
                        .addComponent(bttnCancel)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(confPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnReg)
                    .addComponent(bttnCancel))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxFocusGained
////        if(success){
//            ActionEvent ola=null;
//            bttnRegActionPerformed(ola);
//        }
    }//GEN-LAST:event_nombreTxFocusGained

    private void passTxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxMouseClicked
//        if (verif1){
//            passTx.setText("");
//            this.verif1=false;
//        }
    }//GEN-LAST:event_passTxMouseClicked

    private void passTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxActionPerformed

    private void confPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confPassMouseClicked
//        if (verif2){
//            confPass.setText("");
//            this.verif2=false;
//        }
    }//GEN-LAST:event_confPassMouseClicked

    private void bttnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegActionPerformed
//        ArrayList<Usuario> users = controlXml.todasLosUser();
//
//        control = new controlRegistro(booAdm, bttnCancel, bttnReg, confPass, correoTx, nombreTx, passTx, this);
//        if (control.sePuedeAgregarU()){
//            control.crearUser();
//            controlXml.agregarUser(control.crearUser());
//            VistaLogin ventana = new VistaLogin();
//            control.activaVentana(ventana, this);
//        }
//        else{
//            JOptionPane.showMessageDialog(this,"Revisa los siguientes campos: "+control.mensajeErrorPR());
//        }
//
//        if (booAdm.isSelected()) {
//            if (users.isEmpty()){
//                controlXml.agregarUser(control.crearUser());
//                VistaLogin ventana = new VistaLogin();
//                control.activaVentana(ventana, this);
//            }
//            else {
//                if(!success){
//                    this.booAdm.setEnabled(true);
//                    Administrador actual = (Administrador) control.crearUser();
//                    JOptionPane.showMessageDialog(this,"Debe usar las credenciales de un usuario Administrador para crear otro Administrador");
//                    verifDatosAdmin ventana = new verifDatosAdmin(users,actual,this);
//                    //                    ventana.setVisible(true);
//                    //                    this.setVisible(false);
//                    control.activaVentana (ventana,this);
//                }
//                else {
//                    booAdm.setEnabled(true);
//                    JOptionPane.showMessageDialog(this,"Usuario Administrador creado con exito");
//                    controlXml.agregarUser(control.crearUser());
//                    VistaLogin ventana = new VistaLogin();
//                    control.activaVentana(ventana, this);
//                }
//            }
//        }
//
//        else if ((booAdm.isSelected())&& (control.sePuedeAgregarU())) {
//            JOptionPane.showMessageDialog(this,"Usuario creado con exito");
//            controlXml.agregarUser(control.crearUser());
//            VistaLogin ventana = new VistaLogin();
//            control.activaVentana(ventana, this);
//        }
//
    }//GEN-LAST:event_bttnRegActionPerformed

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed

//        control.activaVentana(new VistaLogin(), this);
    }//GEN-LAST:event_bttnCancelActionPerformed

    private void correoTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaModUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaModUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaModUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaModUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaModUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnReg;
    private javax.swing.JPasswordField confPass;
    private javax.swing.JTextField correoTx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nombreTx;
    private javax.swing.JPasswordField passTx;
    // End of variables declaration//GEN-END:variables
}
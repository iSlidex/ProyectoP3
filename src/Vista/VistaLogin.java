/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.*;
import Estructuras.Administrador;
import Estructuras.Empleado;
import Estructuras.Usuario;
import controlXml.controlXmlUser;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author leito
 */
public class VistaLogin extends javax.swing.JFrame {
controladorLogin control;
controlXmlUser controlXmlU;
boolean verif;
ArrayList<Usuario> users;
    /**
     * Creates new form VistaLogin
     */
    public VistaLogin() {
        initComponents();
        control= new controladorLogin(this, bttnExit, bttnIn, bttnReg, passTx, userTx);
        controlXmlU = new controlXmlUser();
        users = controlXmlU.todasLosUser();
        this.verif=true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnIn = new javax.swing.JButton();
        bttnExit = new javax.swing.JButton();
        passTx = new javax.swing.JPasswordField();
        userTx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttnReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        bttnIn.setText("Ingresar");
        bttnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnInActionPerformed(evt);
            }
        });

        bttnExit.setText("Salir");
        bttnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExitActionPerformed(evt);
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

        userTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario :");

        jLabel2.setText("Contraseña :");

        bttnReg.setText("Registrarse");
        bttnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passTx)
                            .addComponent(userTx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnExit))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(userTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnExit)
                    .addComponent(bttnIn)
                    .addComponent(bttnReg))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxActionPerformed
       if (verif){
       passTx.setText("");
       this.verif=false;
       }
    }//GEN-LAST:event_passTxActionPerformed

    private void userTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxActionPerformed

    private void passTxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxMouseClicked
       if (verif){
       passTx.setText("");
       this.verif=false;
       }
    }//GEN-LAST:event_passTxMouseClicked

    private void bttnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegActionPerformed
       controlador next= new controlador(this);
       next.activaVentana(new vistaRegistro(),this );
    }//GEN-LAST:event_bttnRegActionPerformed

    private void bttnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnInActionPerformed
       controladorLogin next= new controladorLogin(this, bttnExit, bttnIn, bttnReg, passTx, userTx);
       Usuario act = next.log(users);
       if(act!=null){
           System.out.println("entro1");
           if(Arrays.toString(act.getClave()).equals(Arrays.toString(passTx.getPassword()))){
               System.out.println("entro2");
               if(act instanceof Administrador ){
                   System.out.println("entro3");
                vistaAdmin ventana =new vistaAdmin((Administrador) act);
                next.activaVentana(ventana,this ); 
               }else{
                   System.out.println("entro4");
                    VistaEmpleado ventana =new VistaEmpleado((Empleado) act);
                     next.activaVentana(ventana,this);
               }
           }
       }else JOptionPane.showMessageDialog(this,"Ingrese un usuario valido");       
    }//GEN-LAST:event_bttnInActionPerformed

    private void bttnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttnExitActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnExit;
    private javax.swing.JButton bttnIn;
    private javax.swing.JButton bttnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passTx;
    private javax.swing.JTextField userTx;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.controlRegistro;
import Control.controlador;
import Estructuras.Administrador;
import Estructuras.Usuario;
import Estructuras.listaUser;
import controlXml.controlXmlUser;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author leito
 */
public class vistaRegistro extends javax.swing.JFrame {
boolean verif1,verif2,success;
controlRegistro control;
controlXmlUser controlXml;
boolean paso;
Usuario currentUser;
ArrayList<Usuario> listausers;
    listaUser list;
    /**
     * Creates new form vistaRegistro
     */
    public vistaRegistro() {
        initComponents();
         control = new controlRegistro(booAdm, bttnCancel, bttnReg, confPass, correoTx, nombreTx, passTx, this);
         controlXml = new controlXmlUser();
         verif1=true;
         verif2=true;
         success=false;
         this.getContentPane().setBackground (Color.LIGHT_GRAY);
         
    }
    public vistaRegistro(boolean success,Usuario currenUser) {
        initComponents();
         control = new controlRegistro(booAdm, bttnCancel, bttnReg, confPass, correoTx, nombreTx, passTx, this);
         correoTx.setText(currenUser.getCorreo());         
         passTx.setText(new String(currenUser.getClave())); 
         confPass.setText(new String(currenUser.getClave()));        
         nombreTx.setText(currenUser.getNombre());              
         booAdm.setSelected(true);
         currentUser=currenUser;
         controlXml = new controlXmlUser();
         verif1=true;
         verif2=true;
         listausers=controlXml.todasLosUser();
         list=new listaUser(listausers);
         this.success=true;
         this.getContentPane().setBackground (Color.LIGHT_GRAY);
        // ActionEvent evt = null;
         //bttnRegActionPerformed(evt);         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreTx = new javax.swing.JTextField();
        correoTx = new javax.swing.JTextField();
        passTx = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        confPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        booAdm = new javax.swing.JCheckBox();
        bttnReg = new javax.swing.JButton();
        bttnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel1.setText("Registro de usuario : ");

        jLabel2.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel3.setText("Correo: ");

        jLabel4.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel4.setText("Contraseña: ");

        nombreTx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreTxFocusGained(evt);
            }
        });

        passTx.setText("jPasswordField1");
        passTx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTxFocusGained(evt);
            }
        });
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

        jLabel5.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel5.setText("Comfirmar Contraseña:");

        confPass.setText("jPasswordField2");
        confPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confPassFocusGained(evt);
            }
        });
        confPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confPassMouseClicked(evt);
            }
        });
        confPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confPassActionPerformed(evt);
            }
        });

        jLabel6.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel6.setText("Administrador: ");

        booAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booAdmActionPerformed(evt);
            }
        });

        bttnReg.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener c = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bttnReg.setForeground(blue);
                bttnReg.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnReg.setForeground(black);
                bttnReg.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnReg.addMouseListener(c);
        bttnReg.setText("Registrar");
        bttnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegActionPerformed(evt);
            }
        });

        bttnCancel.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener e = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bttnCancel.setForeground(blue);
                bttnCancel.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnCancel.setForeground(black);
                bttnCancel.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnCancel.addMouseListener(e);
        bttnCancel.setText("Cancelar");
        bttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(confPass, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombreTx)
                                        .addComponent(correoTx)
                                        .addComponent(passTx, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bttnReg)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(booAdm)))
                        .addGap(18, 18, 18)
                        .addComponent(bttnCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(booAdm)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnReg)
                    .addComponent(bttnCancel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void bttnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegActionPerformed
        ArrayList<Usuario> users = controlXml.todasLosUser();
        
        control = new controlRegistro(booAdm, bttnCancel, bttnReg, confPass, correoTx, nombreTx, passTx, this);
        if (control.sePuedeAgregarU()){
            if (booAdm.isSelected()) {
                if (users.isEmpty()){
                   controlXml.agregarUser(control.crearUser());
                   VistaLogin ventana = new VistaLogin();
                   control.activaVentana(ventana, this);
                }
                else {                   
                   if(!success){
                       this.booAdm.setEnabled(true);
                       Administrador actual = (Administrador) control.crearUser();
                       JOptionPane.showMessageDialog(this,"Debe usar las credenciales de un usuario Administrador para crear otro Administrador");
                       verifDatosAdmin ventana = new verifDatosAdmin(users,actual,this); 
                       control.activaVentana (ventana,this);                    
                   }
                   else {
                           if (controlXml.buscarPersona(currentUser.getCorreo())!=null){
                           booAdm.setEnabled(true);                        
                           JOptionPane.showMessageDialog(this,"Usuario Administrador creado con exito");
                           controlXml.agregarUser(control.crearUser());
                           VistaLogin ventana = new VistaLogin();
                           control.activaVentana(ventana, this);
                           }
                   }
                }
           }
        
        else  {
                    JOptionPane.showMessageDialog(this,"Usuario creado con exito");
                    controlXml.agregarUser(control.crearUser());        
                    VistaLogin ventana = new VistaLogin();
                    control.activaVentana(ventana, this);
                  }
        }
        else{
            JOptionPane.showMessageDialog(this,"Revisa los siguientes campos: "+control.mensajeErrorPR());
        }                   
       
        
        
    }//GEN-LAST:event_bttnRegActionPerformed

    private void passTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxActionPerformed

    private void passTxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxMouseClicked
       if (verif1){
       passTx.setText("");
       this.verif1=false;
       }
    }//GEN-LAST:event_passTxMouseClicked

    private void confPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confPassMouseClicked
       if (verif2){
       confPass.setText("");
       this.verif2=false;
       }
    }//GEN-LAST:event_confPassMouseClicked

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed
        
        control.activaVentana(new VistaLogin(), this);
    }//GEN-LAST:event_bttnCancelActionPerformed

    private void nombreTxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxFocusGained
        if((success)&&(nombreTx.getText().equals(""))){
         ActionEvent ola=null;
         bttnRegActionPerformed(ola);   
        }
    }//GEN-LAST:event_nombreTxFocusGained

    private void booAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booAdmActionPerformed

    private void passTxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxFocusGained
       if (verif1){
       passTx.setText("");
       this.verif1=false;
       }
    }//GEN-LAST:event_passTxFocusGained

    private void confPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confPassFocusGained
       if (verif2){
       confPass.setText("");
       this.verif2=false;
       }
    }//GEN-LAST:event_confPassFocusGained

    private void confPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confPassActionPerformed

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
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox booAdm;
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnReg;
    private javax.swing.JPasswordField confPass;
    private javax.swing.JTextField correoTx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreTx;
    private javax.swing.JPasswordField passTx;
    // End of variables declaration//GEN-END:variables
}

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
boolean paso,adm;
Usuario currentUser;
ArrayList<Usuario> listausers;
int i,j;
    listaUser list;
    /**
     * Creates new form vistaRegistro
     */
    public vistaRegistro() {
        initComponents();
         
         controlXml = new controlXmlUser();
         verif1=true;
         verif2=true;
         success=false;         
         adm=false;
         control = new controlRegistro(adm, confPass, correoTx, nombreTx, passTx, this);
    }
    public vistaRegistro(boolean success,Usuario currenUser) {
        initComponents();
         correoTx.setText(currenUser.getCorreo());         
         passTx.setText(new String(currenUser.getClave())); 
         confPass.setText(new String(currenUser.getClave()));        
         nombreTx.setText(currenUser.getNombre());              
         adm=true;
         jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_On_30px.png")));
         currentUser=currenUser;
         controlXml = new controlXmlUser();
         verif1=true;
         verif2=true;
         listausers=controlXml.todasLosUser();
         list=new listaUser(listausers);
         this.success=true;
         new vistaMsg2(this,true,"Usuario Administrador registrado con exito").setVisible(true);
         control = new controlRegistro(adm,confPass, correoTx, nombreTx, passTx, this);
         controlXml.agregarUser(control.crearUser());
    }
    public vistaRegistro(Usuario currenUser){
        initComponents();
        control = new controlRegistro(adm,confPass, correoTx, nombreTx, passTx, this);
        correoTx.setText(currenUser.getCorreo());         
         passTx.setText(new String(currenUser.getClave())); 
         confPass.setText(new String(currenUser.getClave()));        
         nombreTx.setText(currenUser.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bttn17 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bttn14 = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        verProd4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        verProd5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        confPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreTx = new javax.swing.JTextField();
        correoTx = new javax.swing.JTextField();
        passTx = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
        });
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 51, 153));

        jPanel5.setBackground(new java.awt.Color(20, 70, 160));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setToolTipText("");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(299, 299, 299))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(34, 34, 34))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 650));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        bttn17.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bttn17.setForeground(new java.awt.Color(255, 255, 255));
        bttn17.setName(""); // NOI18N
        bttn17.setText("Registro nuevo usuario");
        bttn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttn17MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttn17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttn17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 840, 90));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setForeground(new java.awt.Color(102, 255, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/baseline_cancel_black_18dp.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        bttn14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn14.setForeground(new java.awt.Color(0, 51, 153));
        bttn14.setName(""); // NOI18N
        bttn14.setText("Constructores 3000 C.A");
        bttn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bttn14MousePressed(evt);
            }
        });
        bttn14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bttn14MouseDragged(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze2.png"))); // NOI18N
        jLabel16.setToolTipText("");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bttn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 742, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        verProd4.setBackground(new java.awt.Color(0, 80, 160));
        verProd4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        verProd4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verProd4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verProd4FocusLost(evt);
            }
        });
        verProd4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProd4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verProd4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verProd4MouseExited(evt);
            }
        });
        verProd4.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Delete_25px.png"))); // NOI18N
        jLabel17.setText("Cancelar");
        jLabel17.setToolTipText("");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        verProd4.add(jLabel17);
        jLabel17.setBounds(10, 0, 100, 40);

        background.add(verProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 120, 40));

        verProd5.setBackground(new java.awt.Color(0, 80, 160));
        verProd5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        verProd5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verProd5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verProd5FocusLost(evt);
            }
        });
        verProd5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProd5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verProd5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verProd5MouseExited(evt);
            }
        });
        verProd5.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Add_25px.png"))); // NOI18N
        jLabel18.setText("Registrar");
        jLabel18.setToolTipText("");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        verProd5.add(jLabel18);
        jLabel18.setBounds(10, 0, 100, 40);

        background.add(verProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 120, 40));

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
        background.add(confPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 440, -1));

        jLabel6.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Administrador: ");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        jLabel2.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jLabel3.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Correo: ");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel4.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña: ");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        nombreTx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreTxFocusGained(evt);
            }
        });
        background.add(nombreTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 440, -1));
        background.add(correoTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 440, -1));

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
        background.add(passTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 440, -1));

        jLabel5.setFont(new Font("vrinda",Font.BOLD,13));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Comfirmar Contraseña:");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_Off_30px.png"))); // NOI18N
        jLabel20.setToolTipText("");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        background.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1070, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
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

    private void nombreTxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxFocusGained
        if((success)){
         VistaLogin ventana = new VistaLogin();
         control.activaVentana(ventana, this);
        }
    }//GEN-LAST:event_nombreTxFocusGained

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

    private void bttn17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn17MouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/twotone_cancel_black_18dp.png")));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/baseline_cancel_black_18dp.png"))); //baseline_cancel_black_18dp
    }//GEN-LAST:event_jLabel8MouseExited

    private void bttn14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn14MousePressed
        i = evt.getX();
        j= evt.getY();
    }//GEN-LAST:event_bttn14MousePressed

    private void bttn14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn14MouseDragged
        int cI = evt.getXOnScreen();
        int cJ= evt.getYOnScreen();
        this.setLocation(cI-i,cJ-j);
    }//GEN-LAST:event_bttn14MouseDragged

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.setState(newVistaProducto.ICONIFIED);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze3.png")));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze2.png")));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int cI = evt.getXOnScreen();
        int cJ= evt.getYOnScreen();
        this.setLocation(cI-i,cJ-j);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        i = evt.getX();
        j= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        verProd4.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        verProd4.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jLabel17MouseExited

    private void verProd4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd4FocusGained
        verProd4.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd4FocusGained

    private void verProd4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd4FocusLost
        verProd4.setBackground(new java.awt.Color(0,80,160));
    }//GEN-LAST:event_verProd4FocusLost

    private void verProd4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd4MouseEntered
        verProd4.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd4MouseEntered

    private void verProd4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd4MouseExited
        verProd4.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd4MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        verProd5.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        verProd5.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jLabel18MouseExited

    private void verProd5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd5FocusGained
        verProd5.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd5FocusGained

    private void verProd5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd5FocusLost
        verProd5.setBackground(new java.awt.Color(0,80,160));
    }//GEN-LAST:event_verProd5FocusLost

    private void verProd5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd5MouseEntered
        verProd5.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd5MouseEntered

    private void verProd5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd5MouseExited
        verProd5.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd5MouseExited

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        //                    int a = evt.getXOnScreen()-this.i;
        //                    int b = evt.getYOnScreen()-this.j;
        //                    this.setLocation(a,b);
    }//GEN-LAST:event_backgroundMouseDragged

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
        //        Point currentScreenLocation = evt.getLocationOnScreen();
        //        this.setLocation(currentScreenLocation.x - currentLocation.x, currentScreenLocation.y - currentLocation.y);
    }//GEN-LAST:event_backgroundMouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if(adm){
            jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_Off_30px.png")));
            adm=false;
        }
        else {
            jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_On_30px.png")));
            adm=true;
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void verProd5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd5MouseClicked
        ArrayList<Usuario> users = controlXml.todasLosUser();
        
        control = new controlRegistro(adm, confPass, correoTx, nombreTx, passTx, this);
        if (control.sePuedeAgregarU()){
            if (adm) {
                if (users.isEmpty()){
                   controlXml.agregarUser(control.crearUser());
                   VistaLogin ventana = new VistaLogin();
                   control.activaVentana(ventana, this);
                }
                else {                   
                   if(!success){
                       adm=true;
                       jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_On_30px.png")));
                       Administrador actual = (Administrador) control.crearUser();
                       new vistaMsg2(this,true,"Debe usar las credenciales de un usuario Administrador para crear otro Administrador").setVisible(true);
                       verifDatosAdmin ventana = new verifDatosAdmin(users,actual,this); 
                       control.activaVentana (ventana,this);                    
                   }
                   else {
                           if (controlXml.buscarPersona(currentUser.getCorreo())!=null){
                                adm=true;
                                jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_On_30px.png")));                  
                                new vistaMsg2(this,true,"Usuario Administrador registrado con exito").setVisible(true);
                                controlXml.agregarUser(control.crearUser());
                                VistaLogin ventana = new VistaLogin();
                                control.activaVentana(ventana, this);
                           }
                   }
                }
           }
        
        else  {
                    new vistaMsg2(this,true,"Usuario registrado con exito").setVisible(true);
                    controlXml.agregarUser(control.crearUser());        
                    VistaLogin ventana = new VistaLogin();
                    control.activaVentana(ventana, this);
                  }
        }
        else{
            new vistaMsg2(this,true,"Revisa los siguientes campos: "+control.mensajeErrorPR()).setVisible(true);
        }
    }//GEN-LAST:event_verProd5MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
         ArrayList<Usuario> users = controlXml.todasLosUser();
        
        control = new controlRegistro(adm, confPass, correoTx, nombreTx, passTx, this);
        if (control.sePuedeAgregarU()){
            if (adm) {
                if (users.isEmpty()){
                   controlXml.agregarUser(control.crearUser());
                   VistaLogin ventana = new VistaLogin();
                   control.activaVentana(ventana, this);
                }
                else {                   
                   if(!success){
                       adm=true;
                       jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_On_30px.png")));
                       Administrador actual = (Administrador) control.crearUser();
                       new vistaMsg2(this,true,"Debe usar las credenciales de un usuario Administrador para crear otro Administrador").setVisible(true);
                       verifDatosAdmin ventana = new verifDatosAdmin(users,actual,this); 
                       control.activaVentana (ventana,this);                    
                   }
                   else {
                           if (controlXml.buscarPersona(currentUser.getCorreo())!=null){
                                adm=true;
                                jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Switch_On_30px.png")));                
                                new vistaMsg2(this,true,"Usuario Administrador registrado con exito").setVisible(true);
                                controlXml.agregarUser(control.crearUser());
                                VistaLogin ventana = new VistaLogin();
                                control.activaVentana(ventana, this);
                           }
                   }
                }
           }
        
        else  {
                    new vistaMsg2(this,true,"Usuario registrado con exito").setVisible(true);
                    controlXml.agregarUser(control.crearUser());        
                    VistaLogin ventana = new VistaLogin();
                    control.activaVentana(ventana, this);
                  }
        }
        else{
            new vistaMsg2(this,true,"Revisa los siguientes campos: "+control.mensajeErrorPR()).setVisible(true);
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void verProd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd4MouseClicked
        control.activaVentana(new VistaLogin(), this);
    }//GEN-LAST:event_verProd4MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        control.activaVentana(new VistaLogin(), this);
    }//GEN-LAST:event_jLabel17MouseClicked

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
    private javax.swing.JPanel background;
    private java.awt.Label bttn14;
    private java.awt.Label bttn17;
    private javax.swing.JPasswordField confPass;
    private javax.swing.JTextField correoTx;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField nombreTx;
    private javax.swing.JPasswordField passTx;
    private javax.swing.JPanel verProd4;
    private javax.swing.JPanel verProd5;
    // End of variables declaration//GEN-END:variables
}

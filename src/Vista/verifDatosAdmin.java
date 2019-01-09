/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.*;
import Estructuras.Administrador;
import Estructuras.Usuario;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author leito
 */
public class verifDatosAdmin extends javax.swing.JFrame {
boolean verif,success;
controladorLogin control;
vistaRegistro hold;
ArrayList <Usuario> users;
Usuario currentUser;
int i,j;
    /**
     * Creates new form verifDatosAdmin
     */

     public verifDatosAdmin() {
        initComponents();
        this.verif=true;
        this.success = false;
        control = new controladorLogin(this, passTx, userTx);
        
    }
    public verifDatosAdmin(ArrayList <Usuario> users,Usuario currentUser,vistaRegistro vent) {
        initComponents();
        this.verif=true;
        this.success = false;
        control = new controladorLogin(this, passTx, userTx);
        this.hold=vent;
        this.users= users;
        this.currentUser=currentUser;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        bttn15 = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userTx = new javax.swing.JTextField();
        passTx = new javax.swing.JPasswordField();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setUndecorated(true);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel7MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(null);

        bttn15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn15.setForeground(new java.awt.Color(0, 51, 153));
        bttn15.setName(""); // NOI18N
        bttn15.setText("Constructores 3000 C.A");
        bttn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bttn15MousePressed(evt);
            }
        });
        bttn15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bttn15MouseDragged(evt);
            }
        });
        jPanel7.add(bttn15);
        bttn15.setBounds(10, 10, 209, 19);

        jSeparator2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel7.add(jSeparator2);
        jSeparator2.setBounds(10, 39, 206, 24);

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
        jPanel7.add(jLabel16);
        jLabel16.setBounds(950, 10, 36, 40);

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setForeground(new java.awt.Color(102, 255, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/baseline_cancel_black_18dp.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel7.add(jLabel5);
        jLabel5.setBounds(990, 10, 36, 36);

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 60));

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, new java.awt.Color(255, 255, 255), java.awt.Color.gray));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel3FocusLost(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel3KeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Exit_20px.png"))); // NOI18N
        jLabel19.setText("Salir");
        jLabel19.setToolTipText("");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(330, 250, 80, 40);

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));
        jPanel4.setFocusCycleRoot(true);
        jPanel4.setFocusTraversalPolicyProvider(true);
        jPanel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel4FocusLost(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel4KeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Sign_Out_20px.png"))); // NOI18N
        jLabel18.setText("Continuar");
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(160, 250, 130, 40);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_User_20px.png"))); // NOI18N
        jLabel21.setText("Usuario :");
        jLabel21.setToolTipText("");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(130, 100, 110, 40);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Key_20px.png"))); // NOI18N
        jLabel22.setText("Contraseña :");
        jLabel22.setToolTipText("");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel1.add(jLabel22);
        jLabel22.setBounds(130, 160, 150, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Para continuar debe ingresar credenciales de ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 20, 335, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Administrador");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 50, 140, 19);

        userTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxActionPerformed(evt);
            }
        });
        jPanel1.add(userTx);
        userTx.setBounds(270, 100, 164, 42);

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
        jPanel1.add(passTx);
        passTx.setBounds(270, 160, 164, 40);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 770, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxMouseClicked
       if (verif){
       passTx.setText("");
       this.verif=false;
       }
    }//GEN-LAST:event_passTxMouseClicked

    private void passTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxActionPerformed
       if (verif){
       passTx.setText("");
       this.verif=false;
       }
    }//GEN-LAST:event_passTxActionPerformed

    private void userTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        new vistaRegistro(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jPanel3.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        jPanel3.setBackground(new java.awt.Color(0,51,153));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        jPanel3.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jPanel3FocusGained

    private void jPanel3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusLost
        jPanel3.setBackground(new java.awt.Color(0,51,153));
    }//GEN-LAST:event_jPanel3FocusLost

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
        System.exit(0);
    }//GEN-LAST:event_jPanel3KeyPressed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
       Usuario act = control.log(users);
       if(act!=null){
           if(Arrays.toString(act.getClave()).equals(Arrays.toString(passTx.getPassword()))){
               if(act instanceof Administrador ){
                vistaRegistro ventana= new vistaRegistro(true,this.currentUser);
//                    ventana.setVisible(true);
//                    this.setVisible(false);
                    control.activaVentana (ventana,this);   
               }else{
                    new vistaMsg2(this,true,"Usuario no es Administrador").setVisible(true);
               }
           }
       }else new vistaMsg2(this,true,"Ingrese un usuario valido").setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jPanel4.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jPanel4.setBackground(new java.awt.Color(0,51,153));
    }//GEN-LAST:event_jLabel18MouseExited

    private void jPanel4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel4FocusGained
        jPanel4.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jPanel4FocusGained

    private void jPanel4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel4FocusLost
        jPanel4.setBackground(new java.awt.Color(0,51,153));
    }//GEN-LAST:event_jPanel4FocusLost

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
               Usuario act = control.log(users);
       if(act!=null){
           if(Arrays.toString(act.getClave()).equals(Arrays.toString(passTx.getPassword()))){
               if(act instanceof Administrador ){
                vistaRegistro ventana= new vistaRegistro(true,this.currentUser);
//                    ventana.setVisible(true);
//                    this.setVisible(false);
                    control.activaVentana (ventana,this);   
               }else{
                    new vistaMsg2(this,true,"Usuario no es Administrador").setVisible(true);
               }
           }
       }else new vistaMsg2(this,true,"Ingrese un usuario valido").setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new java.awt.Color(0,51,153));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
        this.jPanel4MouseClicked(new MouseEvent(userTx, i, WIDTH, ICONIFIED, i, i, HEIGHT, verif));
    }//GEN-LAST:event_jPanel4KeyPressed

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseExited

    private void bttn15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn15MousePressed
        i = evt.getX();
        j= evt.getY();
    }//GEN-LAST:event_bttn15MousePressed

    private void bttn15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn15MouseDragged
        int cI = evt.getXOnScreen();
        int cJ= evt.getYOnScreen();
        this.setLocation(cI-i,cJ-j);
    }//GEN-LAST:event_bttn15MouseDragged

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.setState(newVistaProducto.ICONIFIED);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze3.png")));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze2.png")));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/twotone_cancel_black_18dp.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/baseline_cancel_black_18dp.png"))); //baseline_cancel_black_18dp
    }//GEN-LAST:event_jLabel5MouseExited

    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged
        int cI = evt.getXOnScreen();
        int cJ= evt.getYOnScreen();
        this.setLocation(cI-i,cJ-j);
    }//GEN-LAST:event_jPanel7MouseDragged

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked

    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        i = evt.getX();
        j= evt.getY();
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        new vistaRegistro(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

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
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verifDatosAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label bttn15;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passTx;
    private javax.swing.JTextField userTx;
    // End of variables declaration//GEN-END:variables
}

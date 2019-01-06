/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.*;
import Estructuras.*;
import controlXml.controlXmlProd;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author leito
 */
public class vistaAdmin extends javax.swing.JFrame {
controlVistaAdm control;
controlXmlProd xml=new controlXmlProd();
ArrayList<Producto>  lista =  xml.todasLosUser();;
Producto aux = new Producto("aux", "aux", 1, "1", 1,1);
Administrador currentUser;

    /**
     * Creates new form vistaAdmin
     */
    public vistaAdmin() {
        initComponents();
        control = new controlVistaAdm(bttnBack, bttnExit, bttnRegNu, bttnViewProd, bttnViewProv, bttnViewU, this);
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
        }
        public vistaAdmin(Administrador currentUser) {
        initComponents();
        control = new controlVistaAdm(bttnBack, bttnExit, bttnRegNu, bttnViewProd, bttnViewProv, bttnViewU, this);
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
        this.currentUser=currentUser;
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnViewU = new javax.swing.JButton();
        bttnViewProv = new javax.swing.JButton();
        bttnViewProd = new javax.swing.JButton();
        bttnRegNu = new javax.swing.JButton();
        bttnBack = new javax.swing.JButton();
        bttnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttnViewU.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener a = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bttnViewU.setForeground(blue);
                bttnViewU.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnViewU.setForeground(black);
                bttnViewU.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnViewU.addMouseListener(a);
        bttnViewU.setText("Ver Usuarios");
        bttnViewU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnViewUActionPerformed(evt);
            }
        });

        bttnViewProv.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener b = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bttnViewProv.setForeground(blue);
                bttnViewProv.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnViewProv.setForeground(black);
                bttnViewProv.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnViewProv.addMouseListener(b);
        bttnViewProv.setText("Ver Proveedores");
        bttnViewProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnViewProvActionPerformed(evt);
            }
        });

        bttnViewProd.setFont(new Font("vrinda",Font.BOLD,15));
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
                bttnViewProd.setForeground(blue);
                bttnViewProd.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnViewProd.setForeground(black);
                bttnViewProd.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnViewProd.addMouseListener(c);
        bttnViewProd.setText("Ver Productos");
        bttnViewProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnViewProdActionPerformed(evt);
            }
        });

        bttnRegNu.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener d = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bttnRegNu.setForeground(blue);
                bttnRegNu.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnRegNu.setForeground(black);
                bttnRegNu.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnRegNu.addMouseListener(d);
        bttnRegNu.setText("Registrar Nuevo Usuario");
        bttnRegNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegNuActionPerformed(evt);
            }
        });

        bttnBack.setFont(new Font("vrinda",Font.BOLD,15));
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
                bttnBack.setForeground(blue);
                bttnBack.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnBack.setForeground(black);
                bttnBack.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnBack.addMouseListener(e);
        bttnBack.setText("Cerrar Sesion");
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnExit.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener f = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bttnExit.setForeground(blue);
                bttnExit.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnExit.setForeground(black);
                bttnExit.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnExit.addMouseListener(f);
        bttnExit.setText("Salir");
        bttnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("arial",Font.BOLD,18));
        jLabel1.setText("Menu Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bttnViewU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnViewProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnViewProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnRegNu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addComponent(bttnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnViewU)
                .addGap(18, 18, 18)
                .addComponent(bttnViewProv)
                .addGap(18, 18, 18)
                .addComponent(bttnViewProd)
                .addGap(18, 18, 18)
                .addComponent(bttnRegNu)
                .addGap(18, 18, 18)
                .addComponent(bttnBack)
                .addGap(18, 18, 18)
                .addComponent(bttnExit)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnViewUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnViewUActionPerformed
        control.activaVentana(new tablaUser(currentUser), this);
    }//GEN-LAST:event_bttnViewUActionPerformed

    private void bttnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttnExitActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        control.activaVentana(new VistaLogin(), this);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnRegNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegNuActionPerformed
        control.activaVentana(new vistaRegistro(),this );
    }//GEN-LAST:event_bttnRegNuActionPerformed

    private void bttnViewProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnViewProvActionPerformed
        control.activaVentana(new tablaProveedores(currentUser), this);
    }//GEN-LAST:event_bttnViewProvActionPerformed

    private void bttnViewProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnViewProdActionPerformed
        control.activaVentana(new tablaProductos(currentUser), this);
        int pos = 0;
        int cont = 0;
        Producto flag = new Producto ("aux", "aux", 1, "1", -1, 1);
        /*Buscara los productos que tengan 3 unidades o menos, si los encuentra mostrara el pop-up*/
            while (aux != null){
                try{
                aux = xml.unidad(pos);
                pos++;
                System.out.println("pos\n"+pos);
                System.out.println("unidades"+aux.getUnidades());
                    if ((aux!=null) && (!(aux.getNombre().equals("aux")))){
                        cont++;
                        System.out.println("contador"+cont+"\n");
                        JOptionPane.showMessageDialog(this,"El siguiente producto posee pocas unidades en el inventario: "+control.aviso(1,aux));
                    }
                }
                catch (NullPointerException NE)
                {
                    break;
                }
            }
    }//GEN-LAST:event_bttnViewProdActionPerformed

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
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnBack;
    private javax.swing.JButton bttnExit;
    private javax.swing.JButton bttnRegNu;
    private javax.swing.JButton bttnViewProd;
    private javax.swing.JButton bttnViewProv;
    private javax.swing.JButton bttnViewU;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

package Vista;

import Control.controlCompraVenta;
import controlXml.controlXmlProd;
import controlXml.controlXmlProv;
import java.awt.Color;
import java.util.ArrayList;
import Control.controlAgregar;
import Control.controlCompraVenta;
import Estructuras.Acciones;
import Estructuras.Producto;
import Estructuras.Proveedor;
import Estructuras.Usuario;
import Estructuras.listaProd;
import Estructuras.listaProv;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class vistaCompraVentaDespues extends javax.swing.JFrame {
    Usuario currentUser;
    controlXmlProv xml=new controlXmlProv();
    controlXmlProd pml=new controlXmlProd();
    listaProd prods;
    listaProv prove;
    Proveedor provAct;
    Producto prod;
    Acciones ac;
    ArrayList<Proveedor>  proveedores;
    ArrayList<Producto>  productos;
    controlCompraVenta control;
    vistaCompraVenta anterior;
    
    
    public vistaCompraVentaDespues() {
        initComponents();
    }

    public vistaCompraVentaDespues(Usuario currentUser,listaProd prods, Integer unidades, String accion, String proveedor, String producto) {
        initComponents();
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
        control = new controlCompraVenta(productos, pdf, regresar, accionTx, fechaTx, preciototalTx, prodTx, provTx, unidadesTx, this);
        proveedores= xml.todasLosUser();
        productos = pml.todasLosUser();
        this.prove = new listaProv(proveedores);
        this.prods = new listaProd(productos);
        this.preciototalTx.setEditable(false);
        this.prodTx.setEditable(false);
        this.provTx.setEditable(false);
        this.unidadesTx.setEditable(false);
        this.accionTx.setEditable(false);
        this.fechaTx.setEditable(false);
        
        /*Llenar la ventana de los datos proporcionados*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        this.fechaTx.setText(dtf.format(now));
        this.unidadesTx.setText(unidades.toString());
        this.accionTx.setText(accion);
        this.provTx.setText(proveedor);
        this.prodTx.setText(producto);
        /*Producto actual*/
        
        
        prod = pml.buscarnombre(prodTx.getText(),provTx.getText());
        this.preciototalTx.setText(control.precioTotal(unidades,prod.getPrecio()).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pdf = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        provTx = new javax.swing.JTextField();
        prodTx = new javax.swing.JTextField();
        unidadesTx = new javax.swing.JTextField();
        preciototalTx = new javax.swing.JTextField();
        fechaTx = new javax.swing.JTextField();
        accionTx = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menú compra/venta");

        jLabel2.setText("Revise si los datos colocados son los correctos, si todo está bien presione aceptar");

        jLabel3.setText("Acción:");

        jLabel4.setText("Proveedor:");

        jLabel5.setText("Producto:");

        jLabel6.setText("Unidades:");

        jLabel7.setText("Precio total:");

        jLabel8.setText("Fecha:");

        jLabel9.setText("de lo contrario, presione regresar para modificar los datos");

        pdf.setText("Aceptar");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        provTx.setBackground(new java.awt.Color(224, 223, 223));

        prodTx.setBackground(new java.awt.Color(224, 223, 223));

        unidadesTx.setBackground(new java.awt.Color(224, 223, 223));

        preciototalTx.setEditable(false);
        preciototalTx.setBackground(new java.awt.Color(224, 223, 223));

        fechaTx.setEditable(false);
        fechaTx.setBackground(new java.awt.Color(224, 223, 223));

        accionTx.setBackground(new java.awt.Color(224, 223, 223));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(unidadesTx))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(prodTx))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(provTx)
                                .addComponent(accionTx)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fechaTx, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                .addComponent(preciototalTx)))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(pdf)
                        .addGap(18, 18, 18)
                        .addComponent(regresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accionTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(provTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(prodTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(unidadesTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(preciototalTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fechaTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf)
                    .addComponent(regresar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.anterior = new vistaCompraVenta(this.currentUser, prove, this.accionTx.getText(),this.provTx.getText(),prod.getNombre(),this.unidadesTx.getText());
        control.activaVentana(anterior, this);
    }//GEN-LAST:event_regresarActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
       // control.actualizarProd(prod,Integer.parseInt(unidadesTx.getText()));
    }//GEN-LAST:event_pdfActionPerformed

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
            java.util.logging.Logger.getLogger(vistaCompraVentaDespues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCompraVentaDespues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCompraVentaDespues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCompraVentaDespues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCompraVentaDespues().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accionTx;
    private javax.swing.JTextField fechaTx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton pdf;
    private javax.swing.JTextField preciototalTx;
    private javax.swing.JTextField prodTx;
    private javax.swing.JTextField provTx;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField unidadesTx;
    // End of variables declaration//GEN-END:variables
}

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
import java.awt.event.KeyEvent;
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
    Integer index;
    int i,j;
    
    public vistaCompraVentaDespues() {
        initComponents();
    }

    public vistaCompraVentaDespues(Usuario currentUser, listaProd prods, Integer unidades, String accion, String prov, String nombre, Producto prod, Integer index) {
        initComponents();
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
        control = new controlCompraVenta(productos, accionTx, fechaTx, preciototalTx, prodTx, provTx, unidadesTx, this);
        productos = pml.todasLosUser();
        this.prods = new listaProd(productos);
        this.preciototalTx.setEditable(false);
        this.prodTx.setEditable(false);
        this.provTx.setEditable(false);
        this.unidadesTx.setEditable(false);
        this.accionTx.setEditable(false);
        this.fechaTx.setEditable(false);
        this.prod = prod;
        this.index = index; 
        
        /*Llenar la ventana de los datos proporcionados*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        this.fechaTx.setText(dtf.format(now));
        this.unidadesTx.setText(unidades.toString());
        this.accionTx.setText(accion);
        this.provTx.setText(prov);
        this.prodTx.setText(nombre);
        /*Producto actual*/
        
        this.preciototalTx.setText(control.precioTotal(unidades,prod.getPrecio()).toString());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        verProd = new javax.swing.JPanel();
        bttn2 = new java.awt.Label();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        verProd1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bttn12 = new java.awt.Label();
        verProd2 = new javax.swing.JPanel();
        bttn13 = new java.awt.Label();
        jLabel12 = new javax.swing.JLabel();
        verProd3 = new javax.swing.JPanel();
        bttn15 = new java.awt.Label();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bttn16 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        bttn17 = new java.awt.Label();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bttn14 = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        verProd4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        verProd5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        accionTx = new javax.swing.JTextField();
        provTx = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prodTx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        unidadesTx = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        preciototalTx = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechaTx = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verProd.setBackground(new java.awt.Color(0, 153, 204));
        verProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        verProd.setName(""); // NOI18N
        verProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verProdFocusLost(evt);
            }
        });
        verProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verProdMouseExited(evt);
            }
        });
        verProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verProdKeyPressed(evt);
            }
        });

        bttn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn2.setForeground(new java.awt.Color(255, 255, 255));
        bttn2.setName(""); // NOI18N
        bttn2.setText("Ver Productos");
        bttn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttn2MouseEntered(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/outline_local_grocery_store_white_18dp_1.png"))); // NOI18N

        javax.swing.GroupLayout verProdLayout = new javax.swing.GroupLayout(verProd);
        verProd.setLayout(verProdLayout);
        verProdLayout.setHorizontalGroup(
            verProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProdLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(48, 48, 48)
                .addComponent(bttn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        verProdLayout.setVerticalGroup(
            verProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(verProdLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bttn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        menu.add(verProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 299, -1));

        jPanel5.setBackground(new java.awt.Color(20, 70, 160));
        jPanel5.setLayout(new java.awt.BorderLayout());
        menu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 389, 6, -1));

        verProd1.setBackground(new java.awt.Color(0, 80, 160));
        verProd1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        verProd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verProd1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verProd1FocusLost(evt);
            }
        });
        verProd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProd1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verProd1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verProd1MouseExited(evt);
            }
        });
        verProd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verProd1KeyPressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/outline_people_white_18dp.png"))); // NOI18N

        bttn12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn12.setForeground(new java.awt.Color(255, 255, 255));
        bttn12.setName(""); // NOI18N
        bttn12.setText("Ver Usuarios");
        bttn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttn12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttn12MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout verProd1Layout = new javax.swing.GroupLayout(verProd1);
        verProd1.setLayout(verProd1Layout);
        verProd1Layout.setHorizontalGroup(
            verProd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProd1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(48, 48, 48)
                .addComponent(bttn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        verProd1Layout.setVerticalGroup(
            verProd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verProd1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(verProd1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bttn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        menu.add(verProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, -1, -1));

        verProd2.setBackground(new java.awt.Color(0, 80, 160));
        verProd2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        verProd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verProd2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verProd2FocusLost(evt);
            }
        });
        verProd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProd2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verProd2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verProd2MouseExited(evt);
            }
        });
        verProd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verProd2KeyPressed(evt);
            }
        });

        bttn13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn13.setForeground(new java.awt.Color(255, 255, 255));
        bttn13.setName(""); // NOI18N
        bttn13.setText("Ver Proveedores");
        bttn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttn13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttn13MouseEntered(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/outline_person_pin_white_18dp.png"))); // NOI18N

        javax.swing.GroupLayout verProd2Layout = new javax.swing.GroupLayout(verProd2);
        verProd2.setLayout(verProd2Layout);
        verProd2Layout.setHorizontalGroup(
            verProd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProd2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(48, 48, 48)
                .addComponent(bttn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        verProd2Layout.setVerticalGroup(
            verProd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verProd2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(verProd2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bttn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(verProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 256, 299, -1));

        verProd3.setBackground(new java.awt.Color(0, 80, 160));
        verProd3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        verProd3.setName(""); // NOI18N
        verProd3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verProd3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verProd3FocusLost(evt);
            }
        });
        verProd3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProd3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verProd3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verProd3MouseExited(evt);
            }
        });

        bttn15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn15.setForeground(new java.awt.Color(255, 255, 255));
        bttn15.setName(""); // NOI18N
        bttn15.setText("Ver Estadisticas");
        bttn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttn15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttn15MouseEntered(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/outline_assessment_white_18dp.png"))); // NOI18N
        jLabel13.setToolTipText("");

        javax.swing.GroupLayout verProd3Layout = new javax.swing.GroupLayout(verProd3);
        verProd3.setLayout(verProd3Layout);
        verProd3Layout.setHorizontalGroup(
            verProd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProd3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addGap(48, 48, 48)
                .addComponent(bttn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        verProd3Layout.setVerticalGroup(
            verProd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verProd3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(verProd3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bttn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        menu.add(verProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setToolTipText("");
        menu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 395, -1, 212));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Sign_Out_30px.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel15FocusLost(evt);
            }
        });
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jLabel15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel15KeyPressed(evt);
            }
        });
        menu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 612, -1, -1));

        bttn16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn16.setForeground(new java.awt.Color(255, 255, 255));
        bttn16.setName(""); // NOI18N
        bttn16.setText("Cerrar Sesion");
        bttn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttn16MouseClicked(evt);
            }
        });
        menu.add(bttn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 612, -1, -1));

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 650));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        bttn17.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bttn17.setForeground(new java.awt.Color(255, 255, 255));
        bttn17.setName(""); // NOI18N
        bttn17.setText("Comprar/ Vender:");
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
                .addContainerGap(440, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttn17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 760, 90));

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setForeground(new java.awt.Color(102, 255, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/baseline_cancel_black_18dp.png"))); // NOI18N
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
        background.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

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

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze2.png"))); // NOI18N
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
                .addComponent(jLabel17)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Go_Back_25px.png"))); // NOI18N
        jLabel18.setText("Regresar");
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
        verProd4.add(jLabel18);
        jLabel18.setBounds(10, 0, 100, 40);

        background.add(verProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 120, 40));

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

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Checkmark_25px.png"))); // NOI18N
        jLabel19.setText("Aceptar");
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
        verProd5.add(jLabel19);
        jLabel19.setBounds(10, 0, 100, 40);

        background.add(verProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 120, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Revise si los datos colocados son los correctos, si todo está bien presione aceptar");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("de lo contrario, presione regresar para modificar los datos");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Acción:");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        accionTx.setBackground(new java.awt.Color(224, 223, 223));
        background.add(accionTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 263, -1));

        provTx.setBackground(new java.awt.Color(224, 223, 223));
        background.add(provTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 263, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Proveedor:");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        prodTx.setBackground(new java.awt.Color(224, 223, 223));
        prodTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodTxActionPerformed(evt);
            }
        });
        background.add(prodTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 262, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Producto:");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        unidadesTx.setBackground(new java.awt.Color(224, 223, 223));
        background.add(unidadesTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 261, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Unidades:");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        preciototalTx.setEditable(false);
        preciototalTx.setBackground(new java.awt.Color(224, 223, 223));
        background.add(preciototalTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 259, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Precio total:");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        fechaTx.setEditable(false);
        fechaTx.setBackground(new java.awt.Color(224, 223, 223));
        background.add(fechaTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 259, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Fecha:");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prodTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodTxActionPerformed

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
        //        Point currentScreenLocation = evt.getLocationOnScreen();
        //        this.setLocation(currentScreenLocation.x - currentLocation.x, currentScreenLocation.y - currentLocation.y);
    }//GEN-LAST:event_backgroundMouseClicked

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        //                    int a = evt.getXOnScreen()-this.i;
        //                    int b = evt.getYOnScreen()-this.j;
        //                    this.setLocation(a,b);
    }//GEN-LAST:event_backgroundMouseDragged

    private void verProd5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd5MouseExited
        verProd5.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd5MouseExited

    private void verProd5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd5MouseEntered
        verProd5.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd5MouseEntered

    private void verProd5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd5MouseClicked
        control.actualizarProd(prod,Integer.parseInt(unidadesTx.getText()), index);
        control.activaVentana(new newVistaProducto(currentUser), this);
    }//GEN-LAST:event_verProd5MouseClicked

    private void verProd5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd5FocusLost
        verProd5.setBackground(new java.awt.Color(0,80,160));
    }//GEN-LAST:event_verProd5FocusLost

    private void verProd5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd5FocusGained
        verProd5.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd5FocusGained

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        verProd5.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        verProd5.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        control.actualizarProd(prod,Integer.parseInt(unidadesTx.getText()), index);
        control.activaVentana(new newVistaProducto(currentUser), this);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void verProd4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd4MouseExited
        verProd4.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd4MouseExited

    private void verProd4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd4MouseEntered
        verProd4.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd4MouseEntered

    private void verProd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd4MouseClicked
        this.anterior = new vistaCompraVenta(this.currentUser, prods, this.accionTx.getText(),this.provTx.getText(),prod.getNombre(),this.unidadesTx.getText(), prod, index);
        control.activaVentana(anterior, this);
    }//GEN-LAST:event_verProd4MouseClicked

    private void verProd4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd4FocusLost
        verProd4.setBackground(new java.awt.Color(0,80,160));
    }//GEN-LAST:event_verProd4FocusLost

    private void verProd4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd4FocusGained
        verProd4.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd4FocusGained

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        verProd4.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        verProd4.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.anterior = new vistaCompraVenta(this.currentUser, prods, this.accionTx.getText(),this.provTx.getText(),prod.getNombre(),this.unidadesTx.getText(), prod, index);
        control.activaVentana(anterior, this);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        i = evt.getX();
        j= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int cI = evt.getXOnScreen();
        int cJ= evt.getYOnScreen();
        this.setLocation(cI-i,cJ-j);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze2.png")));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimze3.png")));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        this.setState(newVistaProducto.ICONIFIED);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void bttn14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn14MouseDragged
        int cI = evt.getXOnScreen();
        int cJ= evt.getYOnScreen();
        this.setLocation(cI-i,cJ-j);
    }//GEN-LAST:event_bttn14MouseDragged

    private void bttn14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn14MousePressed
        i = evt.getX();
        j= evt.getY();
    }//GEN-LAST:event_bttn14MousePressed

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/baseline_cancel_black_18dp.png"))); //baseline_cancel_black_18dp
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/twotone_cancel_black_18dp.png")));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void bttn17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bttn17MouseEntered

    private void bttn16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn16MouseClicked

        control.activaVentana(new VistaLogin(),this );
    }//GEN-LAST:event_bttn16MouseClicked

    private void jLabel15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel15KeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER)){

            control.activaVentana(new VistaLogin(),this );
        }
    }//GEN-LAST:event_jLabel15KeyPressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        control.activaVentana(new VistaLogin(),this );
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel15FocusLost
        bttn16.setForeground(new java.awt.Color(255,255,255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Sign_Out_30px.png")));
    }//GEN-LAST:event_jLabel15FocusLost

    private void jLabel15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel15FocusGained
        bttn16.setForeground(new java.awt.Color(192, 192, 192));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Sign_Out_30px_1.png")));
    }//GEN-LAST:event_jLabel15FocusGained

    private void verProd3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd3MouseExited
        verProd3.setBackground(new java.awt.Color(0, 80, 160));
        bttn15.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd3MouseExited

    private void verProd3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd3MouseEntered
        verProd3.setBackground(new java.awt.Color(30, 120, 180));
        bttn15.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd3MouseEntered

    private void verProd3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd3MouseClicked
        control.activaVentana(new vistaEstadisticasProveedor(currentUser),this);
    }//GEN-LAST:event_verProd3MouseClicked

    private void verProd3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd3FocusLost
        verProd3.setBackground(new java.awt.Color(0, 80, 160));
        bttn15.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd3FocusLost

    private void verProd3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd3FocusGained
        verProd3.setBackground(new java.awt.Color(30, 120, 180));
        bttn15.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd3FocusGained

    private void bttn15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn15MouseEntered
        verProd3.setBackground(new java.awt.Color(30, 120, 180));
        bttn15.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_bttn15MouseEntered

    private void bttn15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn15MouseClicked
        control.activaVentana(new vistaEstadisticasProveedor(currentUser),this);
    }//GEN-LAST:event_bttn15MouseClicked

    private void verProd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verProd2KeyPressed
        control.activaVentana(new admVistaProv(currentUser), this);
    }//GEN-LAST:event_verProd2KeyPressed

    private void verProd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd2MouseExited
        verProd2.setBackground(new java.awt.Color(0, 80, 160));
        bttn13.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd2MouseExited

    private void verProd2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd2MouseEntered
        verProd2.setBackground(new java.awt.Color(30, 120, 180));
        bttn13.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd2MouseEntered

    private void verProd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd2MouseClicked
        control.activaVentana(new admVistaProv(currentUser), this);
    }//GEN-LAST:event_verProd2MouseClicked

    private void verProd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd2FocusLost
        verProd2.setBackground(new java.awt.Color(0, 80, 160));
        bttn13.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd2FocusLost

    private void verProd2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd2FocusGained
        verProd2.setBackground(new java.awt.Color(30, 120, 180));
        bttn13.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd2FocusGained

    private void bttn13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn13MouseEntered
        verProd2.setBackground(new java.awt.Color(30, 120, 180));
        bttn13.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_bttn13MouseEntered

    private void bttn13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn13MouseClicked
        control.activaVentana(new admVistaProv(currentUser), this);
    }//GEN-LAST:event_bttn13MouseClicked

    private void verProd1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verProd1KeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER)){
            control.activaVentana(new admVistaUser(currentUser), this);
        }
    }//GEN-LAST:event_verProd1KeyPressed

    private void verProd1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd1MouseExited
        // TODO add your handling code here:
        verProd1.setBackground(new java.awt.Color(0, 80, 160));
        bttn12.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd1MouseExited

    private void verProd1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd1MouseEntered
        // TODO add your handling code here:  verProd1
        verProd1.setBackground(new java.awt.Color(30, 120, 180));
        bttn12.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd1MouseEntered

    private void verProd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProd1MouseClicked
        control.activaVentana(new admVistaUser(currentUser), this);
    }//GEN-LAST:event_verProd1MouseClicked

    private void verProd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd1FocusLost
        verProd1.setBackground(new java.awt.Color(0, 80, 160));
        bttn12.setBackground(new java.awt.Color(0, 80, 160));
    }//GEN-LAST:event_verProd1FocusLost

    private void verProd1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProd1FocusGained
        verProd1.setBackground(new java.awt.Color(30, 120, 180));
        bttn12.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProd1FocusGained

    private void bttn12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn12MouseEntered
        verProd1.setBackground(new java.awt.Color(30, 120, 180));
        bttn12.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_bttn12MouseEntered

    private void bttn12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn12MouseClicked
        control.activaVentana(new admVistaUser(currentUser), this);
    }//GEN-LAST:event_bttn12MouseClicked

    private void verProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verProdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_verProdKeyPressed

    private void verProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProdMouseExited
        verProd.setBackground(new java.awt.Color(0, 153, 204));
        bttn2.setBackground(new java.awt.Color(0, 153, 204));
    }//GEN-LAST:event_verProdMouseExited

    private void verProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProdMouseEntered
        verProd.setBackground(new java.awt.Color(30, 120, 180));
        bttn2.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProdMouseEntered

    private void verProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProdMouseClicked
        control.activaVentana(new newVistaProducto(currentUser), this);
    }//GEN-LAST:event_verProdMouseClicked

    private void verProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProdFocusLost
        verProd.setBackground(new java.awt.Color(0,153,204));
        bttn2.setBackground(new java.awt.Color(0, 153, 204));
    }//GEN-LAST:event_verProdFocusLost

    private void verProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verProdFocusGained
        verProd.setBackground(new java.awt.Color(30, 120, 180));
        bttn2.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_verProdFocusGained

    private void bttn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn2MouseEntered
        verProd.setBackground(new java.awt.Color(30, 120, 180));
        bttn2.setBackground(new java.awt.Color(30, 120, 180));
    }//GEN-LAST:event_bttn2MouseEntered

    private void bttn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn2MouseClicked
        control.activaVentana(new newVistaProducto(currentUser), this);
    }//GEN-LAST:event_bttn2MouseClicked

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
    private javax.swing.JPanel background;
    private java.awt.Label bttn12;
    private java.awt.Label bttn13;
    private java.awt.Label bttn14;
    private java.awt.Label bttn15;
    private java.awt.Label bttn16;
    private java.awt.Label bttn17;
    private java.awt.Label bttn2;
    private javax.swing.JTextField fechaTx;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField preciototalTx;
    private javax.swing.JTextField prodTx;
    private javax.swing.JTextField provTx;
    private javax.swing.JTextField unidadesTx;
    private javax.swing.JPanel verProd;
    private javax.swing.JPanel verProd1;
    private javax.swing.JPanel verProd2;
    private javax.swing.JPanel verProd3;
    private javax.swing.JPanel verProd4;
    private javax.swing.JPanel verProd5;
    // End of variables declaration//GEN-END:variables
}

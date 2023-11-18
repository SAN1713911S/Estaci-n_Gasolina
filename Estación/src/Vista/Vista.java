
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Santiago Niño
 */
public class Vista extends javax.swing.JFrame{ 

    public Vista() {
        initComponents();
        imagen1();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcambio = new javax.swing.JLabel();
        lblrecibido = new javax.swing.JLabel();
        lblforma = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbl1 = new javax.swing.JPanel();
        lblsigno = new javax.swing.JLabel();
        lblprecio1 = new javax.swing.JLabel();
        lblgalones = new javax.swing.JPanel();
        lblLt = new javax.swing.JLabel();
        lblgasolina1 = new javax.swing.JLabel();
        btn50000 = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        btn70000 = new javax.swing.JButton();
        btn90000 = new javax.swing.JButton();
        btn120000 = new javax.swing.JButton();
        txtotro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnsurtir = new javax.swing.JButton();
        btnfinalizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnfull = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnotro = new javax.swing.JButton();
        btnvalidar = new javax.swing.JButton();
        txtmax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblplacas = new javax.swing.JTextField();
        txtactual = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jrbefectivo = new javax.swing.JRadioButton();
        jrbtargeta = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        txtdesea = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblgasolina = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        lblLt1 = new javax.swing.JLabel();
        lblsigno1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        lblcambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcambio.setForeground(new java.awt.Color(153, 0, 0));

        lblrecibido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblrecibido.setForeground(new java.awt.Color(153, 0, 0));

        lblforma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblforma.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(lblforma, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(lblrecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblcambio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblforma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcambio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("NIT:800.197.268-4");

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jbl1.setBackground(new java.awt.Color(153, 0, 0));
        jbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblsigno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsigno.setForeground(new java.awt.Color(255, 255, 255));
        lblsigno.setText("$");

        lblprecio1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblprecio1.setForeground(new java.awt.Color(255, 255, 255));
        lblprecio1.setText("0.0 ");

        javax.swing.GroupLayout jbl1Layout = new javax.swing.GroupLayout(jbl1);
        jbl1.setLayout(jbl1Layout);
        jbl1Layout.setHorizontalGroup(
            jbl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsigno)
                .addGap(18, 18, 18)
                .addComponent(lblprecio1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jbl1Layout.setVerticalGroup(
            jbl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jbl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsigno)
                    .addComponent(lblprecio1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblgalones.setBackground(new java.awt.Color(153, 0, 0));
        lblgalones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLt.setForeground(new java.awt.Color(255, 255, 255));
        lblLt.setText("Lt");

        lblgasolina1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblgasolina1.setForeground(new java.awt.Color(255, 255, 255));
        lblgasolina1.setText("0.0 ");

        javax.swing.GroupLayout lblgalonesLayout = new javax.swing.GroupLayout(lblgalones);
        lblgalones.setLayout(lblgalonesLayout);
        lblgalonesLayout.setHorizontalGroup(
            lblgalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblgalonesLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lblgasolina1)
                .addGap(18, 18, 18)
                .addComponent(lblLt)
                .addGap(17, 17, 17))
        );
        lblgalonesLayout.setVerticalGroup(
            lblgalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblgalonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblgalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLt)
                    .addComponent(lblgasolina1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn50000.setBackground(new java.awt.Color(153, 0, 0));
        btn50000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn50000.setForeground(new java.awt.Color(255, 255, 255));
        btn50000.setText("$ 50.000");
        btn50000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50000ActionPerformed(evt);
            }
        });

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/descarga.png"))); // NOI18N

        btn70000.setBackground(new java.awt.Color(153, 0, 0));
        btn70000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn70000.setForeground(new java.awt.Color(255, 255, 255));
        btn70000.setText("$ 70.000");
        btn70000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70000ActionPerformed(evt);
            }
        });

        btn90000.setBackground(new java.awt.Color(153, 0, 0));
        btn90000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn90000.setForeground(new java.awt.Color(255, 255, 255));
        btn90000.setText("$ 90.000");
        btn90000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn90000ActionPerformed(evt);
            }
        });

        btn120000.setBackground(new java.awt.Color(153, 0, 0));
        btn120000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn120000.setForeground(new java.awt.Color(255, 255, 255));
        btn120000.setText("$ 120.000");
        btn120000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn120000ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("$");

        btnsurtir.setBackground(new java.awt.Color(153, 0, 0));
        btnsurtir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsurtir.setForeground(new java.awt.Color(255, 255, 255));
        btnsurtir.setText("Surtir");
        btnsurtir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsurtirActionPerformed(evt);
            }
        });

        btnfinalizar.setBackground(new java.awt.Color(153, 0, 0));
        btnfinalizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizar.setText("Finalizar");
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Ingrese la cantidad actual de gasolina en litros:");

        btnfull.setBackground(new java.awt.Color(153, 0, 0));
        btnfull.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfull.setForeground(new java.awt.Color(255, 255, 255));
        btnfull.setText("Full");
        btnfull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfullActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Seleccione la cantidad de dinero a ingresar:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Valor a pagar:");

        btnotro.setBackground(new java.awt.Color(153, 0, 0));
        btnotro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnotro.setForeground(new java.awt.Color(255, 255, 255));
        btnotro.setText("Otro");
        btnotro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotroActionPerformed(evt);
            }
        });

        btnvalidar.setBackground(new java.awt.Color(153, 0, 0));
        btnvalidar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnvalidar.setForeground(new java.awt.Color(255, 255, 255));
        btnvalidar.setText("Validar");
        btnvalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvalidarActionPerformed(evt);
            }
        });

        txtmax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtmax.setText("0.0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("GLOBE OIL");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Ingrese la cantidad máxima de gasolina en litros:");

        lblplacas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblplacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblplacasActionPerformed(evt);
            }
        });

        txtactual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtactual.setText("0.0");
        txtactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactualActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jrbefectivo.setBackground(new java.awt.Color(153, 0, 0));
        jrbefectivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbefectivo.setForeground(new java.awt.Color(255, 255, 255));
        jrbefectivo.setText("Efectivo");

        jrbtargeta.setBackground(new java.awt.Color(153, 0, 0));
        jrbtargeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtargeta.setForeground(new java.awt.Color(255, 255, 255));
        jrbtargeta.setText("Tarjeta");
        jrbtargeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtargetaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Ingrese la cantidad de gasolina que desea surtir:");

        txtdesea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtdesea.setText("0");
        txtdesea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeseaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("*Cada litro de gasolina equivale a $ 8.100 pesos colombianos*");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblgasolina.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblgasolina.setText("0.0 ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ingrese las placas del vehículo:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Se surtiran:");

        lblprecio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblprecio.setText("0.0 ");

        lblLt1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLt1.setText("Lt");

        lblsigno1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsigno1.setText("$");

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtdesea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnvalidar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtactual, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnfull, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblplacas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblgalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(39, 39, 39)
                                .addComponent(lblgasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblLt1)
                        .addGap(74, 74, 74)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn90000, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn50000, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn70000, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn120000, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jrbefectivo)
                                .addGap(61, 61, 61)
                                .addComponent(jrbtargeta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(lblsigno1)
                                .addGap(22, 22, 22)
                                .addComponent(lblprecio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnotro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnsurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(134, 134, 134)
                                    .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(907, 907, 907))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addGap(485, 485, 485)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblprecio)
                                        .addComponent(lblsigno1))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jrbefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbtargeta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblgalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblgasolina)
                                    .addComponent(lblLt1))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblplacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel13)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn50000, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn70000, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn90000, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn120000, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnfull, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnotro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnsurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnvalidar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(txtdesea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactualActionPerformed

    private void btnvalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvalidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvalidarActionPerformed

    private void btnotroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnotroActionPerformed

    private void btnfullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfullActionPerformed

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed

    }//GEN-LAST:event_btnfinalizarActionPerformed

    private void btnsurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsurtirActionPerformed

    }//GEN-LAST:event_btnsurtirActionPerformed

    private void btn120000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn120000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn120000ActionPerformed

    private void btn90000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn90000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn90000ActionPerformed

    private void btn70000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn70000ActionPerformed

    private void btn50000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50000ActionPerformed
 
    }//GEN-LAST:event_btn50000ActionPerformed

    private void txtdeseaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeseaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeseaActionPerformed

    private void jrbtargetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtargetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbtargetaActionPerformed

    private void lblplacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblplacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblplacasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    public javax.swing.JButton btn120000;
    public javax.swing.JButton btn50000;
    public javax.swing.JButton btn70000;
    public javax.swing.JButton btn90000;
    public javax.swing.JButton btnfinalizar;
    public javax.swing.JButton btnfull;
    public javax.swing.JButton btnotro;
    public static javax.swing.JButton btnsurtir;
    public javax.swing.JButton btnvalidar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jbl1;
    public javax.swing.JRadioButton jrbefectivo;
    public javax.swing.JRadioButton jrbtargeta;
    public javax.swing.JLabel lblLt;
    public javax.swing.JLabel lblLt1;
    public javax.swing.JLabel lblcambio;
    public static javax.swing.JLabel lblforma;
    public javax.swing.JPanel lblgalones;
    public static javax.swing.JLabel lblgasolina;
    public static javax.swing.JLabel lblgasolina1;
    public static javax.swing.JTextField lblplacas;
    public static javax.swing.JLabel lblprecio;
    public static javax.swing.JLabel lblprecio1;
    public static javax.swing.JLabel lblrecibido;
    public javax.swing.JLabel lblsigno;
    public javax.swing.JLabel lblsigno1;
    public javax.swing.JTextField txtactual;
    public javax.swing.JTextField txtdesea;
    public javax.swing.JTextField txtmax;
    public javax.swing.JTextField txtotro;
    // End of variables declaration//GEN-END:variables
   
    public void imagen1()
    {
       ImageIcon fot = new ImageIcon("src/imagen/descarga.png");
       Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
       Imagen.setIcon(icono);
       this.repaint();
    }
}
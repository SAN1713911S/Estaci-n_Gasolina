
package Vista;

import static Vista.Factura.fechaActual;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Niño
 */
public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     */
    public Factura() {
        initComponents();
        lblfecha1.setText(fechaActual());
    }   
    public static String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblnit8 = new javax.swing.JLabel();
        jblnit11 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JPanel();
        jblnit = new javax.swing.JLabel();
        jblnit1 = new javax.swing.JLabel();
        lblplacas2 = new javax.swing.JLabel();
        jblnit3 = new javax.swing.JLabel();
        jblnit4 = new javax.swing.JLabel();
        jblnit5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jblnit6 = new javax.swing.JLabel();
        jblnit7 = new javax.swing.JLabel();
        lblplacas = new javax.swing.JLabel();
        lblvalor = new javax.swing.JLabel();
        lblforma = new javax.swing.JLabel();
        btnfinalizar = new javax.swing.JButton();
        lblfecha1 = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        Cambio = new javax.swing.JLabel();
        lblrecibido = new javax.swing.JLabel();
        jblnit9 = new javax.swing.JLabel();
        lblcambio = new javax.swing.JLabel();
        jblnit10 = new javax.swing.JLabel();
        jblnit12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jblnit8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit8.setText("Cantidad gasolina:");

        jblnit11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit11.setText("Cantidad gasolina:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblfecha.setBackground(new java.awt.Color(255, 255, 255));
        lblfecha.setForeground(new java.awt.Color(153, 0, 0));

        jblnit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit.setText("NIT:");

        jblnit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit1.setText("800.197.268-4");

        lblplacas2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblplacas2.setText("Placas:");

        jblnit3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit3.setText("Bogotá , COL");

        jblnit4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit4.setText("Ciudad:");

        jblnit5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit5.setText("Fecha:");

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Factura");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jblnit6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit6.setText("Forma de pago:");

        jblnit7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit7.setText("Valor a pagar:");

        lblplacas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblvalor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblforma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnfinalizar.setBackground(new java.awt.Color(153, 0, 0));
        btnfinalizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizar.setText("Cerrar");
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        lblfecha1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblcantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Cambio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cambio.setText("Cambio:");

        lblrecibido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jblnit9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit9.setText("Recibido:");

        lblcambio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jblnit10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit10.setText("Cantidad gasolina:");

        jblnit12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblnit12.setText("LT");

        javax.swing.GroupLayout lblfechaLayout = new javax.swing.GroupLayout(lblfecha);
        lblfecha.setLayout(lblfechaLayout);
        lblfechaLayout.setHorizontalGroup(
            lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lblfechaLayout.createSequentialGroup()
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblfechaLayout.createSequentialGroup()
                        .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblfechaLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(lblfechaLayout.createSequentialGroup()
                                        .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jblnit4)
                                            .addComponent(jblnit))
                                        .addGap(5, 5, 5))
                                    .addComponent(lblplacas2)
                                    .addComponent(jblnit5)
                                    .addComponent(jblnit6)
                                    .addComponent(jblnit7)
                                    .addComponent(Cambio)
                                    .addComponent(jblnit9)))
                            .addGroup(lblfechaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jblnit10)))
                        .addGap(27, 27, 27)
                        .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblnit1)
                            .addComponent(jblnit3)
                            .addGroup(lblfechaLayout.createSequentialGroup()
                                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblcantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblvalor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(lblfecha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblplacas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(lblforma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(lblrecibido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(lblcambio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jblnit12)))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblfechaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        lblfechaLayout.setVerticalGroup(
            lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblfechaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblnit)
                    .addComponent(jblnit1))
                .addGap(18, 18, 18)
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblnit4)
                    .addComponent(jblnit3))
                .addGap(30, 30, 30)
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblnit5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblplacas2)
                    .addComponent(lblplacas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblnit10)
                    .addComponent(jblnit12))
                .addGap(18, 18, 18)
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblfechaLayout.createSequentialGroup()
                        .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lblfechaLayout.createSequentialGroup()
                                .addComponent(jblnit6)
                                .addGap(27, 27, 27)
                                .addComponent(jblnit7))
                            .addGroup(lblfechaLayout.createSequentialGroup()
                                .addComponent(lblforma, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jblnit9))
                    .addComponent(lblrecibido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(lblfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cambio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcambio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed
        JOptionPane.showMessageDialog(null,"Vuelva Pronto");
        new Factura().setVisible(false);
        dispose();
    }//GEN-LAST:event_btnfinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cambio;
    public javax.swing.JButton btnfinalizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jblnit;
    private javax.swing.JLabel jblnit1;
    private javax.swing.JLabel jblnit10;
    private javax.swing.JLabel jblnit11;
    private javax.swing.JLabel jblnit12;
    private javax.swing.JLabel jblnit3;
    private javax.swing.JLabel jblnit4;
    private javax.swing.JLabel jblnit5;
    private javax.swing.JLabel jblnit6;
    private javax.swing.JLabel jblnit7;
    private javax.swing.JLabel jblnit8;
    private javax.swing.JLabel jblnit9;
    public static javax.swing.JLabel lblcambio;
    public static javax.swing.JLabel lblcantidad;
    private javax.swing.JPanel lblfecha;
    private javax.swing.JLabel lblfecha1;
    public static javax.swing.JLabel lblforma;
    public static javax.swing.JLabel lblplacas;
    private javax.swing.JLabel lblplacas2;
    public static javax.swing.JLabel lblrecibido;
    public static javax.swing.JLabel lblvalor;
    // End of variables declaration//GEN-END:variables
}


package mi.ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import mi.clases.ExcelTableExporter;
import mi.clases.Renderer;
import mi.clases.Validaciones;
import mi.clases.Vlsm;

/**
 *
 * @author Vaio
 */
public class fVlsm extends javax.swing.JFrame {
    List<Vlsm> lis=new ArrayList();
    /**
     * Creates new form fVlsm
     */
    Renderer r= new Renderer();
    DefaultTableModel dt;
    public fVlsm() {
        initComponents();
        Toolkit t= Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/mi/imagenes/simbolo.png")));
        setTitle("App Subnetting");
        setLocationRelativeTo(null);
        Validaciones.soloNumeros(txtipRed);
        Validaciones.soloNumerosEspacio(txtnumHost);
        txtipRed.setToolTipText("Ingrese ip: #.#.#.#");
        txtnumHost.setToolTipText("Cantidad de host: # # # # ... ");
        btnCalcular.setToolTipText("Procesar VLSM");
        btnSalir.setToolTipText("Salir");
        btnLimpiar.setToolTipText("Limpiar");
        dt=(DefaultTableModel) tbLista.getModel();
        tbLista.setDefaultRenderer(Object.class, r);
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/mi/imagenes/fondo2.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setResizable(true);   
        //this.setSize(981,691);
        this.setLocationRelativeTo(fVlsm.this);
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbLista.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        tbLista.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));   
        //tbLista.getTableHeader().setBackground(Color.blue);
        //tbLista.getTableHeader().setForeground(Color.white);
        tbLista.getTableHeader().setFont(new Font("Arial",0,15));


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtipRed = new javax.swing.JTextField();
        txtnumHost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        exportarExcel = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("App Subnetting");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("IP de Red:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Números de Host:");

        txtipRed.setText("192.168.0.0");
        txtipRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipRedActionPerformed(evt);
            }
        });

        txtnumHost.setText("100 500 300");
        txtnumHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumHostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtipRed, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnumHost, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtipRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tbLista.setBackground(new java.awt.Color(204, 204, 255));
        tbLista.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Datos ", "Direccion en N° Binario"
            }
        ));
        tbLista.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbLista);

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mi/imagenes/calculator (1).png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mi/imagenes/eraser.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        exportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mi/imagenes/excel (1).png"))); // NOI18N
        exportarExcel.setText("Exportar");
        exportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarExcelActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mi/imagenes/cancel.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnCalcular)
                        .addGap(103, 103, 103)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(exportarExcel)
                        .addGap(109, 109, 109)
                        .addComponent(btnSalir)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnLimpiar)
                    .addComponent(exportarExcel)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarExcelActionPerformed
        // TODO add your handling code here:
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Exportando a Excel", 1, 3, null, new Object[]{"Exportar y Abrir Documento de Excel", "Solo Exportar", "Cancelar"}, "Cancelar");
        if (seleccion != 2 && seleccion != -1) {
            try {
                ExcelTableExporter excelExporter = new ExcelTableExporter(this.tbLista, new File("Resultado.xls"), "CALCULO DE SUBREDES");
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "Exportado con exito!");
                    if (seleccion == 0) {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler Resultado.xls");
                    }
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_exportarExcelActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea limpiar la lista de datos?", "Limpiando", 0);
        if(0==confirmado){
            DefaultTableModel modelo = (DefaultTableModel)this.tbLista.getModel();
            while (modelo.getRowCount() > 0){
                modelo.removeRow(0);
            }
        }
        txtipRed.setText("");
        txtnumHost.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int validado = 1;
        try {
            Vlsm vl=new Vlsm();
            this.ipred=String.valueOf(this.txtipRed.getText());
            vl.setRangoHost(host);
            this.host=String.valueOf(this.txtnumHost.getText());
            vl.setIp(ipred);

            int[] maskSubred = { 0, 0, 0, 0, 0 };

            String[] ipredCadena = this.ipred.split("\\.");
            int[] ipredNumero = new int[4];
            vl.convertirStringInt(4, ipredCadena, ipredNumero);

            String[] hostCadena = this.host.split("\\s+");
            int[] hostNumero = new int[hostCadena.length];
            vl.convertirStringInt(hostCadena.length, hostCadena, hostNumero);
            //if (txtIpRed.getText().length()>15) {
                //validado=0;
                //JOptionPane.showMessageDialog(null, "IP o rango de host errado, Ejm: 192.168.0.0  500 200 300");
                // }
            for (int i = 0; i < ipredNumero.length; i++) {
                if ((ipredNumero[i] > 255) || (ipredNumero[i] < 0))
                {
                    validado = 0;
                    JOptionPane.showMessageDialog(null, "Rango de IP Red: [0 ; 255] " + vl.getIp());
                }
            }
            for (int i = 0; i < hostNumero.length; i++) {
                if ((hostNumero[i] > Math.pow(2.0D, 24.0D)) || (hostNumero[i] < 3))
                {
                    validado = 0;
                    JOptionPane.showMessageDialog(null, "Rango de host: [3 ; 2^24] " + vl.getRangoHost());
                }
            }
            vl.ordenarHost(hostNumero);
            for (int h = 0; (h < hostCadena.length) && (validado == 1); h++)
            {
                int numeroBits = vl.calcularNumerodeBits(hostNumero[h]);
                String segundoOctal = vl.convertirIntBinario(ipredNumero[1]);
                String tercerOctal = vl.convertirIntBinario(ipredNumero[2]);
                String cuartoOctal = vl.convertirIntBinario(ipredNumero[3]);
                boolean breakCiclo = false;
                if (numeroBits < 8)
                {
                    for (int i = 7; 7 - i < numeroBits; i--) {
                        if (cuartoOctal.charAt(i) != '0') {
                            breakCiclo = true;
                        }
                    }
                }
                else if (numeroBits < 16)
                {
                    breakCiclo = cuartoOctal.equals("00000000") != true;
                    for (int i = 7; 7 - i < numeroBits - 8; i--) {
                        if (tercerOctal.charAt(i) != '0') {
                            breakCiclo = true;
                        }
                    }
                }
                else if (numeroBits < 24)
                {
                    breakCiclo = (cuartoOctal.equals("00000000") != true) || (tercerOctal.equals("00000000") != true);
                    for (int i = 7; 7 - i < numeroBits - 16; i--) {
                        if (segundoOctal.charAt(i) != '0') {
                            breakCiclo = true;
                        }
                    }
                }
                if (breakCiclo == true)
                {
                    JOptionPane.showMessageDialog(null, "No se puede hallar subredes a partir de esta IP de red: " + vl.getIp() + "\n" + "Representacion en Binarios: " + vl.convertirIntBinario(ipredNumero[0]) + "." + vl.convertirIntBinario(ipredNumero[1]) + "." + vl.convertirIntBinario(ipredNumero[2]) + "." + vl.convertirIntBinario(ipredNumero[3]) + "\n" + "Se requiere: [#.#.#.#] como modelo de IP red y el rango de host adecuado a la ip de Red");

                    break;
                }
                insertarFila("Longitud de Red: ", "" + hostNumero[h], "");
                insertarFila("Dirección de Red: ", ipredNumero[0] + "." + ipredNumero[1] + "." + ipredNumero[2] + "." + ipredNumero[3] + " /" + (32 - numeroBits), vl.convertirIntBinario(ipredNumero[0]) + "." + vl.convertirIntBinario(ipredNumero[1]) + "." + vl.convertirIntBinario(ipredNumero[2]) + "." + vl.convertirIntBinario(ipredNumero[3]));
                insertarFila("Número de bits: ", "" + numeroBits, "");
                insertarFila("1ra IP válida: ", ipredNumero[0] + "." + ipredNumero[1] + "." + ipredNumero[2] + "." + (ipredNumero[3] + 1), vl.convertirIntBinario(ipredNumero[0]) + "." + vl.convertirIntBinario(ipredNumero[1]) + "." + vl.convertirIntBinario(ipredNumero[2]) + "." + vl.convertirIntBinario(ipredNumero[3] + 1));

                vl.calcularMascaraSubred(numeroBits, maskSubred);
                vl.calcularHostMax(numeroBits, ipredNumero);

                insertarFila("Última IP válida: ", ipredNumero[0] + "." + ipredNumero[1] + "." + ipredNumero[2] + "." + ipredNumero[3], vl.convertirIntBinario(ipredNumero[0]) + "." + vl.convertirIntBinario(ipredNumero[1]) + "." + vl.convertirIntBinario(ipredNumero[2]) + "." + vl.convertirIntBinario(ipredNumero[3]));
                insertarFila("Dirección de Broadcast: ", ipredNumero[0] + "." + ipredNumero[1] + "." + ipredNumero[2] + "." + (ipredNumero[3] + 1), vl.convertirIntBinario(ipredNumero[0]) + "." + vl.convertirIntBinario(ipredNumero[1]) + "." + vl.convertirIntBinario(ipredNumero[2]) + "." + vl.convertirIntBinario(ipredNumero[3] += 1));
                insertarFila("Máscara de Subred: ", maskSubred[0] + "." + maskSubred[1] + "." + maskSubred[2] + "." + maskSubred[3], vl.convertirIntBinario(maskSubred[0]) + "." + vl.convertirIntBinario(maskSubred[1]) + "." + vl.convertirIntBinario(maskSubred[2]) + "." + vl.convertirIntBinario(maskSubred[3]));
                insertarFila("***********************************************", "***********************************************", "***********************************************");
                if (ipredNumero[3] == 255)
                {
                    if (ipredNumero[2] == 255)
                    {
                        if (ipredNumero[1] == 255)
                        {
                            ipredNumero[0] += 1;
                            ipredNumero[1] = 0;
                            ipredNumero[2] = 0;
                            ipredNumero[3] = 0;
                        }
                        else
                        {
                            ipredNumero[1] += 1;
                            ipredNumero[2] = 0;
                            ipredNumero[3] = 0;
                        }
                    }
                    else
                    {
                        ipredNumero[2] += 1;
                        ipredNumero[3] = 0;
                    }
                }
                else {
                    ipredNumero[3] += 1;
                }
                numeroBits = 0;
                maskSubred = new int[] { 0, 0, 0, 0, 0 };
            }
        } catch (ArrayIndexOutOfBoundsException a){
            JOptionPane.showMessageDialog(null, "IP o rango de host errado, Ejm: 192.168.0.0  500 200 300");
        } catch (NumberFormatException a){
            JOptionPane.showMessageDialog(null, "IP o rango de host errado, Ejm: 192.168.0.0  500 200 300");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtnumHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumHostActionPerformed

    private void txtipRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipRedActionPerformed
    String ipred;
    String host;
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
            java.util.logging.Logger.getLogger(fVlsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fVlsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fVlsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fVlsm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fVlsm().setVisible(true);
            }
        });
    }
    
    private void insertarFila(String nombre, String datos, String datosBinario){
        DefaultTableModel tabla_dinamica = (DefaultTableModel)this.tbLista.getModel();
        Object[] fila = new Object[3];

        fila[0] = nombre;
        fila[1] = datos;
        fila[2] = datosBinario;

        tabla_dinamica.addRow(fila);
        this.tbLista.setModel(tabla_dinamica);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton exportarExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtipRed;
    private javax.swing.JTextField txtnumHost;
    // End of variables declaration//GEN-END:variables
}
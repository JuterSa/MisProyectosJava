/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import modelo.BdData;

/**
 *
 * @author USER
 */
public class frmArtistas extends javax.swing.JFrame {
   Connection conexionBase = null;
    /**
     * Creates new form frmArtistas
     */
    public frmArtistas() {
        initComponents();
        setLocationRelativeTo(null); //Posiciona el Frame en el centro..
        DefaultTableModel tableModel = new DefaultTableModel();
         tableModel.addColumn("Id");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Horas");
       BdData baseDatos = new BdData();
       baseDatos.Conexion();
       //baseDatos.llenardatos();
        for (int i = 0; i < baseDatos.hashCode(); i++) {
            tableModel.addRow(new Object[]{0,1,2});
        }
       
       
       //tableModel.addRow(new Object[]{resultadoBase.getString("nombre"),resultadoBase.getString("horas_estras"),resultadoBase.getString("salario")});
        
        table.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        horas = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Auxilio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        auxilio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Datos = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Agregar artista a la base de datos");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Horas:");

        Auxilio.setText("Auxilio:");

        jLabel5.setText("Salario");

        Agregar.setText("Add +");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        auxilio.setForeground(new java.awt.Color(0, 51, 255));
        auxilio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Horas Extras", "Disponible", "Salario"
            }
        ));
        table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        Datos.setText("Datos");
        Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(Auxilio)
                                    .addComponent(jLabel5)))
                            .addComponent(Agregar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(Datos))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(auxilio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Auxilio))
                            .addComponent(auxilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar)
                            .addComponent(limpiar)
                            .addComponent(Datos))
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        BdData test = new BdData();
        test.Conexion();
        int hTrabajadas,sTrabajado;
        String hora = horas.getText();
        String salary = salario.getText();
        String name = nombre.getText();
        String auxi = auxilio.getSelectedItem().toString();
        hTrabajadas = Integer.parseInt(hora);
        sTrabajado = Integer.parseInt(salary);
        test.Insertar(name, hTrabajadas, auxi, sTrabajado);
       
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        horas.setText(null);
        salario.setText(null);
        nombre.setText(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableComponentShown
       
    }//GEN-LAST:event_tableComponentShown

    private void DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosActionPerformed
        /*BdData test = new BdData();
        test.Conexion();
         test.llenardatos();*/
    }//GEN-LAST:event_DatosActionPerformed

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
            java.util.logging.Logger.getLogger(frmArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmArtistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Auxilio;
    private javax.swing.JButton Datos;
    private javax.swing.JComboBox<String> auxilio;
    private javax.swing.JTextField horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField salario;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
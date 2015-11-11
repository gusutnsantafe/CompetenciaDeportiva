
package competenciadeportiva;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexionBD;

public class AltaCompDeportiva extends javax.swing.JFrame {

   
    public AltaCompDeportiva() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ACEPTAR = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        DeporteAsociado = new javax.swing.JComboBox();
        ATRAS = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        nombreComp = new javax.swing.JTextField();
        Reglamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ALTA_COMPETENCIA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jLabel2.setText("NOMBRE DE COMPETENCIA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 68, 180, 14);

        ACEPTAR.setLabel("ACEPTAR");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });
        getContentPane().add(ACEPTAR);
        ACEPTAR.setBounds(80, 558, 90, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Modalidad de Competencia", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(530, 68, 153, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Forma de Puntuacion", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(530, 118, 150, 20);

        DeporteAsociado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Futbol", "Basquet", "Voley" }));
        DeporteAsociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeporteAsociadoActionPerformed(evt);
            }
        });
        getContentPane().add(DeporteAsociado);
        DeporteAsociado.setBounds(40, 138, 170, 20);

        ATRAS.setText("ATRAS");
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });
        getContentPane().add(ATRAS);
        ATRAS.setBounds(630, 558, 90, 23);

        jCheckBox1.setText("Cant de sets/Tantos por no presentarse");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(530, 198, 270, 23);

        jCheckBox2.setText("Puntos por partidos ganados");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(530, 228, 260, 23);

        jCheckBox3.setText("Puntos por empate");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(530, 258, 250, 23);

        jCheckBox4.setText("Puntos por presentarse");
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(530, 288, 240, 23);

        jCheckBox5.setText("Permite Empate?");
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(530, 318, 240, 23);

        nombreComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCompActionPerformed(evt);
            }
        });
        getContentPane().add(nombreComp);
        nombreComp.setBounds(40, 88, 220, 20);

        Reglamento.setText("Reglamento(Opcional)");
        getContentPane().add(Reglamento);
        Reglamento.setBounds(40, 408, 740, 120);

        jLabel1.setText("Dar de Alta Competencia Deportiva");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 18, 180, 14);

        ALTA_COMPETENCIA.setText("ALTA COMPETENCIA");
        ALTA_COMPETENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTA_COMPETENCIAActionPerformed(evt);
            }
        });
        getContentPane().add(ALTA_COMPETENCIA);
        ALTA_COMPETENCIA.setBounds(40, 369, 133, 23);

        jLabel3.setText("Lugar ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 190, 40, 14);

        jLabel4.setText("Cant:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 190, 30, 14);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 190, 41, 20);

        jButton1.setText("LISTAR PARTICPANTE DE COMPETENCIA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(207, 369, 231, 23);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(90, 190, 56, 20);

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 190, 40, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, ""},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Lugar", "Cant ocupada", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 240, 240, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACEPTARActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void DeporteAsociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeporteAsociadoActionPerformed
        
    }//GEN-LAST:event_DeporteAsociadoActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ATRASActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void nombreCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCompActionPerformed

    private void ALTA_COMPETENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTA_COMPETENCIAActionPerformed
        
    }//GEN-LAST:event_ALTA_COMPETENCIAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AME_Participante ventana2= new AME_Participante();
        ventana2.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String aux= (String)DeporteAsociado.getSelectedItem();
        nombreComp.setText(aux);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AltaCompDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCompDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCompDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCompDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaCompDeportiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JButton ALTA_COMPETENCIA;
    private javax.swing.JButton ATRAS;
    private javax.swing.JComboBox DeporteAsociado;
    private javax.swing.JTextField Reglamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField nombreComp;
    // End of variables declaration//GEN-END:variables
conexionBD cc= new conexionBD();
Connection cn= cc.conexion();

}


package jframe_jdialog;

import java.awt.*;

public class ventana1 extends javax.swing.JFrame {
    
    private Container contenedor;   
    ventanaExterior v1;
  
    public ventana1() {     
        initComponents();
        setTitle("Ventana Principal");
    }
    
    private void ventana2(){
           
          v1 = new ventanaExterior();
            contenedor.add(v1);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VENTANA_EXTERNA = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VENTANA_EXTERNA.setText("VENTANA EXTERNA");
        VENTANA_EXTERNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENTANA_EXTERNAActionPerformed(evt);
            }
        });

        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(VENTANA_EXTERNA)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SALIR)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(VENTANA_EXTERNA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(SALIR)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VENTANA_EXTERNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENTANA_EXTERNAActionPerformed
       
        ventanaExterior dialog = new ventanaExterior(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_VENTANA_EXTERNAActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed

        System.exit(0);    
    }//GEN-LAST:event_SALIRActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SALIR;
    private javax.swing.JButton VENTANA_EXTERNA;
    // End of variables declaration//GEN-END:variables

   
   

    
}

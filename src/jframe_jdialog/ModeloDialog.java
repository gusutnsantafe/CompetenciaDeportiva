
package jframe_jdialog;


import java.awt.event.*;
import javax.swing.*;

public class ModeloDialog extends JFrame implements ActionListener {
    
    public static void main(String args[]){
    
        ModeloDialog d= new ModeloDialog();
        d.setVisible(true);
    }
      
    JPanel p=new JPanel();
    JButton aceptar = new JButton("ACEPTAR");
    
    public ModeloDialog(){
        
        setContentPane(p);
        p.add(aceptar);
        aceptar.addActionListener(this);
        
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(1);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog d= new JDialog();
        d.setSize(200,200); 
        d.setTitle("Agregar Participante");
        d.setVisible(true);
    }
}

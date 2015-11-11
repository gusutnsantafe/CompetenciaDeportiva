
package jframe_jdialog;

import java.awt.*;
import javax.swing.*;

public class MenuP extends JFrame {
      
    private Container contenedor;
    private JButton cargarDialog;
    ACD ventana1;
    
    public static void main(String args[]){
    
        MenuP m= new MenuP();
        m.setVisible(true);
    }
   
    public MenuP(){
           
        setLayout(new BorderLayout(50, 100));
        cargarDialog= new JButton("ACEPTAR");
        contenedor= getContentPane();
        contenedor.add(cargarDialog, BorderLayout.SOUTH);
        
        ventana1= new ACD();
        contenedor.add(ventana1);
              
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
 
     
     
}

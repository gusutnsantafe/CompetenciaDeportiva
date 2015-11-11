
package jframe_jdialog;

import java.awt.Container;
import javax.swing.JDialog;


public class ACD extends JDialog {
   
    private Container contenedor;
  
 public ACD(){
  contenedor=getContentPane();
  contenedor.setLayout(null);
  
  setTitle("CoDejaVu : Titulo Del JDialog");
 
  setSize(300,200);
  
  setLocationRelativeTo(null);
 }
    
    
    
}

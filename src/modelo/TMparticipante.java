
package modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

/*CLASE PARA EL MODELO DE TABLA*/

public class TMparticipante implements TableModel {

    private List <Participante> participantes;
    
    public TMparticipante(List<Participante> lista){
        participantes = lista;
    }
    
    /*CANTIDAD DE PARTICIPANTES*/
    @Override
    public int getRowCount() {
       return participantes.size();/*segun la cantidad de participantes*/
    }

    /*CANTIDAD DE COLUMNAS*/
    @Override
    public int getColumnCount() {
         return 2; /*nombre correo */
    }

    /*NOMBRE DE LAS COLUMNA SEGUN EL INDICE*/
    @Override
    public String getColumnName(int columnIndex) {
        
        String titulo= null;
        
        switch (columnIndex){
        
            case 0:{
                titulo="Correo";
                break;
            }
            case 1:{
                titulo="Nombre";
                break;
            }   

        }
        return titulo;
    }

    /*CLASE COLUMNA*/
    @Override
    public Class<?> getColumnClass(int columnIndex){
         
        return String.class;
    }

    /*Si la columna es distinto de cero, se puede editar*/
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex!=0;
       
    }

    /*OBTENER EL VALOR DE LA COLUMNA Y DEL INDICE*/
    /*FUNCION DE TIPO OBJETO*/
    /*METODO QUE SIRVE PARA VER LOS VALORES DE LA TABLA*/
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Participante p= participantes.get(rowIndex);
         String valor=null;
         
         switch (columnIndex){
        
            case 0:{
                valor = p.getCorreo();
                break;
            }
            case 1:{
                valor= p.getNombre();
                break;
            }   

        }
       return valor;
         
    }

    /*SETIAR EL VALOR*/
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       Participante p= participantes.get(rowIndex);
       
       switch (columnIndex){
        
            case 0:{
                p.setCorreo(aValue.toString());/*si quiere modificar correo*/
                break;
            }
            case 1:{
                 p.setNombre(aValue.toString());/*si quiere modificar nombre*/
                break;
            }   

        }
     
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}

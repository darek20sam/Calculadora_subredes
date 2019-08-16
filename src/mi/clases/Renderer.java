
package mi.clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Vaio
 */
public class Renderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if(i%8==0){
            setBackground(Color.darkGray);
            setForeground(Color.white);
        }else{
            setBackground(Color.white);
            setForeground(Color.darkGray);
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
}

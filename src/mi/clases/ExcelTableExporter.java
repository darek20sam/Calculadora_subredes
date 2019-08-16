/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.clases;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelTableExporter {
    private File file;
    private JTable table;
    private String nombreTab;

    public ExcelTableExporter(JTable table, File file, String nombreTab) throws Exception {
        this.file = file;
        this.table = table;
        this.nombreTab = nombreTab;
    }

    public boolean export() {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(this.file));
            WritableWorkbook w = Workbook.createWorkbook((OutputStream)out);
            WritableSheet s = w.createSheet(this.nombreTab, 0);
            for (int i = 0; i < this.table.getColumnCount(); i++)  {
                for (int j = 0; j < this.table.getRowCount(); j++) {
                    Object objeto = this.table.getColumnName(i);
                    s.addCell((WritableCell)new Label(i+1, j+1, String.valueOf(objeto)));
                }
            }
            for (int i = 0; i < this.table.getColumnCount(); i++)  {
                for (int j = 0; j < this.table.getRowCount(); j++) {
                    Object objeto = this.table.getValueAt(j, i);
                    s.addCell((WritableCell)new Label(i+1, j+2, String.valueOf(objeto)));
                }
            }
           
            w.write();
            w.close();
            out.close();
            return true;
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (WriteException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}


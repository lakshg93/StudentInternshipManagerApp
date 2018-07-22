
package studentinternshipapplication;

import javax.swing.table.AbstractTableModel;

public class TableModelForSelecctedOpForStudents extends AbstractTableModel {
     
    private static final String[] COLUMN_NAMES = {"Company Name" , "Opp name ","Email ","Skills","Description"};
    private static String[][] list;
    
    TableModelForSelecctedOpForStudents (String[][] stList){
        list = stList;
    }
    
    
    
    @Override
    public int getRowCount() {
        return list.length;
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] s = list[rowIndex];
        switch(columnIndex){
            case 0: return s[0];
            case 1: return s[1];
            case 2: return s[2];
            case 3: return s[3];
            case 4: return s[4];
            
            default: return "0";
        }
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
}

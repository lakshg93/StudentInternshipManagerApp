package studentinternshipapplication;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class SelectedOPTable extends AbstractTableModel {
    private static final String[] COLUMN_NAMES = {"Preference order", "Opportunity ID" , "Opportunuty Title ","Company Name "};
    private static String[][] list;
    
    SelectedOPTable  (ArrayList<String[]> stList){
        String[][] ss = new String[stList.size()][];
        list = stList.toArray(ss);
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
            case 0: return rowIndex+1;
            case 1: return s[1];
            case 2: return s[2];
            case 3: return s[3];
            default: return "0";
        }
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }

}

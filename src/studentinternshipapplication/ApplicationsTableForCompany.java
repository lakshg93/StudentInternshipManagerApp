
package studentinternshipapplication;

import javax.swing.table.AbstractTableModel;

public class ApplicationsTableForCompany extends AbstractTableModel {
    
    private static final String[] COLUMN_NAMES = {"Name" , "Department ","Gender ","GPA","Languages","Skills","Mobile No.","Email","Address","Description"};
    private static String[][] list;
    
    ApplicationsTableForCompany (String[][] stList){
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
            case 5: return s[5];
            case 6: return s[6];
            case 7: return s[7];
            case 8: return s[8];
            case 9: return s[9];
            default: return "0";
        }
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
}

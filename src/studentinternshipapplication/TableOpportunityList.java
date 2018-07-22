package studentinternshipapplication;

import javax.swing.table.AbstractTableModel;

public class TableOpportunityList extends AbstractTableModel{
    private static final String[] COLUMN_NAMES = {"Opportunity ID" , "Opportunuty Title ","Company Name "};
    private static String[][] list;
    
    TableOpportunityList (String[][] stList){
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
            default: return "0";
        }
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }

     @Override
    public void setValueAt(Object value ,int row,int col){
        System.out.println(row);
         System.out.println(col);  
        list[row][col] = (String) value;
         fireTableCellUpdated(row, col);
    }
          
    public boolean isCellEditable(int row, int col) {
        System.out.println("........................555555...........................");
        return (col==3);
    }

}

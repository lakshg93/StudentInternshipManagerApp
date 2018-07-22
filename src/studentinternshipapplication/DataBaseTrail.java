package studentinternshipapplication;

import java.io.File;
import javax.swing.JFileChooser;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.io.FileInputStream;
import java.sql.*;
import java.util.regex.Pattern;

public class DataBaseTrail {

//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        DataBaseTrail DT = new DataBaseTrail();
//        DT.writeToDB();
//  
//    }
    public File chooseFile() {

        final JFileChooser fc = new JFileChooser();    // Made final so no duplicates will create
        int choosed = fc.showOpenDialog(null);

        if (choosed == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            return file;
        }
        return null;
    }

    public boolean writeToDB(String id) {

        /*
        Assumed Database table in the structure 
        CREATE TABLE doc(document BLOB, name varchar(50);
         if you need files with larger size - use MediumBlob instead of BLOB
         */
        File file = chooseFile();
Connection con=null;
PreparedStatement pstmt=null;
//        System.out.println(file.getName());
        try {

            // Establishing the Connection To Database;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://sql6.freesqldatabase.com/sql6154485";    //"world" is the Database name
            con = DriverManager.getConnection(url, "sql6154485", "EIczmSX23W");
            System.out.println("Connection Successful");
            /*If you have a Connection pool in the Program get the conncetion Object
        from the connection pool and continue rest as same
             */

            //Saving the file
            String sql = "INSERT INTO cvTable VALUES(?,?,?) ";
           pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setBlob(2, new FileInputStream(file), file.length());
            pstmt.setString(3, file.getName());
            pstmt.executeUpdate();

            return true;

        } catch (Throwable ex) {

            ex.printStackTrace();
            return false;
        }finally{
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    pstmt.close();
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }

}

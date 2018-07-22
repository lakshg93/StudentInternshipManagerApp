package studentinternshipapplication;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBListGeneratorFunctions {

    String url = "jdbc:mysql://sql6.freesqldatabase.com/sql6154485";
    String username = "sql6154485";
    String password = "EIczmSX23W";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
//----------------------------------------------------------------------------------------------------------------------    

    public Connection createConnection() throws SQLException {                              //creating the connection
        con = (Connection) DriverManager.getConnection(url, username, password);
        return con;
    }
//----------------------------------------------------------------------------------------------------------------------

    public void closeConnection(Connection con) throws SQLException {               //closing the connection
        con.close();
    }
//----------------------------------------------------------------------------------------------------------------------

    public void insertEntry(Connection con, String table, String ID, String collums, String data) throws SQLException {             //selecting the applicants 

        String query = "INSERT INTO " + table + " (ID," + collums + ") VALUES (" + data + ");";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.executeUpdate();
        pst.close();

    }
//----------------------------------------------------------------------------------------------------------------------

    public String[] getCollumn(Connection con, String table, String collumn, String other) throws SQLException, ClassNotFoundException {            // creating the GPA list

        String selectQ = "SELECT " + collumn + " FROM " + table + " " + other + ";";

        String countQ = "SELECT COUNT(" + collumn + ") FROM " + table + ";";

        pst = (PreparedStatement) con.prepareStatement(countQ);
        rs = pst.executeQuery();

        rs.next();
        int count = rs.getInt(1);

        String[] entries = new String[count];

        pst = (PreparedStatement) con.prepareStatement(selectQ);
        ResultSet rst = pst.executeQuery();

        int i = 0;
        while (rst.next()) {
            entries[i] = rst.getString(collumn);
            i++;

        }
        pst.close();

        return entries;

    }
//----------------------------------------------------------------------------------------------------------------------

    public String selectOpportunity(Connection con, String stuID, String preference) throws SQLException {                          // return the apportunities corresponding to the preference and student ID

        String query = "SELECT opportunityID FROM preferencetable WHERE studentID='" + stuID + "'AND preference = '" + preference + "' AND Status =0;";

        pst = (PreparedStatement) con.prepareStatement(query);
        rs = pst.executeQuery();
        String opportunity = "";
        if (!rs.next()) {

        } else {
            opportunity = rs.getString(1);
        }
        pst.close();

        return opportunity;
    }
//----------------------------------------------------------------------------------------------------------------------

    public void updateStatus(Connection con, String stuID, String preference) throws SQLException {                 //              updating the staus of the applicant whether he or she is selected

        String query = "UPDATE preferencetable SET Status = '1' WHERE studentID='" + stuID + "'AND preference = '" + preference + "';";

        pst = (PreparedStatement) con.prepareStatement(query);
        pst.executeUpdate();
        pst.close();

    }
//----------------------------------------------------------------------------------------------------------------------

    public void clearTable(Connection con) throws SQLException {                    // clearing the table for junk data in status column

        String query = "UPDATE preferencetable SET Status='0' WHERE 1;";

        pst = (PreparedStatement) con.prepareStatement(query);
        pst.executeUpdate();
        pst.close();

    }
//----------------------------------------------------------------------------------------------------------------------
    
}

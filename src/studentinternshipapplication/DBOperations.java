package studentinternshipapplication;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBOperations {
    
    String url = "jdbc:mysql://sql6.freesqldatabase.com/sql6154485";
    String username = "sql6154485";
    String password = "EIczmSX23W";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DBOperations() {
        createConnection();
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    void createConnection(){
        try{
        con =  (Connection) DriverManager.getConnection(url, username, password); 
        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------
    boolean addStudent(Student s) {
        try {
            //con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "INSERT INTO student_details VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, s.getName());
            pst.setString(2, s.getID());
            pst.setString(3, s.getDepartnment());
            pst.setString(4, s.getTelephone());
            pst.setString(5, s.getEmail());
            pst.setString(6, s.getAddress());
            pst.setString(7, s.getBirthday());
            pst.setString(8, s.getGender());
            pst.setString(9, s.getNIC());
            pst.setFloat(10, s.getGPA());
            pst.setString(11, s.getLanguages());
            pst.setString(12, s.getDescription());
            pst.setString(13, s.getSkills());
            pst.setString(14, s.getPassword());
            pst.setString(15, "Pending");
            pst.setString(16, "0");
            pst.setString(17, "0");
            pst.setString(18, "0");
            
            pst.executeUpdate();                                                                                                   //execute the sql query
            return true;

        } catch (Exception e) {
            System.out.println("addstudent DBOperations");
            System.out.println("***** exception***** ");
            System.out.println(e);
            return false;

        } finally {                                                                                                                             //releasing the resources 
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
//----------------------------------------------------------------------------------------------------------------------------------------

    boolean addCompany(Company c) {
        try {
           // con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "INSERT INTO company_details VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, 0);
            pst.setString(2, c.getAgentName());
            pst.setString(3, c.getAgentID());
            pst.setString(4, c.getPassword());
            pst.setString(5, c.getCompanyName());
            pst.setString(6, c.getPosition());
            pst.setString(7, c.getAgentEmail());
            pst.setString(8, c.getMobile());
            pst.setString(9, c.getLandline());
            pst.setString(10, c.getAddress());
            pst.setInt(11, c.getSlots());
            pst.setString(12, c.getSkills());
            pst.setString(13, c.getOppName());
            pst.setString(14, c.getDescription());
            pst.setString(15, c.getComEmail());
            pst.setString(16,c.getAdminAccepted());

            pst.executeUpdate();                                                                                                   //execute the sql query
            return true;

        } catch (Exception e) {
            System.out.println("***** exception***** ");
            System.out.println(e);
            return false;

        } finally {                                                                                                                             //releasing the resources 
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
//----------------------------------------------------------------------------------------------------------------------------------------

    ResultSet retrieveLoginInfor(String user) {
        try {

           // con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "SELECT ID,Password FROM " + user;
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            return rs;

        } catch (Exception e) {

            System.out.println("***** exception***** ");
            System.out.println(e);
            return null;

        }

    }
//----------------------------------------------------------------------------------------------------------------------------------------
// this method returns all the content in a database for a given table
    ResultSet getContact(String user, String loginType) {                                  // user is the primary key of the table as well as the userID 
        try {                                                                                                                   // login type - student_detail or company_detail - (table name)

            //con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "SELECT * FROM " + loginType + " WHERE ID = (SELECT ID FROM "+loginType+" WHERE ID = '" + user + "' ) ";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            System.out.println("DBOperations - getcontact ");
            return rs;

        } catch (Exception e) {

            System.out.println("***** exception  in get contact method in DBOperations class***** ");
            System.out.println(e);
            return null;

        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------    
    ResultSet getOpportunitiesForStudents(String id, String loginType) {                                  // user is the primary key of the table as well as the userID 
        try {                                                                                                                   // login type - student_detail or company_detail - (table name)
           //con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            //String query = "SELECT * FROM " + loginType + " WHERE CompanyID = (SELECT ID FROM "+loginType+" WHERE CompanyID = " + id + " ) ";
            String query = "SELECT  * FROM " + loginType + " WHERE CompanyID = " + id ;
            System.out.println(query);
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            System.out.println("DBOperations - getcontact get contact hhhhhhhhhhhhhhhhhhh  ");
            System.out.println(rs.getString(1));
            return rs;

        } catch (Exception e) {

            System.out.println("***** exception  in getOpportunitiesForStudents  method in DBOperations class***** ");
            System.out.println(e);
            return null;

        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------    

    boolean updateStudent(Student s) {
        try {
            //con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "UPDATE student_details SET Name='" + s.getName() + "' , ID='" + s.getID() + "' , Depatment ='" + s.getDepartnment() + "' , Telephone='" + s.getTelephone() + "' , Email='" + s.getEmail() + "' , Address='" + s.getAddress() + "' , Birthday='" + s.getBirthday() + "' , Gender='" + s.getGender() + "' , NIC='" + s.getNIC() + "' , GPA='" + s.getGPA() + "' , Languages='" + s.getLanguages() + "' , Description='" + s.getDescription() + "' , Skills='" + s.getSkills() + "' , Password='" + s.getPassword() + "' WHERE ID='" + s.getID() + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();                                                                                                   //execute the sql query
            return true;

        } catch (Exception e) {
            System.out.println("***** exception*update");
            System.out.println(e);
            return false;

        } finally {                                                                                                                             //releasing the resources 
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------

    boolean updateCompany(Company c){
    try {
            //con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "UPDATE company_details SET agentName='"+c.getAgentName()+"' , ID='"+c.getAgentID()+"' , Password ='"+c.getPassword()+"' , companyName='"+c.getCompanyName()+"' , position='"+c.getPosition()+"' , email='"+c.getAgentEmail()+"' , mobile='"+c.getMobile()+"' , land='"+c.getLandline()+"' , address='"+c.getAddress()+"' , availableSlots='"+c.getSlots()+"' , expectedSkills ='"+c.getSkills()+"' , oppName ='"+c.getOppName()+"' , description='"+c.getDescription()+"' , comEmail ='"+c.getComEmail()+"' WHERE CompanyID='"+c.getCompanyID()+"'";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.executeUpdate();                                                                                                   //execute the sql query
            return true;

        } catch (Exception e) {
            System.out.println("***** exception*update");
            System.out.println(e);
            return false;

        } finally {                                                                                                                             //releasing the resources 
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    ResultSet RetrieveStudentForAdmin(){
        try {

           // con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "SELECT ID,adminAccepted,app1,app2,app3 FROM student_details";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            return rs;

        } catch (Exception e) {

            System.out.println("***** exception***** ");
            System.out.println(e);
            return null;

        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    ResultSet retrieveCompanyForAdmin(){
        try {

           // con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "SELECT CompanyID,companyName, adminAccepted, ID FROM company_details";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            return rs;

        } catch (Exception e) {

            System.out.println("***** exception in DBoperations retrieveCompanyforAdmin***** ");
            System.out.println(e);
            return null;

        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    
    boolean acceptUser(String user,String loginType, String msg){
        System.out.println("acceptUser method in DBOperations class");
    try {
           // con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "UPDATE "+loginType+" SET adminAccepted = '"+msg+ "' WHERE ID='" +user + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();                                                                                                   //execute the sql query
            return true;

        } catch (Exception e) {
            System.out.println("***** exception in acceptUser in DBoperation class");
            System.out.println(e);
            return false;

        } finally {                                                                                                                             //releasing the resources 
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
 //---------------------------------------------------------------------------------------------------------------------------------------
 ResultSet retrieveOpptunityListForStudent(){
        try {

           // con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "SELECT CompanyID,companyName, oppName FROM company_details";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            return rs;

        } catch (Exception e) {

            System.out.println("***** exception in DBoperations retrieveOpptunityListForStudent***** ");
            System.out.println(e);
            return null;

        }
 }
 //---------------------------------------------------------------------------------------------------------------------------------------
 boolean addSelectOpportunities(String s1,int s2,int s3) {
        try {
            //con = (Connection) DriverManager.getConnection(url, username, password);            //get the connection
            String query = "INSERT INTO preferencetable VALUES ( ? , ? , ?,? )";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1,s1);
            pst.setInt(2,s2);
            pst.setInt(3,s3);
            pst.setInt(4,0);
            pst.executeUpdate();                                                                                                   //execute the sql query
            return true;

        } catch (Exception e) {
            System.out.println("addstudent Test Student");
            System.out.println("***** exception***** ");
            System.out.println(e);
            return false;

        } finally {                                                                                                                             //releasing the resources 
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
 //---------------------------------------------------------------------------------------------------------------------------------------
 
    public String[] getSelectedCompanies(String stdID) {
        String[] opportunity = new String[3];
        try {
            String query = "SELECT opportunityID FROM preferencetable WHERE studentID='" + stdID + "'AND Status =1;";
            System.out.println(query);
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
            
            int i = 0;
            while (rs.next()) {
                opportunity[i] = rs.getString(1);
                i++;

            }
            pst.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return opportunity;
    }
//----------------------------------------------------------------------------------------------------------------------------------------

    public ResultSet getSelectedStudents(String compID)  {                // output the applicants for a specific company
        
        String query = "SELECT studentID FROM preferencetable WHERE opportunityID='" + compID + "'AND Status =1;";
        System.out.println(query);
        try {
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

//----------------------------------------------------------------------------------------------------------------------------------------
    public ResultSet getCompanyInfo(String compID) {
      String query = "SELECT * FROM company_details WHERE CompanyID ="+compID;
      System.out.println(query);
        try {   
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      return rs;
  
  }
    private void While(boolean next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

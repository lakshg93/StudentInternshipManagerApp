package studentinternshipapplication;

import java.sql.ResultSet;

public class ValidateMethods {
   
 //------------------------------------------------------------------------------------------------------------------------------------
    boolean validateLogin(ResultSet rs, String userName, String password) {  //return false for invalid login
        
        try{
        while (rs.next()) {
            if (userName.equals(rs.getString(1))) {
                if (password.equals(rs.getString(2))) {
                    return true;
                }
            }
        }
        return false;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }  
    }
//----------------------------------------------------------------------------------------------------------------------------------------

}

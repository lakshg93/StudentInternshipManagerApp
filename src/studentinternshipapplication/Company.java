package studentinternshipapplication;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Company {

    private int companyID = 1 ;                          //opportunity ID
    private String agentName;
    private String password;
    private String AgentID;
    private String companyName;
    private String position;
    private String agentEmail;
    private String mobile;
    private String landline;
    private String address;
    private int slots;
    private String skills;
    private String oppName;
    private String description;
    private String comEmail;
    private String adminAccepted = "Pending";
    
    
    //--------------------------------------------------------------------------------------------------------------------------------------
    public void setDetails(ResultSet rs){                                       //set the attributes to a given person
        System.out.println("setDetails method in Company class");
        try{
            while (rs.next()) {
                setCompanyID(Integer.parseInt(rs.getString(1)));
                setAgentName(rs.getString(2));
                setAgentID(rs.getString(3));
                setPassword(rs.getString(4));
                setCompanyName(rs.getString(5));
                setPosition(rs.getString(6));
                setAgentEmail(rs.getString(7));
                setMobile(rs.getString(8));
                setLandline(rs.getString(8));
                setAddress(rs.getString(10));
                setSlots(Integer.parseInt(rs.getString(11)));
                setSkills(rs.getString(12));
                setOppName(rs.getString(13));
                setDescription(rs.getString(14));
                setComEmail(rs.getString(15));
                setAdminAccepted(rs.getString(16));
            }
        }catch(Exception e){
            System.out.println(e);
        }  
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    public String[][] setMiniDataForAdminTable(ResultSet rs){
        ArrayList<String[]> studentArrayList = new ArrayList<String[]>();
         try{
           while (rs.next()) {
                String[] s =  new String[5];
                s[0]=(rs.getString(1));
                s[1]=(rs.getString(2));
                s[2]=(rs.getString(3));
                s[3]=(rs.getString(4));
                studentArrayList.add(s);
            }
           String[][] ss = new String[studentArrayList.size()][];
           return studentArrayList.toArray(ss);
        }catch(Exception e){
            System.out.println(e);
            return null;
            
        } 
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    public String[][] setMiniDataForStudentTable(ResultSet rs){
        ArrayList<String[]> studentArrayList = new ArrayList<String[]>();
         try{
           while (rs.next()) {
                String[] s =  new String[4];
                s[0]=(rs.getString(1));
                s[1]=(rs.getString(2));
                s[2]=(rs.getString(3));
                s[3]="0";
                studentArrayList.add(s);
            }
           String[][] ss = new String[studentArrayList.size()][];
           return studentArrayList.toArray(ss);
        }catch(Exception e){
            System.out.println(e);
            return null;
            
        } 
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    public String[][] setMiniDataForstudenntTable(ResultSet rs){                            //add the opprtunity data to the student interface table to show them the 
        ArrayList<String[]> studentArrayList = new ArrayList<String[]>();                //available opprtunities 
         try{
           while (rs.next()) {
                String[] s =  new String[3];
                s[0]=(rs.getString(1));
                s[1]=(rs.getString(2));
                s[2]=(rs.getString(3));
                studentArrayList.add(s);
            }
           String[][] ss = new String[studentArrayList.size()][];
           return studentArrayList.toArray(ss);
        }catch(Exception e){
             System.out.println("exception in class company method setMiniDataForstudenntTable()");
            System.out.println(e);
            return null;
            
        } 
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    
    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAgentID() {
        return AgentID;
    }

    public void setAgentID(String AgentID) {
        this.AgentID = AgentID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getOppName() {
        return oppName;
    }

    public void setOppName(String oppName) {
        this.oppName = oppName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComEmail() {
        return comEmail;
    }

    public void setComEmail(String comEmail) {
        this.comEmail = comEmail;
    }
     public String getAdminAccepted() {
        return adminAccepted;
    }

    public void setAdminAccepted(String adminAccepted) {
        this.adminAccepted = adminAccepted;
    }
}

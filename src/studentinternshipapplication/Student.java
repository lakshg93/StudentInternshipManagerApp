package studentinternshipapplication;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Student {

    private String name;
    private String ID;
    private String departnment;
    private String email;
    private String telephone;
    private String address;
    private String birthday;
    private String gender;
    private String NIC;
    private float GPA;
    private String languages;
    private String skills;
    private String description;
    private String password;
    private String adminAccepted;
    private String app1;
    private String app2;
    private String app3;
            

    //----------------------------------------------------------------------------------------------------------------------------------
    public void setDetails(ResultSet rs){                                       //set method to set the attributes of a given person
        try{                                                                                           //  ** this resultSet only contain the info of one person
            while (rs.next()) {
                setName(rs.getString(1));
                setID(rs.getString(2));
                setDepartnment(rs.getString(3));
                setTelephone(rs.getString(4));
                setEmail(rs.getString(5));
                setAddress(rs.getString(6));
                setBirthday(rs.getString(7));
                setGender(rs.getString(8));
                setNIC(rs.getString(9));
                setGPA(Float.parseFloat(rs.getString(10)));
                setLanguages(rs.getString(11));
                setDescription(rs.getString(12));
                setSkills(rs.getString(13));
                setPassword(rs.getString(14));
                setAdminAccepted(rs.getString(15));
                setApp1(rs.getString(16));
                setApp2(rs.getString(17));
                setApp3(rs.getString(18));
            }
        }catch(Exception e){
            System.out.println(e);
        }  
    }
    //----------------------------------------------------------------------------------------------------------------------------------
    public String[][] setMiniDataForAdminTable(ResultSet rs){
        ArrayList<String[]> studentArrayList = new ArrayList<String[]>();
         try{
           while (rs.next()) {
                String[] s =  new String[5];
                s[0]=(rs.getString(1));
                s[1]=(rs.getString(2));
                s[2]=(rs.getString(3));
                s[3]=(rs.getString(4));
                s[4]=(rs.getString(5));
                studentArrayList.add(s);
            }
           String[][] ss = new String[studentArrayList.size()][];
           return studentArrayList.toArray(ss);
        }catch(Exception e){
            System.out.println(e);
             //return studentArrayList;
            return null; 
        } 
    }
    //----------------------------------------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDepartnment() {
        return departnment;
    }

    public void setDepartnment(String departnment) {
        this.departnment = departnment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminAccepted() {
        return adminAccepted;
    }

    public void setAdminAccepted(String adminAccepted) {
        this.adminAccepted = adminAccepted;
    }

    public String getApp1() {
        return app1;
    }

    public void setApp1(String app1) {
        this.app1 = app1;
    }

    public String getApp2() {
        return app2;
    }

    public void setApp2(String app2) {
        this.app2 = app2;
    }

    public String getApp3() {
        return app3;
    }

    public void setApp3(String app3) {
        this.app3 = app3;
    }
}

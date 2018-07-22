
package studentinternshipapplication;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class ListGeneratingOperations {
    public static int search(String[] ar, String key){
        int i;
        for (i=0;i< ar.length;i++){
            if(key.equals(ar[i]))
                break;
        }
        return i;
        }
    
    public static void listGenerator() throws SQLException, ClassNotFoundException {
          
          DBListGeneratorFunctions db = new DBListGeneratorFunctions();
          Connection con = db.createConnection();
          db.clearTable(con);
          
          String[] GPAList = db.getCollumn(con,"student_details", "ID","ORDER BY GPA DESC");
        
          String[] luckList1 = RandomListGenerator.shuffleArray(GPAList);
          String[] luckList2 = new String[GPAList.length];
          
          if (GPAList.length%2==0){
                String[] luckList2Second = RandomListGenerator.shuffleArray(Arrays.copyOfRange(GPAList, 0,GPAList.length/2));
                String[] luckList2First = RandomListGenerator.shuffleArray(Arrays.copyOfRange(GPAList, GPAList.length/2,GPAList.length));
               
                for (int j=0;j<GPAList.length/2;j++){
                    luckList2[j]=luckList2First[j];
                    luckList2[GPAList.length/2+j]=luckList2Second[j];
            }
          }
          else{
                String[] luckList2Second = RandomListGenerator.shuffleArray(Arrays.copyOfRange(GPAList, 0, (GPAList.length/2+1)));
                String[] luckList2First = RandomListGenerator.shuffleArray(Arrays.copyOfRange(GPAList, GPAList.length/2+1,GPAList.length));
                
                    luckList2[GPAList.length/2] = luckList2Second[0];
                for (int j=0;j<GPAList.length/2;j++){
                    luckList2[j]=luckList2First[j];
                    luckList2[GPAList.length/2+j+1]=luckList2Second[j+1];
                    
                    }
                
                  
                  }
          
          
          
          String[] companyList = db.getCollumn(con,"company_details", "CompanyID", "");
          String[] companyOpportunityCount = db.getCollumn(con,"company_details", "availableSlots", "");
         
          for(int i=1;i<=GPAList.length;i++){
//              for (int k=0;k<companyList.length;k++){
//                    //System.out.println(companyList[k]+" "+companyOpportunityCount[k]);
//                }
              boolean flag = false;
              int preference = 1;
              while (flag == false & preference<= companyList.length){
                  
                //System.out.println(preference +" "+GPAList[i-1]);
                String opportunity = db.selectOpportunity(con,GPAList[i-1], Integer.toString(preference));
                if(opportunity.length()>0){
                int index = search(companyList,opportunity);
                    //System.out.println("GPA Student -"+GPAList[i-1]+"  Company- "+opportunity+"Preference+ "+preference);
                 // System.out.println(index);
                    if (Integer.parseInt(companyOpportunityCount[index])>0){
                        companyOpportunityCount[index]=Integer.toString(Integer.parseInt(companyOpportunityCount[index])-1);
                        flag = true;
                        db.updateStatus(con,GPAList[i-1], Integer.toString(preference));
                        System.out.println(i+" Student"+ GPAList[i-1]+" GPA List - Company "+opportunity+" Preference "+preference);
                        }
                    
                        
                        
              }
                preference = preference+1;
               // System.out.println("Preference end "+preference);
              }
              flag = false;
              preference = 1;
              while (flag == false & preference<= companyList.length){
                  //System.out.println("Preference "+preference);
                String opportunity = db.selectOpportunity(con,luckList1[i-1], Integer.toString(preference));
                if(opportunity.length()>0){
                 //   System.out.println("luck 1 Student -"+luckList1[i-1]+"  Company- "+opportunity+"Preference+ "+preference);
                int index = search(companyList,opportunity);
                    if (Integer.parseInt(companyOpportunityCount[index])>0){
                        companyOpportunityCount[index]=Integer.toString(Integer.parseInt(companyOpportunityCount[index])-1);
                        flag = true;
                        db.updateStatus(con,luckList1[i-1], Integer.toString(preference));
                        System.out.println(i+" Student"+ luckList1[i-1]+" Luck List 1 - Company "+opportunity+" Preference "+preference);
                        }
                    
                        
                        
              }
               preference = preference+1; 
               //System.out.println("Preference end "+preference);
              }
              flag = false;
              preference = 1;
              while (flag == false & preference<= companyList.length){
                 // System.out.println("Preference start "+preference);
                String opportunity = db.selectOpportunity(con,luckList2[i-1], Integer.toString(preference));
                if(opportunity.length()>0){
                   // System.out.println(" luck 2 Student -"+luckList2[i-1]+"  Company- "+opportunity+"Preference+ "+preference);
                int index = search(companyList,opportunity);
                    if (Integer.parseInt(companyOpportunityCount[index])>0){
                        companyOpportunityCount[index]=Integer.toString(Integer.parseInt(companyOpportunityCount[index])-1);
                        flag = true;
                        db.updateStatus(con,luckList2[i-1], Integer.toString(preference));
                        System.out.println(i+" Student"+ luckList2[i-1]+" Luck List 2 - Company "+opportunity+" Preference "+preference);
                        }
                    
                        
              }
                preference = preference+1;
                //System.out.println("Preference end "+preference);
              }
              }
          
          db.closeConnection(con);
          }
          
          
}

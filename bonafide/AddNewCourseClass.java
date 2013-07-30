/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

import java.sql.*;
/**
 *
 * @author ishant0
 */
public class AddNewCourseClass {
    //Constructors
    public AddNewCourseClass() {
    }

    public AddNewCourseClass(String course_name, String fullform, String years, int sem) {
        this.course_name = course_name;
        this.fullform = fullform;
        this.years = years;
        this.sem = sem;
    }
    //Getter methods
    public String getCourse_name() {
        return course_name;
    }

    public int getSem() {
        return sem;
    }

    public String getFullform() {
        return fullform;
    }
    //setter methods
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setFullform(String fullform) {
        this.fullform = fullform;
    }

    public void setYears(String years) {
        this.years = years;
    }       
    //validations for emptyness
    public boolean isEmpty(){
        Validations v = new Validations();
        if(v.isEmpty(course_name) || v.isEmpty(fullform) || v.isEmpty(years) || (v.isEmpty(sem))){ 
            return true;
        }
        else{
            return false;
        }
    }
    //validatins -- fullform can't have digits
    public boolean fullformContainsDigit(){
        Validations v = new Validations();
        if(v.contaionsDigit(years)){ 
            return true;
        }
        else{
            return false;
        }
    }
    //putting new course and its details in database
    public void putToDatabase(String qr, String added_message, String error){
        try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement(qr);
        ps.executeUpdate();
        c.closeConnection(con, ps, rs);
        if(added_message != null){
            javax.swing.JOptionPane.showMessageDialog(null, added_message);
        }
        }
        catch(Exception ex){javax.swing.JOptionPane.showMessageDialog(null, error+ex);}
       finally{ c.closeConnection(con, ps, rs);}        
    }
    
    public void addPItoDatabase(){}
    
    //variables
    private String course_name;
    private String fullform;
    private String years;
    private int sem;
    private String pi1_name;
    private int till_sem1;
    private String pi2_name;
    private int til2_sem1;
    
    
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Connect c;
}

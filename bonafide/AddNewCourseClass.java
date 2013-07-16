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

    public AddNewCourseClass(String course_name, String fullform, float years) {
        this.course_name = course_name;
        this.fullform = fullform;
        this.years = years;
    }
    //Getter methods
    public String getCourse_name() {
        return course_name;
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

    public void setYears(float years) {
        this.years = years;
    }       
    //validations for emptyness
    public boolean isEmpty(){
        Validations v = new Validations();
        if(v.isEmpty(course_name) || v.isEmpty(fullform) || v.isEmpty(years)){
            return true;
        }
        else{
            return false;
        }
    }
    //validatins -- fullform can't have digits
    public boolean fullformContainsDigit(){
        Validations v = new Validations();
        if(v.contaionsDigit(Float.toString(years))){ 
            return true;
        }
        else{
            return false;
        }
    }
    //putting new course and its details in database
    public void putDataIntoDatabase(){
        try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement("insert into course values('"+course_name+"', '"+fullform+"', "+years+")");
        ps.executeUpdate();
        c.closeConnection(con, ps, rs);
        javax.swing.JOptionPane.showMessageDialog(null, "Course "+course_name+" is added!!");
        }
        catch(Exception ex){javax.swing.JOptionPane.showMessageDialog(null, "Problem in putting data into database data "+ex);}
       finally{ c.closeConnection(con, ps, rs);}        
    }
    //variables
    private String course_name;
    private String fullform;
    private float years;
    
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Connect c;
}

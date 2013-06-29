/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author ishant0
 */
public class SecondClass {
    //Constructors
    public SecondClass() {
    }

    public SecondClass(String name, String rollnum, String course, String cert_type, String enrollment, String father_name, int semester) {
        this.name = name;
        this.rollnum = rollnum;
        this.course = course;
        this.cert_type = cert_type;
        this.enrollment = enrollment;
        this.father_name = father_name;
        this.semester = semester;
    }
    
    //Getter methods
    public String getCert_type() {
        return cert_type;
    }

    public String getCourse() {
        return course;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getName() {
        return name;
    }

    public String getRollnum() {
        return rollnum;
    }

    public int getSemester() {
        return semester;
    }

    public String getRequie_address() {
        return requie_address;
    }

    public String getRequie_cgpa() {
        return requie_cgpa;
    }

    public String getRequie_fee() {
        return requie_fee;
    }

    public String getRequie_year() {
        return requie_year;
    }
    
    
    
    //setter methods
    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollnum(String rollnum) {
        this.rollnum = rollnum;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    //Validations
    Validations v = new Validations();
    public boolean isFatherNamevallid(){
        if(v.contaionsDigit(father_name)){
            return false;
        }
        return true;
    }
    //putting data into datbase.
    public void putDataIntoDatabase(){
    try{
        c = new Connect();
        con = c.getConnection();
           
        ps =con.prepareStatement("insert into firstInfo (rollnum, name, course, sem, ctype, father_name, enrollment) values(?,?,?,?,?,?,?)");
        ps.setString(1,rollnum);
        ps.setString(2,name);
        ps.setString(3,course);
        ps.setInt(4, semester);
        ps.setString(5,cert_type); 
        ps.setString(6,father_name);
        ps.setString(7, enrollment);
            //SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
            //ps.setTimestamp(6, ts);
            //ps.setDate(6, ts);
        ps.executeUpdate();
        c.closeConnection(con, ps, rs);
        }
        catch(Exception ex){JOptionPane.showMessageDialog(null, "Problem in putting data into database data "+ex);}
       finally{ c.closeConnection(con, ps, rs);}        
    }
    
    public void identifyTypeAndMove( SecondClass sc){
    //Identifing the type and moving to concerned type of certificate.
       //Step-1 knowing that the ctype have requirements or not.
       try{
           c = new Connect();
           con = c.getConnection();
           ps = con.prepareStatement("select requirements from type where typeName = '"+cert_type+"'");
           rs = ps.executeQuery();
           rs.next();
           if(rs.getString("requirements").equals("n")){
               System.out.println("not any requirements:)"); 
               CreateCertificate cc = new CreateCertificate();
               cc.create(sc, null); 
           }
           else{
               //Step-2closing connection with type and connecting with requirements table.
               c.closeConnection(null, ps, rs); 
               
               ps = con.prepareStatement("select * from requirements where typeName = '"+cert_type+"'");
               rs = ps.executeQuery();
               requie_cgpa = rs.getString("cgpaSgpa");
               requie_address = rs.getString("address");
               requie_fee = rs.getString("feeStructure");
               requie_year = rs.getString("year");
               //System.out.println("requirements are "+cgpa+address+fee+year);
               if((requie_cgpa.equals("y") & requie_address.equals("y")) || (requie_cgpa.equals("y") & requie_year.equals("y")) || (requie_year.equals("y") & requie_address.equals("y"))){
                   new AllRequired(sc).setVisible(true); 
               }
               else if(requie_cgpa.equals("y")){
                   new CGPA(sc).setVisible(true);
               }
               else if(requie_address.equals("y")){
                   new Address(sc).setVisible(true);
               }
               else if(requie_year.equals("y")){
                   new YearOnly(sc).setVisible(true);
               }
               else{
                   new YearOnly().setVisible(true);
               }               
           }
           //this.dispose();
       }
       catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
       finally{c.closeConnection(con, ps, rs);}         
  
    }
    
    
    
    
    
    
    
    //declaring variables
    protected String name;
    protected String rollnum;
    protected String course;
    protected String cert_type;
    protected String enrollment;
    protected String father_name;
    protected int semester;
   
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Connect c;
   
   private String requie_cgpa;
   private String requie_address;
   private String requie_fee;
   private String requie_year;
}

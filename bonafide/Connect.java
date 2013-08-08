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
public class Connect {
    public java.sql.Connection getConnection(){
        try
        {
            Class.forName("org.sqlite.JDBC");
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:sqlite:bonafide.db");
            return con;
        }catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, "Problem in connecting with database. "+e);             
             return null;
         }
    }
    
    public void closeConnection(java.sql.Connection con, java.sql.PreparedStatement ps, java.sql.ResultSet rs){
        try{
            if(rs != null)
                rs.close();
            if(ps != null){
                ps.close();
            }
            if(con != null){
                con.close();
            }
        }catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, "Problem in closing database. "+e);   
        }
    }
    
    public String splitJoin(String formate, String delimiter, String toAdd ){
        String added = formate;
        try{
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(java.util.regex.Pattern.quote(delimiter));
        String data[] = pattern.split(formate);
        added = data[0] +" "+toAdd+" "+data[1];
        //System.out.println(added);
        return added;
        }catch(Exception e){System.out.println(e+delimiter); return added;}
        //finally{System.out.println(added);}
    }
    
    public static void confirmIt(){
        String message = "There are commands in the output buffer - really quit?";
    String title = "Really Quit?";
    // display the JOptionPane showConfirmDialog
    int reply = javax.swing.JOptionPane.showConfirmDialog(null, message, title, javax.swing.JOptionPane.YES_NO_OPTION);
    if (reply == javax.swing.JOptionPane.YES_OPTION)
    {
      System.exit(0);
    }
   } 
    
    
    public void getAllFromDB(String qr, String field_name, javax.swing.JComboBox combo, String error_message ){
    //fetching all types from type table
    try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement(qr);
        rs = ps.executeQuery();
        java.util.ArrayList<String> entries = new java.util.ArrayList();
        while(rs.next()){
            entries.add(rs.getString(field_name));
        }
        combo.setModel(new javax.swing.DefaultComboBoxModel(entries.toArray(new String[0]))); 
        c.closeConnection(con, ps, rs); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, error_message+e);}
    finally{ c.closeConnection(con, ps, rs); 
    }
}
    
public void putSemestersFromDatabaseToComboBox(String course_name, javax.swing.JComboBox combo, String error_message){
    try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement("select semesters from course where name = '"+course_name+"'");
        rs = ps.executeQuery();
        java.util.ArrayList<Integer> entries = new java.util.ArrayList();
        rs.next();
        int total_sems = rs.getInt("semesters");    
        for(int i = 0; i<total_sems; i++){
            entries.add(i+1);
        }
        //System.out.println(total_sems); 
        combo.setModel(new javax.swing.DefaultComboBoxModel(entries.toArray(new Integer[0])));
        c.closeConnection(con, ps, rs); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, error_message+e);}
    finally{ c.closeConnection(con, ps, rs); 
    }
}

public String getYearsofCourse(String course_name, String error_message){
    try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement("select years from course where name = '"+course_name+"'");
        rs = ps.executeQuery();
        rs.next();
        String years = rs.getString("years");
        c.closeConnection(con, ps, rs); 
        return years;
        }catch(Exception e){            
            javax.swing.JOptionPane.showMessageDialog(null, error_message+e);
            return null;
        }
    finally{ c.closeConnection(con, ps, rs); 
    }
}

public String getFullFormOfcourse(String course){
    try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement("select full_name from course where name = '"+course+"'");
        rs = ps.executeQuery();
        rs.next();
        String full_form = rs.getString("full_name");
        c.closeConnection(con, ps, rs); 
        return full_form;
        }catch(Exception e){            
            javax.swing.JOptionPane.showMessageDialog(null, "Internal Problem; unable to fetch full form of "+course+e);
            return course;
        }
    finally{ c.closeConnection(con, ps, rs); 
    }
}
       
 //Variables DEclaration:
    Connect c;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;       
}

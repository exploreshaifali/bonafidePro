/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ishant0
 */
public class NewClassjr { 
    public static void main(String args[]){ 
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =  DriverManager.getConnection("jdbc:sqlite:C:/Documents and Settings/ishant0/bonafide.db");
           /* String report = "E:\\PD\\pd\\pratice\\Bonafide\\src\\bonafide\\report2.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp);
            */
            PreparedStatement ps =conn.prepareStatement("select name from firstInfo where name like 'a%'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //System.out.println(rs.getString(3)+"\t"+rs.getString(2));
                System.out.println(rs.getString("name"));
            }
            conn.close();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }
}

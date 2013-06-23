/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

import net.sf.jasperreports.engine.JasperCompileManager;
import  net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperPrint;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRDataSource;
import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ishant0
 */
public class Try {
    public static void main(String[] args){
        Second sc = new Second();
       /* JasperReport jasperReport;
        JasperPrint jasperPrint;
        
        try{
            //jasperReport = JasperCompileManager.compileReport("E:/PD/pd/pratice/Bonafide/src/bonafide/report1.jrxml");
            //jasperReport = (JasperReport)JRLoader.loadObject("E:/PD/pd/pratice/Bonafide/src/bonafide/report1.jrxml");
             JasperDesign jasperDesign = JRXmlLoader.load("E:/PD/pd/pratice/Bonafide/src/bonafide/report1.jrxml");
             jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), DriverManager.getConnection("jdbc:odbc:BonafideDatabase"));
            JasperExportManager.exportReportToPdfFile(jasperPrint, "reports/simple_report.pdf");
             System.out.print("Done");
        }catch(Exception e){e.printStackTrace();}
        
        */
        try {
       Connection conn =  DriverManager.getConnection("jdbc:odbc:BonafideDatabase");
      
       JasperDesign jasperDesign = JRXmlLoader.load("E:/PD/pd/pratice/Bonafide/src/bonafide/report1.jrxml");
      /*String sql = "Select * from sinfo where date = "+ sc.getcdt()+"";
       * 
        * deleting below code from class Secong.java and thus commenting these lines.
        * public static String getcdt(){
        return name;
        }
       */
      JRDesignQuery newQuery = new JRDesignQuery();
      //newQuery.setText(sql);
      jasperDesign.setQuery(newQuery);
      JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
     JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
      JasperViewer.viewReport(jasperPrint);
      System.out.print("Done");
   }
   catch (Exception ex)
   {
       JOptionPane.showMessageDialog(null, ex);
   }
    }                                     

        
        

}

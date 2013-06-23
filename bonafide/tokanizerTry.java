/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author ishant0
 */
public class tokanizerTry {
    public static void main(String args[]){
         try
        {
            Class.forName("org.sqlite.JDBC");
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:sqlite:C:/Documents and Settings/ishant0/bonafide.db");
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet rs = st.executeQuery("select * from abc");
            rs.next();
            String s = rs.getString(1);
            System.out.println(s);
            
            java.sql.ResultSet rs2 = st.executeQuery("select * from firstInfo order by date limit 1");
            rs2.next();
            String name = rs2.getString("name");
            String rollnum = rs2.getString("rollnum");
             System.out.println(rollnum);
            
            java.util.regex.Pattern pattern = Pattern.compile(Pattern.quote("name??"));
            String data[] = pattern.split(s);
            String o1 = data[0] +" "+name+" "+data[1];
            System.out.println(o1);
            
            pattern = Pattern.compile(Pattern.quote("roll??"));
            data = pattern.split(o1);
            //System.out.println(Arrays.toString(data));
           System.out.println(data[0] +" "+rollnum+" "+data[1]);
            /*java.util.StringTokenizer st1 = new java.util.StringTokenizer(s, "name??");
            String t1 = st1.nextToken();
            String t2 = st1.nextToken();
            s = t1 + name + t2;
            System.out.println(t1);
            System.out.println(name);
            System.out.println(t2);
             * 
             */
    }
         catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, e);
             
         }
    }
}

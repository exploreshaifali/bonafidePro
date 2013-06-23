/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

/**
 *
 * @author ishant0
 */
public class Connect {
    public static java.sql.Connection getConnection(){
        try
        {
            Class.forName("org.sqlite.JDBC");
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:sqlite:C:/Documents and Settings/ishant0/bonafide.db");
            return con;
        }catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, "Problem in connecting with database. "+e);             
             return null;
         }
    }
    
    public static void closeConnection(java.sql.Connection con, java.sql.PreparedStatement ps, java.sql.ResultSet rs){
        try{
            if(rs != null)
                rs.close();
            ps.close();
            con.close();
        }catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, "Problem in closing database. "+e);   
        }
    }
    
    public static String splitJoin(String formate, String delimiter, String toAdd ){
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(java.util.regex.Pattern.quote(delimiter));
        String data[] = pattern.split(formate);
        String added = data[0] +" "+toAdd+" "+data[1];
        //System.out.println(added);
        return added;
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
    
}

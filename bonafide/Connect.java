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
    public java.sql.Connection getConnection(){
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide.update;
import bonafide.Connect;
/**
 *
 * @author ishant0
 */
public class FromDatabase {
    public void dynamicCombo(String qr, int total_columns, String between_columns, javax.swing.JComboBox combo, String error){
        try{
          c = new Connect();
          con = c.getConnection();
        ps = con.prepareStatement(qr);
        rs = ps.executeQuery();
        java.util.ArrayList<String> entries = new java.util.ArrayList();        
        while(rs.next()){
            if(total_columns == 1){
            entries.add(rs.getString(1));                
            }
            else if(total_columns == 2){
            entries.add(rs.getString(1)+" "+between_columns+" "+rs.getString(2));               
            }
        }        
        combo.setModel(new javax.swing.DefaultComboBoxModel(entries.toArray(new String[0])));
        c.closeConnection(con, ps, rs); 
              
      }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, error+" "+e);}
      finally{
          c.closeConnection(con, ps, rs);
      }
    }
    
    //Variable declarations
    private Connect c;
    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.ResultSet rs;
    
}

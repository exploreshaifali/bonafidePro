/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DeleteUser.java
 *
 * Created on Apr 18, 2013, 7:56:57 PM
 */
package bonafide;

/**
 *
 * @author ishant0
 */
public class DeleteUser extends javax.swing.JFrame {

    /** Creates new form DeleteUser */
    public DeleteUser() {
        initComponents();
        try{ 
            Class.forName("org.sqlite.JDBC");
            con = java.sql.DriverManager.getConnection("jdbc:sqlite:C:/Documents and Settings/ishant0/bonafide.db");
            } catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(null, e);          
        }
        dynamicUserName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deletel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deletel.setText("Want to delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(deletel)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(deletel)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
   private void dynamicUserName(){
        int i = 0;
        try{
            ps = con.prepareStatement("select userid, name from login where isAdmin = 'no'");
            rs = ps.executeQuery();
            if(rs.next()){
                do{
                    i += 1;
                   // String id = rs.getString("userid");
                    javax.swing.JCheckBox chkb = new javax.swing.JCheckBox();
                    chkb.setText(rs.getString("userid"));
                }while(rs.next());
            }
            else
                javax.swing.JOptionPane.showMessageDialog(null, "No user exist now!!");
        }
        catch(java.sql.SQLException e){
          e.printStackTrace();
          javax.swing.JOptionPane.showMessageDialog(null, "Problem in dispatching data from database");          
          System.exit(30000); 
        }  
    
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deletel;
    // End of variables declaration//GEN-END:variables
    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.ResultSet rs;

}

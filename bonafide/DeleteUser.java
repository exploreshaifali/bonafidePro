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

import java.awt.GridLayout;

/**
 *
 * @author ishant0
 */
public class DeleteUser extends javax.swing.JFrame {

    /** Creates new form DeleteUser */
    public DeleteUser() {
        initComponents();
        checks = new java.util.ArrayList<>();
        dynamicCheckboxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deletel = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        delete_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deletel.setText("Want to delete:");

        panel.setLayout(new java.awt.GridLayout(1, 0));

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(deletel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(back_button)
                        .addGap(36, 36, 36)
                        .addComponent(delete_button)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(deletel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_button)
                    .addComponent(back_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//NEED TO MODIFY TO NOT TO DELETE ALL THE ADMINS::::::::::::::::::::::::::::::::::::::::::::::::::::
private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
    //getting those userids which are selected to be deleted and storing them in all_selected
    java.util.ArrayList <String> all_selected= new java.util.ArrayList();
   //loop through the array of checkboxes and get the text of each checkbox that is checked
   for (javax.swing.JCheckBox ck:checks){
    if(ck.isSelected()){
        all_selected.add(ck.getText());
    }
   }
   total = all_selected.size();
   if(total == 0){javax.swing.JOptionPane.showMessageDialog(null,"select the userids you want to delete");}
   else{
    int reply = javax.swing.JOptionPane.showConfirmDialog(null, "Want to delete "+total+" users?", "Delete users", javax.swing.JOptionPane.YES_NO_OPTION);
    if(reply == javax.swing.JOptionPane.YES_OPTION){
    //deleting all selected userids from database
    for(String s : all_selected){
        try{
            c = new Connect();
           con = c.getConnection();
           ps = con.prepareStatement("delete from login where userid = '"+s+"'");
           ps.executeUpdate();
        }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in deleting "+s+" from database."+e);}
        finally{
            c.closeConnection(con, ps, null);
        }
    }
    javax.swing.JOptionPane.showMessageDialog(null, "Deleted "+total+" user from database.");
    this.dispose();
   }
 }
}//GEN-LAST:event_delete_buttonActionPerformed

private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    new Admin().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_back_buttonActionPerformed

        
 
  private void dynamicCheckboxes(){
      //code for fetching existing users and adding them all to checks and generating checkBoxes :)
      try{
          c = new Connect();
        con = c.getConnection();
      
        ps = con.prepareStatement("select userid from login");
        rs = ps.executeQuery();
        panel.setLayout(new GridLayout(4,4,5,10));
        while(rs.next()){
                javax.swing.JCheckBox box = new javax.swing.JCheckBox(rs.getString("userid"));  
                panel.add(box);
                checks.add(box); 
                panel.revalidate();
                panel.repaint();
                pack();            
        }
    
      }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in fetching all users"+e);}
      finally{
          c.closeConnection(con, ps, rs);
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
    private javax.swing.JButton back_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel deletel;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.ResultSet rs;
    private Connect c;

    private java.util.ArrayList <javax.swing.JCheckBox> checks;
    private int total = 0;
}

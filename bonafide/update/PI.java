/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PI.java
 *
 * Created on Jul 30, 2013, 8:32:59 AM
 */
package bonafide.update;

import bonafide.Connect;

/**
 *
 * @author ishant0
 */
public class PI extends javax.swing.JFrame {

    /** Creates new form PI */
    public PI() {
        initComponents();
        f = new FromDatabase();
        f.dynamicCombo("select course_name, sem from pi", 2, "till semester", course_name_combo, "Problem in fetching all courses. ");
        panel2.setVisible(false); 
        //dynamicCombo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        current_pi_name = new javax.swing.JLabel();
        new_pi_tf = new javax.swing.JTextField();
        course_name_combo = new javax.swing.JComboBox();
        update_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wnat to update wich course PI");

        jLabel2.setText("Current PI is:");

        jLabel3.setText("New PI:");

        current_pi_name.setText("           ");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(current_pi_name, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_pi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(current_pi_name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(new_pi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        course_name_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_name_comboActionPerformed(evt);
            }
        });

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(course_name_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(back_button)
                        .addGap(60, 60, 60)
                        .addComponent(update_button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(course_name_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_button))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void course_name_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_name_comboActionPerformed
    String selected = (String)course_name_combo.getSelectedItem();
    selected_course = selected.substring(0, selected.indexOf("till") -1);
    selected_sem = Integer.parseInt(selected.substring(selected.indexOf("semester ")+9));
    Connect c = new Connect();
    try{
    con = c.getConnection();
    //ps = con.prepareStatement("select pi_name from PI where course_name = '"+course+"' and sem = "+sem+"");    
    ps = con.prepareStatement("select pi_name from PI where course_name = ? and sem = ?");
    ps.setString(1, selected_course);
    ps.setInt(2, selected_sem);
    rs = ps.executeQuery();
    rs.next();
    current_pi_name.setText(rs.getString("pi_name"));
    c.closeConnection(con, ps, rs);
    panel2.setVisible(true); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in fetching existing PI name. "+e);}
      finally{
          c.closeConnection(con, ps, rs);
      }
    }//GEN-LAST:event_course_name_comboActionPerformed

private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    new bonafide.Admin().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_back_buttonActionPerformed

private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
    c = new Connect();
    try{
    con = c.getConnection();
    ps = con.prepareStatement("update PI set pi_name = '"+new_pi_tf.getText()+"' where course_name = ? and sem = ?");
    ps.setString(1, selected_course);
    ps.setInt(2, selected_sem);
    ps.executeUpdate();
    c.closeConnection(con, ps, rs); 
    javax.swing.JOptionPane.showMessageDialog(null, "New PI added!");
    new_pi_tf.setText(""); 
    panel2.setVisible(false); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in fetching existing PI name. "+e);}
      finally{
          c.closeConnection(con, ps, rs);
      }
}//GEN-LAST:event_update_buttonActionPerformed

   /* String qr = "select course_name, sem from pi";
    private void dynamicCombo(){
      //code for fetching existing types and adding them all to checks and generating checkBoxes :)
      try{
          c = new Connect();
          con = c.getConnection();
      
        ps = con.prepareStatement(qr);
        rs = ps.executeQuery();
        java.util.ArrayList<String> entries = new java.util.ArrayList();
        while(rs.next()){
            entries.add(rs.getString("course_name")+" till semester "+rs.getString("sem"));               
        }
        course_name_combo.setModel(new javax.swing.DefaultComboBoxModel(entries.toArray(new String[0])));
        c.closeConnection(con, ps, rs); 
              
      }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in fetching all courses. "+e);}
      finally{
          c.closeConnection(con, ps, rs);
      }
  }
    
 * 
 */
    
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
            java.util.logging.Logger.getLogger(PI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JComboBox course_name_combo;
    private javax.swing.JLabel current_pi_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField new_pi_tf;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables

    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.ResultSet rs;
    private Connect c;
    private String selected_course;
    private int selected_sem;
    
    private FromDatabase f;
    
    
}

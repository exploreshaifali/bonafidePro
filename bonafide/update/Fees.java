/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Fees.java
 *
 * Created on Aug 4, 2013, 11:35:00 PM
 */
package bonafide.update;

/**
 *
 * @author ishant0
 */
public class Fees extends javax.swing.JFrame {

    /** Creates new form Fees */
    public Fees() {
        initComponents();
        f = new FromDatabase();
        f.dynamicCombo("select name from course", 1, null, course_combo, "Problem in fetching all courses. ");
        c = new bonafide.Connect();
        c.putSemestersFromDatabaseToComboBox((String)course_combo.getSelectedItem(), sem_combo, "Problem in showing Semesters of this course. ");
        panel1.setVisible(false); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        course_combo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        sem_combo = new javax.swing.JComboBox();
        panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        current_tution = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        new_tuition = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        current_exam = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        current_challan_boy = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        current_challan_girl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        new_exam = new javax.swing.JTextField();
        new_challan_boy = new javax.swing.JTextField();
        new_challan_girl = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Want to update fess of");

        course_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_comboActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose semester");

        sem_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem_comboActionPerformed(evt);
            }
        });

        jLabel3.setText("Tuition Fees:");

        current_tution.setText("tuition fees");

        jLabel5.setText("New :");

        jLabel6.setText("Exam Fees");

        current_exam.setText("exam fees");

        jLabel8.setText("Boy's challan fees");

        current_challan_boy.setText("boy's challan fees");

        jLabel10.setText("girl's challan fee");

        current_challan_girl.setText("girl's challan fees");

        jLabel12.setText("Current:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(current_tution)
                            .addComponent(new_tuition, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(current_exam)
                                    .addComponent(jLabel6)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(new_exam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(current_challan_boy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(new_challan_boy, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(current_challan_girl, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(new_challan_girl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(current_tution)
                    .addComponent(current_challan_girl)
                    .addComponent(current_challan_boy, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(current_exam))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_tuition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_challan_boy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_challan_girl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_exam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        update_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                update_buttonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(back_button)
                        .addGap(76, 76, 76)
                        .addComponent(update_button))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_button)
                    .addComponent(update_button))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void course_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_comboActionPerformed
    c = new bonafide.Connect();
    c.putSemestersFromDatabaseToComboBox((String)course_combo.getSelectedItem(), sem_combo, "Problem in showing Semesters of this course. ");
    panel1.setVisible(false); 
}//GEN-LAST:event_course_comboActionPerformed

private void sem_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem_comboActionPerformed
    selected_course = (String)course_combo.getSelectedItem();
    selected_sem = (Integer)sem_combo.getSelectedItem();
    c = new bonafide.Connect();
    try{
    con = c.getConnection();      
    ps = con.prepareStatement("select tuition_fees, exam_fees, challan_fees_boy, challan_fees_girl from FeeStructure where course = ? and sem = ?");
    ps.setString(1, selected_course);
    ps.setInt(2, selected_sem);
    rs = ps.executeQuery();
    //rs.next();
    current_tution.setText(rs.getString("tuition_fees"));
    current_exam.setText(rs.getString("exam_fees"));  
    current_challan_boy.setText(rs.getString("challan_fees_boy")); 
    current_challan_girl.setText(rs.getString("challan_fees_girl")); 
    c.closeConnection(con, ps, rs);
    panel1.setVisible(true); 
    }catch(java.sql.SQLException es){        
        current_tution.setText("None yet!");
        current_exam.setText("None yet!");
        current_challan_boy.setText("None yet!"); 
        current_challan_girl.setText("None yet!");
        panel1.setVisible(true); 
        c.closeConnection(con, ps, rs); 
        System.out.println(es);
    /*
    try{
    con = c.getConnection();
    ps = con.prepareStatement("insert into FeeStructure values(?,?,?)");
    ps.setString(1, selected_course);
    ps.setInt(2, selected_sem);
    ps.setFloat(3, Float.parseFloat(new_fees_tf.getText()));  
    ps.executeUpdate();
    c.closeConnection(con, ps, rs); 
    javax.swing.JOptionPane.showMessageDialog(null, "Fees Added!");
    new_fees_tf.setText(""); 
    panel1.setVisible(false); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in adding Fees. "+e);}
      finally{
          c.closeConnection(con, ps, rs);
      }
         * 
         */
    }
    catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in fetching existing fees name. "+e);    
    }
      finally{
          c.closeConnection(con, ps, rs);
      }
}//GEN-LAST:event_sem_comboActionPerformed

private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    new bonafide.Admin().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_back_buttonActionPerformed

private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
    actionPerformed();
}//GEN-LAST:event_update_buttonActionPerformed

void actionPerformed(){
    c = new bonafide.Connect();
    if(current_tution.getText().equals("None yet!")){
       try{
        con = c.getConnection();
        ps = con.prepareStatement("insert into FeeStructure values(?,?,?,?,?,?)");
        ps.setString(1, selected_course);
        ps.setInt(2, selected_sem);
        ps.setFloat(3, Float.parseFloat(new_tuition.getText()));  
        ps.setFloat(4, Float.parseFloat(new_exam.getText()));  
        ps.setFloat(5, Float.parseFloat(new_challan_boy.getText()));  
        ps.setFloat(6, Float.parseFloat(new_challan_girl.getText()));  
        ps.executeUpdate();
        c.closeConnection(con, ps, rs); 
        javax.swing.JOptionPane.showMessageDialog(null, "Fees Added!");
        new_tuition.setText(""); 
        new_exam.setText("");
        new_challan_boy.setText(""); 
        new_challan_girl.setText("");
        panel1.setVisible(false); 
        }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in adding Fees. "+e);}
        finally{ c.closeConnection(con, ps, rs); }
    }
    else{
    try{
    con = c.getConnection();
    ps = con.prepareStatement("update FeeStructure set tuition_fees = ?, exam_fees = ?, challan_fees_boy = ?, challan_fees_girl = ? where course = ? and sem = ?");
    ps.setString(1, selected_course);
    ps.setInt(2, selected_sem);
    ps.setFloat(3, Float.parseFloat(new_tuition.getText()));
    ps.setFloat(4, Float.parseFloat(new_exam.getText()));
    ps.setFloat(5, Float.parseFloat(new_challan_boy.getText()));
    ps.setFloat(6, Float.parseFloat(new_challan_girl.getText())); 
    ps.executeUpdate();
    c.closeConnection(con, ps, rs); 
    javax.swing.JOptionPane.showMessageDialog(null, "Fees Updated!");
    new_tuition.setText(""); 
    new_exam.setText("");
    new_challan_boy.setText(""); 
    new_challan_girl.setText("");
    panel1.setVisible(false); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in fetching existing Fees. "+e);}
      finally{c.closeConnection(con, ps, rs); }    
    }
}

private void update_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_buttonKeyPressed
    int k = evt.getKeyCode();
	if(k == java.awt.event.KeyEvent.VK_ENTER){
            actionPerformed();
	}
}//GEN-LAST:event_update_buttonKeyPressed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Fees().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JComboBox course_combo;
    private javax.swing.JLabel current_challan_boy;
    private javax.swing.JLabel current_challan_girl;
    private javax.swing.JLabel current_exam;
    private javax.swing.JLabel current_tution;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField new_challan_boy;
    private javax.swing.JTextField new_challan_girl;
    private javax.swing.JTextField new_exam;
    private javax.swing.JTextField new_tuition;
    private javax.swing.JPanel panel1;
    private javax.swing.JComboBox sem_combo;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
    private FromDatabase f;
    private bonafide.Connect c;
    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.ResultSet rs;
    
    private String selected_course;
    private int selected_sem;
}

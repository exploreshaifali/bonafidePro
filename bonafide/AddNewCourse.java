/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddNewCourse.java
 *
 * Created on Jul 11, 2013, 2:24:10 AM
 */
package bonafide;

/**
 *
 * @author ishant0
 */
public class AddNewCourse extends javax.swing.JFrame {

    /** Creates new form AddNewCourse */
    public AddNewCourse() {
        initComponents();
        this.setTitle("Add New Course");
        course_name_tf.requestFocus();
        panel1.setVisible(false); 
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        course_name_tf = new javax.swing.JTextField();
        fullform_tf = new javax.swing.JTextField();
        years_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sem_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pi1_tf = new javax.swing.JTextField();
        till_sem1_combo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        pi2_tf = new javax.swing.JTextField();
        till_sem2_combo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        logout_button.setText("Logout");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Course Name");

        jLabel2.setText("Full form");

        jLabel3.setText("Period(Years)");

        course_name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_name_tfActionPerformed(evt);
            }
        });

        jLabel4.setText("semesters");

        sem_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem_tfActionPerformed(evt);
            }
        });
        sem_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sem_tfFocusLost(evt);
            }
        });

        jLabel5.setText("Program Incharge name");

        till_sem1_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        till_sem1_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                till_sem1_comboActionPerformed(evt);
            }
        });

        jLabel6.setText("Till Semester");

        jLabel7.setText("Another PI name");

        jLabel8.setText("Till semester");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(till_sem2_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pi2_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(pi2_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(till_sem2_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(logout_button)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(add_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(reset_button)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(years_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fullform_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                            .addComponent(till_sem1_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pi1_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_button)
                    .addComponent(logout_button))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(course_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fullform_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(years_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sem_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pi1_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(till_sem1_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(reset_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
    course_name = course_name_tf.getText();
    String fullform = fullform_tf.getText();
    String years = years_tf.getText();    
    String pi1 = pi1_tf.getText();
    //int sem1 = sem1_
    //checking wether year is a float or not
    Validations v = new Validations();    
    if(v.isVallidYear(years)){
        //checking wether sem is a number or not:        
            AddNewCourseClass add_course = new AddNewCourseClass();  
            //checking wether fields are empty             
            
            add_course.putToDatabase("insert into course values('"+course_name+"', '"+fullform+"', '"+years+"' , "+semester+")","Course "+course_name+" is added!!", "Problem in putting data into database data. ");
            AddNewCourseClass add_pi1 = new AddNewCourseClass();  
            add_pi1.putToDatabase("insert into PI values('"+course_name+"', "+till_sem1+", '"+pi1+"')", null, "Problem in adding Program incharage.");
            if(semester > till_sem1){
                int till_sem2 = (Integer)till_sem2_combo.getSelectedItem();
                String pi2 = pi2_tf.getText();
                add_pi1.putToDatabase("insert into PI values('"+course_name+"', "+till_sem2+", '"+pi2+"')", null, "Problem in adding another Program incharage.");
            }
            
            
            
            
            
            
            
            
            
            
            
            
            new Admin().setVisible(true); 
            this.dispose();
    }
    else{javax.swing.JOptionPane.showMessageDialog(null, "Years can only have numbers/floats.");}
}//GEN-LAST:event_add_buttonActionPerformed

private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
    course_name_tf.setText("");
    fullform_tf.setText("");
    years_tf.setText("");
    sem_tf.setText(""); 
    till_sem1_combo.setModel(null); 
    course_name_tf.requestFocus();
}//GEN-LAST:event_reset_buttonActionPerformed

private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    new Admin().setVisible(true);
    this.dispose();
}//GEN-LAST:event_back_buttonActionPerformed

private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
    new Login().setVisible(true);
    this.dispose();
}//GEN-LAST:event_logout_buttonActionPerformed

private void sem_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem_tfActionPerformed
    add_buttonActionPerformed(evt);
}//GEN-LAST:event_sem_tfActionPerformed

private void course_name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_name_tfActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_course_name_tfActionPerformed

private void sem_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sem_tfFocusLost
 semester = Integer.parseInt(sem_tf.getText()); 
 java.util.ArrayList<Integer> entries = new java.util.ArrayList();
 for(int i = 0; i<semester; i++){
     entries.add(i+1);
 }
 till_sem1_combo.setModel(new javax.swing.DefaultComboBoxModel(entries.toArray(new Integer[0])));
}//GEN-LAST:event_sem_tfFocusLost

private void till_sem1_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_till_sem1_comboActionPerformed
    till_sem1 = (Integer)till_sem1_combo.getSelectedItem();
   //System.out.println(till_sem1_combo.getSelectedItem()+"    "+till_sem1);
   if (till_sem1 < semester){
       panel1.setVisible(true); 
        java.util.ArrayList<Integer> entries = new java.util.ArrayList();
        for(int i = till_sem1; i<semester; i++){
     entries.add(i+1);
    }
    till_sem2_combo.setModel(new javax.swing.DefaultComboBoxModel(entries.toArray(new Integer[0])));
    }
}//GEN-LAST:event_till_sem1_comboActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddNewCourse().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton back_button;
    private javax.swing.JTextField course_name_tf;
    private javax.swing.JTextField fullform_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField pi1_tf;
    private javax.swing.JTextField pi2_tf;
    private javax.swing.JButton reset_button;
    private javax.swing.JTextField sem_tf;
    private javax.swing.JComboBox till_sem1_combo;
    private javax.swing.JComboBox till_sem2_combo;
    private javax.swing.JTextField years_tf;
    // End of variables declaration//GEN-END:variables
    private String course_name;
    private int semester;
    private int till_sem1;
}

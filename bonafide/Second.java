package bonafide;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Second extends javax.swing.JFrame {
//Constructor
    public Second() {
        initComponents();
        ctype_combo.requestFocus();
        fettingFromDB();
        //ctype_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student bonafide", "Character Certificate", "Medium", "CGPA/SGPA", "Fee Structure", "Passport", "Visa" }));
    }
    
    public Second(SecondClass sc) {
        initComponents();        
        fettingFromDB();
        //ctype_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student bonafide", "Character Certificate", "Medium", "CGPA/SGPA", "Fee Structure", "Passport", "Visa" }));
        ctype_combo.setSelectedItem(sc.getCert_type());
        course_combo.setSelectedItem(sc.getCourse()); 
        sem_combo.setSelectedItem(sc.getSemester()); 
        rollnumtf.setText(sc.getRollnum()); 
        nametf.setText(sc.getName()); 
        father_nametf.setText(sc.getFather_name()); 
        enrollment_tf.setText(sc.getEnrollment()); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        SaveC = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        ctype_combo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Display = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        course_combo = new javax.swing.JComboBox();
        sem_combo = new javax.swing.JComboBox();
        rollnumtf = new javax.swing.JTextField();
        nametf = new javax.swing.JTextField();
        father_nametf = new javax.swing.JTextField();
        more_information_button = new javax.swing.JButton();
        change_password_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        enrollment_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        back_file_menu = new javax.swing.JMenuItem();
        edit_menu = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        jLabel4.setText("jLabel4");

        jTextField2.setText("jTextField2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Account");

        SaveC.setText("Save and continue");
        SaveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCActionPerformed(evt);
            }
        });
        SaveC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SaveCKeyPressed(evt);
            }
        });

        logout_button.setText("Logout");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        ctype_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student bonafide", " " }));

        jLabel1.setText("Certificate Type");

        jLabel2.setText("Course");

        jLabel3.setText("Semester");

        jLabel5.setText("Roll No.");

        jLabel6.setText("Name");

        jLabel7.setText("Father's Name");

        course_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                course_comboItemStateChanged(evt);
            }
        });

        sem_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

        rollnumtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnumtfActionPerformed(evt);
            }
        });

        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });

        father_nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                father_nametfActionPerformed(evt);
            }
        });

        more_information_button.setText("More Information");
        more_information_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                more_information_buttonActionPerformed(evt);
            }
        });

        change_password_button.setText("Change Password");
        change_password_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_password_buttonActionPerformed(evt);
            }
        });

        jLabel8.setText("Enrollment No.(optional)");

        enrollment_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollment_tfActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bonafide/Collegelogo.jpg"))); // NOI18N

        file_menu.setText("File");

        back_file_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        back_file_menu.setText("Back");
        back_file_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_file_menuActionPerformed(evt);
            }
        });
        file_menu.add(back_file_menu);

        jMenuBar1.add(file_menu);

        edit_menu.setText("Edit");
        jMenuBar1.add(edit_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(32, 32, 32)
                        .addComponent(more_information_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nametf, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(father_nametf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(rollnumtf, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(enrollment_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ctype_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(course_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 141, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(change_password_button)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(logout_button))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(SaveC)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(more_information_button)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logout_button)
                        .addComponent(change_password_button))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctype_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rollnumtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(father_nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enrollment_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(SaveC))
                    .addComponent(jLabel8))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed

        // TODO add your handling code here:
      Login f1 = new Login();
      f1.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void SaveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCActionPerformed
         actionPerformedonSaveC();                  
    }//GEN-LAST:event_SaveCActionPerformed
    //SaveCActionPerformed all tasks wrote outside so that it will work on Enter key also.
    void actionPerformedonSaveC(){
        int flage = 1;
        StringBuilder error = new StringBuilder();
        //fetching data what user entered.
       String name = nametf.getText(); 
       String rollnum = rollnumtf.getText();
       String father_name = father_nametf.getText();       
       //Providing validations
       Validations v = new Validations(); 
       //checking that roll number or name is not empty.
       if(v.isEmpty(name, rollnum)){                      
           JOptionPane.showMessageDialog(null, "Roll Number and Name can't be empty!");
       }
       else{
           //Checking for vallid rollnumber
           if(!v.isVallidRollnumber(rollnum, error)){
               flage = 0;              
           }
           //Checking for vallid names
        if(!v.isVallidName(name, error)){
           flage = 0;           
        }
        if(!v.isVallidName(father_name, error)){
            flage = 0;            
            if(error.length() == 0){
                StringBuilder sb = new StringBuilder("Father ").append(error);
                error = sb;          
            }
        }
        if(flage == 0){
            JOptionPane.showMessageDialog(null, error);
        }        
        else{            
            //Creating an object of Class SecondClass and setting its fields
           SecondClass sc = new SecondClass(name, rollnum.toUpperCase(), course_combo.getSelectedItem().toString(), ctype_combo.getSelectedItem().toString(),enrollment_tf.getText().toUpperCase(),father_name, Integer.parseInt(sem_combo.getSelectedItem().toString()));          
           sc.putDataIntoDatabase();           
           sc.identifyTypeAndMove(sc);           
           this.dispose();       
       }         
       }
    }
    
   //Moving to More Information page or class    .
    private void more_information_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_more_information_buttonActionPerformed
        new MoreInfomation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_more_information_buttonActionPerformed

//Moving to Change password page or class.
private void change_password_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_password_buttonActionPerformed
// TODO add your handling code here:
    new ChangePassword().setVisible(true);
    this.dispose();
}//GEN-LAST:event_change_password_buttonActionPerformed

//When user Press enter after entering roll umber all rest of the data fields will be filled!!..............Not exactly correct yet.......
private void rollnumtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnumtfActionPerformed
    c = new Connect();    
    try{
        con = c.getConnection();    
        ps =con.prepareStatement("select * from firstInfo where rollnum = '"+rollnumtf.getText().toUpperCase()+"' order by date DESC LIMIT 1");
        rs = ps.executeQuery();                  
        if(rs.next()){        
          nametf.setText(rs.getString("name"));              
          course_combo.setSelectedItem(rs.getString("course"));
          ctype_combo.setSelectedItem(rs.getString("ctype"));
          sem_combo.setSelectedItem(rs.getInt("sem"));
          father_nametf.setText(rs.getString("father_name"));
          enrollment_tf.setText(rs.getString("enrollment")); 
          }
     }
    catch(Exception ex){
         ex.printStackTrace();
         javax.swing.JOptionPane.showMessageDialog(null, "Problem while searching from database."+ex);
    }
    finally{ c.closeConnection(con, ps, rs);}
}//GEN-LAST:event_rollnumtfActionPerformed

private void course_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_course_comboItemStateChanged
    if(evt.getStateChange() == ItemEvent.SELECTED){
        String s = (String)course_combo.getSelectedItem();
        c = new Connect();
        c.putSemestersFromDatabaseToComboBox(s, sem_combo, "Problem in showing Semesters of this course. ");
    }
    else{ }
}//GEN-LAST:event_course_comboItemStateChanged

private void back_file_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_file_menuActionPerformed
    Login f1 = new Login();
      f1.setVisible(true);
      this.dispose();
}//GEN-LAST:event_back_file_menuActionPerformed

private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_nametfActionPerformed

private void father_nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_father_nametfActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_father_nametfActionPerformed

private void enrollment_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollment_tfActionPerformed
    SaveCActionPerformed(evt);
}//GEN-LAST:event_enrollment_tfActionPerformed

private void SaveCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaveCKeyPressed
    int k = evt.getKeyCode();
	if(k == KeyEvent.VK_ENTER){
            actionPerformedonSaveC();
	}   
}//GEN-LAST:event_SaveCKeyPressed

private void fettingFromDB(){
    c = new Connect();
    //method to set all certifiacate types from database table type which includes all types of certificates
    c.getAllFromDB("select typeName from type", "typeName", ctype_combo, "Problem in showing Certificate types. ");
    //method to set all courses from database table :
    c.getAllFromDB("select name from course", "name", course_combo, "Problem in showing Courses. ");
    c.putSemestersFromDatabaseToComboBox((String)course_combo.getSelectedItem(), sem_combo, "Problem in showing Semesters of this course. ");
}
     
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
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Display;
    private javax.swing.JButton SaveC;
    private javax.swing.JMenuItem back_file_menu;
    private javax.swing.JButton change_password_button;
    private javax.swing.JComboBox course_combo;
    private javax.swing.JComboBox ctype_combo;
    private javax.swing.JMenu edit_menu;
    private javax.swing.JTextField enrollment_tf;
    private javax.swing.JTextField father_nametf;
    private javax.swing.JMenu file_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton more_information_button;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField rollnumtf;
    private javax.swing.JComboBox sem_combo;
    // End of variables declaration//GEN-END:variables
   private java.sql.Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Connect c;
   
   
}

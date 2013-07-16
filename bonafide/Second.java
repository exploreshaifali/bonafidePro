package bonafide;

import java.sql.*;
import javax.swing.JOptionPane;

public class Second extends javax.swing.JFrame {
//Constructor
    public Second() {
        initComponents();
        rollnumtf.requestFocus();
        certificateTypes();
        getCourses();
        //ctype_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student bonafide", "Character Certificate", "Medium", "CGPA/SGPA", "Fee Structure", "Passport", "Visa" }));
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
        FnameText = new javax.swing.JTextField();
        more_information_button = new javax.swing.JButton();
        change_password_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        enrollment_tf = new javax.swing.JTextField();

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

        sem_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        rollnumtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnumtfActionPerformed(evt);
            }
        });

        more_information_button.setText("More Information");
        more_information_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                more_information_buttonActionPerformed(evt);
            }
        });

        change_password_button.setText("Change password");
        change_password_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_password_buttonActionPerformed(evt);
            }
        });

        jLabel8.setText("Enrollment No.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enrollment_tf)
                                    .addComponent(ctype_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FnameText, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(nametf)
                                    .addComponent(rollnumtf)
                                    .addComponent(sem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaveC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(change_password_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(more_information_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout_button)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout_button)
                    .addComponent(more_information_button)
                    .addComponent(change_password_button, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctype_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rollnumtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enrollment_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(SaveC)
                .addGap(22, 22, 22))
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
      //fetching data what user entered.
       name = nametf.getText(); 
       rollnum = rollnumtf.getText();
       //Providing validations
       Validations v = new Validations(); 
       //checking that roll number or name is not empty.
       if(v.isEmpty(name) || v.isEmpty(rollnum)){ 
           JOptionPane.showMessageDialog(null, "Roll Number or Name can't be empty!");
       }
       else{ 
           //Checking wether name contains number of not
           if(v.contaionsDigit(name)){
               JOptionPane.showMessageDialog(null, "Name can have only letters and not numbers.");
           }
           //Creating an object of Class SecondClass and setting its fields
           SecondClass sc = new SecondClass(nametf.getText(), rollnumtf.getText().toUpperCase(), course_combo.getSelectedItem().toString(), ctype_combo.getSelectedItem().toString(),enrollment_tf.getText(),FnameText.getText(), Integer.parseInt(sem_combo.getSelectedItem().toString()));
           if(sc.isFatherNamevallid()){
           sc.putDataIntoDatabase();
           sc.identifyTypeAndMove(sc);
           this.dispose();
           }
           else{
           JOptionPane.showMessageDialog(null, "Father's name can have only letters and not numbers.");
           }              
       }                   
    }//GEN-LAST:event_SaveCActionPerformed
    
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
        /*try{
            
            con = Connect.getConnection();
            
            ps =con.prepareStatement("select * from firstInfo where rollnum = '"+rollnumtf.getText().toUpperCase()+"'");
            rs = ps.executeQuery();
            
            int i = 0;
            if(rs.next()){
              i = 1;
              nametf.setText(rs.getString("name"));
              course_combo.setSelectedItem(rs.getString("course"));
              ctype_combo.setSelectedItem(rs.getString("ctype"));
              sem_combo.setSelectedItem(rs.getInt("sem"));
             }
                        
            while (rs.next()){
                    i++;
            } 
           
        }
        catch(Exception ex){
                 ex.printStackTrace();
                 javax.swing.JOptionPane.showMessageDialog(null, ex);
                }
        finally{
           try{
               Connect.closeConnection(con, ps, rs);
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Problem in closing connection "+e);
           }
    }
     * 
     */
        
}//GEN-LAST:event_rollnumtfActionPerformed

//method to set all certifiacate types from database table type which includes all types of certificates
private void certificateTypes(){
    //fetching all types from type table
    try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement("select typeName from type");
        rs = ps.executeQuery();
        java.util.ArrayList<String> type_names = new java.util.ArrayList();
        while(rs.next()){
            type_names.add(rs.getString("typeName"));
        }
        ctype_combo.setModel(new javax.swing.DefaultComboBoxModel(type_names.toArray(new String[0]))); 
        c.closeConnection(con, ps, rs); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in showing Certificate types"+e);}
    finally{ c.closeConnection(con, ps, rs); 
    }
}

//method to set all courses from database table :
private void getCourses(){
    //fetching all types from type table
    try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement("select name from course");
        rs = ps.executeQuery();
        java.util.ArrayList<String> type_names = new java.util.ArrayList();
        while(rs.next()){
            type_names.add(rs.getString("name"));
        }
        course_combo.setModel(new javax.swing.DefaultComboBoxModel(type_names.toArray(new String[0]))); 
        c.closeConnection(con, ps, rs); 
    }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in showing Courses"+e);}
    finally{ c.closeConnection(con, ps, rs); 
    }
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
    private javax.swing.JTextField FnameText;
    private javax.swing.JButton SaveC;
    private javax.swing.JButton change_password_button;
    private javax.swing.JComboBox course_combo;
    private javax.swing.JComboBox ctype_combo;
    private javax.swing.JTextField enrollment_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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
    
    private String name;
    private String rollnum;    
   
   private java.sql.Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Connect c;
   
   
}


/*
 * Admin.java
 *
 * Created on Apr 18, 2013, 6:55:03 PM
 */
package bonafide;

public class Admin extends javax.swing.JFrame {

 
    public Admin() {
        initComponents();
        try{ 
            Class.forName("org.sqlite.JDBC");
            con = java.sql.DriverManager.getConnection("jdbc:sqlite:C:/Documents and Settings/ishant0/bonafide.db");
            } catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(null, e);          
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_new_userb = new javax.swing.JButton();
        new_typeb = new javax.swing.JButton();
        delete_typeb = new javax.swing.JButton();
        backb = new javax.swing.JButton();
        delete_user_button = new javax.swing.JButton();
        add_course_button = new javax.swing.JButton();
        delete_course_button = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        edit_menu = new javax.swing.JMenu();
        add_menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add_new_userb.setText("Add new user");
        add_new_userb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_userbActionPerformed(evt);
            }
        });

        new_typeb.setText("Add new Type");
        new_typeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_typebActionPerformed(evt);
            }
        });

        delete_typeb.setText("Delete type");
        delete_typeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_typebActionPerformed(evt);
            }
        });

        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        delete_user_button.setText("Delete user");
        delete_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_user_buttonActionPerformed(evt);
            }
        });

        add_course_button.setText("Add Course");
        add_course_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_course_buttonActionPerformed(evt);
            }
        });

        delete_course_button.setText("Delete Course");
        delete_course_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_course_buttonActionPerformed(evt);
            }
        });

        file_menu.setText("File");
        menubar.add(file_menu);

        edit_menu.setText("Edit");
        menubar.add(edit_menu);

        add_menu.setText("Add");
        menubar.add(add_menu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_user_button)
                            .addComponent(delete_typeb)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_new_userb)
                                    .addComponent(new_typeb))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete_course_button)
                                    .addComponent(add_course_button)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backb)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_new_userb)
                    .addComponent(add_course_button))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(new_typeb)
                        .addGap(27, 27, 27)
                        .addComponent(delete_typeb)
                        .addGap(29, 29, 29)
                        .addComponent(delete_user_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(backb)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(delete_course_button)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void add_new_userbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_userbActionPerformed
    new AddNewUser().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_add_new_userbActionPerformed

private void new_typebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_typebActionPerformed
    new AddNewType().setVisible(true);;
    this.dispose();
}//GEN-LAST:event_new_typebActionPerformed

private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
    new Login().setVisible(true);
    this.dispose();
}//GEN-LAST:event_backbActionPerformed

private void delete_typebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_typebActionPerformed
    new DeleteType().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_delete_typebActionPerformed

private void delete_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_user_buttonActionPerformed
    new DeleteUser().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_delete_user_buttonActionPerformed

private void add_course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_course_buttonActionPerformed
    new AddNewCourse().setVisible(true);
    this.dispose();
}//GEN-LAST:event_add_course_buttonActionPerformed

private void delete_course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_course_buttonActionPerformed
    new DeleteCourse().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_delete_course_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_course_button;
    private javax.swing.JMenu add_menu;
    private javax.swing.JButton add_new_userb;
    private javax.swing.JButton backb;
    private javax.swing.JButton delete_course_button;
    private javax.swing.JButton delete_typeb;
    private javax.swing.JButton delete_user_button;
    private javax.swing.JMenu edit_menu;
    private javax.swing.JMenu file_menu;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JButton new_typeb;
    // End of variables declaration//GEN-END:variables
    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.ResultSet rs;

}

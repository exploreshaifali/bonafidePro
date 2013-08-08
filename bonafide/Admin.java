
/*
 * Admin.java
 *
 * Created on Apr 18, 2013, 6:55:03 PM
 */
package bonafide;

public class Admin extends javax.swing.JFrame {

 
    public Admin() {
        initComponents();
        this.setTitle("Admin");        
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
        update_pi = new javax.swing.JButton();
        update_type_format_button = new javax.swing.JButton();
        update_fees_button = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        back_file_menu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        edit_menu = new javax.swing.JMenu();
        add_edit_menu = new javax.swing.JMenu();
        course_add_menu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        certificate_type_add_menu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        user_add_menu = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        delete_menu = new javax.swing.JMenu();
        course_delete_user = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        certificate_type_delete_menu = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        user_delete_menu = new javax.swing.JMenuItem();

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

        update_pi.setText("Update PI");
        update_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_piActionPerformed(evt);
            }
        });

        update_type_format_button.setText("Update Type Format");
        update_type_format_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_type_format_buttonActionPerformed(evt);
            }
        });

        update_fees_button.setText("Update Fees");

        file_menu.setText("File");

        back_file_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        back_file_menu.setText("Back");
        back_file_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_file_menuActionPerformed(evt);
            }
        });
        file_menu.add(back_file_menu);
        file_menu.add(jSeparator2);

        menubar.add(file_menu);

        edit_menu.setText("Edit");

        add_edit_menu.setText("Add");

        course_add_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        course_add_menu.setText("Course");
        course_add_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_add_menuActionPerformed(evt);
            }
        });
        add_edit_menu.add(course_add_menu);
        add_edit_menu.add(jSeparator1);

        certificate_type_add_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        certificate_type_add_menu.setText("Certificate Type");
        certificate_type_add_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificate_type_add_menuActionPerformed(evt);
            }
        });
        add_edit_menu.add(certificate_type_add_menu);
        add_edit_menu.add(jSeparator3);

        user_add_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        user_add_menu.setText("User");
        user_add_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_add_menuActionPerformed(evt);
            }
        });
        add_edit_menu.add(user_add_menu);

        edit_menu.add(add_edit_menu);
        edit_menu.add(jSeparator4);

        delete_menu.setText("Delete");

        course_delete_user.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        course_delete_user.setText("Course");
        delete_menu.add(course_delete_user);
        delete_menu.add(jSeparator5);

        certificate_type_delete_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        certificate_type_delete_menu.setText("Certificate Type");
        certificate_type_delete_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificate_type_delete_menuActionPerformed(evt);
            }
        });
        delete_menu.add(certificate_type_delete_menu);
        delete_menu.add(jSeparator6);

        user_delete_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        user_delete_menu.setText("User");
        user_delete_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_delete_menuActionPerformed(evt);
            }
        });
        delete_menu.add(user_delete_menu);

        edit_menu.add(delete_menu);

        menubar.add(edit_menu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_new_userb)
                            .addComponent(new_typeb)
                            .addComponent(add_course_button))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_pi)
                            .addComponent(update_type_format_button)
                            .addComponent(update_fees_button))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(delete_typeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete_course_button)
                            .addComponent(delete_user_button, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_new_userb)
                    .addComponent(delete_user_button))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(new_typeb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add_course_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(backb)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete_typeb)
                        .addGap(11, 11, 11)
                        .addComponent(delete_course_button))))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(update_fees_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_type_format_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update_pi)
                .addContainerGap(235, Short.MAX_VALUE))
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

private void back_file_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_file_menuActionPerformed
    backbActionPerformed(evt);
}//GEN-LAST:event_back_file_menuActionPerformed

private void course_add_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_add_menuActionPerformed
    new AddNewCourse().setVisible(true);
    this.dispose();
}//GEN-LAST:event_course_add_menuActionPerformed

private void certificate_type_add_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificate_type_add_menuActionPerformed
    new AddNewType().setVisible(true);
    this.dispose();
}//GEN-LAST:event_certificate_type_add_menuActionPerformed

private void user_add_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_add_menuActionPerformed
    new AddNewUser().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_user_add_menuActionPerformed

private void certificate_type_delete_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificate_type_delete_menuActionPerformed
    new DeleteType().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_certificate_type_delete_menuActionPerformed

private void user_delete_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_delete_menuActionPerformed
    new DeleteUser().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_user_delete_menuActionPerformed

private void update_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_piActionPerformed
    new bonafide.update.PI().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_update_piActionPerformed

private void update_type_format_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_type_format_buttonActionPerformed
    new bonafide.update.TypeFormate().setVisible(true); 
    this.dispose();
}//GEN-LAST:event_update_type_format_buttonActionPerformed

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
    private javax.swing.JMenu add_edit_menu;
    private javax.swing.JButton add_new_userb;
    private javax.swing.JMenuItem back_file_menu;
    private javax.swing.JButton backb;
    private javax.swing.JMenuItem certificate_type_add_menu;
    private javax.swing.JMenuItem certificate_type_delete_menu;
    private javax.swing.JMenuItem course_add_menu;
    private javax.swing.JMenuItem course_delete_user;
    private javax.swing.JButton delete_course_button;
    private javax.swing.JMenu delete_menu;
    private javax.swing.JButton delete_typeb;
    private javax.swing.JButton delete_user_button;
    private javax.swing.JMenu edit_menu;
    private javax.swing.JMenu file_menu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JButton new_typeb;
    private javax.swing.JButton update_fees_button;
    private javax.swing.JButton update_pi;
    private javax.swing.JButton update_type_format_button;
    private javax.swing.JMenuItem user_add_menu;
    private javax.swing.JMenuItem user_delete_menu;
    // End of variables declaration//GEN-END:variables
    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.ResultSet rs;

}

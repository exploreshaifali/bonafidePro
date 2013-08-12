/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OtherRequirements.java
 *
 * Created on Jul 26, 2013, 12:09:50 PM
 */
package bonafide;

/**
 *
 * @author ishant0
 */
public class OtherRequirements extends javax.swing.JFrame {

    /** Creates new form OtherRequirements */
    public OtherRequirements() {
        initComponents();        
        panel1.setVisible(false);
        panel2.setVisible(false);
    }

    public OtherRequirements(SecondClass sc, AllRequiredClass arc) {
        initComponents();        
        this.sc = sc;
        this.arc = arc;        
        toShow();
    }
    
    public OtherRequirements(SecondClass sc) {
        initComponents();
        this.sc = sc;
        toShow();
    }
public void toShow(){
    panel1.setVisible(false);
    panel2.setVisible(false);
    need1_label.setText(sc.getOther_requirement1()); 
    if(!(sc.getOther_requirement2().equals("n"))){
        panel1.setVisible(true);
        need2_label.setText(sc.getOther_requirement2());
    }
    if(!sc.getOther_requirement3().equals("n")){
        panel2.setVisible(true);
        need3_label.setText(sc.getOther_requirement3());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        need1_label = new javax.swing.JLabel();
        need1_tf = new javax.swing.JTextField();
        create_button = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        need2_label = new javax.swing.JLabel();
        need2_tf = new javax.swing.JTextField();
        panel2 = new javax.swing.JPanel();
        need3_label = new javax.swing.JLabel();
        need3_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        need1_label.setText("need1");

        need1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                need1_tfActionPerformed(evt);
            }
        });

        create_button.setText("Create");
        create_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_buttonActionPerformed(evt);
            }
        });
        create_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                create_buttonKeyPressed(evt);
            }
        });

        need2_label.setText("need2");

        need2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                need2_tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(need2_label, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(need2_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(need2_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(need2_label))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        need3_label.setText("need3");

        need3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                need3_tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(need3_label, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(need3_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(need3_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(need3_label))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(need1_label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(need1_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(create_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(need1_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(need1_label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(create_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void create_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_buttonActionPerformed
    actionPerformed();
}//GEN-LAST:event_create_buttonActionPerformed

void actionPerformed(){
    by_replace1 = need1_tf.getText();
    by_replace2 = need2_tf.getText();
    by_replace3 = need3_tf.getText();
    if(arc == null){
         arc = new AllRequiredClass(by_replace1);
    }
 else{
    arc.setBy_replace1(by_replace1);
    arc.setBy_replace2(by_replace2);
    arc.setBy_replace3(by_replace3);
 }
    new CreateCertificate().create(sc, arc);
}

private void need1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_need1_tfActionPerformed
    create_buttonActionPerformed(evt);
}//GEN-LAST:event_need1_tfActionPerformed

private void need2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_need2_tfActionPerformed
    create_buttonActionPerformed(evt);
}//GEN-LAST:event_need2_tfActionPerformed

private void need3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_need3_tfActionPerformed
    create_buttonActionPerformed(evt);
}//GEN-LAST:event_need3_tfActionPerformed

private void create_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_create_buttonKeyPressed
    int k = evt.getKeyCode();
	if(k == java.awt.event.KeyEvent.VK_ENTER){
            actionPerformed();
	}
}//GEN-LAST:event_create_buttonKeyPressed


/*private void getToReplace1(){
        Connect c = new Connect();
        java.sql.Connection con = null;
        java.sql.PreparedStatement ps = null;
        java.sql.ResultSet rs = null;
        try{
        con = c.getConnection();        
        ps = con.prepareStatement("select other_requirement1 from requirements where typeName = '"+sc.getCert_type()+"'");        
        System.out.println("gstCertTYpe = "+sc.getCert_type()); 
        rs = ps.executeQuery();
        rs.next();
        to_replace1 = rs.getString("other_requirement1");
        System.out.println("to_replace inside getToReplace "+to_replace1);
        c.closeConnection(con, ps, rs); 
   }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem in getting replacement one!"+e);}
   finally{c.closeConnection(con, ps, rs); }
    }
 * 
 */


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
            java.util.logging.Logger.getLogger(OtherRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtherRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtherRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtherRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OtherRequirements().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create_button;
    private javax.swing.JLabel need1_label;
    private javax.swing.JTextField need1_tf;
    private javax.swing.JLabel need2_label;
    private javax.swing.JTextField need2_tf;
    private javax.swing.JLabel need3_label;
    private javax.swing.JTextField need3_tf;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables

    SecondClass sc;
    AllRequiredClass arc;
    private String to_replace1;
    private String by_replace1;
    private String by_replace2;
    private String by_replace3;
}

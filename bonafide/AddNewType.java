/*
 * AddNewType.java
 *
 * Created on Apr 18, 2013, 7:27:52 PM
 */
package bonafide;

public class AddNewType extends javax.swing.JFrame {

    public AddNewType() {
        initComponents();
        this.setTitle("Add New Type");
        name_tf.requestFocus();
        groupButton();
    }

    public String getNew_type_name() {
        return new_type_name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        formateta = new javax.swing.JTextArea();
        addb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        yesrb = new javax.swing.JRadioButton();
        norb = new javax.swing.JRadioButton();
        backb = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Formate");

        formateta.setColumns(20);
        formateta.setRows(5);
        jScrollPane1.setViewportView(formateta);

        addb.setText("Add");
        addb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbActionPerformed(evt);
            }
        });
        addb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addbKeyPressed(evt);
            }
        });

        jLabel3.setText("Requirement other than name, roll num, father name, course, semester.");

        yesrb.setText("yes");
        yesrb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirementYes(evt);
            }
        });
        yesrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesrbActionPerformed(evt);
            }
        });

        norb.setText("no");

        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(backb)
                        .addGap(18, 18, 18)
                        .addComponent(addb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(norb)
                                    .addComponent(yesrb))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesrb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(norb)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addb)
                    .addComponent(backb))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Grouping buttons to make them work as radio buttons.
private void groupButton(){
    bg.add(yesrb);
    bg.add(norb);
}    
    
   
private boolean isInitialsCorrect(){
    //fetching values of new_type_name and new_type_formate
    new_type_name = name_tf.getText();
    new_type_formate = formateta.getText();
    if(yesrb.isSelected()){
        requirements = "y";  
    }
    else{        
        requirements = "n";
    }
    //Checking name or formate fields are not blank.
    if(new_type_name == null || new_type_formate == null || new_type_name.equals("") || new_type_formate.equals("") )
        return false;
    else
        return true;
}
private void addbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbActionPerformed
    actionPerformed();
}//GEN-LAST:event_addbActionPerformed

void actionPerformed(){
    if(isInitialsCorrect()){
    // Inserting Type and formate in type table..
    try{        
        c = new Connect();
        con = c.getConnection();        
        ps =con.prepareStatement("insert into type (typeName, formate, requirements) values(?,?,?)");
        ps.setString(1, new_type_name);        
        ps.setString(2, new_type_formate+"  ");     
        System.out.println(requirements+"rrrrrrrrrrr");
        if(requirements.equals("y")){
            if(rc.getCount() == 0){
                requirements = "n";
            }
        }
        ps.setString(3, requirements);
        /*
        if(requirements.equals("n")){
            ps.setString(3, "n");
        }
        else{
            if(rc.getCount() == 0){
            ps.setString(3, "y");
            }
        } 
         * 
         */
        ps.executeUpdate();        
        c.closeConnection(con, ps, null);                   
        //adding requirrements to requirements table, if count > 0:
    if(requirements.equals("y")){
        if(rc != null){
          if(rc.getCount() > 0){
      try{
          c = new Connect();
        con = c.getConnection();
        
        ps = con.prepareStatement("insert into requirements(typeName, cgpaSgpa, address, feeStructure, year, other_requirement1, other_requirement2, other_requirement3) values(?,?,?,?,?,?,?,?)");
        ps.setString(1,  new_type_name);
        ps.setString(2, rc.getCgpa_sgpa());
        ps.setString(3, rc.getAddress());
        ps.setString(4, rc.getFee_structure());
        ps.setString(5, rc.getYear());
        ps.setString(6, rc.getOther_requirement1()); 
        ps.setString(7, rc.getOther_requirement2());
        ps.setString(8, rc.getOther_requirement3());
        //System.out.println(rc.getOther_requirement1());
        ps.executeUpdate();           
      }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Problem while adding requirements."+e);}
      finally{ c.closeConnection(con, ps, null); }          
      }
    }
    }        
    
    javax.swing.JOptionPane.showMessageDialog(null, new_type_name+" is added!");    
    }
      catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "problem in adding name and formate."+e); }
    finally{ c.closeConnection(con, ps, null);  }    
    Admin f = new Admin();
    f.setVisible(true); 
    this.dispose();
    }
    else{
        javax.swing.JOptionPane.showMessageDialog(null, "Name and Formate can't be blank.");    
    }
}

private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
    Admin f = new Admin();
    f.setVisible(true);
    this.dispose();
}//GEN-LAST:event_backbActionPerformed

private void requirementYes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirementYes
    if(isInitialsCorrect()){
        backb.setEnabled(false);
        norb.setEnabled(false); 
        rc = new AddNewTypeRequirementsClass();
        new AddNewTypeRequirements(rc).setVisible(true); 
    }
    else{
        javax.swing.JOptionPane.showMessageDialog(null, "Name and Formate can't be blank.");
    }
       
}//GEN-LAST:event_requirementYes

private void yesrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesrbActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_yesrbActionPerformed

private void addbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbKeyPressed
    int k = evt.getKeyCode();
	if(k == java.awt.event.KeyEvent.VK_ENTER){
            actionPerformed();
	}
}//GEN-LAST:event_addbKeyPressed

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
            java.util.logging.Logger.getLogger(AddNewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddNewType().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addb;
    private javax.swing.JButton backb;
    private javax.swing.JTextArea formateta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_tf;
    private javax.swing.JRadioButton norb;
    private javax.swing.JRadioButton yesrb;
    // End of variables declaration//GEN-END:variables

    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private Connect c;
    //private java.sql.Statement st;
    //private java.sql.ResultSet rs;
    private javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
    
    private String new_type_name;
    private String new_type_formate;
    private String requirements = "n";
    AddNewTypeRequirementsClass rc;
}

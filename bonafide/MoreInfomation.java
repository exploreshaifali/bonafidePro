package bonafide;

public class MoreInfomation extends javax.swing.JFrame {

    /** Creates new form MoreInfomation */
    public MoreInfomation() {
        initComponents();
        this.setTitle("More Information");                 
        enterChoicetf.setVisible(false);
        table.setVisible(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        byCombo = new javax.swing.JComboBox();
        enterChoicel = new javax.swing.JLabel();
        enterChoicetf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Want to see information by:");

        byCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rollnum", "name", "date", "course", "sem", " ", " " }));
        byCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byComboActionPerformed(evt);
            }
        });

        enterChoicetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterChoicetfActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Rollnumber", "name", "course", "semester", "date"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterChoicel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(byCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterChoicetf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(byCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(enterChoicel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(enterChoicetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void byComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byComboActionPerformed
    String selected = (String)byCombo.getSelectedItem();
    enterChoicel.setText("Enter " + selected);
    enterChoicetf.setVisible(true);
}//GEN-LAST:event_byComboActionPerformed

private void enterChoicetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterChoicetfActionPerformed
    table.setVisible(true);
    //table.setValueAt("Shifali", 1, 1);
    getData();
}//GEN-LAST:event_enterChoicetfActionPerformed

private void getData(){
    try{
        c = new Connect();
        con = c.getConnection();
        ps = con.prepareStatement("select * from firstInfo where "+(String)byCombo.getSelectedItem()+" = '"+enterChoicetf.getText()+"' order by date DESC"); 
        //ps.setString(1, (String)byCombo.getSelectedItem());
        //ps.setString(2, enterChoicetf.getText());
        rs = ps.executeQuery();        
        //System.out.println("select * from firstInfo where "+(String)byCombo.getSelectedItem()+" = "+enterChoicetf.getText());
        int i = 0;        System.out.println("Size equqls "+rs.getFetchSize());
        if(rs.next()){
            System.out.println("i = "+i);
            //table.setValueAt("Name", 1, 1);       
            do{
              table.setValueAt(rs.getString("rollnum"), i, 0); 
              table.setValueAt(rs.getString("name"), i, 1);
              table.setValueAt(rs.getString("course"), i, 2);
              table.setValueAt(rs.getString("sem"), i, 3);
              table.setValueAt(rs.getDate("date"), i, 4);
              i++;
           }while(rs.next());               
         }
         else{             
            javax.swing.JOptionPane.showMessageDialog(null, "No certificate issued with " + enterChoicetf.getText());           
         }
         c.closeConnection(con, ps, rs); 
         }
         catch(java.sql.SQLException e){
             javax.swing.JOptionPane.showMessageDialog(null, "Problem in fetching data. "+e);
             e.printStackTrace();
         }
         finally{c.closeConnection(con, ps, rs);}         
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
            java.util.logging.Logger.getLogger(MoreInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoreInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoreInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoreInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MoreInfomation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox byCombo;
    private javax.swing.JLabel enterChoicel;
    private javax.swing.JTextField enterChoicetf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private java.sql.Connection con;
    private java.sql.PreparedStatement ps;
    private java.sql.Statement st;
    private java.sql.ResultSet rs;
    private Connect c;
}

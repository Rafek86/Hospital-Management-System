import javax.swing.JOptionPane;
import java.sql.*;


public class Update extends javax.swing.JFrame {

 private final String url =
        "jdbc:sqlserver://localhost:1433;" +
         "databaseName=HospitalManagement;integratedSecurity=true;" +
         "encrypt=true;trustServerCertificate=true";
 public int flag=0;   
 public Update() {
        initComponents();
        isExist.setVisible(false);
        loadjdbc.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pidTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        genderCompoBox = new javax.swing.JComboBox<>();
        BloodTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        MajorDieTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        updateButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        isExist = new javax.swing.JLabel();
        Deletebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Patiant ID");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Name ");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Contact Number");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Blood Group");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Any Major Disease Suffered Earler");

        pidTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pidTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidTextFieldActionPerformed(evt);
            }
        });

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        numberTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ageTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        genderCompoBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderCompoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        BloodTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        addressTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        MajorDieTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jLabel10.setText("Update Information");

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search (1).png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        isExist.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        isExist.setForeground(new java.awt.Color(255, 0, 51));
        isExist.setText("Pataient is not exist");

        Deletebtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameTextField)
                                .addComponent(pidTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderCompoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(MajorDieTextField)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(updateButton)
                        .addGap(39, 39, 39)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(isExist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(Deletebtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isExist, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(genderCompoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(MajorDieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 127, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(jLabel1)
                    .addGap(23, 23, 23)
                    .addComponent(jLabel2)
                    .addGap(23, 23, 23)
                    .addComponent(jLabel3)
                    .addGap(19, 19, 19)
                    .addComponent(jLabel4)
                    .addGap(29, 29, 29)
                    .addComponent(jLabel5)
                    .addGap(29, 29, 29)
                    .addComponent(jLabel6)
                    .addGap(23, 23, 23)
                    .addComponent(jLabel7)
                    .addGap(29, 29, 29)
                    .addComponent(jLabel8)
                    .addGap(0, 102, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:Connection con = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet countResult = null;
        ResultSet dataResult = null;
        String ID = pidTextField.getText();
        boolean patientExists = false;

try {
    con = DriverManager.getConnection(url);
    stmt = con.createStatement();

    String countQuery = "SELECT COUNT(*) AS count FROM Patiant_manu WHERE P_ID = '" + ID + "'";
    countResult = stmt.executeQuery(countQuery);

    if (countResult.next() && countResult.getInt("count") > 0) {
        patientExists = true;
        isExist.setVisible(false);

       
        String dataQuery = "SELECT * FROM Patiant_manu WHERE P_ID = '" + ID + "'";
        dataResult = stmt.executeQuery(dataQuery);

        if (dataResult.next()) {
            pidTextField.setText(dataResult.getString("P_ID"));
            nameTextField.setText(dataResult.getString("Name"));
            numberTextField.setText(dataResult.getString("Number"));
            ageTextField.setText(dataResult.getString("Age"));
            genderCompoBox.setSelectedItem(dataResult.getString("Gender"));
            BloodTextField.setText(dataResult.getString("Blood"));
            addressTextField.setText(dataResult.getString("Address"));
            MajorDieTextField.setText(dataResult.getString("Disease"));

            flag = 1;
        }
    } else {
        isExist.setVisible(true);
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
} finally {
    try {
        if (countResult != null) countResult.close();
        if (dataResult != null) dataResult.close();
        if (stmt != null) stmt.close();
        if (con != null) con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error closing database resources: " + ex.getMessage());
    }
}

         
    }//GEN-LAST:event_searchButtonActionPerformed

    private void pidTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidTextFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet result = null;
    String ID = pidTextField.getText();
    String name = nameTextField.getText();
    String number = numberTextField.getText();
    String age = ageTextField.getText();
    String gender = (String) genderCompoBox.getSelectedItem();
    String blood = BloodTextField.getText();
    String address = addressTextField.getText();
    String majorDisease = MajorDieTextField.getText();

try {
    con = DriverManager.getConnection(url);
    
    String updateQuery = "UPDATE Patiant_manu SET Name=?, Number=?, Age=?, Gender=?, Blood=?, Address=?, Disease=? WHERE P_ID=?";
    pstmt = con.prepareStatement(updateQuery);
    pstmt.setString(1, name);
    pstmt.setString(2, number);
    pstmt.setString(3, age);
    pstmt.setString(4, gender);
    pstmt.setString(5, blood);
    pstmt.setString(6, address);
    pstmt.setString(7, majorDisease);
    pstmt.setString(8, ID);

    int rowsUpdated = pstmt.executeUpdate();  

    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Patient information updated successfully.");
    } else {
        JOptionPane.showMessageDialog(null, "Failed to update patient information.");
    }

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
} finally {
    try {
        if (result != null) result.close();
        if (pstmt != null) pstmt.close();  
        if (con != null) con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error closing database resources: " + ex.getMessage());
    }
}
            
    }//GEN-LAST:event_updateButtonActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
Connection con1 = null;
Connection con2 = null;
PreparedStatement pstmt1 = null;
PreparedStatement pstmt2 = null;

try {
    // Establish connections for each database operation
    con1 = DriverManager.getConnection(url);
    con2 = DriverManager.getConnection(url);  // Assuming the same URL is used for both databases
    
    String ID = pidTextField.getText();

    // Create DELETE queries for each table
    String deleteQuery1 = "DELETE FROM Patient_Info WHERE ID = ?";
    String deleteQuery2 = "DELETE FROM Patiant_manu WHERE P_ID = ?";

    // Prepare the statements for each DELETE query
    pstmt1 = con1.prepareStatement(deleteQuery1);
    pstmt1.setString(1, ID);

    pstmt2 = con2.prepareStatement(deleteQuery2);
    pstmt2.setString(1, ID);

    // Execute the first DELETE statement
    int rowsDeleted1 = pstmt1.executeUpdate();

    // Execute the second DELETE statement
    int rowsDeleted2 = pstmt2.executeUpdate();

    // Check if any rows were deleted from both tables
    if (rowsDeleted1 > 0 && rowsDeleted2 > 0) {
        JOptionPane.showMessageDialog(null, "Patient records deleted successfully.");

        // Clear the text fields or update the UI as needed
        pidTextField.setText("");
        nameTextField.setText("");
        numberTextField.setText("");
        ageTextField.setText("");
        genderCompoBox.setSelectedIndex(0);
        BloodTextField.setText("");
        addressTextField.setText("");
        MajorDieTextField.setText("");
    } else {
        JOptionPane.showMessageDialog(null, "Failed to delete patient records.");
    }

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
} finally {
    try {
        // Close resources properly for each connection
        if (pstmt1 != null) pstmt1.close();
        if (pstmt2 != null) pstmt2.close();
        if (con1 != null) con1.close();
        if (con2 != null) con2.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error closing database resources: " + ex.getMessage());
    }
}
    }//GEN-LAST:event_DeletebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloodTextField;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField MajorDieTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> genderCompoBox;
    private javax.swing.JLabel isExist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JTextField pidTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

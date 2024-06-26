
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheGenius
 */
public class addnewPatiant extends javax.swing.JFrame {
private final String url =
    "jdbc:sqlserver://localhost:1433;" +
     "databaseName=HospitalManagement;integratedSecurity=true;" +
     "encrypt=true;trustServerCertificate=true";
   
    public addnewPatiant() {
        initComponents();
        loadjdbc.init();
    }
    
    public boolean validateData(String ID, String name, String number, String age, String gender, String blood, String address, String majorDisease) {
    try {
        int parsedID = Integer.parseInt(ID);
        int parsedAge =Integer.parseInt(age);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid ID. Please enter a valid integer ID.");
        return false;
    }

    return true;
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        P_IDTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        genderTextField = new javax.swing.JComboBox<>();
        addressTextField = new javax.swing.JTextField();
        majorDiseaseTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ADD = new javax.swing.JButton();
        Blood = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setUndecorated(true);

        Close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
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

        P_IDTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        P_IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_IDTextFieldActionPerformed(evt);
            }
        });

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        numberTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ageTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        genderTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextFieldActionPerformed(evt);
            }
        });

        addressTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        majorDiseaseTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patientmanu.png"))); // NOI18N
        jLabel10.setText("Patiant Manu");

        ADD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        ADD.setText("Update");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        Blood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        Blood.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BloodComponentShown(evt);
            }
        });
        Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105)
                        .addComponent(P_IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(136, 136, 136)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52)
                        .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(158, 158, 158)
                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(127, 127, 127)
                        .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(86, 86, 86)
                        .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(123, 123, 123)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(majorDiseaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(ADD)
                        .addGap(18, 18, 18)
                        .addComponent(Close))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addComponent(P_IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(majorDiseaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void P_IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_IDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_IDTextFieldActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        String ID = P_IDTextField.getText();
        String name = nameTextField.getText();
        String number = numberTextField.getText();
        String age = ageTextField.getText();
        String gender = (String) genderTextField.getSelectedItem();
        String blood =(String) Blood.getSelectedItem();
        String address = addressTextField.getText();
        String majorDisease = majorDiseaseTextField.getText();
        
        
       if (ID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter your ID");
        return;
        }

        if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your name");
            return;
        }
        if(number.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your number");
            return;
        }
        if(age.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your age");
            return;
        }
        if(gender.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your gender");
            return;
        }
        if(blood.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Blood Group");
            return;
        }
          if(address.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Address");
            return;
        }
        if(majorDisease.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter your Disease");
            return;
        }
        
        Connection con = null;
        Statement stmt = null;
        
        try{                                                                                      
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            
              if (validateData(ID, name, number, age, gender, blood, address, majorDisease)) {
            String query = "INSERT INTO Patiant_manu VALUES ('"+ID+"','"+name+"','"
               + number + "','" + age + "','" + gender + "','" + blood + "','" + address + "','" + majorDisease + "')";
            String query2= "INSERT INTO Patient_Info (ID) VALUES (" + ID + ")";
            int affectsRows = stmt.executeUpdate(query);
            stmt.executeUpdate(query2);
            if(affectsRows == 1)
            {
                JOptionPane.showMessageDialog(this, "Successful Registration !!!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error !!!");
            }
         }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        finally
        {
            if(con !=null ){ try{ con.close(); }catch(Exception ex){}}
            if(stmt !=null ){ try{ stmt.close(); }catch(Exception ex){}}
        }
       
    }//GEN-LAST:event_ADDActionPerformed

    private void BloodComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BloodComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodComponentShown

    private void BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodActionPerformed

    private void genderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(addnewPatiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewPatiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewPatiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewPatiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewPatiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JComboBox<String> Blood;
    private javax.swing.JButton Close;
    private javax.swing.JTextField P_IDTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JComboBox<String> genderTextField;
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
    private javax.swing.JTextField majorDiseaseTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numberTextField;
    // End of variables declaration//GEN-END:variables
}

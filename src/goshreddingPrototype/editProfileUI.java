/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshreddingPrototype;

import goshredding.vo.EventVO;
import goshredding.data.Validation;
import goshredding.service.GoService;
import goshredding.vo.OrganizerVO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author huwei
 */
public class editProfileUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public editProfileUI() {
        initComponents();
        usernameTxt.setText("Goofy tony");
        forenameTxt.setText("Tony");
        surnameTxt.setText("Hu");
        dobTxt.setText("2002-04-05");
        add1Txt.setText("151 Mumbles Rd");
        add2Txt.setText("Swansea");
        postcodeTxt.setText("SA3 4EU");
        numTxt.setText("07752668726");
        emailTxt.setText("Tonyhu1503@gmail.com");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        forenameTxt = new javax.swing.JTextField();
        surnameTxt = new javax.swing.JTextField();
        add1Txt = new javax.swing.JTextField();
        add2Txt = new javax.swing.JTextField();
        postcodeTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        dobTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        password1Txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        password2Txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 246, 254));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 480));

        jPanel.setBackground(new java.awt.Color(239, 246, 254));
        jPanel.setPreferredSize(new java.awt.Dimension(850, 480));
        jPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Edit information");
        jPanel.add(jLabel2);
        jLabel2.setBounds(366, 26, 189, 30);

        forenameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(forenameTxt);
        forenameTxt.setBounds(167, 82, 289, 35);

        surnameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(surnameTxt);
        surnameTxt.setBounds(167, 129, 289, 35);

        add1Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(add1Txt);
        add1Txt.setBounds(167, 222, 289, 35);

        add2Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(add2Txt);
        add2Txt.setBounds(167, 269, 289, 35);

        postcodeTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(postcodeTxt);
        postcodeTxt.setBounds(167, 316, 289, 35);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Surname:");
        jPanel.add(jLabel4);
        jLabel4.setBounds(79, 134, 82, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Forename:");
        jPanel.add(jLabel5);
        jLabel5.setBounds(69, 87, 92, 22);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText(" Postcode:");
        jPanel.add(jLabel6);
        jLabel6.setBounds(71, 321, 90, 22);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("DOB:");
        jPanel.add(jLabel7);
        jLabel7.setBounds(118, 181, 43, 22);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Address2:");
        jPanel.add(jLabel9);
        jLabel9.setBounds(75, 274, 86, 22);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("Address1:");
        jPanel.add(jLabel10);
        jLabel10.setBounds(75, 227, 86, 22);

        numTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(numTxt);
        numTxt.setBounds(167, 363, 289, 35);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Contact Num:");
        jPanel.add(jLabel12);
        jLabel12.setBounds(41, 368, 120, 22);

        emailTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(emailTxt);
        emailTxt.setBounds(167, 410, 289, 35);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("email:");
        jPanel.add(jLabel13);
        jLabel13.setBounds(108, 415, 53, 22);

        backBtn.setBackground(new java.awt.Color(72, 124, 175));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel.add(backBtn);
        backBtn.setBounds(560, 410, 106, 35);

        saveBtn.setBackground(new java.awt.Color(72, 124, 175));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel.add(saveBtn);
        saveBtn.setBounds(710, 410, 106, 35);

        dobTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(dobTxt);
        dobTxt.setBounds(167, 176, 289, 35);

        usernameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jPanel.add(usernameTxt);
        usernameTxt.setBounds(540, 130, 260, 35);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setText("Username:");
        jPanel.add(jLabel15);
        jLabel15.setBounds(474, 87, 92, 22);

        jPanel1.setBackground(new java.awt.Color(218, 227, 243));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Change password");

        password1Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setText("Confirm password:");

        password2Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("New Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel.add(jPanel1);
        jPanel1.setBounds(470, 174, 360, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        myProfileUI mpFrm = new myProfileUI();
        mpFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

//        String forename = forenameTxt.getText();
//        String surname = surnameTxt.getText();
//        String dob = dobTxt.getText();
//        String add1 = add1Txt.getText();
//        String add2 = add2Txt.getText();
//        String postcode = postcodeTxt.getText();
//        String num = numTxt.getText();
//        String email = emailTxt.getText();
//    
//        String username = usernameTxt.getText();
//        String password1 = password1Txt.getText();
//        String income = "0";
//        String lineRead;
//        int lineNum = 0;//stores the number of lines in a file
//
//        boolean validate = true;
//
//        if (Validation.isPresent(forenameTxt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Forename",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isPresent(surnameTxt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Surname",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isPresent(numTxt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Contact number",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isLength(numTxt.getText(), 11) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Must be 11 numbers long", "Contact number",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isDate(dobTxt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Please write a valid date and in the format 'dd/mm/yyyy'", "DOB",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isPresent(emailTxt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Email",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isPresent(add1Txt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Cannot be empty!", "address",
//                    JOptionPane.INFORMATION_MESSAGE);// TODO add your handling code here:
//        }
//        if (Validation.isPresent(postcodeTxt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Postcode",
//                    JOptionPane.INFORMATION_MESSAGE);// TODO add your handling code here:
//        }
//        if ((Validation.isLength(postcodeTxt.getText(), 7) || Validation.isLength(postcodeTxt.getText(), 8)) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Must be 7 or 8 characters long", "Postcode",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isPresent(usernameTxt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Username",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isLength(password1Txt.getText(), 8) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Must be 8 characters long", "Password",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//        if (Validation.isDoubleVerification(password1Txt.getText(), password2Txt.getText()) == false) {
//            validate = false;
//            JOptionPane.showMessageDialog(null, "Please confirm the password again", "Passwords don't match",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//
//        
//                //store organizer information
//                
//                    try {
//                        OrganizerVO organizer = new OrganizerVO();
//                        organizer.username = username;
//                        organizer.password = password1;
//                        organizer.forename = forename;
//                        organizer.surname = surname;
//                        organizer.dob = dob;
//                        organizer.add1 = add1;
//                        organizer.add2 = add2;
//                        organizer.postcode = postcode;
//                        organizer.num = num;
//                        organizer.email = email;
//                        organizer.income = income;
//                        //GoService.getInstance().insertOrganizer(organizer);
//                    } catch (Exception e) {
//
//                    }
//                    JOptionPane.showMessageDialog(null, "successful added");
//                    MainFormUI mainFrm = new MainFormUI();
//                    mainFrm.setVisible(true);
//                    this.dispose();
//                
//            
//       
    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(editProfileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editProfileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editProfileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editProfileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editProfileUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add1Txt;
    private javax.swing.JTextField add2Txt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField forenameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numTxt;
    private javax.swing.JTextField password1Txt;
    private javax.swing.JTextField password2Txt;
    private javax.swing.JTextField postcodeTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField surnameTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}

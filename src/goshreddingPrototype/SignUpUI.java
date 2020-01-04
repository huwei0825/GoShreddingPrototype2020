/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshreddingPrototype;

import goshredding.data.Validation;
import goshredding.service.GoService;
import goshredding.vo.OrganizerVO;
import goshredding.vo.ParticipantVO;
import javax.swing.JOptionPane;

/**
 *
 * @author Songyun Hu
 */
public class SignUpUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public SignUpUI() {
        initComponents();
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
        password1Txt = new javax.swing.JTextField();
        password2Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        dobTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 246, 254));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 480));

        jPanel.setBackground(new java.awt.Color(239, 246, 254));
        jPanel.setPreferredSize(new java.awt.Dimension(850, 480));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Sign up");

        forenameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        surnameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        add1Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        add2Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        postcodeTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        password1Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        password2Txt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Surname:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Forename:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText(" Postcode:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("DOB:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("I'm a:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Address2:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("Address1:");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Password(8 characters):");

        numTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Contact Num:");

        emailTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("email:");

        userTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        userTypeComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "participant", "Organizer" }));
        userTypeComboBox.setPreferredSize(new java.awt.Dimension(96, 40));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setText("Confirm password:");

        backBtn.setBackground(new java.awt.Color(72, 124, 175));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(72, 124, 175));
        saveBtn.setText("Sign up");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        dobTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        usernameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setText("Username:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("(dd/mm/yyyy)");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jLabel2))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(forenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(add1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(add2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(password1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(postcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(forenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15))))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addComponent(add2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14))))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12))
                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
        LoginUI liFrm = new LoginUI();
        liFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        String forename = forenameTxt.getText();
        String surname = surnameTxt.getText();
        String dob = dobTxt.getText();
        String add1 = add1Txt.getText();
        String add2 = add2Txt.getText();
        String postcode = postcodeTxt.getText();
        String num = numTxt.getText();
        String email = emailTxt.getText();
        String userType = (String) userTypeComboBox.getSelectedItem();
        String username = usernameTxt.getText();
        String password1 = password1Txt.getText();
        String income = "0";
       

        boolean validate = true;

        if (Validation.isPresent(forenameTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Forename",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(surnameTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Surname",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(numTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Contact number",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isLength(numTxt.getText(), 11) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Must be 11 numbers long", "Contact number",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isDate(dobTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Please write a valid date and in the format 'dd/mm/yyyy'", "DOB",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (Validation.isPresent(add1Txt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "address",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(postcodeTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Postcode",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if ((Validation.isLength(postcodeTxt.getText(), 7) || Validation.isLength(postcodeTxt.getText(), 8)) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Must be 7 or 8 characters long", "Postcode",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isPresent(usernameTxt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Cannot be empty!", "Username",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isLength(password1Txt.getText(), 8) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Must be 8 characters long", "Password",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (Validation.isDoubleVerification(password1Txt.getText(), password2Txt.getText()) == false) {
            validate = false;
            JOptionPane.showMessageDialog(null, "Please confirm the password again", "Passwords don't match",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        try {
            if (validate == true) {
                //store participant information
                if (userType.equalsIgnoreCase("participant")) {
                    try {
                        ParticipantVO participant = new ParticipantVO();
                        participant.username = username;
                        participant.password = password1;
                        participant.forename = forename;
                        participant.surname = surname;
                        participant.dob = dob;
                        participant.add1 = add1;
                        participant.add2 = add2;
                        participant.postcode = postcode;
                        participant.num = num;
                        participant.email = email;
                        GoService.getInstance().addParticipant(participant);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                //store organizer information
                if (userType.equalsIgnoreCase("organizer")) {
                    
                    try {
                        OrganizerVO organizer = new OrganizerVO();
                        organizer.username = username;
                        organizer.password = password1;
                        organizer.forename = forename;
                        organizer.surname = surname;
                        organizer.dob = dob;
                        organizer.add1 = add1;
                        organizer.add2 = add2;
                        organizer.postcode = postcode;
                        organizer.num = num;
                        organizer.email = email;
                        organizer.income = income;
                        GoService.getInstance().addOrganizer(organizer);
                    } catch (Exception e) {

                    }
                    
                }
                JOptionPane.showMessageDialog(null, "successful added");
                    LoginUI liFrm = new LoginUI();
                    liFrm.setVisible(true);
                    this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error with: " + ex);
        }
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
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpUI().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField numTxt;
    private javax.swing.JTextField password1Txt;
    private javax.swing.JTextField password2Txt;
    private javax.swing.JTextField postcodeTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField surnameTxt;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}

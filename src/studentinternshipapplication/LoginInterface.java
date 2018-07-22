package studentinternshipapplication;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class LoginInterface extends javax.swing.JFrame {

    String login = "student_details";                           //storing the type of user
    String loginID;
    LoginInterface li;
    
    //---------------------------------------------------------------------------------------------------------------------------------------
    public LoginInterface() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x_size = 1350;
        int y_size=700;
        this.setSize(x_size,y_size);
        loginFieldsPanel.setVisible(false);                     //at the start panel containig all the login input fields is set to invisible
                                                                                       //first suer has to specify the type of user - student admin or comapny
                                                                                       
    }
    
  //----------------------------------------------------------------------------------------------------------------------------------------
    void setLoginInterface(LoginInterface l){               //setting variable values 
        this.li = l;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryPanel = new javax.swing.JPanel();
        lblCompany = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblStudent = new javax.swing.JLabel();
        loginFieldsPanel = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        txtID = new javax.swing.JTextField();
        lblGoBack = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnNewUser = new javax.swing.JButton();
        lblLogInfo = new javax.swing.JLabel();
        lblBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        categoryPanel.setBackground(new java.awt.Color(102, 102, 102));
        categoryPanel.setOpaque(false);

        lblCompany.setBackground(new java.awt.Color(0, 153, 204));
        lblCompany.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        lblCompany.setForeground(new java.awt.Color(255, 255, 255));
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompany.setText("Company");
        lblCompany.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        lblCompany.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompanyMouseClicked(evt);
            }
        });

        lblAdmin.setBackground(new java.awt.Color(204, 0, 102));
        lblAdmin.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("Admin");
        lblAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        lblAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
        });

        lblStudent.setBackground(new java.awt.Color(0, 153, 153));
        lblStudent.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        lblStudent.setForeground(new java.awt.Color(255, 255, 255));
        lblStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudent.setText("Student");
        lblStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        lblStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStudentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout categoryPanelLayout = new javax.swing.GroupLayout(categoryPanel);
        categoryPanel.setLayout(categoryPanelLayout);
        categoryPanelLayout.setHorizontalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        categoryPanelLayout.setVerticalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        getContentPane().add(categoryPanel);
        categoryPanel.setBounds(160, 480, 980, 200);

        loginFieldsPanel.setOpaque(false);

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setToolTipText("Enter Password");
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtPassword.setOpaque(false);

        txtID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("Enter User ID");
        txtID.setToolTipText("Enter User ID");
        txtID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtID.setOpaque(false);

        lblGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        lblGoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoBackMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 204, 153));
        btnLogin.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnNewUser.setBackground(new java.awt.Color(204, 204, 204));
        btnNewUser.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnNewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnNewUser.setText("New User");
        btnNewUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewUser.setOpaque(false);
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });

        lblLogInfo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblLogInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogInfo.setText("display log");

        javax.swing.GroupLayout loginFieldsPanelLayout = new javax.swing.GroupLayout(loginFieldsPanel);
        loginFieldsPanel.setLayout(loginFieldsPanelLayout);
        loginFieldsPanelLayout.setHorizontalGroup(
            loginFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFieldsPanelLayout.createSequentialGroup()
                .addGroup(loginFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFieldsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblGoBack))
                    .addGroup(loginFieldsPanelLayout.createSequentialGroup()
                        .addGroup(loginFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginFieldsPanelLayout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(loginFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword)
                                    .addComponent(txtID)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginFieldsPanelLayout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(lblLogInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 403, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginFieldsPanelLayout.setVerticalGroup(
            loginFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginFieldsPanelLayout.createSequentialGroup()
                        .addGap(0, 361, Short.MAX_VALUE)
                        .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginFieldsPanelLayout.createSequentialGroup()
                        .addComponent(lblLogInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(lblGoBack)))
                .addContainerGap())
        );

        getContentPane().add(loginFieldsPanel);
        loginFieldsPanel.setBounds(230, 240, 1090, 430);

        lblBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Graduates_110915.jpg"))); // NOI18N
        getContentPane().add(lblBackgroundImage);
        lblBackgroundImage.setBounds(0, 0, 1350, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//----------------------------------------------------------------------------------------------------------------------------------------
    private void lblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentMouseClicked
        categoryPanel.setVisible(false);                                //panel containing all the categories are set to invisible
        login = "student_details";                                                         //making the login type
        loginFieldsPanel.setVisible(true);                              //enabling login input fields
        lblLogInfo.setText("Sign-in as : STUDENT");
    }//GEN-LAST:event_lblStudentMouseClicked
//----------------------------------------------------------------------------------------------------------------------------------------
    private void lblCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMouseClicked
        categoryPanel.setVisible(false);                                //same as above
        login = "company_details";
        loginFieldsPanel.setVisible(true);
        lblLogInfo.setText("Sign-in as : COMPANY");
    }//GEN-LAST:event_lblCompanyMouseClicked
//---------------------------------------------------------------------------------------------------------------------------------------
    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        categoryPanel.setVisible(false);                             //same as above
        login = "admin_details";
        loginFieldsPanel.setVisible(true);
        lblLogInfo.setText("Sign-in as : ADMIN");
        btnNewUser.setVisible(false);
    }//GEN-LAST:event_lblAdminMouseClicked
//----------------------------------------------------------------------------------------------------------------------------------------
    private void lblGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoBackMouseClicked
        loginFieldsPanel.setVisible(false);                             //moves one step back to the verify user type phase
        categoryPanel.setVisible(true);                                 //incase the user clicked a button by mistake
        txtID.setText("");
        txtPassword.setText("");
        btnNewUser.setVisible(true);
    }//GEN-LAST:event_lblGoBackMouseClicked
//-----------------------------------------------------------------------------------------------------------------------------------------
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        loginMethod();
    }//GEN-LAST:event_btnLoginActionPerformed
//------------------------------------------------------------------------------------------------------------------------------------------
    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        if(login.equals("student_details"))                             //new user for student
        displayStudentInterface(true);
        else if(login.equals("company_details")){                   //new user for company
            CompanyInterface cl = new CompanyInterface(li,true);
            cl.setVisible(true);
        }    
    }//GEN-LAST:event_btnNewUserActionPerformed
//----------------------------------------------------------------------------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblBackgroundImage;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblGoBack;
    private javax.swing.JLabel lblLogInfo;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JPanel loginFieldsPanel;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
//---------------------------------------------------------------------------------------------------------------------------------------
StudentInterface displayStudentInterface(boolean newUser) {                                       //newUser - states whether he has editable powers
        StudentInterface frame = new StudentInterface(li, newUser);        //creating the new frame and disable text edit since user is already in the system
        //frame.setExtendedState(LoginInterface.MAXIMIZED_BOTH);      //setting the size to the max
        frame.setTitle("Student login");
        frame.setStudentInterface(frame);                                                       //passing the address to of student frame
        li.setVisible(false);                                                                                      //disappear login window
        frame.setVisible(true);
        return frame;
    }
//--------------------------------------------------------------------------------------------------------------------------------------
CompanyInterface displayCompanyLoginInterface(boolean newUser){
    CompanyInterface frame = new CompanyInterface(li, newUser);        //creating the new frame and disable text edit since user is already in the system
    frame.setTitle("Company login");
    //frame.setStudentInterface(frame);                                                       //passing the address to of student frame
    li.setVisible(false);                                                                                      //disappear login window
    frame.setVisible(true);
    return frame;
}
//---------------------------------------------------------------------------------------------------------------------------------------
adminInterface displayAdminInterface(boolean newUser){
    adminInterface frame = new adminInterface(li, newUser);        //creating the new frame and disable text edit since user is already in the system
    frame.setTitle("Admin login");
    li.setVisible(false);                                                                                      //disappear login window
    frame.setVisible(true);
    return frame;
}
//---------------------------------------------------------------------------------------------------------------------------------------
void loginMethod(){
        System.out.println("login method in logininteerface class");
        ValidateMethods vm = new ValidateMethods();
        DBOperations db = new DBOperations();
        boolean validLogin = vm.validateLogin(db.retrieveLoginInfor(login), txtID.getText(), txtPassword.getText());      
        
        if (login.equals("student_details")) {
            if (validLogin) {
                JOptionPane.showMessageDialog(this, "Successful Login");
                Student s = new Student();
                s.setDetails(db.getContact(txtID.getText(),login));
                StudentInterface sdt = displayStudentInterface(false);
                sdt.fillInfo(s);    
                System.gc();
                
            } else {
                JOptionPane.showMessageDialog(this, "Login Failed");
                txtID.setText("");
                txtPassword.setText("");
            }
        }else if(login.equals("company_details")){
           if (validLogin) {
                JOptionPane.showMessageDialog(this, "Successful Login");
                Company c = new Company();
                c.setDetails(db.getContact(txtID.getText(),login));
                CompanyInterface lg = displayCompanyLoginInterface(false);
                lg.fillInfo(c);
                System.gc();
            } else {
                JOptionPane.showMessageDialog(this, "Login Failed");
                txtID.setText("");
                txtPassword.setText("");
            }
            
        } else if (validLogin) {
            JOptionPane.showMessageDialog(this, "Successful Login");
            displayAdminInterface(true);
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed");
            txtID.setText("");
            txtPassword.setText("");
        }
    }
}
//---------------------------------------------------------------------------------------------------------------------------------------


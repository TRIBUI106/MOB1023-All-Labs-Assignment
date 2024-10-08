/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package me.chezis.lab2.view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Chezis P
 */
public class Bai3 extends javax.swing.JFrame {

    /**
     * Creates new form Bai3
     */ 
    public Bai3() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Lab 2 - Bài 3");
        setResizable(false);
        lblLoginForm.setForeground(Color.BLUE);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Hiển thị lại SelectionPage khi cửa sổ con đóng
                SelectionPage selectionPage = new SelectionPage();
                setVisible(false);
                selectionPage.setVisible(true);
            }
        });
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoginForm = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        chkRemember = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLoginForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginForm.setText("Login Form");

        lblUsername.setText("Username");

        txtUsername.setText("Enter your username");

        lblPassword.setText("Password");

        txtPassword.setText("jPasswordField1");

        chkRemember.setText("Remember me?");
        chkRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRememberActionPerformed(evt);
            }
        });

        btnAdd.setText("Login");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkRemember)
                            .addComponent(lblLoginForm)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkRemember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
        chkRemember.setSelected(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String user = txtUsername.getText();
        String pass = new String(txtPassword.getPassword());  
        
        
        // Xử lý đăng nhập siu xịn xò bởi chezis - copy nhớ để nguồn <3 
        
//        Cách 1
//        if (!user.equals("fpt")) {
//        JOptionPane.showMessageDialog(this, "Đăng nhập thất bại! | Sai tài khoản", "Error", JOptionPane.ERROR_MESSAGE);
//        } else if (!pass.equals("polytechnic")) {
//            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại! | Sai mật khẩu", "Error", JOptionPane.ERROR_MESSAGE);
//        } else if ( user.equals("Enter your username") && pass.equals("jPasswordField1")) {
//            JOptionPane.showMessageDialog(this, "Lỗi ! Bạn chưa thay đổi username & password", "Error", JOptionPane.ERROR_MESSAGE);
//        } else {
//            showLoginInfo(user, pass, chkRemember.isSelected());
//            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
//            SelectionPage mainPanel = new SelectionPage();
//            mainPanel.show();
//        }
        
        
        // Cách 2 ( tui thấy cách này ok hơn )
        if ( user.equals("fpt") && pass.equals("polytechnic") ) {
            showLoginInfo(user, pass, chkRemember.isSelected());
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
            SelectionPage mainPanel = new SelectionPage();
            mainPanel.show();
            this.setVisible(false);
        } else if ( user.equals("Enter your username") && pass.equals("jPasswordField1")) {
            JOptionPane.showMessageDialog(this, "Lỗi ! Bạn chưa thay đổi username & password", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void chkRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRememberActionPerformed
        if ( chkRemember.isSelected() ) {
            JOptionPane.showMessageDialog(this, "Đã ghi nhớ bạn cho những lần đăng nhập sau", "Remember me", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_chkRememberActionPerformed

    private void showLoginInfo(String user, String pass, boolean isChecked) {
        System.out.println("Username : " + user);
        System.out.println("Password : " + pass);
        System.out.println("Checked  : " + isChecked);
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkRemember;
    private javax.swing.JLabel lblLoginForm;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

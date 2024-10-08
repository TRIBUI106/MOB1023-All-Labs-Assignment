/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package me.chezis.lab2.view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Chezis P
 */
public class Bai4 extends javax.swing.JFrame {

    /**
     * Creates new form Bai4
     */
    
    private boolean editingUser = false;
    private int editingUserNO;
    private String editingUserName;
    
    public Bai4() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Lab 2 - Bài 4");
        setResizable(false);
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
    
    private void themUserVaoBang() {
        if ( editingUser ) {
            System.out.println("Bro try to add user while editing xD");
        } else {
            DefaultTableModel list = (DefaultTableModel) tblUserList.getModel();
            list.addRow(new Object[]{"Đức Trí", "password123", "Admin"});
            list.addRow(new Object[]{"RandomUser1", "password234", "User"});
            list.addRow(new Object[]{"RandomUser2", "password456", "Admin"});
            list.addRow(new Object[]{"RandomUser3", "password123", "User"});
            list.addRow(new Object[]{"RandomUser4", "password567", "Admin"});
            JOptionPane.showMessageDialog(this, "Đã thêm 5 users vào hệ thống", "Success", JOptionPane.INFORMATION_MESSAGE);
            doiTab(0, false, ""); 
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpRole = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUserManagement = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserList = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        rdoUser = new javax.swing.JRadioButton();
        rdoAdmin = new javax.swing.JRadioButton();
        btnReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAddRandomUser = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUserManagement.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUserManagement.setForeground(new java.awt.Color(0, 0, 255));
        lblUserManagement.setText("User Management");

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblUserList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserList.setColumnSelectionAllowed(true);
        tblUserList.setRowHeight(30);
        tblUserList.getTableHeader().setReorderingAllowed(false);
        tblUserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUserList);
        tblUserList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblUserList.getColumnModel().getColumnCount() > 0) {
            tblUserList.getColumnModel().getColumn(0).setResizable(false);
            tblUserList.getColumnModel().getColumn(0).setHeaderValue("Username");
            tblUserList.getColumnModel().getColumn(1).setResizable(false);
            tblUserList.getColumnModel().getColumn(1).setHeaderValue("Password");
            tblUserList.getColumnModel().getColumn(2).setResizable(false);
            tblUserList.getColumnModel().getColumn(2).setHeaderValue("Role");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LIST", jPanel1);

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsername.setText("Username");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setText("Password");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRole.setText("Role");

        grpRole.add(rdoUser);
        rdoUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoUser.setText("User");

        grpRole.add(rdoAdmin);
        rdoAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoAdmin.setText("Admin");

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setMargin(new java.awt.Insets(4, 26, 4, 26));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setMargin(new java.awt.Insets(4, 26, 4, 26));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.setMargin(new java.awt.Insets(4, 26, 4, 26));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setMargin(new java.awt.Insets(4, 26, 4, 26));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAddRandomUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddRandomUser.setText("Add 5 Test User");
        btnAddRandomUser.setMargin(new java.awt.Insets(4, 26, 4, 26));
        btnAddRandomUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRandomUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword)
                    .addComponent(lblRole))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset))
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdoUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoAdmin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAddRandomUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(rdoUser)
                    .addComponent(rdoAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddRandomUser, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("EDITION", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserManagement)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if ( editingUser ) {
//            System.out.println("Đang sửa thông tin của user !");
            JOptionPane.showMessageDialog(this, "Bạn đang sửa thông tin của user " + editingUserName +" !\nẤn Update hoặc Delete để tiếp tục thêm user", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
            String user = txtUsername.getText();
            String pass = new String(txtPassword.getPassword());
            String role = "";
            if (rdoAdmin.isSelected()) {
                role = "Admin";
            } else if (rdoUser.isSelected()) {
                role = "User";                
            } else {
                role = "empty";
            }

            if (user.equals("")) {
                System.out.println("Client didn't pick a username");
                JOptionPane.showMessageDialog(this, "Chưa đặt username!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (pass.equals("")) {
                System.out.println("Client didn't pick a password");
                JOptionPane.showMessageDialog(this, "Chưa đặt password!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (grpRole.getSelection() == null) { // Kiểm tra nếu chưa chọn role
                JOptionPane.showMessageDialog(this, "Chưa chọn vai trò!", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Client didn't pick a role");
            } else {
                model.addRow(new Object[]{user, pass, role});   
                JOptionPane.showMessageDialog(this, "<html>Đã thêm người dùng <u>" + user + "</u> vào hệ thống</html>", "Success", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("User added");
                doiTab(0, false, "");
                txtUsername.setText("");
                txtPassword.setText("");
            }
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int callback = JOptionPane.showConfirmDialog(this, "Xóa hết user ?", "Error", JOptionPane.YES_NO_OPTION);
//        System.out.println(callback); // Test
        switch (callback) {
            case JOptionPane.YES_OPTION:
                DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(this, "Đã xóa hết người dùng trong hệ thống", "Success", JOptionPane.INFORMATION_MESSAGE);
                //            doiTab(0, false, "");
                txtUsername.setText("");
                txtPassword.setText("");
                rdoAdmin.setSelected(false);
                rdoUser.setSelected(false);
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("Người dùng chọn không xóa");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Người dùng chọn hủy hành động");
                break;
            default:
                System.out.println("Lỗi hệ thống !");
                break;
        }
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void doiTab(int soTrang, boolean editUser, String userName) {
        jTabbedPane1.setSelectedIndex(soTrang);
        if ( editUser ) {
            lblUserManagement.setText("Editing User: " + userName);
            editingUser = true;
        } else {
            lblUserManagement.setText("User Management");
            editingUser = false;
            txtUsername.setText("");
            txtPassword.setText("");
        }
    }
    
    private void tblUserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserListMouseClicked
        // GET
        int userRow = (int) tblUserList.getSelectedRow();
        String username = (String) tblUserList.getValueAt(userRow, 0);
        String password = (String) tblUserList.getValueAt(userRow, 1);
        String role     = (String) tblUserList.getValueAt(userRow, 2);
        editingUserNO = userRow;
        editingUserName = username;
        
//      chezis checking syntax
        System.out.println(
                "\nĐang Xem " +
                "\nCột số   : " + ( userRow + 1 ) +
                "\nUsername : " + username +
                "\nPassword : " + password +
                "\nRole     : " + role + 
                "\n"
        );
        
        
        // POST
        if ("Admin".equals(role)) {
            rdoAdmin.setSelected(true);
        } else if ("User".equals(role)) {
            rdoUser.setSelected(true);
        }
        doiTab(1, true, username);
        txtUsername.setText(username);
        txtPassword.setText(password);
    }//GEN-LAST:event_tblUserListMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if ( !editingUser ) {
            JOptionPane.showMessageDialog(this, "Bạn không chỉnh sửa user nào !", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel userList = (DefaultTableModel) tblUserList.getModel();
            String user = txtUsername.getText();
            String pass = new String(txtPassword.getPassword());
            String role = "";
            if (rdoAdmin.isSelected()) {
                role = "Admin";
            } else if (rdoUser.isSelected()) {
                role = "User";                
            }
            userList.setValueAt(user, editingUserNO, 0);
            userList.setValueAt(pass, editingUserNO, 1);
            userList.setValueAt(role, editingUserNO, 2);
            System.out.println("Updated User : " + user + " | " + pass + " | " + role);
            JOptionPane.showMessageDialog(this, "Thay đổi thông tin của " + user + " thành công !", "Success", JOptionPane.INFORMATION_MESSAGE);
            doiTab(0, false, "");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddRandomUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRandomUserActionPerformed
        themUserVaoBang();
    }//GEN-LAST:event_btnAddRandomUserActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel userList = (DefaultTableModel) tblUserList.getModel();
        if ( editingUser ) {
            int callback = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa user " + editingUserName + " hay không ?", "Error", JOptionPane.YES_NO_OPTION);
            switch (callback) {
                case JOptionPane.YES_OPTION:
                    userList.removeRow(editingUserNO);
                    JOptionPane.showMessageDialog(this, "Đã xóa user " + editingUserName + " thành công !", "Success", JOptionPane.INFORMATION_MESSAGE);
                    doiTab(0, false, "");
                    break;
                case JOptionPane.NO_OPTION:
                    System.out.println("Người dùng chọn không xóa");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    System.out.println("Người dùng chọn hủy hành động");
                    break;
                default:
                    System.out.println("Lỗi hệ thống !");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn user !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddRandomUser;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup grpRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserManagement;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rdoAdmin;
    private javax.swing.JRadioButton rdoUser;
    private javax.swing.JTable tblUserList;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

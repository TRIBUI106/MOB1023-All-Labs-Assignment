/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab4.view;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Chezis P
 */
public class QuanLyNhanVien_B1_B2 extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien_B1_B2() {
        initComponents();
        this.setTitle("Bài 1 / 2");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtDayBorn.setText("");
        txtFullname.setText("");
        txtSalary.setText("");
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

        lblQLNV = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblDB = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        txtFullname = new javax.swing.JTextField();
        txtDayBorn = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQLNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQLNV.setForeground(new java.awt.Color(255, 0, 51));
        lblQLNV.setText("Quản Lý Nhân Viên");

        lblFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFullname.setText("Họ Và Tên");

        lblDB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDB.setText("Ngày Sinh");

        lblSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSalary.setText("Lương");

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        txtFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFullname.setText("jTextField1");

        txtDayBorn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDayBorn.setText("jTextField2");

        txtSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalary.setText("jTextField3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFullname)
                    .addComponent(lblDB)
                    .addComponent(lblSalary))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFullname)
                    .addComponent(txtDayBorn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheck)
                            .addComponent(lblQLNV))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addComponent(txtSalary))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullname)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDB)
                    .addComponent(txtDayBorn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheck)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        String name = txtFullname.getText();
        String dayborn = txtDayBorn.getText();
        String salary = txtSalary.getText();
        
        if ( name.equals("") || name.length() == 0 ) {
            announceErr("Bạn chưa nhập tên nhân viên !");
            txtFullname.setBackground(Color.YELLOW);
            return;
        } else {
            txtFullname.setBackground(Color.WHITE);
        }
        
        if ( dayborn.equals("") || dayborn.length() == 0 ) {
            announceErr("Bạn chưa nhập ngày sinh nhân viên !");
            txtDayBorn.setBackground(Color.yellow);
            return;
        } else {
            txtDayBorn.setBackground(Color.WHITE);
        }
        
        if ( salary.equals("") || salary.length() == 0 ) {
            announceErr("Bạn chưa nhập lương nhân viên !");
            txtSalary.setBackground(Color.yellow);
            return;
        } else {
            txtSalary.setBackground(Color.WHITE);
        }

        double luong = 0;
        try {
            luong = Double.parseDouble(salary);
            if (luong < 0) {
                announceWar("Lương nhân viên phải là số dương!");
                txtSalary.setBackground(Color.YELLOW);
                return;
            } else {
                txtSalary.setBackground(Color.WHITE);
            }
        } catch (NumberFormatException e1) {
            announceErr("Lương phải là một số !");
            txtSalary.setBackground(Color.YELLOW);
            return;
        }   
        
        Date date;
        SimpleDateFormat formater = new SimpleDateFormat("dd-mm-yyyy");
        try {
            date = formater.parse(dayborn);
            check(name, salary, date);
        } catch (ParseException e1) {
            announceErr("Ngày sinh không hợp lệ! Định dạng phải là dd-mm-yyyy.");
            txtDayBorn.setBackground(Color.YELLOW);
            return;
        } catch (Exception e2) {
            System.out.println("Lỗi không xác định !\n" + e2);
            return;
        }
        
        
        
        
        
    }//GEN-LAST:event_btnCheckActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void check(String name, String salary, Date date){
        System.out.println("Name     : " + name);
        System.out.println("Day Born : " + date);
        System.out.println("Luong    : " + salary);
    }
    
    public void announce(String text, String title, int type) {
        JOptionPane.showMessageDialog(null, text, title, type);
    }
    
    public void announceErr(String text) {
        JOptionPane.showMessageDialog(null, text, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void announceInf(String text) {
        JOptionPane.showMessageDialog(null, text, "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void announceWar(String text) {
        JOptionPane.showMessageDialog(null, text, "Warning", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(QuanLyNhanVien_B1_B2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien_B1_B2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien_B1_B2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien_B1_B2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien_B1_B2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel lblDB;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblQLNV;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTextField txtDayBorn;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}

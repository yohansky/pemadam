import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Login_jframe extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs =null;
PreparedStatement pst=null;

    public Login_jframe() {
        initComponents();
        conn=javaconnect.ConnecrDb();
    }
public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
} 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmd_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logo1 = new Pictures.logo();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Aleo", 1, 18)); // NOI18N
        jLabel5.setText("APLIKASI PENANGANAN PEMADAMAN KEBAKARAN ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmd_login.setText("Login");
        cmd_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_loginActionPerformed(evt);
            }
        });
        jPanel1.add(cmd_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, -1));
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, -1));

        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Titan One", 2, 18)); // NOI18N
        jLabel4.setText("Login");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 300, 190));

        javax.swing.GroupLayout logo1Layout = new javax.swing.GroupLayout(logo1);
        logo1.setLayout(logo1Layout);
        logo1Layout.setHorizontalGroup(
            logo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        logo1Layout.setVerticalGroup(
            logo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 150, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/11013-ilustrasi-pemadam-kebakaran.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -40, -1, -1));

        setSize(new java.awt.Dimension(604, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_loginActionPerformed
        String username = "Admin";
        String password = "Admin";
        if (username.equalsIgnoreCase(txt_username.getText())&& password.equalsIgnoreCase(txt_password.getText())){
            javax.swing.JOptionPane.showMessageDialog(null, "Username dan Password Benar");
            this.setVisible(true);
            new Menu_frame().setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Username dan Password Salah");
            txt_username.setText("");
            txt_password.setText("");
            txt_username.requestFocus();
            new Login_jframe().setVisible(true);
        }
        dispose();
    }//GEN-LAST:event_cmd_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private Pictures.logo logo1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

}

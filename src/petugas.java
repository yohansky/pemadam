import java.awt.*;
import java.awt.event.*;
import net.proteanit.sql.*;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
public class petugas extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs =null;
PreparedStatement pst=null;
private DefaultTableModel tabmode;
    /**
     * Creates new form karyawan_info
     */
    public petugas() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Update_table();
        datatable();
    }
    
    private void Update_table(){
        try{
        String sql ="select * from anggota";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        table_karyawan.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}
   private void clear(){
        txt_id.setText("");
        txt_nama.setText("");
        txt_jabatan.setText("");   
        txt_notelp.setText("");  
    }
        public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void datatable(){
        Object[] Baris = {"Kode Petugas","Nama Petugas","Jabatan","Nomor HP"};
        tabmode = new DefaultTableModel(null, Baris);
        table_karyawan.setModel(tabmode);
        String sql = "select * from anggota";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String a = hasil.getString("id_ptgs");
                String b = hasil.getString("nama");
                String c = hasil.getString("jabatan");
                String d = hasil.getString("no_hp");
                               
                String[] data = {a,b,c,d};
                tabmode.addRow(data);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_karyawan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Cmd_save = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        txt_update = new javax.swing.JButton();
        cmd_delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_jabatan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_notelp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        logo1 = new Pictures.logo();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_karyawanMouseClicked(evt);
            }
        });
        table_karyawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_karyawanKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_karyawan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 540, 320));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cmd_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-document-save-icon.png"))); // NOI18N
        Cmd_save.setText("Save");
        Cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmd_saveActionPerformed(evt);
            }
        });

        cmd_clear.setIcon(new javax.swing.ImageIcon("D:\\File kuliah\\Semester 6\\Pemrograman Visual\\project\\bahan\\icon\\clear.png")); // NOI18N
        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        txt_update.setIcon(new javax.swing.ImageIcon("D:\\File kuliah\\Semester 6\\Pemrograman Visual\\project\\bahan\\icon\\update.png")); // NOI18N
        txt_update.setText("Update");
        txt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updateActionPerformed(evt);
            }
        });

        cmd_delete.setIcon(new javax.swing.ImageIcon("D:\\File kuliah\\Semester 6\\Pemrograman Visual\\project\\bahan\\icon\\delete.png")); // NOI18N
        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Back-2-2-icon.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Cmd_save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmd_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cmd_save)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_clear)
                    .addComponent(cmd_delete))
                .addGap(18, 18, 18)
                .addComponent(txt_update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 220, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Jabatan");

        jLabel1.setText("Kode Petugas");

        jLabel2.setText("Nama Petugas");

        jLabel5.setText("No. HP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_notelp, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txt_jabatan)
                    .addComponent(txt_nama)
                    .addComponent(txt_id))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 170));

        javax.swing.GroupLayout logo1Layout = new javax.swing.GroupLayout(logo1);
        logo1.setLayout(logo1Layout);
        logo1Layout.setHorizontalGroup(
            logo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        logo1Layout.setVerticalGroup(
            logo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        getContentPane().add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DAFTAR PETUGAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 871, 44));

        setSize(new java.awt.Dimension(1123, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_karyawanMouseClicked
        DefaultTableModel tabmode=(DefaultTableModel)table_karyawan.getModel();
        int bar = table_karyawan.getSelectedRow();   
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
                       
        txt_id.setText(a);
        txt_nama.setText(b);
        txt_jabatan.setText(c);
        txt_notelp.setText(d);
        
    }//GEN-LAST:event_table_karyawanMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              Menu_frame s = new Menu_frame();
       s.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        int row =table_karyawan.getSelectedRow();
        int p = JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
        String Table_click=(table_karyawan.getModel().getValueAt(row, 0).toString());
        String sql="delete from anggota where id_ptgs='"+Table_click+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Terhapus");

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        datatable();
        }
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        clear();
        datatable();
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void txt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updateActionPerformed
        try {
            String value1 = txt_id.getText();
            String value2 = txt_nama.getText();
            String value3 = txt_jabatan.getText();
            String value4 = txt_notelp.getText();
            
                                    
            String sql ="update anggota set id_ptgs='"+value1+"',nama='"+value2+"',jabatan='"+value3+"',no_hp='"+value4+"' where id_ptgs='"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Terubah");

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        datatable();
    }//GEN-LAST:event_txt_updateActionPerformed

    private void Cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd_saveActionPerformed
        try{
            String sql ="insert into anggota (id_ptgs,nama,jabatan,no_hp) values (?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_id.getText());
            pst.setString(2, txt_nama.getText());
            pst.setString(3, txt_jabatan.getText());
            pst.setString(4, txt_notelp.getText());
                       
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        datatable();
    }//GEN-LAST:event_Cmd_saveActionPerformed

    private void table_karyawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_karyawanKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP);
        try{
            int row =table_karyawan.getSelectedRow();
            String Table_click=(table_karyawan.getModel().getValueAt(row, 0).toString());
            String sql="select * from anggota where id_ptgs='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next()){
            String add1 =rs.getString("id_ptgs");
            txt_id.setText(add1);
            String add2 =rs.getString("nama");
            txt_nama.setText(add2);
            String add3 =rs.getString("jabatan");
            txt_jabatan.setText(add3);
            String add4 =rs.getString("no_hp");
            txt_jabatan.setText(add4);
                        
        }
        } catch (Exception e){
          JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_table_karyawanKeyPressed

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
            java.util.logging.Logger.getLogger(petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cmd_save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Pictures.logo logo1;
    private javax.swing.JTable table_karyawan;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jabatan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_notelp;
    private javax.swing.JButton txt_update;
    // End of variables declaration//GEN-END:variables
}
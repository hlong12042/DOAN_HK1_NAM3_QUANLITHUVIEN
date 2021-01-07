package NhanVien;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import hoadon.HoaDon;
import javax.swing.JOptionPane;

/**
 *
 * @author LONG
 */
public class DEMO extends javax.swing.JFrame {

    public DEMO() throws IOException{
        initComponents();
        File file = new File("temp.txt");
        InputStream input = null;
        input = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buf = new BufferedReader(reader);
        String[] ls = buf.readLine().split(",");
        String tenDangNhap = ls[1];
        NhanVien nhanVien = Utils.Utils.tim(tenDangNhap);
        String str = "Thông tin đăng nhập: " +
                "\nMã nhân viên: " + nhanVien.getMaNV() +
                "\nHọ tên nhân viên: " + nhanVien.getTen() +
                "\nTuổi: " + Integer.toString(nhanVien.getTuoi()) +
                "\nGiới tính: " + nhanVien.getGioiTinh() +
                "\nĐịa chỉ: " + nhanVien.getDiaChi() +
                "\nChức vụ: ";
        if(ls[3].equals("true")) str+="Quản lí";
        else str+="Nhân viên";
        jEditorPane1.setText(str);
        jEditorPane1.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnKe = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnSach = new javax.swing.JButton();
        btnLapHoaDon = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book store management");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lí cửa hàng sách", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnKe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKe.setText("Quản lí kệ sách");
        btnKe.setToolTipText("Shelves Management");
        btnKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeActionPerformed(evt);
            }
        });

        btnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNhanVien.setText("Quản lí nhân viên");
        btnNhanVien.setToolTipText("Staffs management");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setToolTipText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnHoaDon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHoaDon.setText("Quản lí hóa đơn");
        btnHoaDon.setToolTipText("Bills management");
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnSach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSach.setText("Quản lí đầu sách");
        btnSach.setToolTipText("Warehouse");
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachActionPerformed(evt);
            }
        });

        btnLapHoaDon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLapHoaDon.setText("Lập hóa đơn");
        btnLapHoaDon.setToolTipText("Invoice");
        btnLapHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapHoaDonActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setToolTipText("Log out");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        jEditorPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDangXuat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLapHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 358, Short.MAX_VALUE)
                        .addComponent(btnLapHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNhanVien))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnDangXuat))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thoát?", "Exit", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            Utils.Utils.xoaThongTinDangNhap();
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachActionPerformed
        try {
            if(ktAdmin()){
                Sach.TimKiem timKiem= new Sach.TimKiem();
                timKiem.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Bạn không phải người quản lí, không thể thực hiện chức năng này", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSachActionPerformed

    private void btnLapHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapHoaDonActionPerformed
        try {
            HoaDon hoaDon = new hoadon.HoaDon();
            File file = new File("temp.txt");
            InputStream input = null;
            input = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader buf = new BufferedReader(reader);
            try {
                String[] ls = buf.readLine().split(",");
                hoaDon = hoaDon.taoHoaDonMoi(ls[0]);
                List<String> listIDSach = new Vector<>();
                listIDSach = hoaDon.leakDS();
                hoaDon.setListIDSach(listIDSach);   
                hoaDon.taoFormGhiHD(hoaDon);
            } catch (IOException ex) {
                Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLapHoaDonActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        try {
            if(ktAdmin()){
                hoadon.QuanLiHoaDon quanLiHoaDon = new hoadon.QuanLiHoaDon();
                quanLiHoaDon.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Bạn không phải người quản lí, không thể thực hiện chức năng này", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        try {
            if(ktAdmin()){
                QuanLyNhanVien qlnv = new QuanLyNhanVien();
                qlnv.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Bạn không phải người quản lí, không thể thực hiện chức năng này", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đăng xuất?", "Sign out", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            setVisible(false);
            new Utils.DangNhap().setVisible(true);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeActionPerformed
        kesach.KeSachF keSach = new kesach.KeSachF();
        keSach.setVisible(true);
    }//GEN-LAST:event_btnKeActionPerformed

    private static boolean ktAdmin() throws FileNotFoundException, IOException{
        File file = new File("temp.txt");
        InputStream input = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buf = new BufferedReader(reader);
        String line = buf.readLine();
        String[] ls = line.split(",");
        if(ls[3].equals("true")) return true;
        return false;
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        Utils.Utils.xoaThongTinDangNhap();
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
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DEMO().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKe;
    private javax.swing.JButton btnLapHoaDon;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnThoat;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

package Sach;

import static Sach.Kho.ghifile;
import static Sach.TimKiem.KTinput;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ChinhSua extends javax.swing.JFrame {

    public ChinhSua(Sach sach) {
        initComponents();
        LabelMaSach.setText(sach.getMaSach());
        inputTieuDe.setText(sach.getTieuDe());
        inputMaKe.setText(sach.getMaKe());
        inputGiaNhap.setText(Long.toString(sach.getGiaNhap()));
        inputGiaBan.setText(Long.toString(sach.getGiaBan()));
        inputSoLuong.setText(Long.toString(sach.getSoLuong()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputTieuDe = new javax.swing.JTextField();
        inputMaKe = new javax.swing.JTextField();
        inputGiaNhap = new javax.swing.JTextField();
        inputGiaBan = new javax.swing.JTextField();
        inputSoLuong = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        LabelThongBao = new javax.swing.JLabel();
        LabelMaSach = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit propertises");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mã Sách:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tiêu đề:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Mã kệ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Giá nhập:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Giá bán:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Số lượng:");

        inputTieuDe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputTieuDe.setToolTipText("Book's title");

        inputMaKe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputMaKe.setToolTipText("Book's shelf");

        inputGiaNhap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputGiaNhap.setToolTipText("Sale price");

        inputGiaBan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputGiaBan.setToolTipText("Buy price");

        inputSoLuong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputSoLuong.setToolTipText("Amount");

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setToolTipText("Exit");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOK.setText("OK");
        btnOK.setToolTipText("OK");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });

        LabelThongBao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelThongBao.setForeground(java.awt.Color.red);

        LabelMaSach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelMaSach.setToolTipText("Book's id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(LabelMaSach)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(inputTieuDe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(inputMaKe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(inputGiaNhap))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelThongBao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
                                .addComponent(btnOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThoat))
                            .addComponent(inputSoLuong)
                            .addComponent(inputGiaBan))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LabelMaSach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputMaKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnOK)
                    .addComponent(LabelThongBao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        String maSach = LabelMaSach.getText();
        String tieuDe = inputTieuDe.getText();
        String maKe = inputMaKe.getText();
        long giaN = 0;
        long giaB = 0;
        long soL = 0;
        if(maSach.isEmpty()||tieuDe.isEmpty()||maKe.isEmpty()||inputGiaNhap.getText().isEmpty()||inputGiaBan.getText().isEmpty()||inputSoLuong.getText().isEmpty()){
            LabelThongBao.setText("Không để trống!");
            return;
        }
        if(!KTinput(maKe)){
            LabelThongBao.setText("Không nhập kí tự đặt biệt!");
            return;
        }
        try {
            long giaNhap = Long.parseLong(inputGiaNhap.getText());
            long giaBan = Long.parseLong(inputGiaBan.getText());
            long soLuong = Long.parseLong(inputSoLuong.getText());
            Kho kho = new Kho();
            Sach sach = kho.timTieuDe(tieuDe);
            if (sach!=kho.timMaSach(maSach)){
                LabelThongBao.setText("Trùng tiêu đề!");
                return;
            }
            kesach.Ke ke = new kesach.Ke();
            kesach.KeSach kesach = ke.timMaKe(maKe);
            if(kesach==null){
                LabelThongBao.setText("Không tìm thấy mã kệ!");
                return;
            }
            int option = JOptionPane.showConfirmDialog(rootPane, "Bạn chắn chắn muốn chỉnh sửa thông tin của đầu sách này?", "Cẩn thận",JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION){
                sach = kho.timMaSach(maSach);
                sach.setTieuDe(tieuDe);
                sach.setMaKe(maKe);
                sach.setGiaNhap(giaNhap);
                sach.setGiaBan(giaBan);
                sach.setSoLuong(soLuong);
                kho.thaydoi(maSach, sach);
                JOptionPane.showMessageDialog(rootPane, "Đã chỉnh sửa thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (IOException ex) {
            Logger.getLogger(ChinhSua.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NumberFormatException e){
            LabelThongBao.setText("Nhập sai định dạng ngày tháng");
        }
    }//GEN-LAST:event_btnOKMouseClicked

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
            java.util.logging.Logger.getLogger(ChinhSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChinhSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChinhSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChinhSua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Kho kho = new Kho();
                Sach sach = kho.timMaSach("SGK0020");
                new ChinhSua(sach).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMaSach;
    private javax.swing.JLabel LabelThongBao;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JTextField inputGiaBan;
    private javax.swing.JTextField inputGiaNhap;
    private javax.swing.JTextField inputMaKe;
    private javax.swing.JTextField inputSoLuong;
    private javax.swing.JTextField inputTieuDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

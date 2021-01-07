package Sach;

import static Sach.Kho.ghifile;
import static Sach.TimKiem.KTinput;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ThemSach extends javax.swing.JFrame {

    public ThemSach() {
        initComponents();
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
        inputGiaBan = new javax.swing.JTextField();
        inputGiaNhap = new javax.swing.JTextField();
        inputMaKe = new javax.swing.JTextField();
        inputTieuDe = new javax.swing.JTextField();
        inputMaSach = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        LabelThongBao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new title");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

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

        inputGiaBan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputGiaBan.setToolTipText("Buy's price");

        inputGiaNhap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputGiaNhap.setToolTipText("Sale's price");

        inputMaKe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputMaKe.setToolTipText("Book's shelf");

        inputTieuDe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputTieuDe.setToolTipText("Book's title");

        inputMaSach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputMaSach.setToolTipText("Book's id");
        inputMaSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputMaSachKeyReleased(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setToolTipText("Thoát\nExit");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOK.setText("OK");
        btnOK.setToolTipText("Ok");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });

        LabelThongBao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelThongBao.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                            .addComponent(inputTieuDe)
                            .addComponent(inputMaKe)
                            .addComponent(inputGiaNhap)
                            .addComponent(inputGiaBan))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelThongBao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThoat)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String maSach = inputMaSach.getText();
        String tieuDe = inputTieuDe.getText();
        String maKe = inputMaKe.getText();
        long giaNhap = 0;
        long giaBan = 0;
        if(maSach.isEmpty()||tieuDe.isEmpty()||maKe.isEmpty()||inputGiaNhap.getText().isEmpty()||inputGiaBan.getText().isEmpty()){
            LabelThongBao.setText("Không để trống!"); 
            return;
        }
        if(!KTinput(maSach)||!KTinput(maKe)){
            LabelThongBao.setText("Không nhập kí tự đặt biệt!");
            return;
        }
        try{
            giaNhap = Long.parseLong(inputGiaNhap.getText());
            giaBan = Long.parseLong(inputGiaBan.getText());
            if(giaNhap<0||giaBan<0){
                LabelThongBao.setText("Không nhập số âm!");
                return;
            }
            Kho kho = new Kho();
            Sach s = kho.timMaSach(maSach);
            if (s!=null){
                LabelThongBao.setText("Trùng mã Sách!");
                return;
            }
            s = kho.timTieuDe(tieuDe);
            if (s!=null){
                LabelThongBao.setText("Trùng tiêu đề!");
                return;
            }
            kesach.Ke ke = new kesach.Ke();
            kesach.KeSach kesach = ke.timMaKe(maKe);
            if(kesach==null){
                LabelThongBao.setText("Không tìm thấy mã kệ!");
                return;
            }
            kho.them2(new Sach(maSach, tieuDe, maKe, giaNhap, giaBan, new Date(), 0));
            JOptionPane.showMessageDialog(jPanel1, "Đã thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e){
            LabelThongBao.setText("Nhập đúng định dạng số!");
        } catch (IOException ex) {
            Logger.getLogger(ThemSach.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }//GEN-LAST:event_btnOKMouseClicked

    private void inputMaSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMaSachKeyReleased
        Kho kho = new Kho();
        String maSach = inputMaSach.getText();
        for (Sach sach:kho.getSach()){
            if(sach.getMaSach().contains(maSach)){
                String[] ls = sach.getMaSach().split("0");
                int maTruoc = Integer.parseInt(ls[ls.length-1]);
                inputMaSach.setToolTipText(ls[0] + Integer.toString(maTruoc+1));
            }
        }
        
    }//GEN-LAST:event_inputMaSachKeyReleased

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
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelThongBao;
    public javax.swing.JButton btnOK;
    private javax.swing.JButton btnThoat;
    public javax.swing.JTextField inputGiaBan;
    public javax.swing.JTextField inputGiaNhap;
    public javax.swing.JTextField inputMaKe;
    public javax.swing.JTextField inputMaSach;
    public javax.swing.JTextField inputTieuDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

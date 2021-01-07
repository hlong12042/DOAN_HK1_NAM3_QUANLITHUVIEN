package Sach;

import static Sach.Sach.ngay;
import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TimKiem extends javax.swing.JFrame {
    
    public TimKiem() {
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
        inputMaKe = new javax.swing.JTextField();
        inputTieuDe = new javax.swing.JTextField();
        inputMaSach = new javax.swing.JTextField();
        btnChinhSua = new javax.swing.JButton();
        btnDatLai = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputNgay = new javax.swing.JTextField();
        inputThang = new javax.swing.JTextField();
        inputNam = new javax.swing.JTextField();
        LabelThongBao = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Warehourse information");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mã Sách:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tiêu đề:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Mã kệ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Ngày nhập:");

        inputMaKe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputMaKe.setToolTipText("Book's shelf");
        inputMaKe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputMaKeKeyReleased(evt);
            }
        });

        inputTieuDe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputTieuDe.setToolTipText("Book's title");
        inputTieuDe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputTieuDeKeyReleased(evt);
            }
        });

        inputMaSach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputMaSach.setToolTipText("Book's id");
        inputMaSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputMaSachKeyReleased(evt);
            }
        });

        btnChinhSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChinhSua.setText("Chỉnh sửa");
        btnChinhSua.setToolTipText("Edit\nFill correctly the first box to use this option\nNhập chính xác Mã Sách để thực hiện chức năng");
        btnChinhSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChinhSuaMouseClicked(evt);
            }
        });

        btnDatLai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDatLai.setText("Đặt lại");
        btnDatLai.setToolTipText("Reset");
        btnDatLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatLaiMouseClicked(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setToolTipText("Search");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setText("Thêm đầu sách");
        btnThem.setToolTipText("Add new Book title");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Ngày:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tháng:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Năm:");

        inputNgay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputNgay.setToolTipText("Book's title added date\nDay of month");

        inputThang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputThang.setToolTipText("Book's title added date\nMonth");

        inputNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputNam.setToolTipText("Book's title added date\nYear");

        LabelThongBao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelThongBao.setForeground(java.awt.Color.red);

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setToolTipText("Remove\nFill correctly the first box to use this option\nNhập chính xác Mã Sách để thực hiện chức năng xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(inputMaKe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputMaSach)
                            .addComponent(inputTieuDe)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputThang, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChinhSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
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
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(inputNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChinhSua)
                    .addComponent(btnDatLai)
                    .addComponent(btnTimKiem)
                    .addComponent(btnThem)
                    .addComponent(LabelThongBao)
                    .addComponent(btnXoa)
                    .addComponent(btnThoat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kết quả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            null,
            new String [] {
                "Mã Sách", "Tiêu đề", "Mã kệ", "Giá nhập", "Giá bán", "Ngày nhập", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatLaiMouseClicked
        datlai();
    }//GEN-LAST:event_btnDatLaiMouseClicked

    
    public void datlai(){
        Vector header = new Vector();
        header.add("Mã Sách");
        header.add("Tiêu dề");
        header.add("Mã Kệ");
        header.add("Giá nhập");
        header.add("Giá bán");
        header.add("Ngày nhập");
        header.add("Số lượng");
        jTable1.setModel(new DefaultTableModel(null,header));
    }
    
    private void Timkiem(){
        Kho kho = new Kho();
        String maSach = inputMaSach.getText();
        String tieuDe = inputTieuDe.getText();
        String maKe = inputMaKe.getText();
        int ngay = 0;
        int thang = 0;
        int nam = 0;
        if (!KTinput(maSach)||!KTinput(maKe)){
            LabelThongBao.setText("Không nhập kí tự đặt biệt");
            return;
        }
        try{
            if(!inputNgay.getText().isEmpty()&&!inputThang.getText().isEmpty()&&!inputNam.getText().isEmpty()){
                ngay = Integer.parseInt(inputNgay.getText());
                thang = Integer.parseInt(inputThang.getText());
                nam = Integer.parseInt(inputNam.getText());
                    if(!ktNgayThang(ngay,thang,nam)){
                        LabelThongBao.setText("Nhập sai ngày tháng!");
                        datlai();
                        return;
                    }
            }
            List<Sach> ds = kho.getSach();
            boolean flag = true;
            if(!maSach.isEmpty()){
                while (flag){
                    int count = 0;
                    for(Sach sach:ds){
                        if(sach.getMaSach().indexOf(maSach)==-1) {
                            ds.remove(sach);
                            break;
                        }
                        count++;
                    }
                    if(count == ds.size()) flag = false;
                }
            }
            flag = true;
            if(!tieuDe.isEmpty()){
                while (flag){
                    int count = 0;
                    for(Sach sach:ds){
                        if(sach.getTieuDe().indexOf(tieuDe)==-1) {
                            ds.remove(sach);
                            break;
                        }
                        count++;
                    }
                    if(count == ds.size()) flag = false;
                }
            }
            flag = true;
            if(!maKe.isEmpty()){
                while (flag){
                    int count = 0;
                    for(Sach sach:ds){
                        if(sach.getMaKe().indexOf(maKe)==-1) {
                            ds.remove(sach);
                            break;
                        }
                        count++;
                    }
                    if(count == ds.size()) flag = false;
                }
            }
            flag = true;
            if(ngay==0||thang==0||nam==0){}
            else{
                while (flag){
                    int count = 0;
                    Date n = new Date();
                    n.setDate(ngay);
                    n.setMonth(thang);
                    n.setYear(nam);
                    for(Sach sach:ds){
                        if(!sach.getNgayNhap().before(n)) {
                            ds.remove(sach);
                            break;
                        }
                        count++;
                    }
                    if(count == ds.size()) flag = false;
                }
            }
            Vector header = new Vector();
            header.add("Mã Sách");
            header.add("Tiêu dề");
            header.add("Mã Kệ");
            header.add("Giá nhập");
            header.add("Giá bán");
            header.add("Ngày nhập");
            header.add("Số lượng");
            Vector data = new Vector();
            for (Sach s:ds){
                Vector row = new Vector();
                row.add(s.getMaSach());
                row.add(s.getTieuDe());
                row.add(s.getMaKe());
                row.add(s.getGiaNhap());
                row.add(s.getGiaBan());
                row.add(ngay(s.getNgayNhap()));
                row.add(s.getSoLuong());
                data.add(row);
            }
            jTable1.setModel(new DefaultTableModel(data, header));
        }catch(NumberFormatException e){
            LabelThongBao.setText("Nhập sai định dạng ngày tháng");
        }       
    }
    
    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        Timkiem();
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnChinhSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChinhSuaMouseClicked
        int row = jTable1.getSelectedRow();
        String maSach = "";
        if (row == -1){
            do{
                maSach = JOptionPane.showInputDialog(rootPane,"Nhập mã sách cần chỉnh sửa", "Mã sách");
                if(!KTinput(maSach))
                    JOptionPane.showMessageDialog(rootPane, "Không nhập kí tự đặc biệt!", "Warning!", JOptionPane.WARNING_MESSAGE);
                if(maSach.isEmpty())
                    JOptionPane.showMessageDialog(rootPane, "Nhập chính xác mã sách để thực hiện chức năng này!", "Warning!", JOptionPane.WARNING_MESSAGE);
            } while(!KTinput(maSach)||maSach.isEmpty());
        } else {
            model = (DefaultTableModel) jTable1.getModel();
            maSach = model.getValueAt(row, 0).toString();
        }
        Kho kho = new Kho();
        Sach sach = kho.timMaSach(maSach);
        if(sach==null){
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy mã sách này!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            ChinhSua chinhSua = new ChinhSua(sach);
            chinhSua.setVisible(true);         
        }
    }//GEN-LAST:event_btnChinhSuaMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        ThemSach themsach = new ThemSach();
        themsach.setVisible(true);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int option = JOptionPane.showConfirmDialog(rootPane, "Bạn chắc chắn muốn xóa đầu sách " + inputMaSach.getText() + " ?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
            Kho kho = new Kho();
            Sach sach = kho.timMaSach(inputMaSach.getText());
            if(sach==null)
                JOptionPane.showMessageDialog(rootPane, "Nhập chính xác mã sách bạn muốn xóa!", "Cảnh báo", JOptionPane.INFORMATION_MESSAGE);
            else{
                try {
                    kho.xoa2(sach);
                    JOptionPane.showMessageDialog(rootPane, "Đã xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    datlai();
                } catch (IOException ex) {
                    Logger.getLogger(TimKiem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void inputMaSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMaSachKeyReleased
        Timkiem();
    }//GEN-LAST:event_inputMaSachKeyReleased

    private void inputTieuDeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTieuDeKeyReleased
        Timkiem();
    }//GEN-LAST:event_inputTieuDeKeyReleased

    private void inputMaKeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMaKeKeyReleased
        Timkiem();
    }//GEN-LAST:event_inputMaKeKeyReleased

    public static boolean ktNgayThang(int ngay, int thang, int nam){
        if(nam<1970||thang<1||12<thang||ngay<1)
            return false;
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                if(31<ngay)
                    return false;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                if(30<ngay)
                    return false;
            }
            case 2:
                if(ktNamNhuan(nam)&&ngay<29) return true;
                else if(!ktNamNhuan(nam)&&ngay<28) return true;
                else return false;
        }
        return true;
    }
    
    public static boolean ktNamNhuan(int year){
        return (((year % 4 == 0) && (year % 100 != 0)) || 
            (year % 400 == 0)); 
    }
    
    public static boolean KTinput(String str){
        if(str.isEmpty()) return true;
        String regex = "\\w+";
        String[] ls = str.split(" ");
        for (String s:ls){
            if(!s.matches(regex)) 
                return false;
        }
        return true;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TimKiem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelThongBao;
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JButton btnDatLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTextField inputMaKe;
    private javax.swing.JTextField inputMaSach;
    private javax.swing.JTextField inputNam;
    private javax.swing.JTextField inputNgay;
    private javax.swing.JTextField inputThang;
    private javax.swing.JTextField inputTieuDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
}

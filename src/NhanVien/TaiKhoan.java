/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

/**
 *
 * @author Linh
 */
public class TaiKhoan {

    protected String ten;
    protected String tenDangNhap;
    protected String matKhau;
    protected boolean isAdmin;

    public TaiKhoan() {
    }

    public TaiKhoan(String ten, String tenDangNhap, String matKhau, boolean isAdmin) {
        this.ten = ten;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.isAdmin = isAdmin;
    }

    public TaiKhoan(TaiKhoan tk) {
        this.ten = tk.ten;
        this.tenDangNhap = tk.tenDangNhap;
        this.matKhau = tk.matKhau;
        this.isAdmin = tk.isAdmin;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDangNhap() {
        return this.tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap.trim();
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau.trim();
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin() {
        this.isAdmin = !this.isAdmin;
    }

    public void thongTin() {
        System.out.println(this.tenDangNhap);
        System.out.println(this.matKhau);
        System.out.println(this.isAdmin);
    }

    @Override
    public String toString() {
        return "TaiKhoan{"
                + "tenDangNhap='" + this.tenDangNhap + '\''
                + ", matKhau='" + this.matKhau + '\''
                + ", isAdmin=" + this.isAdmin
                + '}';
    }

    public boolean soSanh(String tenDangNhap, String matKhau) {
        return this.tenDangNhap.equals(tenDangNhap) && this.matKhau.equals(matKhau);
    }

    public static void doiMatKhau(TaiKhoan tk, String tenDangNhap, String matKhauMoi) {
        if (tk.tenDangNhap.equals(tenDangNhap)) {
            tk.setMatKhau(matKhauMoi);
        }
    }
}

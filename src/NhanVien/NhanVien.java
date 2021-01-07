/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import Utils.Utils;
import java.util.ArrayList;

/**
 *
 * @author Linh
 */
public class NhanVien extends TaiKhoan {

    protected String maNV;
    protected int tuoi;
    protected String diaChi;
    protected String gioiTinh;

    public NhanVien() {

    }

    public NhanVien(String maNV, String ten, int tuoi, String gioiTinh, String diaChi, String tenDangNhap, String matKhau, boolean isAdmin) {
        super(ten, tenDangNhap, matKhau, isAdmin);
        this.maNV = maNV;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public NhanVien(NhanVien nv) {
        super(nv);
        this.maNV = nv.maNV;
        this.ten = nv.ten;
        this.tuoi = nv.tuoi;
        this.diaChi = nv.diaChi;
        this.gioiTinh = nv.gioiTinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    

    public int getTuoi() {
        return tuoi;
    }

    public boolean setTuoi(int tuoi) {
        if (tuoi >= 18) {
            this.tuoi = tuoi;
            return true;
        }
        return false;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi.trim();
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     *
     */
    @Override
    public void thongTin() {
        System.out.println(this.maNV);
        System.out.println(this.ten);
        System.out.println(this.tuoi);
        System.out.println(this.gioiTinh);
        System.out.println(this.diaChi);
        System.out.println(this.tenDangNhap);
        System.out.println(this.matKhau);
        System.out.println(this.isAdmin);
    }

    @Override
    public String toString() {
        return "NhanVien{"
                + "maNV=" + maNV
                + ", ten=" + ten
                + ", tuoi=" + tuoi
                + ", diaChi=" + diaChi
                + ", gioiTinh=" + gioiTinh
                + ", tenDangNhap=" + tenDangNhap
                + ", matKhau=" + matKhau
                + ", isAdmin=" + isAdmin + '}';
    }

    public static void main(String[] args) {
        ArrayList<NhanVien> ds = Utils.dsNhanVien();
        ds.forEach(nv -> {
            System.out.println(nv.toString());
        });
    }
}

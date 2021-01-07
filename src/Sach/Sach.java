/*

 */
package Sach;
import  java.util.Date;
import java.time.LocalDate;
/**

 */
public class Sach {
    
    private String maSach;
    private String tieuDe;
    private String maKe;
    private long giaNhap;
    private long giaBan;
    private Date ngayNhap;
    private long soLuong;

    public Sach(String maSach, String tieuDe, String maKe, long giaNhap, long giaBan, Date ngayNhap, long soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.maKe = maKe;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
    }

    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.maKe = "";
        this.giaNhap = 0;
        this.giaBan = 0;
        this.ngayNhap = new Date();
        this.soLuong = 0;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getMaKe() {
        return maKe;
    }

    public void setMaKe(String maKe) {
        this.maKe = maKe;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }
    
    public void setNgayNhap(Date ngayNhap){
        this.ngayNhap = ngayNhap;
    }
    
    public static String ngay(Date date){
        return Integer.toString(date.getDate()) + "/" + Integer.toString(date.getMonth()+1) + "/" + Integer.toString(date.getYear()+1900);
    }
    

    @Override
    public String toString(){
        return maSach + "-" + tieuDe + "-" + maKe + "-" + Long.toString(giaNhap) + "-" + Long.toString(giaBan) + "-" + ngay(ngayNhap) + "-" + Long.toString(soLuong);
    }
    public static void main(String[] argv){
        Date date = new Date();
        System.out.print(ngay(date));
        System.out.print(date);
        Sach sach = new Sach();
        System.out.print(sach.toString());
    }
}

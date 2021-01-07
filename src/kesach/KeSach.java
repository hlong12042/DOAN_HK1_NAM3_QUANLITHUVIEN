package kesach;
public class KeSach {
    private String khu;
    private String maKe;
    private long toida;
    private long hientai;
   

    public KeSach(){
        khu = "";
        maKe = "";
        toida = 0;
        hientai = 0;
    }

    public KeSach(String maKe, String khu, long toida, long hientai ){
        this.khu = khu;
        this.maKe = maKe;
        this.toida = toida;
        this.hientai = hientai;
    }

    public String getKhu() {
        return khu;
    }

    public void setKhu(String khu) {
        this.khu = khu;
    }

    public void setMake(String maKe) {
        this.maKe = maKe;
    }


    public String getMake() {
        return maKe;
    }


    public long getToida() {
        return toida;
    }

    public void setToida(long toida) {
        this.toida = toida;
    }

    public long getHientai() {
        return hientai;
    }

    public void setHientai(long hientai) {
        this.hientai = hientai;
    }

     @Override
    public String toString(){
        return maKe + "-" + khu + "-" + Long.toString(toida) + "-" + Long.toString(hientai);
    }

//    public void hienthiTT() {
//        System.out.printf("%-5d %-20s %-15s %-15s %-15s \n", khu, maKe, toida, hientai);
//    }

}

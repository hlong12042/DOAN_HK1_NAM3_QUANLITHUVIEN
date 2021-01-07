/*

 */
package Sach;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigDecimal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**

 */
public class Kho {

    private List<Sach> sach;
    
    public List<Sach> getSach() {
        return sach;
    }

    public void setSach(List<Sach> sach) {
        this.sach = sach;
    }
    
    public static List<Sach> source2 () throws IOException, FileNotFoundException{
        List<Sach> ds = new ArrayList<>();
        File file = new File("Sach.txt");
        InputStream input = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buf = new BufferedReader(reader);
        String line;
        while ((line = buf.readLine())!=null){
            String[] ls = line.split("-");
            String maSach = ls[0];
            String tieuDe = ls[1];
            String maKe = ls[2];
            long giaNhap = Long.parseLong(ls[3]);
            long giaBan = Long.parseLong(ls[4]);
            Date ngayNhap;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            try {
                ngayNhap = format.parse(ls[5]);
            } catch (ParseException ex) {
                Logger.getLogger(Kho.class.getName()).log(Level.SEVERE, null, ex);
                ngayNhap = new Date();
            }
            long soLuong = Long.parseLong(ls[6]);
            ds.add(new Sach(maSach, tieuDe, maKe, giaNhap, giaBan, ngayNhap, soLuong));
        }
        buf.close();
        reader.close();
        return ds;
    }
    
    public Sach timMaSach(String maSach){
        for (Sach s:sach){
            if(s.getMaSach().equals(maSach)){
                return s;
            }
        }
        return null;
    }
    
    public Sach timTieuDe(String TieuDe){
        for (Sach s:sach){
            if(s.getTieuDe().equals(TieuDe)){
                return s;
            }
        }
        return null;
    }
    
    public Sach timMaKe(String maKe){
        for (Sach s:sach){
            if(s.getMaKe().equals(maKe)){
                return s;
            }
        }
        return null;
    }
    
    public static void ghifile(String url, List a) throws IOException, FileNotFoundException{
        File file = new File(url);
        FileWriter writer = new FileWriter(file);
        BufferedWriter buf = new BufferedWriter(writer);
        for (Object o:a){
            buf.write(o.toString()+"\n");
        }
        buf.close();
        writer.close();
    }
    
    public void xoa2(Sach sach) throws IOException, FileNotFoundException{
        this.sach.remove(sach);
        ghifile("Sach.txt", this.sach);
    }
    
    public void them2(Sach s) throws IOException, FileNotFoundException{
        sach.add(s);
        ghifile("Sach.txt", sach);
    }
    
    public void thaydoi(String maSach, Sach s) throws IOException, FileNotFoundException{
        for (int i = 0; i<sach.size(); i++){
            Sach temp = sach.get(i);
            if(temp.getMaSach().equals(maSach)){
                sach.add(i, s);
                sach.remove(temp);
                break;
            }
        }
        ghifile("Sach.txt", sach);
    }
    
    public Kho(){
        try {
            this.sach = source2();
        } catch (IOException ex) {
            Logger.getLogger(Kho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] agvs) throws IOException{
        Kho kho = new Kho();
    }
}

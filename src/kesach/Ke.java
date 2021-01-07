
/*

 */
package kesach;
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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


/**

 */
public class Ke {
    private List<KeSach> kesach;
    
    public List<KeSach> getKeSach() {
        return kesach;
    }

    public void setSach(List<KeSach> kesach) {
        this.kesach = kesach;
    }
    
    public static List<KeSach> source2 () throws IOException, FileNotFoundException{
        List<KeSach> ds = new ArrayList<>();
        File file = new File("KeSach.txt");
        InputStream input = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buf = new BufferedReader(reader);
        String line;
        while ((line = buf.readLine())!=null){
            String[] ls = line.split("-");
            String maKe = ls[0];
            String khu = ls[1];
            long toida = Long.parseLong(ls[2]);
            long hientai = Long.parseLong(ls[3]);
            ds.add(new KeSach(maKe, khu, toida, hientai));
        }
        buf.close();
        reader.close();
        return ds;
    }
    

    

    
    public KeSach timMaKe(String maKe){
        for (KeSach ks:kesach){
            if(ks.getMake().equals(maKe)){
                return ks;
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
    
    public void xoa2(KeSach kesach) throws IOException, FileNotFoundException{
        this.kesach.remove(kesach);
        ghifile("KeSach.txt", this.kesach);
    }
    
    public void them2(KeSach ks) throws IOException, FileNotFoundException{
        kesach.add(ks);
        ghifile("KeSach.txt", kesach);
    }
    
    public void thaydoi(String maKe, KeSach ks) throws IOException, FileNotFoundException{
        for (int i = 0; i<kesach.size(); i++){
            KeSach temp = kesach.get(i);
            if(temp.getMake().equals(maKe)){
                kesach.add(i, ks);
                kesach.remove(temp);
                break;
            }
        }
        ghifile("KeSach.txt", kesach);
    }
    public Ke(){
        try {
            this.kesach = source2();
        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void capNhap(List<String> dsMua) throws IOException, FileNotFoundException {
        Ke ke = new Ke();
        for (String sach:dsMua){
            String maKe = sach.split("-")[2];
            Long soLuongHienTai = Long.parseLong(sach.split("-")[7]);
            KeSach keSach = ke.timMaKe(maKe);
            KeSach keSachsau = keSach;
            keSachsau.setHientai(keSachsau.getHientai()-soLuongHienTai);
            ke.xoa2(keSach);
            ke.them2(keSachsau);
        }
    }
    
    public static void main(String[] agvs) throws IOException{
        Ke ds = new Ke();
        for (KeSach ke:ds.getKeSach()){
            System.out.print(ke.toString());
        }
    }
}

package Utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import NhanVien.NhanVien;
import NhanVien.TaiKhoan;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linh
 */
public class Utils {

    public static ArrayList<NhanVien> dsNhanVien() {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        try {

            File file = new File("nhanvien.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                NhanVien nv = new NhanVien(line[0], line[1], Integer.valueOf(line[2]), line[3], line[4], line[5], line[6], Boolean.valueOf(line[7]));
                dsNhanVien.add(nv);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return dsNhanVien;
    }

    public static ArrayList<TaiKhoan> thongTinTKNhanVien() {
        ArrayList<TaiKhoan> dsTKNV = new ArrayList<>();
        try {
            File file = new File("nhanvien.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                dsTKNV.add(new TaiKhoan(line[1], line[5], line[6], Boolean.valueOf(line[7])));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DangNhap.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return dsTKNV;

    }

    public static void luuThongTinDangNhap(TaiKhoan tk) throws IOException {
        FileWriter writer = new FileWriter("temp.txt");
        String info = tk.getTen() + "," + tk.getTenDangNhap() + "," + tk.getMatKhau() + "," + tk.isAdmin();
        writer.write(info);
        writer.close();
    }

    public static void xoaThongTinDangNhap() {
        File file = new File("temp.txt");
        if (file.exists()) {
            file.delete();
        }
    }

    public static String[] docThongTinDangNhap() {
        String ten = null, tenDangNhap = null, matKhau = null, isAdmin = null;
        try {
            File file = new File("temp.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                ten = line[0];
                tenDangNhap = line[1];
                matKhau = line[2];
                isAdmin = line[3];
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return new String[]{ten, tenDangNhap, matKhau, isAdmin};
    }

    public static ArrayList<String> taiKhoanHopLe() {
        ArrayList<String> dsTKHL = new ArrayList<>();
        try {
            File file = new File("dstk.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                dsTKHL.add(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DangNhap.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return dsTKHL;
    }
    
    public static NhanVien tim(String tenDangNhap){
        ArrayList<NhanVien> ds = dsNhanVien();
        for(NhanVien nv:ds){
            if(nv.getTenDangNhap().equals(tenDangNhap))
                return nv;
        }
        return null;
    }

    public static String taoMaNV() {
        Random rand = new Random();
        String prefix = "NV";
        int randomNumber = rand.nextInt(10000);
        return prefix + randomNumber;
    }

}

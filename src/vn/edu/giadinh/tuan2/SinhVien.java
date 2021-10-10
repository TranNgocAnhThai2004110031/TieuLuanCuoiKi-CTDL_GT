package vn.edu.giadinh.tuan2;

import java.util.Date;

public class SinhVien {
    //1.Thu?c tính
    String mssv;
    String tenSinhVien;
    int tuoi;
    boolean gioiTinh;
    String queQuan;
    Date ngaySinh;
    //2.Phương th?c
    //<ki?u tr? v?> <tên hàm> <(danh sách tham s?)>{.......}
    void inThongTin(){
        System.out.println("Mã số  sinh viên: " + mssv);
        System.out.println("Tên sinh viên: " + tenSinhVien);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới Tính: " + gioiTinh);
        System.out.println("Quê quán: " + queQuan);
        
    }
}

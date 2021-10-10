package com.thaitna2004110031.tuan3;

public class SinhVienBai4Lab3 {
    String tenSinhVien;
    double diem;
    SinhVienBai4Lab3(){}
    SinhVienBai4Lab3(String tsv, double d){
        tenSinhVien = tsv;
        diem = d;
    }
 
    void inThongTin(){
        System.out.println("Họ và tên: " + tenSinhVien + "  " 
        + "Điểm: " + diem );
    }
}

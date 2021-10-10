package com.thaitna2004110031.tuan04;

public class NhanVien {
    String tenNhanVien;
    double luong;
	String diaChi;
    String boPhanlamViec; 
    String ngaySinh;

    NhanVien(){}
    NhanVien(String tnv, double l, String dc, String bplv, String ns){
        tenNhanVien = tnv;
        luong = l;
        diaChi = dc;
        boPhanlamViec = bplv;
        ngaySinh = ns;
    }
    void inThongTin(){
        System.out.println("Tên nhân viên: " + tenNhanVien + "  " 
        + "\nLương: " + luong + "  " 
        + "\nĐịa chỉ: " + diaChi + "  " 
        + "\nBộ phận làm việc: " + boPhanlamViec + " "
        + "\nNgày sinh: " + ngaySinh);
    }
}

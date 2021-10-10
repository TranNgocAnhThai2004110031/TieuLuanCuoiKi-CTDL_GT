package com.thaitna2004110031.tuan3;

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
}

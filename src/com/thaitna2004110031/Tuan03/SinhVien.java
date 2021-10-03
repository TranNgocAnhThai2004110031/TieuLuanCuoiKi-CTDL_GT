package com.thaitna2004110031.tuan03;

public class SinhVien {
    int Mssv, tuoi;
    String hoVaTen;
    String queQuan;
    SinhVien(){}
    SinhVien(int ms, String hvt, int t, String qq){
        Mssv = ms;
        hoVaTen = hvt;
        tuoi = t;
        queQuan = qq;
    }

    void inThongTin(){
        System.out.println("Ma số sinh viên: " +Mssv + "  " 
        +"Họ và tên: " +hoVaTen +"  " 
        +"Tuổi: " +tuoi + "  " 
        +"Quê quán: " +queQuan);
    }
}

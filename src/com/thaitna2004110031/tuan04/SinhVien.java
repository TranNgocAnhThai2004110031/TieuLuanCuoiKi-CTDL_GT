package com.thaitna2004110031.tuan04;

public class SinhVien {
    int Mssv, tuoi;
    String hoVaTen;
    String queQuan;
    SinhVien(){}
    SinhVien(int mssv, String hvt, int t, String qq){
        Mssv = mssv;
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

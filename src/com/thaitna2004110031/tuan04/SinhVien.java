package com.thaitna2004110031.tuan04;

public class SinhVien {
    int Mssv;
    String hoVaTen;
    int tuoi;
    String queQuan;
    SinhVien(){}
    SinhVien(int m, String h, int t, String q){
        Mssv = m;
        hoVaTen = h;
        tuoi = t;
        queQuan = q;
    }

    void inThongTin(){
        System.out.println("Ma số sinh viên: " + Mssv + "  " 
        +"\nHọ và tên: " + hoVaTen +"  " 
        +"\nTuổi: " + tuoi + "  " 
        +"\nQuê quán: " + queQuan);
    }
}

package com.thaitna2004110031.tuan04;

public class TaiKhoan {
    String tenChutaiKhoan;
    int soTaiKhoan;
    double soDuTaiKhoan;

    TaiKhoan(){}
    TaiKhoan(String tctk,int stk, double sdtk){
        tenChutaiKhoan = tctk;
        soTaiKhoan = stk;
        soDuTaiKhoan = sdtk;
    }
    void inThongTin(){
        System.out.println("Tên chủ tài khoản: " + tenChutaiKhoan + "  " 
        + "\nSố tài khoản: " + soTaiKhoan + "  " 
        + "\nsố dư tài khoản: " + soDuTaiKhoan);
    }
}
 
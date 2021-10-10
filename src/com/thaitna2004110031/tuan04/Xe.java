package com.thaitna2004110031.tuan04;

public class Xe { 
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    double dungTichXang;
    Xe(){}
    Xe(String tcx, String  hsx, String d, String gp, double dtx){
        tenChuXe = tcx;
        hangSanXuat = hsx;
        dong = d;
        giayPhep = gp;
        dungTichXang = dtx;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: " + tenChuXe + "  " 
        + "vHãng sản xuất: " + hangSanXuat + "  " 
        + "\nDòng: " + dong + "  " 
        + "\nGiấy phép: " + giayPhep + " "
        + "\nDung tích xăng: " + dungTichXang);
    }
}

package com.thaitna2004110031.tuan04;

public class Sach {
    double gia;
    String nhaSanXuat;
    int namSanxuat;
    int soLuong;
    double giaBan; 
    String loai;

    Sach(){}
    Sach(double g, String nsx, int nasx, int sl, double gb, String l){
        gia = g;
        nhaSanXuat = nsx;
        namSanxuat = nasx;
        soLuong = sl;
        giaBan = gb;
        loai = l;
    }
    void inThongTin(){
        System.out.println("Giá: " + gia + "  " 
        + "\nNhà sản xuất: " + nhaSanXuat + "  " 
        + "\nNăm sản xuất: " + namSanxuat + "  " 
        + "\nSố lượng: " + soLuong + " "
        + "\nGiá bán: " + giaBan + " "
        + "\nLoại: " + loai);
    }
}

package com.thaitna2004110031.tuan04;

public class MayTinh {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    int ram;
    String cpu;
    double gia;
	int namBaoHanh;

    MayTinh(){}
    MayTinh(String nsx, int nasx, String hdh, int r, String c, double g, int nbh){
        nhaSanXuat = nsx;
        namSanXuat = nasx;
        heDieuHanh = hdh;
        ram = r;
        cpu = c;
        gia = g;
        namBaoHanh = nbh;

    }
    void inThongTin(){
        System.out.println("Nhà sản xuất: " + nhaSanXuat + "  " 
        + "\nNăm sản xuất: " + namSanXuat + "  " 
        + "\nHệ điều hành: " + heDieuHanh + "  " 
        + "\nRAM : " + ram + " "
        + "\nCPU: " + cpu + " "
        + "\nGiá: " + gia + " "
        + "\nNăm bảo hành: " + namBaoHanh);
    }
}

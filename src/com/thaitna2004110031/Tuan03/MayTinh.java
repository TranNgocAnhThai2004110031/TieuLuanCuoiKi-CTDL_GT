package com.thaitna2004110031.tuan03;

public class MayTinh {
    String nhaSanXuat;
    String namSanXuat;
    String heDieuHanh; 
    String ram;
    String cpu;
    double gia;
	String namBaoHanh;

    MayTinh(){}
    MayTinh(String nsx, String nasx, String hdh, String r, String c, double g, String nbh){
        nhaSanXuat = nsx;
        namSanXuat = nasx;
        heDieuHanh = hdh;
        ram = r;
        cpu = c;
        gia = g;
        namBaoHanh = nbh;

    }
}

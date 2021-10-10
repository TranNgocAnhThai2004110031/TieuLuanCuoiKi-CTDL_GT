package com.thaitna2004110031.tuan05;

public class SVDV {
    private String hoVaTen;
    private double diemTB;
    public SVDV(){
        this.hoVaTen = null;
        this.diemTB = 0;
    }
    public SVDV(String ten, double diem) {
        this.hoVaTen = ten;
        this.diemTB = diem; 
    }

    public double getdiemTB(){
        return diemTB;
    }
    public void setdiemTB(double diem){
        this.diemTB = diem;
    }
    public void sethoVaTen(String ten){
        this.hoVaTen = ten;
    }
    public String gethoVaTen(){
        return this.hoVaTen;
    }
}

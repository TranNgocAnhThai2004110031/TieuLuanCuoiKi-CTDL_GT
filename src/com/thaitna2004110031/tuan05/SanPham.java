package com.thaitna2004110031.tuan05;

public class SanPham {
    private String ten;
    private double gia; 
 
    public SanPham(){
    }
        
    public SanPham(String t, double g) {
        ten = t;
        gia = g;   
    }

    public double  getgia() {
        return gia;
    }
    public void setgia(double g){
        this.gia = g;
    }
    public void setten(String t){
        this.ten = t;
    }
    public String getten(){
        return this.ten;
    }
}
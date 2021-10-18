package com.thaitna2004110031.tuan06;

public class SanPham {
    private String ten;
    private double gia;
    private double giamGia;
    private double thueNhapKhau; 
 
    public SanPham(){
    }
        
    public SanPham(String t, double g, double gg, double th) {
        ten = t;
        gia = g;
        giamGia = gg;
        thueNhapKhau = th;   
    }
 
    public double  getgia() {
        return gia;
    }
    public double  getgiamGia() {
        return giamGia;
    }
    public double  getthueNhapKhau() {
        return thueNhapKhau;
    }
    public String getten(){
        return this.ten;
    }
    public void setten(String t){
        this.ten = t;
    }
    public void setgia(double g){
        this.gia = g;
    }
    public void setgiamGia(double gg){
        this.giamGia = gg;
    }
    public void setthueNhapKhau(double th){
        this.thueNhapKhau = th;
    }
    void inThongTin(){
        System.out.println("Tên sản phẩm" +"\t" + "Giá bán" +"\t\t" + "Giảm giá" +"\t" + "Thuế nhập khẩu");
        System.out.println(ten + "\t\t" +gia + "\t\t" +giamGia +"\t\t" +thueNhapKhau);
    }
}

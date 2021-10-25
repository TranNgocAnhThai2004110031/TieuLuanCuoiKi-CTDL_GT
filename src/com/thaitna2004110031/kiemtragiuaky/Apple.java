package com.thaitna2004110031.kiemtragiuaky;

public class Apple {
    private int ma;
    private double khoiLuong;
    private String mauSac;
    Apple next;
    
    public Apple(){
    }
        
    public Apple(int m, double kl, String ms) {
        ma = m;
        khoiLuong = kl;
        mauSac = ms;  
    }
    public Apple(int m, double kl, String ms, Apple n) {
        ma = m;
        khoiLuong = kl;
        mauSac = ms;
        next = n;  
    }
 
    public int getma() {
        return ma;
    }
    public double getkhoiLuong() {
        return khoiLuong;
    }
    public String getmauSac() {
        return mauSac;
    }
    public void setma(int m){
        this.ma = m;
    }
    public void setkhoiLuong(double kl){
        this.khoiLuong = kl;
    }
    public void setmauSac(String ms){
        this.mauSac = ms;
    }
    public void setnext(Apple next){
        this.next = next;
    }
    public Apple getnext(){
        return next;
    }
    void inThongTin(){
        System.out.println("Mã: " +ma);
        System.out.println("Khối lượng: " +khoiLuong);
        System.out.println("Màu sắc: " +mauSac);
    }

}

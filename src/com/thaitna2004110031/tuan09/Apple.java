package com.thaitna2004110031.tuan09;

import java.util.Scanner;

public class Apple {
    int ma;
    double khoiLuong;
    String mauSac;
    Apple next;
    Scanner nhap = new Scanner(System.in);
    
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
    void nhap(){
        System.out.println("====================");
        System.out.printf("Mã: "); 
        ma = nhap.nextInt(); 
        System.out.print("Khối lượng: ");
        khoiLuong = nhap.nextDouble();
        System.out.print("Màu sắc: ");
        nhap.nextLine();
        mauSac = nhap.nextLine();
    }
    void inThongTin(){
        System.out.println(ma +"\t" + khoiLuong +"\t\t" +mauSac);
        // System.out.println("Mã: " +ma +"\t"+"Khối lượng: " +khoiLuong +"\t" +"Màu sắc: " +mauSac);
        // System.out.println("Khối lượng: " +khoiLuong);
        // System.out.println("Màu sắc: " +mauSac);
    }
}

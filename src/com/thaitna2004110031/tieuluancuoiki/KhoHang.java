package com.thaitna2004110031.tieuluancuoiki;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhoHang {
    public String loai;
    int id;
    String tenHangHoa;
    double giaNhap; 
    int soLuongTonKho;
    Date ngayNhapKho = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");;    
    Scanner nhap = new Scanner(System.in);

    public KhoHang() {}

    public KhoHang(String _loai, int _id, String _tenHangHoa, double _giaNhap, int _soLuongTonKho, Date _ngayNhapKho){
        loai = _loai;
        id = _id;
        tenHangHoa = _tenHangHoa;
        giaNhap = _giaNhap;
        soLuongTonKho = _soLuongTonKho;
        _ngayNhapKho = ngayNhapKho;
    }

    public KhoHang(String _loai, int _id, String _tenHangHoa, double _giaNhap, int _soLuongTonKho, String ngay){
        loai = _loai;
        id = _id;
        tenHangHoa = _tenHangHoa;
        giaNhap = _giaNhap;
        soLuongTonKho = _soLuongTonKho;
         
        try {
            ngayNhapKho = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date _ngayNhapKho = ngayNhapKho;
    }

    public void nhapThongTin(){
        System.out.println("====================");
        System.out.print("+ Loại hàng hóa: ");
        loai = nhap.nextLine();
        System.out.print("+ ID hàng hóa: ");
        id = nhap.nextInt();
        System.out.print("+ Tên hàng hóa: ");
        nhap.nextLine();
        tenHangHoa = nhap.nextLine();
        System.out.print("+ Giá nhập khẩu: ");
        giaNhap = nhap.nextDouble();
        System.out.print("+ Số lượng hóa tồn kho: ");
        soLuongTonKho = nhap.nextInt();
        nhap.nextLine();
        System.out.print("+ Ngày nhập kho: ");
        try {
            ngayNhapKho = simpleDateFormat.parse(nhap.nextLine());

        } catch (Exception e) {
        }
    }

    void inThongTin(){
         
        System.out.println("Loại: " +loai +"\t" +"|| ID: "  +id +" || Tên hàng hóa: " +tenHangHoa +"\t" +"|| Giá nhập khẩu: " +giaNhap +"\t" +"|| Số lượng hóa tồn kho: " +soLuongTonKho +" || Ngày nhập kho: " +simpleDateFormat.format(ngayNhapKho));
              
    }
}


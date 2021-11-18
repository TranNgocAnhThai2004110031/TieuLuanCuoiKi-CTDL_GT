package com.thaitna2004110031.thicuoiky;

import java.util.Date;
import java.util.Scanner;

public class KhoHang {
    String loai;
    int maHang;
    String tenHangHoa;
    double giaNhap;
    int soLuongTonKho;
    Date ngayNhapKho;
    Scanner nhap = new Scanner(System.in);

    public KhoHang() {}

    public KhoHang(String _loai, int _maHang, String _tenHangHoa, double _giaNhap, int _soLuongTonKho, Date _ngayNhapKho){
        loai = _loai;
        maHang = _maHang;
        tenHangHoa = _tenHangHoa;
        giaNhap = _giaNhap;
        soLuongTonKho = _soLuongTonKho;
        ngayNhapKho = _ngayNhapKho;
    }

    void nhap(){
        System.out.println("====================");
        System.out.print("+ Loại hàng hóa: ");
        loai = nhap.nextLine();
        System.out.print("+ Mã hàng hóa: ");
        maHang = nhap.nextInt();
        System.out.print("+ Tên hàng hóa: ");
        nhap.nextLine();
        tenHangHoa = nhap.nextLine();
        System.out.print("+ Giá nhập khẩu: ");
        giaNhap = nhap.nextDouble();
        System.out.print("+ Số lượng hóa tồn kho: ");
        soLuongTonKho = nhap.nextInt();
        //nhap.nextLong();
        System.out.print("+ Ngày nhập kho: ");
        // long date;
        // ngayNhapKho = nhap.nextLong(date);
        long date = nhap.nextLong();
        ngayNhapKho = new Date(date);
    }
    void inThongTin(){
        System.out.println(loai +"\t" +maHang +"\t\t" +tenHangHoa +"\t\t" +giaNhap +"\t\t" +soLuongTonKho +"\t\t" +ngayNhapKho);
        // System.out.println("_____________________________________");
        // System.out.println("- Mã của táo: "+ma);
        // System.out.println("- Khối lượng của táo: "+khoiLuong);
        // System.out.println("- Màu sắc của táo: "+mauSac);
        
    }
    //nhap

    //in
}

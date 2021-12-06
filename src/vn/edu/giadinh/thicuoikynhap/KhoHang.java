package vn.edu.giadinh.thicuoikynhap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhoHang {
    String loai;
    int maHang;
    String tenHangHoa;
    double giaNhap;
    int soLuongTonKho;
    // Date ngayNhapKho = null;
    // SimpleDateFormat simpleDateFormat;    
    Scanner nhap = new Scanner(System.in);

    public KhoHang() {}

    public KhoHang(String _loai, int _maHang, String _tenHangHoa, double _giaNhap, int _soLuongTonKho){ // , Date _ngayNhapKho
        loai = _loai;
        maHang = _maHang;
        tenHangHoa = _tenHangHoa;
        giaNhap = _giaNhap;
        soLuongTonKho = _soLuongTonKho;
        // ngayNhapKho = _ngayNhapKho;
    }

    public void nhap(){
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
        // nhap.nextLine();
        // System.out.print("+ Ngày nhập kho: ");
        // simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        // try {
        //     ngayNhapKho = simpleDateFormat.parse(nhap.nextLine());

        // } catch (Exception e) {
        // }

    }

    void inThongTin(){
         
        System.out.println("Loại: " +loai +"\t" +"|| Mã hàng hóa: "  +maHang +"\t" +"|| Tên hàng hóa: " +tenHangHoa +"\t" +"|| Giá nhập khẩu(K): " +giaNhap +"\t" +"|| Số lượng hóa tồn kho: " +soLuongTonKho); // +"\t" +"|| Ngày nhập kho: " +simpleDateFormat.format(ngayNhapKho)
              
    }

}

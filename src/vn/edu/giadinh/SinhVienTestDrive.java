package vn.edu.giadinh;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien;
        sinhVien = new SinhVien();
        sinhVien.mssv = "2004110031";
        sinhVien.tenSinhVien = "Trần Ngọc Anh Thái";
        sinhVien.queQuan = "Tiền Giang";
        sinhVien.tuoi = 19;
        
        sinhVien.inThongTin();
    }
}

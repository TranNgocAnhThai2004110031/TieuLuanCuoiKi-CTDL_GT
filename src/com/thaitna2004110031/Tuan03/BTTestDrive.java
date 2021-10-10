package com.thaitna2004110031.tuan03;

public class BTTestDrive {
    public static void main(String[] args){
        Sach sach;
        NhanVien nhanvien;
        Xe xe;
        MayTinh maytinh;
        TaiKhoan taikhoan;

        sach = new Sach(19.999, " Bộ GD&DT Hà Nội." , " 2021.",  23000. , " Sách giáo khoa.");
        System.out.println(" Giá: " + sach.gia 
        + "\n Nhà sản xuất: " + sach.nhaSanXuat 
        + "\n Năm sản xuất: " + sach.namSanxuat 
        + "\nGiá bán: " + sach.giaBan 
        + " \nLoại: " + sach.loai);

        nhanvien = new NhanVien(" Trần Ngọc Anh Thái.",  1000000., " Tiền Giang.", " Quản lý.", " 18/10/2002.");
        System.out.println(" Tên nhân viên: " + nhanvien.tenNhanVien 
        + "\n Lương: " + nhanvien.luong 
        + " \nĐịa chỉ: " + nhanvien.diaChi 
        + " \nBộ phận làm việc: " + nhanvien.boPhanlamViec 
        + "\nNgày sinh: " + nhanvien.ngaySinh);

        xe = new Xe(" Trần Ngọc Anh Thái.", " HonDa.", " Wave.", " Có.", 5.);
        System.out.println(" Tên chủ xe: " + xe.tenChuXe 
        + " \nHãng sản xuất: " + xe.hangsanXuat 
        + "\n Dòng: " + xe.dong 
        + "\n Giấy phép: " + xe.giayPhep 
        + " \nDung tích xăng: " + xe.dungTichXang);

        maytinh = new MayTinh(" HP.", " 2021.", " WinDows 11.", "12.", " Intel.", 20000000, " 2026.");
        System.out.println(" Nhà sản xuất: " + maytinh.nhaSanXuat 
        + " \nNăm sản xuất: " + maytinh.namSanXuat 
        + " \nHệ điều hành: " + maytinh.heDieuHanh 
        + " \nRAM: " + maytinh.ram 
        + " \nCPU: " + maytinh.cpu 
        + " \nGiá: " + maytinh.gia 
        + " \nNăm bảo hành: " + maytinh.namBaoHanh);

        taikhoan = new TaiKhoan("Trần Ngọc Anh Thái", 123456789, 99999999);
        System.out.println(" Số tài khoản: " + taikhoan.soTaiKhoan
        + " Số dư tài khoản: " + taikhoan.soDuTaiKhoan); 

    }
}

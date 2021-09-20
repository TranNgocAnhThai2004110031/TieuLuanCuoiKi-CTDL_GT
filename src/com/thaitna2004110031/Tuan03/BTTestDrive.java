package com.thaitna2004110031.Tuan03;

public class BTTestDrive {
    public static void main(String[] args){
        Sach sach;
        NhanVien nhanvien;
        Xe xe;
        MayTinh maytinh;
        TaiKhoan taikhoan;

        sach = new Sach(19.999, "Nghe Xuong", "2020", 23.000, "Vo viet");
        System.out.println("Giá: " + sach.gia
        + "Nhà sản xuất: " + sach.nhaSanXuat
        + "Năm sản xuất: " + sach.namSanxuat
        + "Giá bán: " + sach.giaBan
        + "Loại: " + sach.loai);

        nhanvien = new NhanVien("Nguyễn Văn A", 10.000000, "TP.HCM", "Quản lý", "1/1/1999");
        System.out.println("Tên nhân viên: " + nhanvien.tenNhanVien
        + "Lương: " + nhanvien.luong
        + "Địa chỉ: " + nhanvien.diaChi
        + "Bộ phận làm việc: " + nhanvien.boPhanlamViec
        +  "Ngày sinh: " + nhanvien.ngaySinh);

        xe = new Xe("Nguyễn Văn B", "BMW", "BMW", "Có", 50);
        System.out.println("Tên chủ xe: " + xe.tenChuXe
        + "Hãng sản xuất: " + xe.hangsanXuat
        + "Dòng: " + xe.dong
        + "Giấy phép: " + xe.giayPhep
        + "Dung tích xăng: " + xe.dungTichXang);

        maytinh = new MayTinh("HP", "2021", "WinDow 11", "12", "Intel", 20.000000, "2026");
        System.out.println("Nhà sản xuất: " + maytinh.nhaSanXuat
        + "Năm sản xuất: " + maytinh.namSanXuat
        + "Hệ điều hành: " + maytinh.heDieuHanh
        + "RAM: " + maytinh.ram
        + "CPU: " + maytinh.cpu
        + "Giá: " + maytinh.gia
        + "Năm bảo hành: " + maytinh.namBaoHanh);

        taikhoan = new TaiKhoan(123456789, 99.9999999);
        System.out.println("Số tài khoản: " + taikhoan.soTaiKhoan
        + "Số dư tài khoản: " + taikhoan.soDuTaiKhoan); 

    }
}

package com.thaitna2004110031.tuan06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3Lab4 {
    public static void main(String[] args) { 
        Bai3Lab4 ds = new Bai3Lab4();
        ds.menu();
    }
    private ArrayList<SanPham> list = new ArrayList<>(); 
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        while(true){ 
            for (int i = 0; i < n ; i++) {
                Scanner nhap = new Scanner(System.in);
                System.out.printf("Nhập tên sản phẩm thứ %d: " ,i+1); 
                String ten = nhap.nextLine(); 
                System.out.print("Nhập giá sản phẩm: ");
                double gia = nhap.nextDouble();
                System.out.print("Nhập giá sản phẩm giảm: ");
                double giamGia = nhap.nextDouble();
                System.out.print("Nhập thuế nhập khẩu của sản phẩm: ");
                double thueNhapKhau = nhap.nextDouble();
                list.add(new SanPham(ten, gia, giamGia, thueNhapKhau));
            } 
            if(sc.nextLine().isEmpty()){ 
                break; 
            } 
        }
    }

    static void sapXepGiamDanTheoGia(ArrayList<SanPham> list) {
        System.out.println("=====Danh sách sau khi sắp xếp=====");
        //Collections.sort(list, (a ,b) ->(int) (a.getgia() - b.getgia()));
        Comparator<SanPham> comp;
        comp = new Comparator<SanPham>(){
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getgia(), o2.getgia());
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
    }
    static SanPham timSanPhamTheoTen(String ten, ArrayList<SanPham> list){
        SanPham result = null;
        for (SanPham sanPham : list) {
            if (sanPham.getten().equals(ten)) {
                result = sanPham;
            }
        }
        return result;
    }
    static void xoaSanPhamTheoTen(String ten, ArrayList<SanPham> list){
        SanPham sanPham = timSanPhamTheoTen(ten, list);
        list.remove(sanPham);
    }

    public void tinhTrungBinh(){
        double avg = 0, sum = 0;
        for(SanPham sanPham : list){
            sum += sanPham.getgia();
        }
        avg = sum / list.size();
        System.out.println("Giá trung bình của các sản phẩm: "+ avg);
    }
    public void menu(){
        do{
            System.out.println("=====================MENU======================");
            System.out.println("1. Nhập danh sách sản phẩm.");
            System.out.println("2. Xuất danh sách sản phẩm.");
            System.out.println("3. Sắp xếp danh sách.");
            System.out.println("4. Tìm kiếm và xóa sản phẩm trong danh sách.");
            System.out.println("5. Tính giá trunng bình của sản phẩm.");
            System.out.println("6. Thoát.");
            System.out.print("Lựa chọn của bạn: ");
            Scanner scanner = new Scanner(System.in);
            int luaChon = scanner.nextInt();
            switch(luaChon){
                case 1:
                    nhap();
                    break;
                case 2:
                    for (SanPham sanPham : list) {
                        sanPham.inThongTin();
                    }
                    break;
                case 3:
                    sapXepGiamDanTheoGia(list);
                    for (SanPham sanPham : list) {
                        sanPham.inThongTin();
                    }
                    break;
                case 4:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Nhập tên sản phẩm cần tìm và xóa: ");
                    String ten = sc.nextLine();
                    timSanPhamTheoTen(ten, list);
                    xoaSanPhamTheoTen(ten, list);
                    System.out.println("=====Danh sách sản pẩm sau khi xóa=====");
                    for (SanPham sanPham : list) {
                        sanPham.inThongTin();
                    }
                    break;
                case 5: 
                    tinhTrungBinh();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập không đúng !");
                        
            } 
        }while(true);  
    }
}

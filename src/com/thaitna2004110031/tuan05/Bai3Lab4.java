package com.thaitna2004110031.tuan05;

import java.util.ArrayList;
import java.util.Collections;
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
    public void hienthi() {
        System.out.println("danh sách sản phẩm");
        System.out.println("Tên \t|Giá \t|Giảm giá \t|Thuế nhập khẩu \t");
        for(SanPham sanPham : list){
            System.out.printf("%s\t|%.2f\t|%.2f\t\t|%.2f\n", sanPham.getten(), sanPham.getgia(), sanPham.getgiamGia(), sanPham.getthueNhapKhau()); 
        }
         
    }
    public void sapxep() {
        System.out.println("=====Danh sách sau khi sắp xếp=====");
        Collections.sort(list, (a ,b) ->(int) (a.getgia() - b.getgia()));
        //Collections.sort(list);
        //Collections.reverse(list);
        hienthi(); 
    }
    public void timVaXoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần tìm và xóa: ");
        String ten = scanner.nextLine();
        SanPham found = null;
        for(SanPham sanPham : list){
            if(sanPham.getten().equals(ten)){
                found = sanPham; 
            }     
        }
        if(found != null){
            list.remove(found);
            System.out.println("Sản phẩm đã được xóa");
        }else{
            System.out.println("Sản phẩm không có trong danh sách");
        }
        hienthi();
         
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
                    hienthi();
                    break;
                case 3:
                    sapxep();
                    break;
                case 4:
                    timVaXoa();
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
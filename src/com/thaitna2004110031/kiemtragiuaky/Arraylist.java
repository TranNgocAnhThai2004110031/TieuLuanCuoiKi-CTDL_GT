package com.thaitna2004110031.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    private ArrayList<Apple> list = new ArrayList<>();
    public void themTaoVaoKho() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng táo: ");
        int n = sc.nextInt();
        while(true){ 
            for (int i = 0; i < n ; i++) {
               Scanner nhap = new Scanner(System.in);
               Scanner scanner = new Scanner(System.in);
               System.out.println("Nhập thông tin táo"); 
               System.out.print("Nhập mã: ");
               int ma = nhap.nextInt();
               System.out.print("Nhập khối lượng: ");
               double khoiLuong = nhap.nextDouble();
               System.out.print("Nhập màu sắc: ");
               String mauSac = scanner.nextLine();
               list.add(new Apple(ma, khoiLuong, mauSac));
            }
            if(sc.nextLine().equals("")){ 
                break; 
            }
        }    
    }
    public void inDanhSach(){
        for (Apple indanhsach : list) {
            indanhsach.inThongTin();
        }
    }
    public Apple timTaoTheoMau(){
        String mauSac;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập màu táo cần tìm: ");
        mauSac = sc.nextLine();
        Apple result = null;
        for (Apple tao : list) {
            if (tao.getmauSac().equals(mauSac)) {
                result = tao;
            }
        }
        return result;
    }
    
    public void menu(){
        do{
            System.out.println("=====================MENU======================");
            System.out.println("1. Thêm táo vào kho.");
            System.out.println("2. Tìm táo theo màu.");
            System.out.println("3. In danh sách táo.");
            System.out.println("4. Thoát.");
            System.out.print("Lựa chọn của bạn: ");
            Scanner scanner = new Scanner(System.in);
            int luaChon = scanner.nextInt();
            switch(luaChon){
                case 1:
                    themTaoVaoKho();
                    break;
                case 2:
                    timTaoTheoMau();
                    inDanhSach();
                    break;
                case 3:
                    inDanhSach();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập không đúng !");
                        
            } 
        }while(true);  
    }
}

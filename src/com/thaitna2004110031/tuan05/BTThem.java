package com.thaitna2004110031.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BTThem {
    public static void main(String[] args) {
        BTThem ds = new BTThem();
        ds.menu();
    }
    private ArrayList<SVDV> list = new ArrayList<>();
    public void nhapDSSV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        while(true){ 
            for (int i = 0; i < n ; i++) {
                Scanner nhap = new Scanner(System.in);
                System.out.printf("Nhập họ và tên sinh viên thứ %d: " ,i+1); 
                String hoVaTen = nhap.nextLine(); 
                System.out.print("Nhập điểm trung bình: ");
                double diemTB = nhap.nextDouble();
                list.add(new SVDV(hoVaTen, diemTB));
            } 
            if(sc.nextLine().isEmpty()){ 
                break; 
            } 
        }
    }
    public void hienThiDSSV() {
        for(SVDV svdv : list){
            System.out.printf("Họ và tên: %.2s  || Điểm trung bình:  %.2f \n", 
            svdv.gethoVaTen(), svdv.getdiemTB());
        } 
    }
    public void sapXep(){
        System.out.println("=====Danh sách sau khi sắp xếp=====");
        Collections.sort(list, (a ,b) -> (int)(a.getdiemTB() - b.getdiemTB()));
        Collections.reverse(list);
        hienThiDSSV();
    }
    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên cần tìm: ");
        String ten = sc.nextLine();
        String a[] = new String[100];
        int n = sc.nextInt();
        sc.nextLine();
        list.indexOf(ten);
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
        System.out.println("=====Danh sách sinh viên cần tìm kiếm là=====");
		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase(ten)) {
				System.out.println("" + a[i]);
			}
        }
        hienThiDSSV();
    }
    public void timVaSua() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên cần tìm: ");
        String ten = sc.nextLine();
        System.out.print("Nhập họ tên sinh viên cần sửa: ");
        String suaTen = sc.nextLine();
        //list.set(list.indexOf(ten),suaTen);
        hienThiDSSV();
    }
    public void timVaXoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên cần tìm và xóa: ");
        String ten = scanner.nextLine();
        SVDV found = null;
        for(SVDV svdv : list){
            if(svdv.gethoVaTen().equals(ten)){
                found = svdv;
            }
        }
        if(found != null){
            list.remove(found);
            System.out.println("Họ và tên sinh viên vừa chọn đã được xóa");
        }else{
            System.out.println("Họ và tên sinh viên không có tronh danh sách!");
        }
        hienThiDSSV();
    }
    //phương thức menu
    public void menu(){
        do{
            System.out.println("=======================MENU======================");
            System.out.println("1. Nhập danh sách sinh viên.");
            System.out.println("2. Xuất danh sách sinh viên đã nhập.");
            System.out.println("3. Xuất danh sách sinh viên theo khoảng điểm.");
            System.out.println("4. Tìm kiếm sinh viên theo họ tên.");
            System.out.println("5. Tìm và sửa sinh viên theo họ tên ");
            System.out.println("6. Tìm và xóa sinh viên theo họ tên.");
            System.out.println("7. Thoát.");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();

            switch(luaChon){
                case 1:
                     nhapDSSV();
                     break;
                case 2:
                     System.out.println("=====Danh sách sinh viên=====");
                     hienThiDSSV();
                     break;
                case 3:
                     sapXep();
                     break;
                case 4:
                     timKiem();
                     break;
                case 5:
                     timVaSua();
                     break;
                case 6:
                     timVaXoa();
                     break;
                case 7:
                     System.exit(0);
            default:
                 System.out.println("Nhập không đúng !!!");
                 
            }

        }while(true);
    }
}
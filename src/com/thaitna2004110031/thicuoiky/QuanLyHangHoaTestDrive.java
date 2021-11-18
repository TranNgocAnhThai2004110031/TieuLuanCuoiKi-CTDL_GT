package com.thaitna2004110031.thicuoiky;

import java.util.Scanner;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) {
        QuanLyHangHoa testDrive = new QuanLyHangHoa();
        // testDrive.themDau();
        // System.out.println("==========");
        // testDrive.print();
        // testDrive.themCuoi();
        // System.out.println("==========");
        // testDrive.print();
        // testDrive.xoaCuoi();
        // System.out.println("==========");
        // testDrive.print();

        // //Thực phẩm
        // testDrive.add("Thực phẩm", 11111, "Gạo", 15000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11112, "Trứng", 5000, 500, 11/11/2021);
        // testDrive.add("Thực phẩm", 11113, "Đường", 22000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11114, "Bột gạo", 2000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11115, "Dầu ăn", 30000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11116, "Muối", 5000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11117, "Bột ngọt", 55000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11118, "Hạt nêm", 45000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11119, "Mì", 5000, 500, 1/1/2021);
        // testDrive.add("Thực phẩm", 11120, "Nước tương", 35000, 500, 1/1/2021);
        // //Sành sứ
        // testDrive.add("Sành sứ", 22221, "Chén", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22222, "Ly", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22223, "Tô", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22224, "Dĩa", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22225, "Muỗng", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22226, "Ấm trà", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22227, "Tách trà", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22228, "Chén", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22229, "Chén", 20000, 200, 1/1/2021);
        // testDrive.add("Sành sứ", 22230, "Chén", 20000, 200, 1/1/2021);
        // //Điện máy
        // testDrive.add("Điện máy", 33331, "Tủ lạnh", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33332, "Máy giặt", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33333, "Ấm đun", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33334, "Tivi", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33335, "Loa", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33336, "Tay nghe", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33337, "Nồi cơm", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33338, "Bếp điện từ", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33339, "Laptop", 15000000, 100, 1/1/2021);
        // testDrive.add("Điện máy", 33340, "Đèn", 15000000, 100, 1/1/2021);
       
        Scanner sc = new Scanner(System.in);
        int luaChon ,key;
        do{
            System.out.println("----------MENU----------");
            System.out.println(">>1: Thêm hàng hóa.");
            System.out.println(">>2: Xóa hàng hóa.");
            System.out.println(">>3: Sửa hàng hóa.");
            System.out.println(">>4: Tìm kiếm hàng hóa.");
            System.out.println(">>5: Sắp xếp hàng hóa.");
            System.out.println(">>6: Thống kê hàng hóa.");
            System.out.print("- Nhập vào sựa lựa chọn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
            case 1:
                System.out.println("----------MENU----------");
                System.out.println(">>1: Thêm hàng hóa vào đầu danh sách.");
                System.out.println(">>2: Thêm hàng hóa vào cuối danh sách.");
                System.out.println(">>3: Thêm hàng hóa vào trước 1 hàng hóa có danh sách theo mã hàng hóa.");
                System.out.print("- Nhập vào sựa lựa chọn: ");
                key = sc.nextInt();
                switch (key) {
                    case 1:
                        testDrive.themDau();
                        break;
                    case 2:
                        testDrive.themCuoi();
                        break;
                    case 3:
                        testDrive.themDau();
                        break;
                    default:
                        break;                    
                }
                System.out.print("- Quay lại menu(1:yes/0:no): ");
                key = sc.nextInt();
                break;
            case 2:
                System.out.println("----------MENU----------");
                System.out.println(">>1: Xóa hàng hóa vào đầu danh sách.");
                System.out.println(">>2: Xóa hàng hóa vào cuối danh sách.");
                System.out.println(">>3: Xóa hàng hóa vào trước 1 hàng hóa có danh sách theo mã hàng hóa.");
                System.out.print("- Nhập vào sựa lựa chọn: ");
                key = sc.nextInt();
                switch (key) {
                    case 1:
                        testDrive.themDau();
                        break;
                    case 2:
                        testDrive.themCuoi();
                        break;
                    case 3:
                        testDrive.themDau();
                        break;
                    default:
                        break;                    
                }
                System.out.print("- Quay lại menu(1:yes/0:no): ");
                key = sc.nextInt();
                break;
            case 3:
                System.out.println("----------MENU----------");
                System.out.println(">>1: Sửa hàng hóa vào đầu danh sách.");
                System.out.println(">>2: Sửa hàng hóa vào cuối danh sách.");
                System.out.println(">>3: Sửa hàng hóa vào trước 1 hàng hóa có danh sách theo mã hàng hóa.");
                System.out.print("- Nhập vào sựa lựa chọn: ");
                key = sc.nextInt();
                switch (key) {
                    case 1:
                        testDrive.themDau();
                        break;
                    case 2:
                        testDrive.themCuoi();
                        break;
                    case 3:
                        testDrive.themDau();
                        break;
                    default:
                        break;                    
                }
                System.out.print("- Quay lại menu(1:yes/0:no): ");
                key = sc.nextInt();
                break;
            case 4:
                System.out.println(">>4: Xoá book cuối.");
                break;
            case 5:
                System.out.println(">>5: Thêm book vào trước book tìm được.");
                break;
            case 6:
                System.out.println(">>6: In danh sách liên kết.");
                break;
            case 7:
                System.out.println(">>7: Tìm kiếm sách trong dách sách."); 
                int tim = sc.nextInt();
                if(testDrive.find(tim) != null){
                    System.out.println("Sách có trong danh sách");
                }  
                else{
                    System.out.println("Không tìm thấy");
                }
                break;
            case 8:
                System.out.println("Chương trình kết thúc!");
                System.exit(0);
            }
            System.out.print("- Quay lại menu(1:yes/0:no): ");
            key = sc.nextInt();
        }
        while(key != 0);

    }
}
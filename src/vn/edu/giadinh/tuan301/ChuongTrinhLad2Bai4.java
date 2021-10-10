package vn.edu.giadinh.tuan301;

import java.util.Scanner;

public class ChuongTrinhLad2Bai4 {
    public static void main(String[] args){
        System.out.println("=============Menu=============");
        System.out.println(">>1. Giai phuong trinh bac I");
        System.out.println(">>2. Giai phuong trinh bac 2");
        System.out.println(">>3. Tinh tien dien");
        System.out.println("=============Menu=============");
        int suLuaChon;
        System.out.println("Lua chon chuc nang: ");
        Scanner bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
              case 1: giaiPTBacI(); break;
              case 2: /**chức năng nào được thực hiện - gọi hàm */; break;
              case 3: /**chức năng nào được thực hiện - gọi hàm */; break;
              default: System.out.println("Chọn chức năng khác");
        }

    }
    static void giaiPTBacI(){
        float a,b;
        /*if (a==0) {
            if(b==0){
                System.out.println("PT vô số nghiệm...");
            }
            else System.out.println("PT vô nghiệm...");
        }
        else {
            float x;
            x = float(-b/a);
            System.out.println("PT có nghiệm là: " +x);
        }*/
    }

    static void giaiPTBacII(){
        System.out.println("Triển khai code giải pt bậc II");
    }

    static void tinhTienDien(){
        System.out.println("Triển khai code tính tiền điện");
    }
}
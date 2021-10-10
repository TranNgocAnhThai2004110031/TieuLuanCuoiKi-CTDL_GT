package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class CTMinhHoaNhap {
    public static void main(String[] args){
        double diemMonCTDLGT;
        diemMonCTDLGT = 5.0;

        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập vào điểm môn CTDL&GT: ");
        diemMonCTDLGT = bienNhap.nextDouble();

        System.out.println("Điểm vừa nhập là: " + diemMonCTDLGT);

        //String chuoi = new String("Hello");
        
    }
}

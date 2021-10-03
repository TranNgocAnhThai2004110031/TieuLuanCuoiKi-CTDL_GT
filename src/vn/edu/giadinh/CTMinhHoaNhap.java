package vn.edu.giadinh;

import java.util.Scanner;

public class CTMinhHoaNhap {
    public static void main(String[] args){
        Scanner bienNhap;
        double diemMonCTDLGT;
        diemMonCTDLGT = 5.0;

        bienNhap = new Scanner(System.in);
        System.out.print("Nhập vào điểm môn CTDL&GT: ");
        diemMonCTDLGT = bienNhap.nextDouble();

        System.out.println("Điểm vừa nhập là: " + diemMonCTDLGT);

        //String chuoi = new String("Hello");
        
    } 
}
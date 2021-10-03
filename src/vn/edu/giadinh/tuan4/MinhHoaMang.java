package vn.edu.giadinh.tuan4;

//import java.util.Arrays;
//import java.util.Scanner;

public class MinhHoaMang {
    public static void main(String[] args){
        /*Scanner t = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = t.nextInt();
        double [] a = new double [n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", + (i+1));
            a[i] = t.nextDouble();
        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(a));

        System.out.println("=====Duyệt mảng=====");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        System.out.println("=====For each=====");
        for (double diem : a) {
            System.out.println(diem);
        }*/

        Dog[] danhSachDog = new Dog[7];

        Dog dog0 = new Dog(10, "Đen", "Fibo");
        Dog dog1 = new Dog(15, "Vàng", "La la");
        Dog dog2 = new Dog(20, "Đen trắng","Lu Lu");
        Dog dog3 = new Dog(25, "Vàng", "BiLu");
        Dog dog4 = new Dog(30, "Trắng", "BoBo");
        Dog dog5 = new Dog(35, "Vàng trắng", "MiNa");
        Dog dog6 = new Dog(40, "Đen vàng", "Nana");

        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog3;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;

        for (int i= 0; i < danhSachDog.length; i++) {
            danhSachDog[i].inThongTin();
        }
        
    }
}
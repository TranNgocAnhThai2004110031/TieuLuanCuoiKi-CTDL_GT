package vn.edu.giadinh.tuan301;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao N: ");
        int N = sc.nextInt();
        Boolean ok = true;
        for(int i = 2; i < N - 1; i++ ){
            if (N % i == 0) {
                ok = false;
                break;
            }
            else {
                ok = true;
            }
        }
        if (ok == true) {
            System.out.printf(" %d La so nguyen to", + N);
        } else {
            System.out.printf("%d Khong phai so nguyen to", + N);
        }
    }
}

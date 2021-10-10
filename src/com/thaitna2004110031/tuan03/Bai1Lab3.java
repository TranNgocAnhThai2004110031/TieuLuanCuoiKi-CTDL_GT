package com.thaitna2004110031.tuan03;

import java.util.Scanner;

public class Bai1Lab3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào N: ");
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
            System.out.printf(" %d Là số nguyên tố!!!", + N);
        } else {
            System.out.printf("%d Không phải số nguyên tố!!!", + N);
        }
    }
}

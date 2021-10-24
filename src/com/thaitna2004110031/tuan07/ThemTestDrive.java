package com.thaitna2004110031.tuan07;

public class ThemTestDrive {
    public static void main(String[] args) {
        Them them = new Them();
        them.add(0);
        them.add(1);
        them.add(2);
        them.add(3);
        them.add(4);
        them.add(5);
        them.add(6);
        them.add(7);
        them.add(8);
        them.add(9);
        them.print();
        them.themVaoDau(10);
        System.out.println("\n=====Danh sách sau khi thêm======");
        them.print();
        them.themTruocMotPhanTu(11, 3);
        System.out.println("\n=====Danh sách sau khi thêm======");
        them.print();
    }
}

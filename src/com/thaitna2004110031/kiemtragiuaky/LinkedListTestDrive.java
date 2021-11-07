package com.thaitna2004110031.kiemtragiuaky;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList testDrive = new LinkedList();
        testDrive.add(1, 2, "xanh" );
        testDrive.add(2, 4, "Do");
        testDrive.add(3, 6, "Xanh");
        testDrive.add(4, 8, "Xanh");
        testDrive.add(5, 10, "Vang");
        testDrive.add(6, 12, "Vang");
        testDrive.print();
        
        testDrive.themVaoDau(7, 14, "Xanh");
        testDrive.themVaoCuoi(8, 16, "Do");
        System.out.println("Danh sách táo sau khi thêm");
        testDrive.print();

        System.out.println("Danh sách táo sau khi xóa");
        testDrive.xoaTraiTaoCuoi();
        testDrive.print();
    }
}

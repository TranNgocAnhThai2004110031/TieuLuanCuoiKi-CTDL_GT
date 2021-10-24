package com.thaitna2004110031.tuan07;

public class XoaTestDive{
    public static void main(String[] args) {
        Xoa xoa = new Xoa();
        xoa.add(0);
        xoa.add(1);
        xoa.add(2);
        xoa.add(3);
        xoa.add(4);
        xoa.add(5);
        xoa.add(6);
        xoa.add(7);
        xoa.add(8);
        xoa.add(9);
        xoa.add(10);
        xoa.print();
        xoa.xoaDau();
        System.out.println("\n=====Danh sách sau khi xóa đầu=====");
        xoa.print();
        xoa.xoaCuoi();
        System.out.println("\n=====Danh sách sau khi xóa cuối=====");
        xoa.print();
        xoa.xoaPhanTuChoTruoc(3);
        System.out.println("\n=====Danh sách sau khi xóa=====");
        xoa.print();
    }
}

package com.thaitna2004110031.tuan07;

public class SuaThongTin1PhanTuTestDrive {
    public static void main(String[] args) {
        SuaThongTin1PhanTu sua = new SuaThongTin1PhanTu();
        sua.add(0);
        sua.add(1);
        sua.add(2);
        sua.add(3);
        sua.add(4);
        sua.add(5);
        sua.add(6);
        sua.add(7);
        sua.add(8);
        sua.add(9);
        sua.print();
        System.out.println("\n=====Danh sách sau khi sửa=====");
        sua.timVaSua(10, 3);
        sua.print();
    }
}

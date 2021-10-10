package com.thaitna2004110031.tuan03;

public class student {
    String tenSV;
    int tuoi;
    student(){}
    student(String tsv, int t){
        tenSV = tsv;
        tuoi = t;
    }

    void inThongTin(){
        System.out.println("Họ và tên: " +tenSV +"  " 
        +"Tuổi: " + tuoi );
    }
}

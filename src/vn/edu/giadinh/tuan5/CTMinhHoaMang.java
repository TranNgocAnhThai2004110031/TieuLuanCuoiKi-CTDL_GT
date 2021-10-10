package vn.edu.giadinh.tuan5;

public class CTMinhHoaMang {
    public static void main(String[] args) {
       int[] arr = {3, 5, 7, 9};
       int newElement = 8;
       int n = arr.length;
       int[] newArr = new int[n + 1];
       for (int i = 0; i < n; i++) {
           newArr[i] = arr[i];
       }
       System.out.println("In mảng cũ");
       for (int x : arr) {
           System.out.print(x + "\t");
       }
       System.out.println();
       newArr[n] = newElement;
       System.out.println("In mảng mới");
       for (int x : newArr) {
           System.out.print(x + "\t");
       }
    }
}

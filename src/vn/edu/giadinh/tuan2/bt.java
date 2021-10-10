package vn.edu.giadinh.tuan2;

public class bt {
    public static void main(String[] argr) {
        int a = 7, b = 5, c=9;
        int max=a>b?a:b;
        max=a>c?a:c;
        max=b>c?b:c;
        System.out.println("Max = " + max);

    }
}

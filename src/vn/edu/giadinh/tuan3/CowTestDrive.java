package vn.edu.giadinh.tuan3;

public class CowTestDrive {
    public static void main(String[] args){
        Cow cow;
        cow = new Cow(15);
        System.out.println("Weight: " + cow.weight);
        cow = new Cow(5);
        System.out.println("Weight: " + cow.weight);
        cow = new Cow(25.5, "Hà Lan", "Đean trắng");
        System.out.println("Weight: " + cow.weight + "Breed: " + cow.breed + "Color: " + cow.color);
    }
}

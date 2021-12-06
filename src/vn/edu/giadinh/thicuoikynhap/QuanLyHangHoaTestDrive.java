package vn.edu.giadinh.thicuoikynhap;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) {
        QuanLyHangHoa testDrive = new QuanLyHangHoa();
        
        testDrive.add("Thực phẩm", 11111, "Gạo", 15, 500);
        testDrive.add("Thực phẩm", 11112, "Trứng", 5, 500);
        testDrive.add("Thực phẩm", 11113, "Đường", 22, 500);
        testDrive.add("Thực phẩm", 11114, "Bột gạo", 2, 500);
        testDrive.add("Thực phẩm", 11115, "Dầu ăn", 30, 500);
        testDrive.add("Thực phẩm", 11116, "Muối", 5, 500);
        testDrive.add("Thực phẩm", 11117, "Bột ngọt", 55, 500);
        testDrive.add("Thực phẩm", 11118, "Hạt nêm", 45, 500);
        testDrive.add("Thực phẩm", 11119, "Mì", 5, 500);
        testDrive.add("Thực phẩm", 11120, "Nước tương", 35, 500);
        //Sành sứ
        testDrive.add("Sành sứ", 22221, "Chén", 20, 200);
        testDrive.add("Sành sứ", 22222, "Ly", 10, 200);
        testDrive.add("Sành sứ", 22223, "Tô", 15, 200);
        testDrive.add("Sành sứ", 22224, "Dĩa", 5, 200);
        testDrive.add("Sành sứ", 22225, "Muỗng", 2, 200);
        testDrive.add("Sành sứ", 22226, "Ấm trà", 30, 200);
        testDrive.add("Sành sứ", 22227, "Tách trà", 5, 200);
        testDrive.add("Sành sứ", 22228, "Chén", 20, 200);
        testDrive.add("Sành sứ", 22229, "Chén", 20, 200);
        testDrive.add("Sành sứ", 22230, "Chén", 20, 200);
        //Điện máy
        testDrive.add("Điện máy", 33331, "Tủ lạnh", 15000, 100);
        testDrive.add("Điện máy", 33332, "Máy giặt", 15000, 100);
        testDrive.add("Điện máy", 33333, "Ấm đun", 150, 100);
        testDrive.add("Điện máy", 33334, "Tivi", 3000, 100);
        testDrive.add("Điện máy", 33335, "Loa", 200, 100);
        testDrive.add("Điện máy", 33336, "Tay nghe", 150, 100);
        testDrive.add("Điện máy", 33337, "Nồi cơm", 250, 100);
        testDrive.add("Điện máy", 33338, "Bếp điện từ", 1500, 100);
        testDrive.add("Điện máy", 33339, "Laptop", 20000, 100);
        testDrive.add("Điện máy", 33340, "Đèn", 150, 100);
        
        testDrive.menu();
    }
}

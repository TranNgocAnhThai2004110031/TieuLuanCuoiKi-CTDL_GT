package com.thaitna2004110031.tieuluancuoiki;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) {
        QuanLyHangHoa testDrive = new QuanLyHangHoa();
        //  DỮ LIỆU MỒI 
        // Thực phẩm 
        testDrive.add("Thuc pham", 11111, "Gạo", 15000, 500, "01/11/2021");
        testDrive.add("Thuc pham", 11112, "Trứng", 3000, 500, "02/11/2021");
        testDrive.add("Thuc pham", 11113, "Đường", 22000, 500, "03/11/2021");
        testDrive.add("Thuc pham", 11114, "Bột gạo", 2000, 500, "04/11/2021");
        testDrive.add("Thuc pham", 11115, "Dầu ăn", 30000, 500, "05/11/2021");
        testDrive.add("Thuc pham", 11116, "Muối", 5000, 500, "06/11/2021");
        testDrive.add("Thuc pham", 11117, "Bột ngọt", 55000, 500, "07/11/2021");
        testDrive.add("Thuc pham", 11118, "Hạt nêm", 45000, 500, "08/11/2021");
        testDrive.add("Thuc pham", 11119, "Mì", 5000, 500, "09/11/2021");
        testDrive.add("Thuc pham", 11120, "Sữa", 19000, 500, "10/11/2021");
        // Điện máy
        testDrive.add("Dien may", 33331, "Máy pha cafe", 1350000, 100, "21/11/2021");
        testDrive.add("Dien may", 33332, "Máy hút chân không", 1290000, 100, "22/11/2021");
        testDrive.add("Dien may", 33333, "Ấm đun", 150000, 100, "23/11/2021");
        testDrive.add("Dien may", 33334, "Bình giữ nhiệt", 370000, 100, "24/11/2021");
        testDrive.add("Dien may", 33335, "Loa", 400000, 100, "25/11/2021");
        testDrive.add("Dien may", 33336, "Tay nghe", 150000, 100, "26/11/2021");
        testDrive.add("Dien may", 33337, "Nồi cơm", 500000, 100, "27/11/2021");
        testDrive.add("Dien may", 33338, "Quạt ", 500000, 100, "28/11/2021");
        testDrive.add("Dien may", 33339, "Ly giữ nhiệt", 150000, 100, "29/11/2021");
        testDrive.add("Dien may", 33340, "Đèn pin", 60000, 100, "30/11/2021");
        // Sành sứ
        testDrive.add("Sanh su", 22221, "Chén sứ", 4000, 2000, "11/11/2021");
        testDrive.add("Sanh su", 22222, "Ly", 10000, 2000, "12/11/2021");
        testDrive.add("Sanh su", 22223, "Tô sứ bầu", 15000, 2000, "13/11/2021");
        testDrive.add("Sanh su", 22224, "Dĩa sứ cạn", 5000, 2000, "14/11/2021");
        testDrive.add("Sanh su", 22225, "Muỗng sứ", 2000, 2000, "15/11/2021");
        testDrive.add("Sanh su", 22226, "Bộ tách trà sứ", 300000, 2000, "16/11/2021");
        testDrive.add("Sanh su", 22227, "Thố mứt", 39000, 2000, "17/11/2021");
        testDrive.add("Sanh su", 22228, "Dĩa sứ ảo", 6000, 2000, "18/11/2021");
        testDrive.add("Sanh su", 22229, "Dĩa tương sứ", 3000, 2000, "19/11/2021");
        testDrive.add("Sanh su", 22230, "Chén nước chấm", 3000, 2000, "20/11/2021");
        // MENU    
        testDrive.menu();
       
    }
    
}

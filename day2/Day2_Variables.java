package day2;

public class Day2_Variables {
    public static void main(String[] args) {

        // Giống như bạn có 200.000 VND để tiêu trong ngày
        int totalMoney = 200000;

        // Mỗi hoạt động trong ngày sẽ tốn 1 phần
        int coffeeCost = 25000;   // ly cà phê sáng
        int lunchCost = 40000;    // bữa trưa
        int snackCost = 15000;    // ăn vặt chiều

        // Tính tổng chi tiêu và số tiền còn lại
        int totalSpent = coffeeCost + lunchCost + snackCost;
        int remaining = totalMoney - totalSpent;

        // Hiển thị kết quả
        System.out.println(" Tổng chi tiêu: " + totalSpent + " VND");
        System.out.println(" Số tiền còn lại: " + remaining + " VND");

        // Ghi chú cảm xúc
        System.out.println("Hôm nay chi tiêu hợp lý, vẫn còn dư tiền uống trà sữa ");
    }
}

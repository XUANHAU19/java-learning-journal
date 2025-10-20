package day4;

public class Day4_LaundryLoop {
    public static void main(String[] args) {
        String[] clothes = {"áo thun", "quần jean", "áo sơ mi", "vớ", "khăn mặt"};

        System.out.println("🧺 Bắt đầu giặt đồ...");

        for (int i = 0; i < clothes.length; i++) {
            String item = clothes[i];
            System.out.println("👉 Đang giặt: " + item);

            // Nếu gặp "vớ", bỏ qua (vì quá nhỏ, giặt riêng)
            if (item.equals("vớ")) {
                System.out.println("⏩ Bỏ qua vớ, giặt riêng sau!");
                continue;
            }

            // Nếu gặp "khăn mặt", dừng hẳn vì máy giặt bị đầy
            if (item.equals("khăn mặt")) {
                System.out.println("⚠️ Máy giặt đầy! Dừng lại để phơi đồ.");
                break;
            }

            System.out.println("✅ Giặt xong " + item + "\n");
        }

        System.out.println("🎉 Hoàn thành việc giặt đồ hôm nay!");
    }
}

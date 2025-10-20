package day3;

import java.util.Scanner;

public class Day3_weatherDecision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hôm nay trời thế nào? (mưa/nắng/lạnh)");
        String weather = scanner.nextLine();

        if (weather.equals("mưa")) {
            System.out.println("Mang áo mưa và đi xe buýt 🚍");
        } else if (weather.equals("nắng")) {
            System.out.println("Trời đẹp, đi xe máy 🛵");
        } else if (weather.equals("lạnh")) {
            System.out.println("Mặc áo ấm và đi bộ cho khỏe 🚶");
        } else {
            System.out.println("Không rõ thời tiết, ở nhà học Java thôi ☕");
        }

        scanner.close();
    }
}

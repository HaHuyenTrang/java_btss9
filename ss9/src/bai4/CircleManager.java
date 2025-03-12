package bai4;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        System.out.println("Bán kính hình tròn mặc định ");
        circleMng circle = new circleMng();
        circle.displayData();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bán kính hình tròn có tham số ");
        System.out.print("Nhập bán kính hình tròn : ");
        double radius = Double.parseDouble(scanner.nextLine());
        circleMng circle2 = new circleMng(radius);
        circle2.displayData();
    }
}
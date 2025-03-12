package bai5;

import java.util.Scanner;

public class vector2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tọa độ x = ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tọa độ y = ");
        double y = Double.parseDouble(scanner.nextLine());
        vector vector = new vector(x,y);
        vector.displayData();

        System.out.print("Nhập tọa độ x1 = ");
        double x1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tọa độ y1 = ");
        double y1 = Double.parseDouble(scanner.nextLine());
        vector vector2 = new vector(x1, y1);
        vector2.displayData();

        System.out.println("Tổng giữa 2 vector : "+vector2.add(vector));
        System.out.println("Hiệu giữa 2 vector : "+vector2.sub(vector));
        System.out.println("Tích vô hướng giữa 2 vector : "+vector2.dotProduct(vector));
    }
}
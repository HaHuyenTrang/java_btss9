package bai6;

import java.util.Scanner;

public class point2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tọa độ x1 : ");
        double x1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tọa độ y2 : ");
        double y1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập tọa độ x2 : ");
        double x2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tọa độ y2 : ");
        double y2 = Double.parseDouble(scanner.nextLine());

        point point1 = new point(x1,y1);
        point point2 = new point(x2,y2);

        point1.displayData();
        System.out.printf("Khoảng cách giữa hai điểm : %.2f\n",point1.distanceTo(point2));

        System.out.println("Tọa độ khi thay mới ");
        System.out.print("x1 = ");
        point1.setX(Double.parseDouble(scanner.nextLine()));
        System.out.print("y2 = ");
        point1.setY(Double.parseDouble(scanner.nextLine()));

        point1.displayData();
        System.out.printf("Khoảng cách giữa hai điểm : %.2f\n",point1.distanceTo(point2));


    }
}
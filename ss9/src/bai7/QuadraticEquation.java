package bai7;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c : ");
        double c = Double.parseDouble(scanner.nextLine());

        Constructor  quadratic = new Constructor (a, b, c);
        quadratic.displayData();
    }
}
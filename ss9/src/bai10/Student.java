package bai10;


import java.util.Scanner;

// Enum giới tính
enum Gender {
    MALE, FEMALE, OTHER;
}

// Lớp Student
class Student {
    int id;
    String name;
    int age;
    Gender gender;
    String address;
    String phoneNumber;

    // Constructor không tham số
    public Student() {}

    // Constructor có tham số
    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Nhập thông tin sinh viên
    public void inputData(Scanner scanner) {
        System.out.print("ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tên: ");
        this.name = scanner.nextLine();
        System.out.print("Tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Giới tính (MALE/FEMALE/OTHER): ");
        this.gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    // Hiển thị thông tin sinh viên
    public void displayData() {
        System.out.println(id + " - " + name + " - " + age + " - " + gender + " - " + address + " - " + phoneNumber);
    }
}
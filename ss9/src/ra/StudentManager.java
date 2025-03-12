package ra;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student("SV003", "Nguyễn Văn C", 23, true, "Hồ Chí Minh");

        System.out.println("----------Nhập thông tin sinh viên 1-----------");
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);

        System.out.println("----------Nhập thông tin sinh viên 2-----------");
        System.out.println("Nhap tuoi SV : ");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap vao gioi tinh SV : ");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhap vao dia chi : ");
        student2.setAddress(scanner.nextLine());


        System.out.println("----------Thông tin sinh viên 1------------");
        student1.showData();
        System.out.println("----------Thông tin sinh viên 2------------");
        student2.showData();
        System.out.println("----------Thông tin sinh viên 3------------");
        student3.showData();
    }
}
package bai10;
import java.util.ArrayList;
import java.util.Scanner;

// Lớp quản lý danh sách sinh viên
public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> displayStudents();
                case 2 -> addStudent();
                case 3 -> editStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (Student s : students) {
                s.displayData();
            }
        }
    }

    static void addStudent() {
        Student student = new Student();
        student.inputData(scanner);
        students.add(student);
        System.out.println("Thêm thành công!");
    }

    static void editStudent() {
        System.out.print("Nhập ID sinh viên cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Nhập thông tin mới:");
                s.inputData(scanner);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    static void deleteStudent() {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        students.removeIf(s -> s.id == id);
        System.out.println("Xóa thành công!");
    }
}


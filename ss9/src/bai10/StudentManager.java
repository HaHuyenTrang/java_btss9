package bai10;

import java.util.Scanner;

// Lớp quản lý danh sách sinh viên
public class StudentManager{
    static Student[] students = new Student[100];
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Danh sách trống.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            students[i].displayData();
                        }
                    }
                    break;
                case 2:
                    if (count >= students.length) {
                        System.out.println("Danh sách đã đầy!");
                        break;
                    }
                    students[count] = new Student();
                    students[count].inputData(scanner);
                    count++;
                    System.out.println("Thêm thành công!");
                    break;
                case 3:
                    System.out.print("Nhập ID sinh viên cần sửa: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (students[i].id == editId) {
                            System.out.println("Nhập thông tin mới:");
                            students[i].inputData(scanner);
                            System.out.println("Cập nhật thành công!");
                            break;
                        }
                    }
                    System.out.println("Không tìm thấy sinh viên!");
                    break;
                case 4:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (students[i].id == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[count - 1] = null;
                            count--;
                            System.out.println("Xóa thành công!");
                            break;
                        }
                    }
                    System.out.println("Không tìm thấy sinh viên!");
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }
}
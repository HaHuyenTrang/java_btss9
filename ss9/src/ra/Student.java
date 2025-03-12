package ra;
import java.util.Scanner;

public class Student {

    private String studentName;
    /*
     * xây dựng lớp sinh viên, quản lý thôgn tin sinh viên
     * 1. các thuộc tính
     *  - mã sv
     *  - tên sv
     *  - tuổi sv
     *  - giới tính sv
     *  - địa chỉ sv
     * 2. có 3 constructors: không tham số, 2 tham số mã sv - tên sv, có đỷ tham số
     * 3. có hành vi
     *  - tính tổng 2 số nguyên
     *  - chào giảng viên
     *  - nhập thông tin sv
     *  - hiển thị tt sv
     * */
    // fields | properties | attributes: thuộc tính mô tả các đặc diểm của đối tượng
    // trong thế giới thực
    private String studentId;
    private String studentNam;
    private int age;
    private boolean sex;
    private String address;
    //2. constructors: các hàm giúp khởi tạo đối tượng
    //syntax: public + className (paramter)
    // -- contructor default:   0 tham ssoos khởi tạo với giá trị mặc định
    public Student(String studentId, String studentName , int age, boolean sex, String address){
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;

    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean getSex() {
        return sex;
    }
    public void setSex(boolean sex){
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    //3 phương thức hành vi
    public int number(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public void helloTeacher(){
        System.out.println("Hello Teacher");
    }

    public void input(Scanner scanner){
        System.out.print("nhập mã sv: ");
        studentId = scanner.next();
        System.out.print("nhập tên sv: ");
        studentName = scanner.next();
        System.out.print("nhập tuổi sv: ");
        age = scanner.nextInt();
        System.out.print("nhập địa chỉ sv: ");
        address = scanner.next();
        System.out.print("nhập giới tính sv: ");
        sex = scanner.nextBoolean();



    }

    public void inputData(Scanner scanner) {
    }

    public void showData() {
    }
}

package bai2;

public class employ {
    private int id;
    private String name;
    private String department;
    private double salary;

    public employ(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
        System.out.println("Tăng lương : " + salary);
    }

    public void displayInfo() {
        System.out.println("Mã nhân viên : "+this.id);
        System.out.println("Tên nhân viên : "+this.name);
        System.out.println("Phòng ban : "+this.department);
        System.out.println("Lương : "+this.salary);
    }
}
package bai9;

public class main {
    public static void main(String[] args) {
        // Tạo các đối tượng Fraction
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);

        // Hiển thị các phân số ban đầu
        System.out.println("Phân số 1: " + fraction1);
        System.out.println("Phân số 2: " + fraction2);

        // Thực hiện các phép toán và hiển thị kết quả
        System.out.println("Cộng: " + fraction1.add(fraction2));
        System.out.println("Trừ: " + fraction1.subtract(fraction2));
        System.out.println("Nhân: " + fraction1.multiply(fraction2));
        System.out.println("Chia: " + fraction1.divide(fraction2));
    }
}


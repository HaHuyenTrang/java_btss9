package bai8;

public class banking {
    public static void main(String[] args) {
        // Tạo hai tài khoản ngân hàng
        BankAccount account1 = new BankAccount("123456789", "Hà Huyền Trang", 100);
        BankAccount account2 = new BankAccount("987654321", "Trần Hồng T", 3000000);

        // Hiển thị thông tin ban đầu
        System.out.println("Thông tin ban đầu:");
        account1.display();
        account2.display();

        // Nạp tiền vào tài khoản 1
        account1.addMoney(2800);
        account1.display();

        // Rút tiền từ tài khoản 2
        account2.withdrawMoney(200);
        account2.display();

        // Chuyển tiền từ tài khoản 1 sang tài khoản 2
        account1.banking(account2, 67000);
        account1.display();
        account2.display();
    }
}
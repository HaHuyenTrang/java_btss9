package bai8;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Phương thức nạp tiền
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp thành công: " + amount);
        } else {
            System.out.println("Số tiền nạp không hợp lệ.");
        }
    }

    // Phương thức rút tiền
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Rút thành công: " + amount);
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    // Phương thức chuyển tiền
    public void banking(BankAccount recipient, double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ để chuyển tiền.");
        } else if (amount > 0) {
            this.balance -= amount;
            recipient.balance += amount;
            System.out.println("Chuyển thành công: " + amount + " đến " + recipient.accountHolder);
        } else {
            System.out.println("Số tiền chuyển không hợp lệ.");
        }
    }

    // Phương thức hiển thị thông tin tài khoản
    public void display() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Tên chủ tài khoản: " + accountHolder);
        System.out.println("Số dư: " + balance);
        System.out.println("-------------------------");
    }
}


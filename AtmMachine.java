import java.util.Scanner;

class BankAccount {
    int balance = 5000;

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Successfully deposited: " + amount);
        } else {
            System.out.println("⚠️ Deposit amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("⚠️ Withdrawal amount must be positive.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawal Successful! Amount: " + amount);
        } else {
            System.out.println("❌ Insufficient balance. Current balance: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("💰 Your Current Balance = " + balance);
    }
}

public class AtmMachine {
    Scanner sc = new Scanner(System.in);
    BankAccount account = new BankAccount();

    public void start() {
        int choice;
        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Withdrawal Amount: ");
                    int wAmount = sc.nextInt();
                    account.withdraw(wAmount);
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    int dAmount = sc.nextInt();
                    account.deposit(dAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("👋 Good Bye...");
                    break;
                default:
                    System.out.println("⚠️ Invalid Choice!");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        AtmMachine atm = new AtmMachine();
        atm.start();
    }
}

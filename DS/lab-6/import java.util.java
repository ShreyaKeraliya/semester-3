import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;
    private String name;

    public BankAccount(int accountNumber, double balance, String accountHolder, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful. New balance is " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance is " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter account holder: ");
                    String accountHolder = scanner.next();
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    BankAccount account = new BankAccount(accountNumber, balance, accountHolder, name);
                    accounts.add(account);
                    System.out.println("Account created successfully");
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    for (BankAccount account1 : accounts) {
                        if (account1.getAccountNumber() == depositAccountNumber) {
                            account1.deposit(depositAmount);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    for (BankAccount account1 : accounts) {
                        if (account1.getAccountNumber() == withdrawAccountNumber) {
                            account1.withdraw(withdrawAmount);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int checkAccountNumber = scanner.nextInt();
                    for (BankAccount account1 : accounts) {
                        if (account1.getAccountNumber() == checkAccountNumber) {
                            account1.checkBalance();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
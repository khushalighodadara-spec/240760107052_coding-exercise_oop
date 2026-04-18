class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    public void openAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

        System.out.println("Account Opened Successfully");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass SavingAccount
class SavingAccount extends BankAccount {
    private double interestRate = 4.5; 
    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned in Saving Account: " + interest);
    }
}
class FixedDepositAccount extends BankAccount {
    private double interestRate = 7.0;
    public void maturityAmount(int years) {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}
public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Rahul Sharma", 10000);

        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Priya Patel", 50000);

        fd.checkBalance();
        fd.maturityAmount(3);
    }
}

/*
Output:

Account Opened Successfully
Account Number : SA101
Account Holder : Rahul Sharma
Balance        : 10000.0

2000.0 deposited successfully.
1500.0 withdrawn successfully.
Current Balance: 10500.0
Interest Earned in Saving Account: 472.5

Account Opened Successfully
Account Number : FD201
Account Holder : Priya Patel
Balance        : 50000.0

Current Balance: 50000.0
Maturity Amount after 3 years: 60500.0
*/

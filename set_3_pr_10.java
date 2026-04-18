class BankAccount {
    private String accountHolderName;
    private double balance;
    private static double interestRate = 5.0; 
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }
    public void displayInterest() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    // Static method to update interest rate
    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul", 10000);
        BankAccount acc2 = new BankAccount("Priya", 20000);
        acc1.displayInterest();
        acc2.displayInterest();
        BankAccount.updateInterestRate(7.5);

        System.out.println("After Updating Interest Rate:\n");
        acc1.displayInterest();
        acc2.displayInterest();
    }
}

/*
Output:

Account Holder: Rahul
Balance: 10000.0
Interest Rate: 5.0%
Interest Earned: 500.0

Account Holder: Priya
Balance: 20000.0
Interest Rate: 5.0%
Interest Earned: 1000.0

After Updating Interest Rate:

Account Holder: Rahul
Balance: 10000.0
Interest Rate: 7.5%
Interest Earned: 750.0

Account Holder: Priya
Balance: 20000.0
Interest Rate: 7.5%
Interest Earned: 1500.0
*/

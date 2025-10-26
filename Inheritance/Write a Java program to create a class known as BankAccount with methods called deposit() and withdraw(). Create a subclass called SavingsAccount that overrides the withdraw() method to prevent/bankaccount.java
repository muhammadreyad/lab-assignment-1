class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        // Check the new rule: balance must not fall below 100
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Savings Withdrew: " + amount);
        } else {
            System.out.println("Savings withdrawal failed: Amount invalid or balance must remain at least 100.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(200.0);
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Test 1: Valid withdrawal
        myAccount.withdraw(50.0); // Should succeed (Balance will be 150)
        System.out.println("Balance: " + myAccount.getBalance());

        // Test 2: Invalid withdrawal (would go below 100)
        myAccount.withdraw(70.0); // Should fail (150 - 70 = 80, which is < 100)
        System.out.println("Balance: " + myAccount.getBalance());
        
        // Test 3: Valid withdrawal (exactly to 100)
        myAccount.withdraw(50.0); // Should succeed (150 - 50 = 100)
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}
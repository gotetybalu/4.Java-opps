class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        System.out.println(account.getBalance());
    }
}

/*
Remember for interviews
- Encapsulation: Data hiding + controlled access through methods.
- Make variables private.
- Provide public methods when access is needed.
- Encapsulation helps protect data and enforce validation rules.
Difference to remember:
- Abstraction hides implementation details.
- Encapsulation protects data by controlling access to it.
*/

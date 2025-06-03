package P14_Tugas2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // ERROR: Cannot override the final method from BankAccount
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Info"); // Ini akan error
    }
    */

    // Solusi: Buat method baru untuk informasi tambahan
    public void displaySavingsInfo() {
        super.displayAccountInfo();
        System.out.println("This is a savings account.");
    }
}


package super_keyword.test.test1;

/**
 * You are given a class named BankAccount. The class has two fields: number and balance.
 *
 * Define two classes which inherit from the BankAccount:
 *
 * CheckingAccount containing the double field fee.
 * SavingsAccount containing the double field interestRate.
 * Each new class should have a constructor with three parameters to initialize all fields:
 *
 * CheckingAccount(String number, Long balance, double fee)
 * SavingsAccount(String number, Long balance, double interestRate)
 * Do not forget to invoke the superclass constructor when creating objects.
 */

public class BankAccount {
    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

}
class CheckingAccount extends BankAccount {
    protected double fee;

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}
class SavingsAccount extends BankAccount {
    protected double interestRate;

    public SavingsAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

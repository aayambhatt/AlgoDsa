package A_basics.B_oopsBasics;

class BankAccount {
    private double balance;
    private String accountType;

    public BankAccount(double balance){
        this.balance = balance;
    }
    public BankAccount(double balance, String accountType){
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}

class MainTest{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(100);
        BankAccount b2 = new BankAccount(200);
        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());
    }

}

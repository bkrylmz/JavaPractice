package bekir;

public class BankClass {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankClass{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checBalance(){
        System.out.println("Your avaliable balance is "+ balance);
    }

    public void deposit(){
        System.out.println("Your avaliable deposit is "+ balance);

}}

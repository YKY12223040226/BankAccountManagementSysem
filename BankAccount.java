package y12223040226;

//银行账户的类
public  class BankAccount {

   // 数据域：账户和用户名和余额
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //构造函数
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    //取款时，余额不足提示
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("余额不足！");
        } else {
            balance -= amount;
        }
    }


    //查看银行账户属性
    public String toString() {
        return accountNumber + " - " + accountHolderName + " - " + balance;
    }
}

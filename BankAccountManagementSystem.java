package y12223040226;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountManagementSystem {

    //创建一个ArrayList存储所有银行账户
    private ArrayList<BankAccount> accounts;

    //初始化accounts为一个空的ArrayList
    public BankAccountManagementSystem() {
        accounts = new ArrayList<>();
    }

    //添加一个新的银行账户到accounts中
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    //从accounts中删除一个指定的银行账户
    public void removeAccount(BankAccount account) {
        accounts.remove(account);
    }

    //显示所有账户信息
    public void displayAccounts() {
        System.out.println("账户列表：");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }


    public static void main(String[] args) {

        //创建对象
        BankAccountManagementSystem system = new BankAccountManagementSystem();
        Scanner scanner = new Scanner(System.in);

        //主体操作部分
        while (true) {

            //显示菜单
            System.out.println("1. 添加账户");
            System.out.println("2. 删除账户");
            System.out.println("3. 显示账户列表");
            System.out.println("4. 退出");

            //读取用户选择
            int choice = scanner.nextInt();
            scanner.nextLine();

            //根据输入的符号判断操作
            if (choice == 1) {
                //添加账户
                System.out.print("请输入账户号码：");
                String accountNumber = scanner.nextLine();
                System.out.print("请输入账户持有人姓名：");
                String accountHolderName = scanner.nextLine();
                System.out.print("请输入账户余额：");
                double balance = scanner.nextDouble();
                scanner.nextLine();//用于获取\n

                BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
                system.addAccount(account);
                System.out.println("账户添加成功！");
            } else if (choice == 2) {

                //删除账户
                System.out.print("请输入要删除的账户号码：");
                String accountNumber = scanner.nextLine();

                BankAccount accountToRemove = null;
                for (BankAccount account : system.accounts) {
                    if (account.getAccountNumber().equals(accountNumber)) {
                        accountToRemove = account;
                        break;
                    }
                }

                if (accountToRemove != null) {
                    system.removeAccount(accountToRemove);
                    System.out.println("账户删除成功！");
                } else {
                    System.out.println("账户未找到！");
                }
            } else if (choice == 3) {

                //显示账户列表
                system.displayAccounts();
            } else if (choice == 4) {

                //退出
                System.out.println("正在退出...");
                break;
            } else {

                //处理无效操作
                System.out.println("无效的选择！请重试。");
            }

            System.out.println();
        }

        //结束
        scanner.close();
    }

}


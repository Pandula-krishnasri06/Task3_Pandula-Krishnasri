import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit Successful");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
        }
        else if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal Successful");
        }
        }
        public void checkbalance(){
            System.out.println("Current Balance: "+balance);
        }
    }
public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000);
        while (true) {
            System.out.println("\nATM MENU");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.print("Enter Amount:");
                account.deposit(sc.nextDouble());
                break;
                case 2:
                System.out.print("Enter Amount:");
                account.withdraw(sc.nextDouble());
                break;
                case 3:
                account.checkbalance();
                break;
                case 4:
                System.out.println("Thankyou");
                sc.close();
                return;
                default:
                System.out.println("Invalid Choice");
            }   
        }
    }
}

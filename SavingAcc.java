import java.util.Scanner;
class InsufficientFundException extends Exception{
    public InsufficientFundException(String message){
        super(message);
    }
}
public class SavingAcc {
    int acno;
    String name;
    double balance;
    public SavingAcc(int acno, String name, double balance){
        this.acno=acno;
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double ammount){
        balance = balance + ammount;
        System.out.println("Ammount deposited succefully!");
    }
    public void withdraw(double ammount) throws InsufficientFundException{
        if(balance - ammount < 500){
            throw new InsufficientFundException(" insufficient balance in account!");
        }
        balance =balance - ammount;
        System.out.println("Amount withdrwn succefully");
    }
    public void viewBalance(){
        System.out.println("Account no: " + acno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SavingAcc obj=new SavingAcc(101,"harshala" , 2000);
        obj.viewBalance();

        System.out.println("Enter ammount to deposit:");
        double depositamm=sc.nextDouble();
        obj.deposit(depositamm);
        obj.viewBalance();

        System.out.println("Enter ammount to withdeaw:");
        double withdrawamm=sc.nextDouble();

        try {
            obj.withdraw(withdrawamm);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
        obj.viewBalance();
        sc.close();
    }
}

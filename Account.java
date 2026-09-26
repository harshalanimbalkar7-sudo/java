import java.util.Scanner;
public class Account {
    int acno;
    String acname;
    double balance;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account no:");
        acno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account name:");
        acname= sc.nextLine();
        System.out.println("Enter balance:");
        balance=sc.nextDouble();
    }
    public void display(){
        System.out.println("Account no: " + acno );
        System.out.println("Account name: " + acname );
        System.out.println("Balance: " + balance );
    }
    public void deposit(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        double ammount=sc.nextDouble();
        balance= balance + ammount;
        System.out.println("Amount deposited succesfully!");
        System.out.println("Current balance : " + balance);
    }
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        double ammount=sc.nextDouble();
        if(ammount <= balance){
            balance = balance - ammount;
            System.out.println("Amount withdrawn succesfully!");
            System.out.println("current balance:" + balance);
        }else{
            System.out.println("Insufficent balance.");
        }
    }
    public static void main(String[] args) {
        Account a= new Account();
        a.accept();
        a.display();
        a.deposit();
        a.withdraw();
        System.out.println("\n---Final Account Details---");
        a.display();
    }
}

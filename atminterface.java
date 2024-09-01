
import java.util.*;
class ATM {
    BankAccount a=new BankAccount();
    Scanner sc=new Scanner(System.in);
    public void checkBalance(){
        System.out.println("Your current balance is " +a.totAmt());
    }
    public void withDrawn(){
        System.out.println("Enter the amount to withdraw:");
        int n=sc.nextInt();
        if (a.amount>=n){
            a.amount-=n;
            System.out.println("Successfully withdrawn");
        }
        else{
            System.out.println("You have no sufficient amount.");
        }
    }
    public void deposit(){
        System.out.println("Enter the amount to deposit:");
        int n=sc.nextInt();
        a.amount+=n;
        System.out.println("Your amount has been updated");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM atm=new ATM();
        boolean c=true;
        while(c){
        System.out.print("What do you need from this?\n");
        System.out.print("1. Checking Balance?\n");
        System.out.print("2. Withdraw?\n");
        System.out.print("3. Deposit?\n");
        System.out.print("4. Exit?\n");
        int ch=sc.nextInt();
        switch(ch){
            case 1: 
                atm.checkBalance();
                break;
            case 2: 
                atm.withDrawn();
                break;
            case 3: 
                atm.deposit();
                break;
            case 4:
                System.out.println("Exiting");
                c=false;
                break;
            default:
            System.out.println("Make a right choice.");
                
        }
        }
    }
}
class BankAccount{
    public int amount=500;
    public double totAmt(){
        return amount;
    }
}
